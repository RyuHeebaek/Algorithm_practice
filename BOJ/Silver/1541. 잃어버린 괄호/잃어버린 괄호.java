import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    public static void main(String[] args) throws IOException{
        String Equation = br.readLine();
        String[] parts = Equation.split("-");
        int result = 0;

        for(int i = 0; i < parts.length; i++) {
            int tempSum = sumOfPlus(parts[i]);

            if(i==0) {
                result += tempSum;
            } else {
                result -= tempSum;
            }
        }
        System.out.println(result);
    }

    public static int sumOfPlus(String str) {
        String[] parts = str.split("\\+");
        int sum = 0;
        for(String num : parts) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
