import java.util.*;
class Solution {
    String[] arr = {"1", "2", "4"};
    public String solution(int n) {
        
        
        
        return dfs(n);
    }
    
    public String dfs(int num) {
        if(num == 1 || num == 2 || num == 3) {
            return arr[num - 1];
        }
        
        if(num % 3 == 0) {
            return dfs((num - 1) / 3) + arr[2];
        }
        
        return dfs(num / 3) + arr[num % 3 != 0 ? num % 3 - 1 : 2];
    }
}