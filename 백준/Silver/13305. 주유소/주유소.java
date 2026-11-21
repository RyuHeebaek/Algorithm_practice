import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    static int N;
    static int[] oil, road;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        oil = new int[N];
        road = new int[N-1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < road.length; i++) {
            road[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < oil.length; i++) {
            oil[i] = Integer.parseInt(st.nextToken());
        }

        int lowPrice = oil[0];
        long pay = 0;
        for(int i = 0; i < N-1; i++) {
            if(lowPrice > oil[i]) {
                lowPrice = oil[i];
            }
            pay += (long) lowPrice * road[i];
        }
        System.out.println(pay);
    }



}
