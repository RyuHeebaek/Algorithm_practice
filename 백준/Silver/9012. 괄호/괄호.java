import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            String input = br.readLine().trim();
            if(isvalid(input)){
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);
    }
    
    public static boolean isvalid(String str){
        int count = 0;
        
        for(char c : str.toCharArray()){
            if(c == '('){
                count++;
            } else if (c == ')') {
                count--;
                if(count<0){
                    return false;
                }
            }
        }
        return count == 0;
    }
}