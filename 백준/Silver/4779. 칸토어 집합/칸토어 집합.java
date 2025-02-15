import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while((input = br.readLine()) != null){
            int n = Integer.parseInt(input);
            int length = (int) Math.pow(3, n);
            char[] result = new char[length];

            Arrays.fill(result, '-');

            cantorSet(result, 0, length);

            System.out.println(new String(result));
        }
    }

    public static void cantorSet(char[] arr, int start, int length){
        if(length == 1) return;

        int segmentLength = length / 3;

        for(int i = start + segmentLength; i < start + segmentLength * 2; i++){
            arr[i] = ' ';
        }

        cantorSet(arr, start, segmentLength);
        cantorSet(arr, start + segmentLength * 2, segmentLength);
    }
}