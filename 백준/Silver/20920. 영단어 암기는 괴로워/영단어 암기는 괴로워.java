import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0;i < n; i++){
            String str = br.readLine();
            if(str.length() >= m){
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        list.sort((a, b) -> {
            int freq1 = map.get(a);
            int freq2 = map.get(b);

            if (freq1 != freq2) {
                return freq2 - freq1;
            }
            if (a.length() != b.length()){
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for(String str : list){
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }
}