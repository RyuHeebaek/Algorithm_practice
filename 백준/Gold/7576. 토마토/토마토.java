import java.io.*;
import java.util.*;

public class Main {
    static int[][] box;
    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        Queue<int[]> queue = new ArrayDeque<>();
        int unripeCount = 0;

        for(int i = 0; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
                if(box[i][j] == 1){
                    queue.add(new int[]{i, j});
                } else if (box[i][j] == 0) {
                    unripeCount++;
                }
            }
        }
        System.out.print(bfs(queue, unripeCount));
    }
    static int bfs(Queue<int[]> queue, int unripeCount){
        int days = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            boolean ripeToday = false;

            for(int i = 0; i < size; i++){
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                for(int[] dir : directions){
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if(nx >= 0 && ny >= 0 && nx < N && ny < M && box[nx][ny] == 0){
                        box[nx][ny] = 1;
                        queue.add(new int[]{nx, ny});
                        unripeCount--;
                        ripeToday = true;
                    }
                }
            }
            if(ripeToday) days++;
        }
        return unripeCount == 0 ? days : -1;
    }
}