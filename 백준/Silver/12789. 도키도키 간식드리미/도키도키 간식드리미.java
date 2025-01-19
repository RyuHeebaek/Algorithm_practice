import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        System.out.print(checkNum(br.readLine(), N));
    }

    public static String checkNum(String str, int endNum) {
        StringTokenizer st = new StringTokenizer(str);
        Stack<Integer> stack = new Stack<>();
        int receiveFood = 1;

        for(int i=0;i<endNum;i++){
            int num = Integer.parseInt(st.nextToken());
            if(num == receiveFood){
                receiveFood++;
            } else {
                stack.push(num);
            }
            
            while(!stack.isEmpty() && stack.peek() == receiveFood){
                stack.pop();
                receiveFood++;
            }
        }
        return stack.isEmpty() ? "Nice" : "Sad";
    }
}