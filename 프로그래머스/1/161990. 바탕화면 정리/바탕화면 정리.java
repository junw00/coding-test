import java.util.*;
class Solution {
    public int[] solution(String[] wallpaper) {
        int answer[];
        List<Integer> luList = new ArrayList<>();
        List<Integer> rdList = new ArrayList<>();
        for (String str : wallpaper) {
            luList.add(str.indexOf("#"));

            rdList.add(str.lastIndexOf("#"));
        }
        System.out.println(luList);
        System.out.println(rdList);
        int lux = 0;
        for (int i = 0; i < luList.size(); i++) {
            if(luList.get(i) != -1) {
                lux = i;
                break;
            }
        }
        int luy = luList.stream()
            .filter(y -> y != -1)
            .min(Integer::compare)
            .orElse(-1);


        int rdx= 0;
        for(int j = rdList.size() - 1; j >= 0; j--) {
            if(rdList.get(j) != -1) {
                rdx = j + 1;
                break;
            }
        }
        
        int rdy = Collections.max(rdList) + 1;
        
        answer = new int[] {lux, luy, rdx, rdy};
        return answer;
        
    }
}