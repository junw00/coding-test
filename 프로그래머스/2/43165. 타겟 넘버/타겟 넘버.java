import java.util.*;
class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {

        int cnt = 0;
        int[][] result = new int[numbers.length][(int) Math.pow(2, numbers.length)];
        
        result[0][0] += numbers[0];
        result[0][1] -= numbers[0];
            
        for(int i = 1; i < result.length; i++) {
            int idx = 0;
            
            for(int j = 0; j < (int) Math.pow(2, i + 1); j++) { 
                
                
                if(j % 2 == 0) {
                    result[i][j] = result[i - 1][idx] + numbers[i];    
                }else {
                    result[i][j] = result[i - 1][idx++] - numbers[i]; 
                }
                
                if(i == result.length - 1 && result[i][j] == target) {
                    cnt++;
                }
                
            }
        }
        
        return cnt;
    }
    
    
}