import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] isVisited = new boolean[words.length];
        Queue<String[]> q = new LinkedList<>();
        q.add(new String[] {begin, "0"});
        while(!q.isEmpty()) {
            String[] strInfo = q.poll();
            
            if(strInfo[0].equals(target)) {
                return Integer.parseInt(strInfo[1]);
            }
            
            for(int i = 0; i < words.length; i++) {
                int cnt = 0;
                for(int j = 0; j < words[i].length(); j++) {
                    if(strInfo[0].charAt(j) != words[i].charAt(j)) cnt++;
                }
                if(cnt == 1 && !isVisited[i]) {
                    isVisited[i] = true;
                    q.add(new String[] {words[i], String.valueOf(Integer.parseInt(strInfo[1]) + 1)});
                }
            }
        }
        return answer;
    }
}