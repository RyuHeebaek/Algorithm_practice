import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());
       char[][] board = new char[n][m];

       for(int i=0;i<n;i++){
           board[i] = br.readLine().toCharArray();
       }

       int minCount = Integer.MAX_VALUE;

       for(int i=0;i<=n-8;i++){
           for(int j=0;j<=m-8;j++){
               int count1 = countRepaints(board,i,j,'B');
               int count2 = countRepaints(board,i,j,'W');
               minCount = Math.min(minCount,Math.min(count1,count2));
           }
       }
       System.out.println(minCount);
    }

    public static int countRepaints(char[][] board, int x, int y, char startColor){
        int count = 0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                char expectedColor = ((i+j)%2==0 ? startColor : (startColor=='W' ? 'B' : 'W'));
                if(board[x+i][y+j] != expectedColor){
                    count++;
                }
            }
        }
        return count;
    }

}