import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        HashSet<String> unheard = new HashSet<>();

        for(int i=0;i<N;i++){
            unheard.add(br.readLine());
        }

        List<String> result = new ArrayList<>();

        for(int i=0;i<M;i++){
            String name = br.readLine();
            if(unheard.contains(name)){
                result.add(name);
            }
        }

        Collections.sort(result);

        StringBuilder sb = new StringBuilder();
        sb.append(result.size()).append("\n");
        for(String name : result) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
    }
}