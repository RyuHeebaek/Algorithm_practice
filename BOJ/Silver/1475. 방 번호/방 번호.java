import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException{
        int[] nums = new int[10];
        String num = br.readLine();
        int sixOrNine = 0;
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < num.length(); i++) {
            int curr = num.charAt(i)-'0';
            if (curr == 6 || curr == 9) {
                sixOrNine++;
                if(sixOrNine == 2) {
                    sixOrNine = 0;
                    nums[6]++;
                    nums[9]++;
                }
            } else {
                nums[curr]++;
            }
        }
        if (sixOrNine == 1) {
            nums[6]++;
        }
        for(int i = 0; i < 10; i++) {
            result = Math.max(result, nums[i]);
        }
        System.out.println(result);
    }

}
