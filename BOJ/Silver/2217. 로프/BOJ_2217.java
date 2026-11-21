import java.io.*;
import java.util.*;

public class BOJ_2217 {

     static class Rope implements Comparable<Rope>{
        int weight;
        public Rope(int weight) {
            this.weight = weight;
        }

        @Override
        public int compareTo(Rope o) {
            return this.weight - o.weight;
        }
    }

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    static PriorityQueue<Rope> queue = new PriorityQueue<>();
    static int N;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            queue.offer(new Rope(Integer.parseInt(br.readLine())));
        }
        int result = Integer.MIN_VALUE;
        int size = queue.size();
        for(int i = 0; i < size; i++) {
            result = Math.max(queue.poll().weight * N--, result);
        }
        System.out.println(result);
    }



}
