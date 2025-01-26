import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine().trim());
        int S = 0; // 집합을 나타내는 비트마스크

        for (int i = 0; i < M; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "add":
                    int addNum = Integer.parseInt(command[1]);
                    S |= (1 << (addNum - 1));
                    break;
                case "remove":
                    int removeNum = Integer.parseInt(command[1]);
                    S &= ~(1 << (removeNum - 1));
                    break;
                case "check":
                    int checkNum = Integer.parseInt(command[1]);
                    sb.append((S & (1 << (checkNum - 1))) > 0 ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    int toggleNum = Integer.parseInt(command[1]);
                    S ^= (1 << (toggleNum - 1));
                    break;
                case "all":
                    S = (1 << 20) - 1; // 20개의 비트를 전부 1로 설정
                    break;
                case "empty":
                    S = 0; // 비트를 전부 0으로 설정
                    break;
            }
        }

        System.out.print(sb);
    }
}