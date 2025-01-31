import java.io.*;
import java.util.*;

public class Main {

    public static int n, m; // n = 세로, m = 가로 크기
    public static int[][] ground; // 입력값 저장
    public static boolean[][] visited; // 방문 여부
    public static int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}}; // 4방향

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        ground = new int[n][m];
        visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
                if (ground[i][j] == 2) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true; // 시작점 방문 처리
                    ground[i][j] = 0; // 시작점의 거리는 0
                }
            }
        }

        BFS(queue);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && ground[i][j] == 1) { // 도달할 수 없는 영역 처리
                    ground[i][j] = -1;
                }
                sb.append(ground[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void BFS(Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int[] direction : directions) {
                int nx = x + direction[0];
                int ny = y + direction[1];

                // 범위 체크 및 방문 여부, 벽 확인
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if (visited[nx][ny] || ground[nx][ny] == 0) continue;

                visited[nx][ny] = true; // 방문 처리
                ground[nx][ny] = ground[x][y] + 1; // 거리 업데이트
                queue.add(new int[]{nx, ny});
            }
        }
    }
}