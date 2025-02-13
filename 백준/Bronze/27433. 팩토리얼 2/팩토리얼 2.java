import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(recursive(n));
    }

    public static long recursive (int n) {
        if(n == 0) return 1;
        return n * recursive(n-1);
    }
}