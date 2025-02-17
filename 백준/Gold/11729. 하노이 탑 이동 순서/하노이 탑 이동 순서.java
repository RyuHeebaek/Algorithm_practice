import java.io.*;
import java.util.*;

public class Main {

    public static StringBuilder sb = new StringBuilder();
    public static int moveCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        hanoi(N, 1, 2, 3);

        System.out.println(moveCount);

        System.out.println(sb);
    }

    public static void hanoi(int n, int start, int mid, int end){
        if(n == 1){
            sb.append(start).append(" ").append(end).append("\n");
            moveCount++;
            return;
        }

        hanoi(n-1, start, end, mid);

        sb.append(start).append(" ").append(end).append("\n");
        moveCount++;

        hanoi(n-1, mid, start, end);
    }
}