import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int max = 0;
        Map<String, Integer> idx = new HashMap<>();
        //특정 친구에게 선물을 준 횟수
        Map<String, Integer> giftMap = new HashMap<>();
        for(String gift: gifts) {
            String[] info = gift.split(" ");
            idx.put(info[0], idx.getOrDefault(info[0], 0) + 1);
            idx.put(info[1], idx.getOrDefault(info[1], 0) - 1);
            giftMap.put(gift, giftMap.getOrDefault(gift, 0) + 1);
        }
        
        for(int i = 0; i < friends.length; i++) {
            int giftNum = 0;
            for(int j = 0; j < friends.length; j++) {
                if(i != j) {
                    String key = friends[i] + " " + friends[j];
                    String reverseKey = friends[j] + " " + friends[i];
                    if(giftMap.get(key) == null && giftMap.get(reverseKey) == null) {
                        if(idx.get(friends[i]) == null) continue;
                        
                        if(idx.get(friends[j]) == null) giftNum++;
                        
                        if(idx.get(friends[j]) != null && idx.get(friends[i]) > idx.get(friends[j])) giftNum++;
                    }
                    if(giftMap.get(key) == null) continue;
                    if(giftMap.get(reverseKey) == null) {
                        
                        giftNum++;
                        continue;
                    }
                    if(giftMap.get(key) > giftMap.get(reverseKey)) giftNum++;
                    else if(giftMap.get(key) == giftMap.get(reverseKey) && idx.get(friends[i]) > idx.get(friends[j])) giftNum++;

                }
            }
            max = Math.max(giftNum, max);
        }
        return max;
    }
}