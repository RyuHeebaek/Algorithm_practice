import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    static int N, students;
    static boolean[] input;
    static int[][] student;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        input = new boolean[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < N+1; i++) {
            if(st.nextToken().equals("1")) input[i] = true;
        }

        students = Integer.parseInt(br.readLine().trim());
        student = new int[students][2];
        for(int i = 0; i < students; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 2; j++) {
                student[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < students; i++) {
            if(student[i][0] == 1) {
                maleToggle(student[i][1]);
            } else {
                femaleToggle(student[i][1]);
            }
        }

        int idx = 1;
        for(int i = 1; i < N+1; i++) {
            sb.append(input[i] ? 1 : 0).append(" ");
            if(i==20*idx) {
                idx++;
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    static boolean inRange(int left, int right) {
        return left > 0 && right <= N;
    }
    static void femaleToggle(int student) {
        int right = student + 1;
        int left = student - 1;
        input[student] = !input[student];
        while (inRange(left, right)) {
            if (input[left]==input[right]) {
                input[left] = !input[left];
                input[right] = !input[right];
                left--;
                right++;
            } else {
                break;
            }
        }

    }

    static void maleToggle(int student) {
        for(int i = student; i < N+1; i = i + student){
            input[i] = !input[i];
        }
    }
}
