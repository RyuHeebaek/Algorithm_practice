import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>();
        List<String> messages = new ArrayList<>();

        for(String log : record){
            String[] split = log.split(" ");
            String commend = split[0];
            String userId = split[1];

            switch (commend){
                case "Enter" :
                    String nickNameEnter = split[2];
                    userMap.put(userId, nickNameEnter);
                    messages.add(userId + "님이 들어왔습니다.");
                    break;
                case "Leave" :
                    messages.add(userId + "님이 나갔습니다.");
                    break;
                case "Change" :
                    String nickNameChange = split[2];
                    userMap.put(userId, nickNameChange);
                    break;
            }
        }

        String[] result = new String[messages.size()];
        int index =  0;
        for(String message : messages){
            String userId = message.split("님")[0];
            String nickName = userMap.get(userId);
            result[index++] = message.replace(userId, nickName);
        }
        return result;
    }
}