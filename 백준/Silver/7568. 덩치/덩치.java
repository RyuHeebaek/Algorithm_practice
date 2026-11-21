import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    static int N;
    static int[][] people;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine().trim());
        people = new int[N][2];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int tall = Integer.parseInt(st.nextToken());
            people[i][0] = weight;
            people[i][1] = tall;
        }
        for (int i = 0; i < N; i++) {
            int rank = 1;

            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                if (people[j][0] > people[i][0] && people[j][1] > people[i][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }

        System.out.println(sb);
    }

}
