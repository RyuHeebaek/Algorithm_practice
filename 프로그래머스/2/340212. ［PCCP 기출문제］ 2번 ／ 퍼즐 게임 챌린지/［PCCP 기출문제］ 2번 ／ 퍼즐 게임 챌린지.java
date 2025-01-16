class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int min = 1;
        int max = 100_000;
        int answer = max;

        while(min <= max){
            int mid = (min + max) / 2;

            if(canSolveWithInLimit(diffs, times, limit, mid)){
                answer = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return answer;
    }

    public static boolean canSolveWithInLimit(int[] diffs, int[] times, long limit, int level){
        long totalTime = 0;
        int n = diffs.length;

        for(int i = 0; i < n; i++){
            int diff = diffs[i];
            int time_cur = times[i];
            int time_prev = i > 0 ? times[i-1] : 0;

            if(diff <= level){
                totalTime += time_cur;
            } else {
                int misstake = diff - level;
                totalTime += misstake * (time_cur + time_prev) + time_cur;
            }

            if(totalTime>limit){
                return false;
            }
        }
        return true;
    }
}