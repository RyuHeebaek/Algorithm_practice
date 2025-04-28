import java.io.*;

public class Main {

    static int N;
    static int count = 0;
    static boolean[] cols;
    static boolean[] diag1;
    static boolean[] diag2;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        cols = new boolean[N];
        diag1 = new boolean[2 * N + 1];
        diag2 = new boolean[2 * N + 1];

        backTrack(0);
        System.out.println(count);
    }

    static void backTrack(int row){
        if( row == N){
            count++;
            return;
        }

        for(int col = 0; col < N; col++){
            if(cols[col] || diag1[row + col] || diag2[row - col + (N - 1)]){
                continue;
            }

            cols[col] = true;
            diag1[row + col] = true;
            diag2[row - col + (N - 1)] = true;

            backTrack(row + 1);

            cols[col] = false;
            diag1[row + col] = false;
            diag2[row - col + (N -1)] = false;
        }
    }
}