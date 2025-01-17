import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> runners = new HashMap<>();

        for(String s : participant){
            runners.put(s, runners.getOrDefault(s, 0) + 1);
        }

        for(String s : completion){
            runners.put(s, runners.get(s)-1);
        }
        
        for(String s : runners.keySet()){
            if(runners.get(s)>0){
                return s;
            }
        }
        return "";
    }
}