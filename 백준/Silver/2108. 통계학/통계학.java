import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine().trim());
        }

        System.out.println(arithmeticMean(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr));
        System.out.println(range(arr));
    }

    public static int arithmeticMean (int[] arr){
        int result = 0;

        for (int j : arr) {
            result += j;
        }

        return Math.round((float) result / arr.length);
    }

    public static int median (int[] arr){
        Arrays.sort(arr);
        int middle = (arr.length - arr.length/2) - 1;
        return arr[middle];
    }

    public static int mode (int[] arr){
        int[] numbers = new int[8001];
        ArrayList<Integer> mode = new ArrayList<>();
        int max = 0;

        for (int j : arr) {
            int num = j + 4000;
            numbers[num]++;
            max = Math.max(max, numbers[num]);
        }

        for(int i = 0; i < 8001;i++){
            if(numbers[i] == max){
                mode.add(i - 4000);
            }
        }

        Collections.sort(mode);

        return mode.size() > 1 ? mode.get(1) : mode.get(0);
    }

    public static int range (int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }
}