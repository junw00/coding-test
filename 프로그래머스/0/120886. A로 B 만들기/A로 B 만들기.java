import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] befores = before.split("");
        String[] afters = after.split("");
        Arrays.sort(befores); 
        Arrays.sort(afters); 
        
        
        return String.join("" ,befores).equals(String.join("" ,afters)) ? 1: 0;
    }
}