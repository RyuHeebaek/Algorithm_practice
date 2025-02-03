import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        while(true){
            int total = 0;
            int n = Integer.parseInt(br.readLine());
            if(n==-1) break;
            int sqrt = (int) Math.sqrt(n);

            for(int i=1;i<=sqrt;i++){
                if(n%i==0){
                    arr.add(i);
                    if(n/i != i){
                        arr.add(n/i);
                    }
                }
            }
            arr.sort(Comparator.naturalOrder());
            arr.remove(arr.size()-1);

            for (Integer integer : arr) {
                total += integer;
            }

            if(n==total){
                System.out.printf("%d = ",n);
                for(int j=0;j<arr.size()-1;j++){
                    System.out.printf("%d + ",arr.get(j));
                }
                System.out.println(arr.get(arr.size()-1));
            } else {
                System.out.printf("%d is NOT perfect.\n",n);
            }
            arr.clear();
        }
    }
}