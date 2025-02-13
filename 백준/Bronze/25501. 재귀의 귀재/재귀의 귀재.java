import java.io.*;
import java.util.*;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            count = 0;
            sb.append(isPalindrome(str, 0, str.length()-1)).append(" ").append(count).append("\n");
        }
        System.out.print(sb);
    }

    public static int isPalindrome(String str, int l, int r) {
        count++;
        if(l >= r) return 1;
        else if (str.charAt(l) != str.charAt(r)) {
            return 0;
        } else {
            return isPalindrome(str, l + 1, r -1);
        }
    }
}