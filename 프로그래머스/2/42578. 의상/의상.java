import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        // 의상 종류별 개수 세기
        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1); // 해당 종류에서 안 입는 경우 포함
        }

        return answer - 1; // 전부 안 입는 경우 제외
    }
}
