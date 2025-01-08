import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        
        int total = 0;
        int result[] = new int[photo.length];
        
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                if(map.get(photo[i][j]) != null) {
                    total += map.get(photo[i][j]);
                }else {
                    total += 0;
                }
            }
            result[i] = total;
            total = 0;
        }
        
        return result;

    }
}