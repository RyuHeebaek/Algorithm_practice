import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 입력 수
        int original = n; // 초기 값 저장
        int count = 0; // 사이클 횟수

        do {
            int tens = n / 10; // 십의 자리
            int ones = n % 10; // 일의 자리
            int sum = tens + ones; // 각 자리 숫자의 합
            n = (ones * 10) + (sum % 10); // 새로운 수 생성
            count++;
        } while (n != original);

        System.out.println(count); // 결과 출력
    }
}