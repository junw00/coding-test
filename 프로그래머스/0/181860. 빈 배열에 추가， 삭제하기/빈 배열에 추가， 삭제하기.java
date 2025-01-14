import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    stack.push(arr[i]);
                }
            }else {
                for(int j = 0; j < arr[i]; j++) {
                    stack.pop();
                }
            }
        }
        int[] answer = new int[stack.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}