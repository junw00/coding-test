import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerIdxMap = new HashMap<String, Integer>();
        HashMap<Integer, String> player = new HashMap<Integer, String>();
        
        for(int i = 0; i < players.length; i++) {
            playerIdxMap.put(players[i], i);
            player.put(i, players[i]);
        }
        
        for(int i = 0; i < callings.length; i++) {
            int playerIdx = playerIdxMap.get(callings[i]);
            String frontPlayer = player.get(playerIdx - 1);
            
            // callings배열에서 나온 선수와 앞 선수 위치 바꾸기
            player.put(playerIdx, frontPlayer);
            player.put(playerIdx - 1, callings[i]);
            
            // playerIdxMap에서 위치가 바뀐 선수들 인덱스 값 바꾸기
            playerIdxMap.put(callings[i], --playerIdx);
            playerIdxMap.put(frontPlayer, ++playerIdx);
           
        }
        List<String> playerRanking = new ArrayList<String>(player.values());
        return playerRanking;
    }
    
}