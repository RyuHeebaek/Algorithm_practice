import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int A1 = Integer.parseInt(st.nextToken()), B1 = Integer.parseInt(st.nextToken());

        int denominator = B*B1/GCD(B,B1);
        int numeratorA = denominator/B*A;
        int numeratorB = denominator/B1*A1;
        int numerator = numeratorA+numeratorB;

        int gcd = GCD(numerator, denominator);

        System.out.printf("%d %d", numerator/gcd, denominator/gcd);

    }

    public static int GCD (int A, int B){
        while(B!=0){
            int temp = A%B;
            A = B;
            B = temp;
        }
        return A;
    }
}