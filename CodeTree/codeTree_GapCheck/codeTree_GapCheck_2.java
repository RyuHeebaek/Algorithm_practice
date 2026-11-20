package codeTree_GapCheck;//import java.io.*;
//import java.util.*;
//
//public class Main {
//
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static StringTokenizer st;
//
//    public static void main(String[] args) throws IOException {
//        int N = Integer.parseInt(br.readLine());
//        int Q = Integer.parseInt(br.readLine());
//
//        int[] candy = new int[N];
//        int curr = 0; // 1번 바구니를 0번 인덱스로 관리
//
//        for (int i = 0; i < Q; i++) {
//            st = new StringTokenizer(br.readLine());
//            int dir = Integer.parseInt(st.nextToken());
//            int count = Integer.parseInt(st.nextToken());
//
//            for (int k = 0; k < count; k++) {
//                candy[curr]++;
//
//                // 마지막 이동 단계가 아닌 경우에만 다음 바구니로 이동
//                if (k < count - 1) {
//                    if (dir == 1) {
//                        curr = (curr + 1) % N;
//                    } else {
//                        curr = (curr - 1 + N) % N;
//                    }
//                }
//            }
//        }
//
//        int maxCandy = 0;
//        for (int i = 0; i < N; i++) {
//            maxCandy = Math.max(maxCandy, candy[i]);
//        }
//
//        System.out.println(maxCandy);
//    }
//}

import java.io.*;

class codeTree_GapCheck_2{

    static int count, N, A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        A = Integer.parseInt(br.readLine());
        count = Integer.MAX_VALUE;

        move(0, 1);

        System.out.println(count);
    }

    public static void move(int idx, int now) {
        if (now >= A) {
            count = Math.min(count, idx);
            return;
        }

        if(now >= 1) {
            move(idx + 1, now * 2);
            move(idx + 1, now + 1);
            move(idx + 1, now - 2);
        } else return;


    }
}

