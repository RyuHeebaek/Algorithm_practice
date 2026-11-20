import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class codeTree_chap_4_2{
    public static void main(String[] args) throws IOException {
        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());



        int days1 = d1;
        int days2 = d2;

        for(int i = 0; i < m1 -1; i++){
            days1 += day[i];
        }

        for(int i = 0; i < m2 - 1; i++){
            days2 += day[i];
        }



        System.out.println(Math.abs(days1 - days2) + 1);
    }
}
