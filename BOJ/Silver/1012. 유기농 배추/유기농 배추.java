import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    static int T, M, N, K;

    static boolean[][] field;
    static boolean[][] visited;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            field = new boolean[N][M];
            visited = new boolean[N][M];

            for(int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                field[x][y] = true;
            }
            int result = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if (dfs(i, j)) result++;
                }
            }
            System.out.println(result);
        }
    }

    public static boolean dfs(int x, int y) {
        if(!field[x][y] || visited[x][y]) return false;

        visited[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(canMove(nx, ny)) {
                dfs(nx, ny);
            }
        }

        return true;
    }

    public static boolean canMove(int x, int y) {
        return inRange(x, y) && !visited[x][y] && field[x][y];
    }

    public static boolean inRange(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }

}
