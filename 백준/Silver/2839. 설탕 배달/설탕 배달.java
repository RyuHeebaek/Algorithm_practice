import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i*5 + j*3) == n){
                    count = Math.min(count,i+j);
                }
            }
        }
        if(count>n){
            System.out.println(-1);
        } else System.out.println(count);
    }
}