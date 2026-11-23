import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st = null;

    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int N, M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];

        for(int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        int result = 0;
        for(int i = 1; i <= N; i++) {
            if(dfs(i)) result++;
        }
        System.out.println(result);
    }

    public static boolean dfs(int v) {
        if(visited[v]) {
            return false;
        }

        visited[v] = true;

        for(int next : list.get(v)) {
            dfs(next);
        }
        return true;
    }
}
