import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++) {
            int[] arr = new int[2];
            arr[0] = priorities[i];
            if(i == location) {
                arr[1] = 1;
            }
            q.add(arr);
        }
        
        int cnt = 1;
        while(!q.isEmpty()) {
            int max = Integer.MIN_VALUE;
            for(int[] i : q) {
                max = Math.max(i[0], max);
            }

            int[] priority = q.poll();
            if(max == priority[0]) {
                if(priority[1] == 1) return cnt;
                cnt++;
            }
            else q.add(priority);
            
        }
        return cnt;
    }
}