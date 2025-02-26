import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static boolean[] visited;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());   //  숫자 범위
        m = Integer.parseInt(st.nextToken());   //  숫자 갯수

        visited = new boolean[n+1];
        result = new int[m];

        backtrack(0);
        System.out.println(sb);
    }

    public static void backtrack(int depth) {
        if(depth == m){
            for(int i = 0; i < m; i++){
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = i;
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}