import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double[] arr = new double[Integer.parseInt(br.readLine())];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        for(int i=0;i<arr.length;i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }
        
        double max = 0;
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            max += ((arr[i]/arr[arr.length-1])*100);
        }
        
        System.out.print(max/arr.length);
        
    }
}