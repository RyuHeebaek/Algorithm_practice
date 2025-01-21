import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int total = 1;
        for(int i=N;i>N-M;i--){
            total *= i;
        }
        for(int i=1;i<=M;i++){
            total /= i;
        }
        System.out.println(total);
    }
}