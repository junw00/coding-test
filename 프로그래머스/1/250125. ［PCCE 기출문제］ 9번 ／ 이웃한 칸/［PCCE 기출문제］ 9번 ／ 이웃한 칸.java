class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int row = board.length - 1;
        int col = board[0].length - 1;
        String color = board[h][w];
        for(int[] dir: dirs){
            int dh = h + dir[0];
            int dw = w + dir[1];
            
            if (dh >= 0 && dw >= 0 && dh <= row && dw <= col) {
                if(board[dh][dw].equals(color)) answer++;
            }
            
        }
        return answer;
    }
}