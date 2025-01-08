import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        Arrays.sort(mats);
        for(int k = mats.length - 1; k >= 0; k--) {
            for(int i = 0; i < park.length; i++) {
                for(int j = 0; j < park[0].length; j++) {
                    if(!isRange(park, i ,j)) continue;
                    
                    if(isPut(park, i, j, mats[k])) {
                        return mats[k];
                    }
                }
            }
        }
        return -1;
    }
    
    public boolean isPut(String[][] park, int row, int col, int size) {
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(!isRange(park, i, j)) {
                    return false;
                }
                
            }
        }
        return true;
    }
    
    public boolean isRange(String[][] park, int row, int col) {
        if(row > park.length - 1 || col > park[0].length - 1 || !park[row][col].equals("-1")) {
            return false;
        }
        return true;
    }
}