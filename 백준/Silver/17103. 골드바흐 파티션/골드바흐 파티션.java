import java.io.*;
import java.util.Arrays;

public class Main {
    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine().trim());

        int MAX = 1000000;
        sieve(MAX);

        for(int i=0;i<testCase;i++){
            int N = Integer.parseInt(br.readLine().trim());
            sb.append(countPartition(N)).append("\n");
        }

        System.out.print(sb);

    }

    public static void sieve(int max) {
        isPrime = new boolean[max+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for(int i=2; i*i <= max;i++){
            if(isPrime[i]) {
                for(int j= i*i;j<=max; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }

    public static int countPartition(int n){
        int count = 0;

        for(int i=2;i<=n/2;i++){
            if(isPrime[i] && isPrime[n-i]){
                count++;
            }
        }

        return count;
    }
}