import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Set<String> set = new HashSet<>();
        // Arrays.sort(lines, (o1, o2) -> o1[0] - o2[0]);
        for(int i = 0; i < lines.length; i++) {
            for(int j = 0; j < lines.length; j++) {
                if(i == j) continue;
                
                if(lines[i][1] >= lines[j][0] && lines[i][1] < lines[j][1]) {
                    int max = Math.max(lines[i][0], lines[j][0]);
                    System.out.println("i: " + i + " j: " + j + " val: " + (lines[i][1] - max));

                    for(int k = max + 1; k <= lines[i][1]; k++) {
                        set.add("" + (k) + "-" + (k -1));
                    }
                }else if(lines[i][1] > lines[j][0] && lines[i][1] <= lines[j][1]) {
                    int max = Math.max(lines[i][0], lines[j][0]);
                    System.out.println("i: " + i + " j: " + j + " val: " + (lines[i][1] - max));

                    for(int k = max + 1; k <= lines[i][1]; k++) {
                        set.add("" + (k) + "-" + (k -1));
                    }
                }
                else if(lines[i][1] >= lines[j][0] && lines[i][1] <= lines[j][1]) {
                    int max = Math.max(lines[i][0], lines[j][0]);
                    System.out.println("i: " + i + " j: " + j + " val: " + (lines[i][1] - max));

                    for(int k = max + 1; k <= lines[i][1]; k++) {
                        set.add("" + (k) + "-" + (k -1));
                    }
                }else if(lines[i][0] >= lines[j][0] && lines[i][0] < lines[j][1]) {
                    
                    int min = Math.min(lines[i][1], lines[j][1]);
                    System.out.println("i: " + i + " j: " + j + " val: " + (min - lines[i][0]));
                    for(int k = lines[i][0] + 1; k <= min; k++) {
                        set.add("" + (k) + "-" + (k - 1));
                    }
                }else if(lines[i][0] > lines[j][0] && lines[i][0] <= lines[j][1]) {
                    
                    int min = Math.min(lines[i][1], lines[j][1]);
                    System.out.println("i: " + i + " j: " + j + " val: " + (min - lines[i][0]));
                    for(int k = lines[i][0] + 1; k <= min; k++) {
                        set.add("" + (k) + "-" + (k - 1));
                    }
                }else if(lines[i][0] >= lines[j][0] && lines[i][0] <= lines[j][1]) {
                    
                    int min = Math.min(lines[i][1], lines[j][1]);
                    System.out.println("i: " + i + " j: " + j + " val: " + (min - lines[i][0]));
                    for(int k = lines[i][0] + 1; k <= min; k++) {
                        set.add("" + (k) + "-" + (k - 1));
                    }
                }else if(lines[i][0] > lines[j][0] && lines[i][0] < lines[j][1]) {
                    
                    int min = Math.min(lines[i][1], lines[j][1]);
                    System.out.println("i: " + i + " j: " + j + " val: " + (min - lines[i][0]));
                    for(int k = lines[i][0] + 1; k <= min; k++) {
                        set.add("" + (k) + "-" + (k - 1));
                    }
                }else if(lines[i][1] > lines[j][0] && lines[i][1] < lines[j][1]) {
                    int max = Math.max(lines[i][0], lines[j][0]);
                    System.out.println("i: " + i + " j: " + j + " val: " + (lines[i][1] - max));

                    for(int k = max + 1; k <= lines[i][1]; k++) {
                        set.add("" + (k) + "-" + (k -1));
                    }
                }
            }
        }
        
        return set.size();
    }
}