import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayDeque<int[]> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= N; i++){
            deque.addLast(new int[] {i, Integer.parseInt(st.nextToken())});
        }

        while(!deque.isEmpty()){
            int[] current = deque.removeFirst();
            sb.append(current[0]).append(" ");

            if(deque.isEmpty()) break;

            int steps = current[1];
            if(steps > 0){
                for(int i = 0; i < steps -1; i++){
                    deque.addLast(deque.removeFirst());
                }
            } else {
                for(int i = 0; i < Math.abs(steps); i++){
                    deque.addFirst(deque.removeLast());
                }
            }
        }
        System.out.print(sb);
    }
}