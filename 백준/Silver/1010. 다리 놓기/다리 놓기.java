import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine().trim());

        for(int i = 0; i < testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int leftSide = Integer.parseInt(st.nextToken());
            int rightSide = Integer.parseInt(st.nextToken());

            if(leftSide < rightSide){
                sb.append(rightIsBig(leftSide, rightSide)).append("\n");
            } else if(leftSide == 0){
                sb.append(0).append("\n");
            } else if(leftSide == rightSide){
                sb.append(1).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static long rightIsBig (int left, int right){
        long total = 1;
        int n = 1;

        for(int i = right; i > right - left; i--){
            total *= i;
            total /= n;
            n++;
        }

        return total;
    }
}