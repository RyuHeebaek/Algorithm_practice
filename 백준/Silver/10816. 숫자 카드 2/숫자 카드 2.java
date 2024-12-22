import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> cards = new HashMap<>();

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            cards.put(num, cards.getOrDefault(num,0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<M;i++){
            int value = Integer.parseInt(st.nextToken());
            sb.append(cards.getOrDefault(value,0)).append(" ");
        }
        System.out.print(sb);
    }
}