import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] arrAndIndex = new int[N][2];
        for(int i = 0; i < N; i++){
            arrAndIndex[i][0] = Integer.parseInt(st.nextToken());
            arrAndIndex[i][1] = i;
        }

        Arrays.sort(arrAndIndex, (a, b) -> {
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        int[] arrP = new int[N];
        for(int i = 0; i < N; i++){
            arrP[arrAndIndex[i][1]] = i;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(arrP[i]).append(" ");
        }

        System.out.print(sb);
    }
}