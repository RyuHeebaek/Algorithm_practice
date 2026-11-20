package codeTree_GapCheck;

import java.io.*;
import java.util.StringTokenizer;

public class codeTree_GapCheck_1 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[][] rest;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int startx = Integer.parseInt(st.nextToken());
        int starty = Integer.parseInt(st.nextToken());

        int minTime = Integer.parseInt(st.nextToken());
        int maxTime = Integer.parseInt(st.nextToken());

        rest = new int[N][2];
        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());

            rest[i][0] = Integer.parseInt(st.nextToken());
            rest[i][1] = Integer.parseInt(st.nextToken());
        }

        int minMove = Integer.MAX_VALUE;

        for(int i = minTime ; i <= maxTime; i++){
            for(int j = 0; j < N; j++){
                minMove = Math.min(minMove, Math.abs(rest[j][0] - startx * i) + Math.abs(rest[j][1] - starty * i));
            }
        }

        System.out.println(minMove);
    }
}
