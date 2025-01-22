import java.util.Arrays;

class Solution {

    public static boolean[] isPrime;

    private static void SieveOfEratosthenes(){
        isPrime = new boolean[3000];

        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= Math.sqrt(2999); i++){
            if(isPrime[i]){
                for(int j = i*i; j <= 2999; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }

    public int solution(int[] nums) {
        SieveOfEratosthenes();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(isPrime_fun(nums[i] + nums[j] + nums[k])){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isPrime_fun(int num){
        return isPrime[num];
    }
}