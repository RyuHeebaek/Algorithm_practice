import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    static int N, K;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;
        for(int i = N-1; i>= 0; i--) {
            int curr = nums[i];
            if (curr <= K) {
                result += K / curr;
                K = K % curr;
            }
            if(K==0) break;
        }
        System.out.println(result);
    }



}
