import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        
        Map<Character, Integer> key = new HashMap<>();

        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                if(key.get(s.charAt(i)) == null){
                    key.put(s.charAt(i), i + 1);
                } else if (key.get(s.charAt(i)) > i + 1) {
                    key.put(s.charAt(i), i + 1);
                }
            }
        }
        
        int total = 0;
        for (int i = 0; i < targets.length; i++ ) {
            for (int j = 0;  j < targets[i].length(); j++) {
                if (key.get(targets[i].charAt(j)) == null) {
                    total = -1;
                    result[i] = total;
                    break;
                }else{
                    total += key.get(targets[i].charAt(j));
                }
            }
            result[i] = total;
            total = 0;

        }
        return result;
    }
}