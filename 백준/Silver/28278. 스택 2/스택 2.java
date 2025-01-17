import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine().trim());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken().trim());
            switch (command){
                case 1:
                    stack.push(Integer.parseInt(st.nextToken().trim()));
                    break;
                case 2:
                    if(!stack.empty()){
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    sb.append(stack.empty() ? 1 : 0).append("\n");
                    break;
                case 5:
                    if(!stack.empty()){
                        sb.append(stack.peek()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}