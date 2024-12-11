import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String[][] members = new String[n][2];
        
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            members[i][0] = st.nextToken();
            members[i][1] = st.nextToken();
        }
        
        Arrays.sort(members, (a,b) -> {
            int ageA = Integer.parseInt(a[0]);
            int ageB = Integer.parseInt(b[0]);
            return Integer.compare(ageA, ageB);
        });
        
        StringBuilder sb = new StringBuilder();
        
        for(String[] member : members){
            sb.append(member[0]).append(" ").append(member[1]).append("\n");
        }
        System.out.println(sb.toString());
        
        
    }
}