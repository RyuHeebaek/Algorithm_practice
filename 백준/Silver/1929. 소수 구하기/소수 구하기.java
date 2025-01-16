import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb  = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken().trim()), M = Integer.parseInt(st.nextToken().trim());

        for(int i=N;i<=M;i++){
            if(checkPrime(i)){
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static boolean checkPrime (int n){
        if(n<2){
            return false;
        }

        if(n==2){
            return true;
        }

        if(n%2==0){
            return false;
        }

        for(int i=3;i * i <= n;i += 2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}