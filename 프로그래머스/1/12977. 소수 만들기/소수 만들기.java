import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;


        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    temp = nums[i] + nums[j] + nums[k];
                    if(!isValid(temp)) answer++;
                    temp = 0;
                }        
            }
        }

        return answer;
    }
    
    public boolean isValid(int num) {
        if(num <= 3) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) return true;
        }
        return false;
    }
}