import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 666;

        while (true) {
            if(contains666(num)){
                count++;
            }
            if(count==n){
                System.out.println(num);
                break;
            }
            num++;
        }
        
    }
    
    public static boolean contains666(int n){
        while(n>0){
            if(n%1000 == 666){
                return true;
            }
            n /= 10;
        }
        return false;
    }
}