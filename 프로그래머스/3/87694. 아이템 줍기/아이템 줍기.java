import java.util.*;

class Solution {
    static final int SIZE = 102; // 좌표 확장을 위해 2배 크기로 설정
    static boolean[][] map = new boolean[SIZE][SIZE]; // 테두리 정보 저장
    static boolean[][] visited = new boolean[SIZE][SIZE]; // 방문 여부 체크
    static int[] dx = {0, 1, 0, -1}; // 이동 방향 (동, 남, 서, 북)
    static int[] dy = {1, 0, -1, 0};

    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        // Step 1: 좌표를 2배 확장하여 저장
        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2, y1 = rect[1] * 2;
            int x2 = rect[2] * 2, y2 = rect[3] * 2;

            // 직사각형 테두리를 맵에 기록
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    map[i][j] = true; // 모든 영역을 먼저 표시
                }
            }
        }

        // Step 2: 내부를 제거하여 테두리만 남김
        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2, y1 = rect[1] * 2;
            int x2 = rect[2] * 2, y2 = rect[3] * 2;

            for (int i = x1 + 1; i < x2; i++) {
                for (int j = y1 + 1; j < y2; j++) {
                    map[i][j] = false; // 내부를 false로 변경
                }
            }
        }

        // Step 3: BFS를 활용하여 최단 거리 탐색
        return bfs(characterX * 2, characterY * 2, itemX * 2, itemY * 2) / 2; // 좌표 2배 확장 → 답은 2로 나누기
    }

    public int bfs(int startX, int startY, int targetX, int targetY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1], distance = cur[2];

            // 목표 아이템에 도달하면 거리 반환
            if (x == targetX && y == targetY) return distance;

            // 네 방향으로 이동
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];

                // 테두리를 따라 이동할 수 있는 경우만 탐색
                if (isValid(nx, ny)) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, distance + 1});
                }
            }
        }
        return -1; // 도달할 수 없는 경우
    }

    public boolean isValid(int x, int y) {
        // 범위를 벗어나거나 방문했거나 테두리가 아니면 이동 불가
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE && map[x][y] && !visited[x][y];
    }
}
