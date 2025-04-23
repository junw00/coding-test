class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] arr = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] arr1 = {"aya", "ye", "woo", "ma"};
        for(String s : babbling) {
            int len = s.length();
            for(int i = 0; i < arr.length; i++) {
                s = s.replace(arr[i], "-");
            }
            if(len != s.length()) continue;
            
            for(int i = 0; i < arr.length; i++) {
                s = s.replace(arr1[i], "-");
            }
            
            if(s.replace("-", "").equals("")) answer++;
        }
        return answer;
    }
}