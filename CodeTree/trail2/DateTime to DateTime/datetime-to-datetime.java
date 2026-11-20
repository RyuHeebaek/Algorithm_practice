import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int secToGivenval = (60 * 24 * 11) + (60 * 11) + 11;
        int secToRstTime = (60 * 24 * A) + (60 * B) + C;

        System.out.println(secToRstTime -  secToGivenval < 0 ? -1 : secToRstTime - secToGivenval);
    }
}
