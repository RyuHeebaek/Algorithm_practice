import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());
        int F = Integer.parseInt(br.readLine().trim());

        int base = (N/100) * 100;
        for(int i = 0; i < 100; i++) {
            if((base + i) % F == 0) {
                System.out.printf("%02d\n", i);
                break;
            }
        }

    }
}