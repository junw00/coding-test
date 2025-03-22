class Solution {
    String[] arr = {"A", "E", "I", "O", "U"};
    int cnt = 0;
    int answer = 0;
    public int solution(String word) {
        
        for(String s : arr) {
            cnt++;
            dfs(s, word);
        }
        return answer;
    }
    
    public void dfs(String str, String word) {
        if(str.equals(word)) answer = cnt;
        if(str.length() >= 5) return;
        
        for(String s : arr) {
            cnt++;
            dfs(str + s, word);
            
        }
    }
}