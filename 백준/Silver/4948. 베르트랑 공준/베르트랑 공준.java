import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            int N = Integer.parseInt(br.readLine().trim());
            if(N==0) break;
            sb.append(check(N)).append("\n");
        }

        System.out.print(sb);
    }

    public static int check (int n){
        int m = n*2;
        int count = 0;

        for(int i=n+1;i<=m;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }

        if(n==2){
            return true;
        }

        if(n%2 == 0){
            return false;
        }

        for(int i=3;i*i <= n;i+=2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}