import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Arrays.sort(wallet);
        while(true) {
            System.out.println(Arrays.toString(bill));
            min = Math.min(bill[0], bill[1]);
            max = Math.max(bill[0], bill[1]);
            
            if(min <= wallet[0] && max <= wallet[1]) {
                return answer;
            }
            
            if(bill[0] >= bill[1]) bill[0] = bill[0] / 2;
            else bill[1] = bill[1] / 2;
            answer++;
        }

    }
}