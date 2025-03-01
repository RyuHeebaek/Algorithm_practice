import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M];
        backTrack(1, 0);

        System.out.print(sb);
    }

    public static void backTrack(int start, int depth) {
        if(depth == M) {
            for(int num : result) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i <= N; i++){
            result[depth] = i;
            backTrack(i, depth + 1);
        }
    }
}
