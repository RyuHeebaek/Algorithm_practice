import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] og = new int[n];
        int[] sorted = new int[n];

        for(int i=0;i<n;i++){
            og[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        Map<Integer,Integer> map = new HashMap<>();

        int rank = 0;

        for(int num : sorted){
            if(!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int num : og){
            sb.append(map.get(num)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}