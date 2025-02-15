import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr, sortedArr;
    public static int result = -1, count, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];
        sortedArr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, n-1);

        System.out.println(result);
    }

    public static void mergeSort(int left, int right){
        if(count > k) return;
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    public static void merge(int left, int mid, int right){
        int i = left, j = mid + 1, t = 0;

        while(i <= mid && j <= right){
            if(arr[i] < arr[j]){
                sortedArr[t++] = arr[i++];
            }
            else{
                sortedArr[t++] = arr[j++];
            }
        }

        while(i <= mid){
            sortedArr[t++] = arr[i++];
        }

        while(j <= right){
            sortedArr[t++] = arr[j++];
        }

        i = left;
        t = 0;
        while(i <= right){
            count++;

            if(count == k){
                result = sortedArr[t];
                return;
            }

            arr[i++] = sortedArr[t++];
        }
    }
}