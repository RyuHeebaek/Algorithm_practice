class Solution {
    public String solution(String X, String Y) {
        return commonNum(X, Y);
    }
    public static String commonNum (String x, String y){
        int[] numX = new int[10];
        int[] numY = new int[10];
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<x.length();i++){
            numX[x.charAt(i)-'0']++;
        }

        for(int i=0;i<y.length();i++){
            numY[y.charAt(i)-'0']++;
        }

        for(int i=9;i>=0;i--){
            int commonCount = Math.min(numX[i], numY[i]);
            while(commonCount>0){
                sb.append(i);
                commonCount--;
            }
        }

        if(sb.length() == 0){
            return "-1";
        }

        if(sb.toString().equals("0".repeat(sb.length()))){
            return "0";
        }
        
        return sb.toString();
    }
}