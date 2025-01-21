import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int total = 1;
        for(int i = N;i>0;i--){
            total *= i;
        }
        System.out.println(total);
    }
}