import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(int[][] line) {
        ArrayList<int[]> points = new ArrayList<>();

        int max_x = Integer.MIN_VALUE, max_y = Integer.MIN_VALUE;
        int min_x = Integer.MAX_VALUE, min_y = Integer.MAX_VALUE;

        for(int i = 0; i < line.length-1; i++){
            int a = line[i][0];
            int b = line[i][1];
            int e = line[i][2];
            for(int j = i+1; j < line.length; j++){
                int c = line[j][0];
                int d = line[j][1];
                int f = line[j][2];

                long denominator = (long) a * d - (long) b * c;
                if(denominator == 0) continue;

                long numerator_x = (long) b * f - (long) e * d;
                long numerator_y = (long) e * c - (long) a * f;

                if(numerator_x % denominator == 0 && numerator_y % denominator == 0){
                    int x = (int) (numerator_x / denominator);
                    int y = (int) (numerator_y / denominator);
                    points.add(new int[]{x, y});

                    max_x = Math.max(max_x, x);
                    max_y = Math.max(max_y, y);
                    min_x = Math.min(min_x, x);
                    min_y = Math.min(min_y, y);
                }
            }
        }

        int x_len = max_x - min_x + 1;
        int y_Len = max_y - min_y + 1;
        char[][] answer = new char[y_Len][x_len];

        for(char[] row : answer){
            Arrays.fill(row, '.');
        }

        for (int[] point : points) {
            int x = point[0] - min_x;
            int y = max_y - point[1];
            answer[y][x] = '*';
        }

        String[] result = new String[y_Len];
        for(int i = 0; i < y_Len; i++){
            result[i] = new String(answer[i]);
        }
        return result;
    }
}