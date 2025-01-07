class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int diffMax = Integer.MIN_VALUE;
        

        for(int d : diffs) {
            diffMax = Math.max(d, diffMax);
        }

        int left = 1, right = diffMax;
        while (left <= right) {
            int mid = (left + right) / 2;
            long time = 0;
            

            for (int j = 0; j < diffs.length; j++) {
                int mistake = Math.max(0, diffs[j] - mid);
                time += times[j];
                if (j > 0) {
                    time += (times[j] + times[j - 1]) * mistake;
                }
                if (time > limit) break;  // 제한 시간 초과 시 중단
            }

            if (time <= limit) {

                right = mid - 1;
            } else {

                left = mid + 1;
            }
        }
        

        return left;
    }
}
