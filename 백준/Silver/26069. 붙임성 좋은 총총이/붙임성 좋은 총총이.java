import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        HashSet<String> dancing = new HashSet<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name1 = st.nextToken();
            String name2 = st.nextToken();

            if(name1.equals("ChongChong") || name2.equals("ChongChong")){
                dancing.add(name1);
                dancing.add(name2);
            }

            if(dancing.contains(name1) || dancing.contains(name2)){
                dancing.add(name1);
                dancing.add(name2);
            }
        }

        System.out.print(dancing.size());
    }
}