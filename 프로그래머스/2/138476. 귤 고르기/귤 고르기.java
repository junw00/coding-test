import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int t : tangerine) {
            countMap.put(t, countMap.getOrDefault(t, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort((a, b) -> b - a); // 내림차순 정렬

        int sum = 0;
        for (int num : counts) {
            sum += num;
            answer++;
            if (sum >= k) break;
        }

        return answer;
    }
}
