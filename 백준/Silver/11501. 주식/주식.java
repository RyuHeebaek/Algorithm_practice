import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    static int T, N;
    static int[] nums;

    public static void main(String[] args) throws IOException{
        T = Integer.parseInt(br.readLine());
        for(int t = 0; t < T; t++) {
            N  = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            nums = new int[N];
            for(int i = 0; i < N; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            int prev = nums[N-1];
            long total = 0;
            for(int i = N-2; i >= 0; i--) {
                if(nums[i] > prev) {
                    prev = nums[i];
                } else {
                    total += (prev - nums[i]);
                }
            }
            System.out.println(total);
        }
    }

}
