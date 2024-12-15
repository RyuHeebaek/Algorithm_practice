import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] have = new int[n];
        for(int i=0;i<n;i++){
            have[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(have);

        int m = Integer.parseInt(br.readLine());
        int[] check = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            check[i] = Integer.parseInt(st.nextToken());
        }

        for(int target : check){
            if(search(have,target)){
                sb.append("1 ");
            }else {
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString().trim());

    }

    public static boolean search(int[] cards, int target) {
        int left = 0, right = cards.length-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(cards[mid] == target){
                return true;
            } else if (cards[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }
}