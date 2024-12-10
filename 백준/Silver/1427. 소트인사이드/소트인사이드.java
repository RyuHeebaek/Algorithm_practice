import java.io.InputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        InputStream in = System.in;
        
        int[] cnt = new int[10];
        int c;
        while((c=in.read()) != '\n'){
            cnt[c-'0']++;
        }
        
        for(int i=9;i>=0;i--){
            while(cnt[i]-- > 0){
                System.out.print(i);
            }
        }
    }
}