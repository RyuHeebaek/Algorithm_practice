import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine().trim());

        for(int i = 0; i < testCase; i++){

            String arabiaOrRoma = br.readLine();
            if(arabiaOrRoma.matches("^[0-9]*$")){
                sb.append(arabicToRoman(Integer.parseInt(arabiaOrRoma))).append("\n");
            } else {
                sb.append(romanToArabic(arabiaOrRoma)).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static String arabicToRoman(int num){
        StringBuilder sb = new StringBuilder();
        int[] value = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = new String[] {"M", "CM", "D", "CD",  "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for(int i = 0; i < value.length; i++){
            while (num >= value[i]){
                sb.append(roman[i]);
                num -= value[i];
            }
        }
        return sb.toString();
    }

    public static int romanToArabic(String str){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prev = 0;
        for(int i = str.length()-1; i >= 0; i--){
            int current = map.get(str.charAt(i));

            if(current < prev) {
                total -= current;
            } else {
                total += current;
            }
            prev = current;
        }
        return total;
    }
}