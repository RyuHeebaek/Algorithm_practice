import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, N);
        System.out.println(solve(size, r, c));

    }

    static int solve (int size, int row, int column){
        if(size == 1) return 0;

        int half = size / 2;
        int area = half * half;

        if(row < half && column < half) {   //0사분면
            return solve(half, row, column);
        } else if (row < half && column >= half) {  //1사분면
            return area + solve(half, row, column - half);
        } else if (row >= half && column < half) {  //2사분면
            return area * 2 + solve(half, row - half, column);
        } else {    //3사분면
            return area * 3 + solve(half, row - half, column - half);
        }
    }
}