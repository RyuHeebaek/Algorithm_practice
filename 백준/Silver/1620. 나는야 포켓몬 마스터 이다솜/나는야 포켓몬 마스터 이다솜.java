import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> name_index = new HashMap<>();
        String[] index_Name = new String[N+1];

        for(int i=1;i<=N;i++){
            String name = br.readLine();
            name_index.put(name, i);
            index_Name[i] = name;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<M;i++){
            String ans = br.readLine();
            if(Character.isDigit(ans.charAt(0))){
                int index = Integer.parseInt(ans);
                sb.append(index_Name[index]).append("\n");
            } else {
                sb.append(name_index.get(ans)).append("\n");
            }
        }

        System.out.print(sb);

    }
}