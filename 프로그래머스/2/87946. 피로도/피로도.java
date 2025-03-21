import java.util.*;
class Solution {
    int max = Integer.MIN_VALUE;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        for(int i = 0; i < dungeons.length; i++) {
            
            if(dungeons[i][0] <= k) {
                System.out.println(i);
                boolean[] isVisited = new boolean[dungeons.length];
                isVisited[i] = true;
                dfs(dungeons, k - dungeons[i][1], isVisited, i, 1);
            }
        }
        return max;
    }
    
    public void dfs(int[][] dungeons, int pirodo, boolean[] isVisited, int idx, int complete) {
       
        
        for(int i = 0; i < dungeons.length; i++) {
            if(!isVisited[i] && pirodo >= dungeons[i][0]) {
                isVisited[i] = true;
                System.out.println(i);
                dfs(dungeons, pirodo - dungeons[i][1], isVisited, i, complete + 1);
                max = Math.max(complete + 1, max);
                isVisited[i] = false;
                
            }
        }
    }
}