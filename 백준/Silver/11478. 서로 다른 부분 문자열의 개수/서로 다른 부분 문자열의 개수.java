import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        HashSet<String> hash = new HashSet<>();

        for(int i=0;i<str.length();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<str.length();j++){
                sb.append(str.charAt(j));
                hash.add(sb.toString());
            }
        }

        System.out.println(hash.size());

    }
}