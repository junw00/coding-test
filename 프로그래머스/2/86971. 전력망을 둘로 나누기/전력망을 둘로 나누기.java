import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < wires.length; i++) {
            boolean[] visited = new boolean[n + 1]; 

            int count = dfs(wires, visited, 1, i); 
            int diff = Math.abs(n - count - count);
            answer = Math.min(answer, diff);
        }

        return answer;
    }

    public int dfs(int[][] wires, boolean[] visited, int node, int skipIdx) {
        visited[node] = true;
        int count = 1;

        for (int i = 0; i < wires.length; i++) {
            if (i == skipIdx) continue;

            int a = wires[i][0];
            int b = wires[i][1];

            if (a == node && !visited[b]) {
                count += dfs(wires, visited, b, skipIdx);
            } else if (b == node && !visited[a]) {
                count += dfs(wires, visited, a, skipIdx);
            }
        }

        return count;
    }
}
