import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken()), B = Long.parseLong(st.nextToken());

        System.out.println(A*B/GCD(A,B));
    }

    public static long GCD (long A, long B){
        while(B!=0){
            long temp = A%B;
            A = B;
            B = temp;
        }
        return A;
    }
}