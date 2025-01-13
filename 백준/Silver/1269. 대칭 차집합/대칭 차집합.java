import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        HashSet<Integer> val1 = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            val1.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> val2 = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            val2.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;

        for(int num : val1){
            if(!val2.contains(num)){
                count++;
            }
        }

        for(int num : val2){
            if(!val1.contains(num)){
                count++;
            }
        }

        System.out.println(count);

    }
}