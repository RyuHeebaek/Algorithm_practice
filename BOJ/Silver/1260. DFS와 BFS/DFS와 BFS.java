import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;
    static StringBuilder sb = new StringBuilder();

    static int N, M, V;
    static boolean[] visited;
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        for(int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        visited = new boolean[N+1];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        for(int i = 1; i <= N; i++) {
            Collections.sort(list.get(i));
        }

        dfs(V);
        sb.append("\n");
        visited = new boolean[N+1];
        bfs(V);
        System.out.println(sb);
    }

    static void dfs(int v) {
        if(visited[v]) {
            return;
        }
        sb.append(v).append(" ");
        visited[v] = true;

        for(int next : list.get(v)) {
            dfs(next);
        }
    }

    static void bfs(int v) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(v);
        visited[v] = true;

        while(!queue.isEmpty()) {
            int curr = queue.poll();
            sb.append(curr).append(" ");
            for(int next : list.get(curr)) {
                if(!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}
