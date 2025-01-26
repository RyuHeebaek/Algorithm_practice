import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> greeted = new HashSet<>();
        int totalCount = 0;
        
        for(int i = 0; i < n; i++){
            String input = br.readLine();
            if(input.equals("ENTER")){
                totalCount += greeted.size();
                greeted.clear();
            } else {
                greeted.add(input);
            }
        }
        totalCount += greeted.size();
        System.out.print(totalCount);
    }
}