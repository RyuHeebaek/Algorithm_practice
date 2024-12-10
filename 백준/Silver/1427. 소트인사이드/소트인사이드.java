import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cnt = new int[10];
        String str = br.readLine();

        for(int i=0;i<str.length();i++){
            cnt[str.charAt(i)-'0']++;
        }

        for(int i=9;i>=0;i--){
            while(cnt[i]-- > 0){
                System.out.print(i);
            }
        }
    }
}