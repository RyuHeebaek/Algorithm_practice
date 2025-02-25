class Solution {
    
    public static int[] answer;
    
    public int[] solution(int rows, int columns, int[][] queries) {
        
        int[][] matrix = new int[rows][columns];
        answer = new int[queries.length];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = (i*columns + j+1);
            }
        }
        
        int put = 0;
        for(int[] query : queries){
            answer[put++] = rotate(query[0]-1, query[1]-1, query[2]-1, query[3]-1, matrix);   
        }
        return answer;
    }
    
    public static int rotate(int x1, int y1, int x2, int y2, int[][] matrix){
        int firstNum = matrix[x1][y1];
        int min_value = firstNum;
        
        for(int i = x1; i < x2; i++){
            matrix[i][y1] = matrix[i+1][y1];
            min_value = Math.min(min_value, matrix[i+1][y1]);
        }
        
        for(int i = y1; i < y2; i++){
            matrix[x2][i] = matrix[x2][i+1];
            min_value = Math.min(min_value, matrix[x2][i+1]);
        }
        
        for(int i = x2; i > x1; i--){
            matrix[i][y2] = matrix[i-1][y2];
            min_value = Math.min(min_value, matrix[i-1][y2]);
        }
        
        for(int i = y2; i > y1 + 1; i--){
            matrix[x1][i] = matrix[x1][i-1];
            min_value = Math.min(min_value, matrix[x1][i-1]);
        }
        
        matrix[x1][y1+1] = firstNum;
        return min_value;
    }
}