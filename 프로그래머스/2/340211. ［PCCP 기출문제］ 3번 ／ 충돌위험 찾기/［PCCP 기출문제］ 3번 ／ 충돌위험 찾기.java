import java.util.*;
class Solution {
    
    class Robot {
        int r;
        int c;
        int[] destination;
        int maxIdx;
        int curIdx;
        int[] route;
        public Robot(int r, int c, int maxIdx, int[] destination, int curIdx, int[] route) {
            this.r = r;
            this.c = c;
            this.maxIdx = maxIdx;
            this.destination = destination;
            this.curIdx = curIdx;
            this.route = route;
        }
        
        public boolean isMove() {
            return (this.r != destination[0] || this.c != destination[1]);
        }
        
        public void move() {
            if(this.r < destination[0]) this.r++;
            else if(this.r > destination[0]) this.r--;   
            else {
                if(this.c < destination[1]) this.c++;
                else if (this.c > destination[1]) this.c--;
            }     
        }
        
        public boolean isNext() {
            return this.maxIdx > this.curIdx;
        }
    }
    
    public int solution(int[][] points, int[][] routes) {
        int answer = 0;
        Queue<Robot> q = new LinkedList<>();
        //충돌 위치 확인
        Map<String, Integer> map = new HashMap<>();
        int loop;
        for(int[] route : routes) {
            int r = points[route[0] - 1][0] - 1;
            int c = points[route[0] - 1][1] - 1;
            int[] destination = new int[] {points[route[1] - 1][0] - 1, points[route[1] - 1][1] - 1};
            Robot robot = new Robot(r, c, route.length - 1, destination, 1, route);
            q.add(robot);
        }
        
        loop = q.size();
        map.clear();
        for(int j = 0; j < loop; j++) {
            Robot r = q.poll();
            map.put(r.r + " " + r.c, map.getOrDefault(r.r + " " + r.c, 0) + 1);
            q.add(r);
            // System.out.println(map.toString());
        }
        answer += count(map);
        
        while(!q.isEmpty()) {
        
            map.clear();
            loop = q.size();
        
            for(int i = 0; i < loop; i++) { 
                
                
                
                Robot robot = q.poll();
                if(!robot.isMove()) {
                    //더이상 갈 곳 없음
                    if(!robot.isNext()) {
                        //로봇 내보내기
                        q.remove(robot);
                        continue;
                    }else {
                        robot.curIdx++;
                        int[] newDest = new int[] {points[robot.route[robot.curIdx] - 1][0] - 1, points[robot.route[robot.curIdx] - 1][1] - 1};
                        
                        robot.destination = newDest;
                        robot.move();
                        // System.out.println(robot.r + " " + robot.c);
                    }
                    
                }else {
                    robot.move();
                    // System.out.println(robot.r + " " + robot.c);
                }
                q.add(robot); 
            }
            loop = q.size();
            map.clear();
            for(int i = 0; i < loop; i++) {
                Robot r = q.poll();
                map.put(r.r + " " + r.c, map.getOrDefault(r.r + " " + r.c, 0) + 1);
                q.add(r);
                // System.out.println(map.toString());
            }
            answer += count(map);
        }
        
        return answer;   
    }
    
    //충돌 횟수
    private static int count(Map<String, Integer> map) {
        int count = 0;
        for(Integer i : map.values()) {
           if(i > 1) count += 1;  
        }
 
        return count;
    }
}