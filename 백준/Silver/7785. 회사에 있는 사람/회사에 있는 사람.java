import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        HashSet<String> company = new HashSet<>();

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken(), commute = st.nextToken();
            if(commute.equals("enter")){
                company.add(name);
            }
            if (commute.equals("leave")) {
                company.remove(name);
            }
        }

        List<String> result = new ArrayList<>(company);
        result.sort(Collections.reverseOrder());
        
        for(String name : result){
            sb.append(name).append("\n");
        }
        System.out.println(sb.toString().trim());

    }
}