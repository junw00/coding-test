import java.util.*;
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String[] video = video_len.split(":");
        String[] start = pos.split(":");
        String[] opStart = op_start.split(":");
        String[] opEnd = op_end.split(":");
        long videoLen = Long.parseLong(video[0]) * 60 + Long.parseLong(video[1]);
        long startLen = Long.parseLong(start[0]) * 60 + Long.parseLong(start[1]);
        long opStartLen = Long.parseLong(opStart[0]) * 60 + Long.parseLong(opStart[1]);
        long opEndLen = Long.parseLong(opEnd[0]) * 60 + Long.parseLong(opEnd[1]);
        
        for(String comm : commands) {
            if(startLen >= opStartLen && startLen <= opEndLen) {
                startLen = opEndLen;
            }
            
            if(comm.equals("next")) {
                startLen += 10;
            }else {
                startLen -= 10;
            }
            
            
            if(startLen < 0) {
                startLen = 0;
            }else if(startLen > videoLen) {
                startLen = videoLen;
            }
        }
        
        if(startLen >= opStartLen && startLen <= opEndLen) {
            startLen = opEndLen;
        }
        
        String minute = Long.toString(startLen / 60);
        String second = Long.toString(startLen % 60);
        minute = minute.length() == 1 ? "0" + minute : minute;
        second = second.length() == 1 ? "0" + second : second;
        return minute + ":" + second;
    }
}