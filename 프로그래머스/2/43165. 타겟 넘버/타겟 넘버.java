class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int idx, int cur) {
        
        if(idx > numbers.length - 1) {
            if(cur == target) {
                answer++;
            }
            return;
        }
        
        dfs(numbers, target, idx + 1, cur + numbers[idx]);
        dfs(numbers, target, idx + 1, cur - numbers[idx]);
    }
}