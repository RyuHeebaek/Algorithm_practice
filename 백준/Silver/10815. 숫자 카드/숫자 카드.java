import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> cards = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            cards.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int target = Integer.parseInt(st.nextToken());
            if(cards.contains(target)){
                sb.append("1 ");
            }else {
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}