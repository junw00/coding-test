// brown + yellow 가 카펫의 크기.
// brown + yellow의 제곱근 까지의 약수를 구하면 그 최대값이 brown 카펫의 길이 , yellow는 entire(전체 칸) / brown
class Solution {
    public int[] solution(int brown, int yellow) {
        //yellow 넓이
        int extent = yellow;
        for(int i = 1; i <= (int) Math.sqrt(extent); i++) {
            //i는 무조건 yellow의 세로가 됨
            if(extent % i == 0 && (i + 2) * 2 + (extent / i) * 2 == brown) {
                return new int[] {extent / i + 2, i + 2};
            }
        }
        return null;
    }
}