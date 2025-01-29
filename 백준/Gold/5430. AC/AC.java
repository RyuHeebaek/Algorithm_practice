import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < testCase; i++){
            String order = br.readLine();

            int[] arr = new int[Integer.parseInt(br.readLine().trim())];

            String nums = br.readLine();
            if(nums.equals("[]")){
                arr = new int[0];
            } else {
                StringTokenizer st = new StringTokenizer(nums.substring(1, nums.length()-1), ",");
                for(int j = 0; j < arr.length; j++){
                    arr[j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append(orderReturn(arr, order)).append("\n");

        }

        System.out.print(sb);

    }

    public static String orderReturn(int[] arr, String order){
        int start = 0;
        int end = arr.length;
        boolean reverse = false;

        for(char command : order.toCharArray()){
            if(command == 'R'){
                reverse = !reverse;
            } else if (command == 'D') {
                if(start >= end){
                    return "error";
                }
                if(reverse){
                    end--;
                }else {
                    start++;
                }
            }
        }
        StringBuilder sb = new StringBuilder("[");
        if(!reverse){
            for (int i = start; i < end; i++) {
                sb.append(arr[i]);
                if (i < end - 1) {
                    sb.append(",");
                }
            }
        } else {
            for (int i = end - 1; i >= start; i--) {
                sb.append(arr[i]);
                if (i > start) {
                    sb.append(",");
                }
            }
        }
        sb.append("]");
        return sb.toString();
        }
    }