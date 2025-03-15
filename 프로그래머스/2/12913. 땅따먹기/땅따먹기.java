import java.util.*;
class Solution {
    int solution(int[][] land) {
        int answer = 0;
//         int[][] result = new int[land.length][land[0].length];
        
//         //제일 위쪽 세팅
//         for(int i = 0; i < land[0].length; i++) {
//             result[0][j] = land[0][j];
//         }
        
        for(int i = 1; i < land.length; i++) {
            for(int j = 0; j < land[i].length; j++) {
                int cur = land[i][j];
                for(int k = 0; k < land[i].length; k++) {
                    if(j == k) continue;
                    land[i][j] = Math.max(land[i][j], cur + land[i - 1][k]);
                }
            }
        }
        
        for(int i = 0; i < land[0].length; i++) {
            answer = Math.max(answer, land[land.length - 1][i]);
        }

        return answer;
    }
}