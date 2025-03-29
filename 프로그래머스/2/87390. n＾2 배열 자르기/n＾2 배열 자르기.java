class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);
        int[] answer = new int[size];
        
        int idx = 0;
        for(long i = left; i <= right; i++) {
            
            // if((i + 1) % n == 0){
            //     answer[idx++] = n;
//             }else {
//                 int a = (int) (i % n);
//                 int b = (int) (i / n);
                
//                 int max = Math.max(a, b);
//                 answer[idx++] = max + 1;
//             }
            
            int a = (int) (i % n);
            int b = (int) (i / n);
                
            int max = Math.max(a, b);
            answer[idx++] = max + 1;
            
        }
        return answer;
    }
}