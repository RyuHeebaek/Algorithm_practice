import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }
            if(isVaild(str)){
                sb.append("yes").append("\n");
            } else sb.append("no").append("\n");

        }
        System.out.print(sb);
    }

    public static boolean isVaild (String str) {
        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            } else if (c == ']') {
                if(stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}