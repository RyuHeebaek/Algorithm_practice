import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            long num = Long.parseLong(br.readLine());
            sb.append(findNextPrime(num)).append("\n");
        }
        System.out.print(sb);
    }

    public static long findNextPrime (long num){
        if(num == 0 || num == 1 || num == 2){
            return 2;
        }

        while(true){
            boolean flag = true;

            for(int i=2;i<Math.sqrt(num)+1;i++){
                if(num%i == 0){
                    flag = false;
                    break;
                }
            }

            if(flag){
                return num;
            }
            num++;
        }
    }
}