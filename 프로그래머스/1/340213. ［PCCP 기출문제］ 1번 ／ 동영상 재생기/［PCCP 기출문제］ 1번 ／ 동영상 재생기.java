public class Solution {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLength = timeToSeconds(video_len);
        int currentPosition = timeToSeconds(pos);
        int openingStart = timeToSeconds(op_start);
        int openingEnd = timeToSeconds(op_end);

        currentPosition = autoSkip(openingStart, openingEnd, currentPosition);
        
        for(String command : commands){
            if(command.equals("prev")){
                currentPosition = Math.max(0,currentPosition-10);
            } else if (command.equals("next")) {
                currentPosition = Math.min(videoLength, currentPosition+10);
            }
            currentPosition = autoSkip(openingStart, openingEnd, currentPosition);
        }

        return secondsToTime(currentPosition);
    }

    public static int timeToSeconds(String time){
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return minutes * 60 + seconds;
    }

    public static String secondsToTime(int seconds){
        int minutes = seconds/60;
        seconds %= 60;
        return String.format("%02d:%02d",minutes,seconds);
    }
    
    public static int autoSkip(int opStart, int opEnd, int pos){
        if(opStart <= pos && pos <= opEnd){
            pos = opEnd;
        }
        return pos;
    }
}