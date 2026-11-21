import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Node implements Comparable<Node>{
        int val;
        public Node(int val) {
            this.val = val;
        }

        @Override
        public int compareTo(Node o) {
            return this.val - o.val;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    static int N;
    static PriorityQueue<Node> queue = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            queue.offer(new Node(Integer.parseInt(st.nextToken())));
        }

        int[] dp = new int[N];
        dp[0] = queue.poll().val;
        for(int i = 1; i < N; i++) {
            dp[i] = dp[i-1] + queue.poll().val;
        }

        int result = 0;
        for(int i = 0; i < N; i++) {
            result += dp[i];
        }
        System.out.println(result);
    }
}
