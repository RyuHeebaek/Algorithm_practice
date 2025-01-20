import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ArrayDeque<Integer> deque1 = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= N; i++){
            deque.addLast(i);
        }

        sb.append("<");
        while(deque.size() > 1){
            for(int i=0;i<K-1;i++){
                deque.addLast(deque.pop());
            }
            deque1.addLast(deque.pop());
            sb.append(deque1.peekLast()).append(", ");
        }
        sb.append(deque.peek()).append(">");
        System.out.println(sb);
    }
}