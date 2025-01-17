import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        Stack<Integer> stack = new Stack<>();

        long total = 0;

        for(int i=0;i<N;i++){
            int item = Integer.parseInt(br.readLine().trim());
            if(item > 0){
                stack.push(item);
            } else {
                stack.pop();
            }
        }

        while(!stack.empty()){
            total += stack.pop();
        }

        System.out.print(total);
    }
}