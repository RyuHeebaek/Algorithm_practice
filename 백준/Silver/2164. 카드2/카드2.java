import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        for(int i = n; i > 0; i--){
            deque.push(i);
        }

        while(deque.size()>1){
            deque.removeFirst();
            deque.addLast(deque.removeFirst());
        }

        System.out.print(deque.peek());
    }
}