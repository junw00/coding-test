import java.util.*;
class Solution {
    int[] dy = {1, 0, -1};
    int[] dx = {0, 1, -1};
    int dir = 0;
    public int[] solution(int n) {
        if(n == 1) {
            return new int[]{1};
        }
        List<Integer> list = new ArrayList<>();
        int[][] result = new int[n][];

        for(int i = 1; i <= n; i++) {
            result[i - 1] = new int[i];
        }
        
        Queue<int[]> q = new LinkedList<>();
        result[0][0] = 1;
        q.add(new int[]{0, 0});
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int newRow = cur[0] + dy[dir];
            int newCol = cur[1] + dx[dir];
            if(isValid(newRow, newCol, result)) {
                q.add(new int[] {newRow, newCol});
                result[newRow][newCol] = result[cur[0]][cur[1]] + 1;

            }else {
                if(result[cur[0] + dy[dir]][cur[1] + dx[dir]] == 0) {
                    result[cur[0] + dy[dir]][cur[1] + dx[dir]] = result[cur[0]][cur[1]] + 1;

                    q.add(new int[] {cur[0] + dy[dir], cur[1] + dx[dir]});
                }
            }
        }
        


        for(int[] arr : result) {
            for(int num : arr) {
                list.add(num);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public boolean isValid(int row, int col, int[][] result) {
        if(row < 0 || col < 0 
           || row > result.length - 1 || col > result[row].length - 1 
           || result[row][col] != 0) {
            dir = (dir + 1) % 3;
            return false;
        }
        
        return true;
    }
}