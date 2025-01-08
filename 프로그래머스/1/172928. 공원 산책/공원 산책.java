import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int row = 0;
        int col = 0;
        int[] answer = new int[2];
        char[][] c = new char[park.length][park[0].length()];
        for(int i = 0; i < park.length; i++) {
            if(park[i].contains("S")) {
                row = i;
                col = park[i].indexOf("S");
            }
            c[i] = park[i].toCharArray();
        }
        
        for(String route : routes){
            String[] cur = route.split(" ");
            int loop = Integer.parseInt(cur[1]);
            for(int i = 0; i < loop; i++) {
                if(cur[0].equals("E")) {
                    try{
                        if(c[row][col + (i + 1)] == 'X') {
                            break;
                        }if(i + 1 == loop) {
                            c[row][col + (i + 1)] = 'S';
                            c[row][col] = 'O';
                            col += (i + 1);
                            System.out.println(col);
                        }
                    }catch (Exception e) {
                        break;
                    }  
                }
                
                if(cur[0].equals("S")) {
                    try{
                        if(c[row + (i + 1)][col] == 'X') {
                            break;
                        }if(i + 1 == loop) {
                            c[row + (i + 1)][col] = 'S';
                            c[row][col] = 'O';
                            row += (i + 1);
                        }
                    }catch (Exception e) {
                        break;
                    }  
                }
                
                if(cur[0].equals("N")) {
                    try{
                        if(c[row - (i + 1)][col] == 'X') {
                            break;
                        }if(i + 1 == loop) {
                            c[row - (i + 1)][col] = 'S';
                            c[row][col] = 'O';
                            row -= (i + 1);
                        }
                    }catch (Exception e) {
                        break;
                    }  
                }
                
                if(cur[0].equals("W")) {
                    try{
                        if(c[row][col - (i + 1)] == 'X') {
                            break;
                        }if(i + 1 == loop) {
                            c[row][col - (i + 1)] = 'S';
                            c[row][col] = 'O';
                            col -= (i + 1);
                        }
                    }catch (Exception e) {
                        break;
                    }  
                }
            }  
        }
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
                if(c[i][j] == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
            System.out.println();
        }
        
        return answer;
    }
//     public boolean move(String dir, int distance) {
        
//     }
    
}