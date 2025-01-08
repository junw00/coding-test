import java.util.*;
class Solution {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int idx = getIdx(ext);
        List<int[]> l = extract(data, idx, val_ext);
        int[][] answer = new int[l.size()][4];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = l.get(i);
        }
        answer = sort(answer, getIdx(sort_by));
        return answer;
    }
    
    public int getIdx(String ext) {
        if(ext.equals("code")) return 0;
        if(ext.equals("date")) return 1;
        if(ext.equals("maximum")) return 2;
        
        return 3;
    }
    
    public List<int[]> extract(int[][] data, int idx, int val_ext) {
        List<int[]> l = new ArrayList<>();
        for(int[] d : data) {
            if(d[idx] < val_ext) {
                l.add(d);
            }
        }
        return l;
    }
    
    public int[][] sort(int[][] data, int sort_by) {
        for(int i = 1; i < data.length; i++) {
            int[] temp = data[i];
            
            int idx = i - 1;
            
            while(idx >= 0 && temp[sort_by] < data[idx][sort_by]) {
                data[idx + 1] = data[idx];
                idx--;
            }
            
            data[idx + 1] = temp;
        }
        return data;
    }
}