import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static class Node implements Comparable<Node>{
        int time;
        int val;

        public Node(int val, int time) {
            this.time = time;
            this.val = val;
        }
        @Override
        public int compareTo(Node o) {
            return this.val - o.val;
        }
    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st = null;

    static int N;
    static PriorityQueue<Node> q = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            q.offer(new Node(Integer.parseInt(st.nextToken()), i));
        }

        int[] dp = new int[N];
        dp[0] = q.poll().val;
        for(int i = 1; i < N; i++) {
            dp[i] = dp[i-1] + q.poll().val;
        }

        int result = 0;
        for(int i = 0; i < N; i++) {
            result += dp[i];
        }

        System.out.println(result);
    }
}
