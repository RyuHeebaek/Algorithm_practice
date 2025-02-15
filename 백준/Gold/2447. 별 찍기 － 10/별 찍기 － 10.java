import java.io.*;
import java.util.*;

public class Main {

    public static char[][] stars;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        stars = new char[n][n];

        checkStars(0, 0, n, false);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sb.append(stars[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void checkStars (int x, int y, int n, boolean blank) {

        if(blank){
            for(int i = x; i < x+n; i++){
                for(int j = y; j < y+n; j++){
                    stars[i][j] = ' ';
                }
            }
            return;
        }

        if(n <= 1){
            stars[x][y] = '*';
            return;
        }

        int blockSize = n/3;
        int startCount = 0;

        for(int i = x; i < x + n; i+=blockSize){
            for(int j = y; j < y + n; j+=blockSize){
                startCount++;
                checkStars(i, j, blockSize, startCount == 5);
            }
        }
    }
}