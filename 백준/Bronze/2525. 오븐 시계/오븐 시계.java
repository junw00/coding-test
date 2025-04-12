import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int H = sc.nextInt();
        H = (H == 0) ? 24 : H;
        int M = sc.nextInt();
        int time = sc.nextInt() + H * 60 + M;
        System.out.println((time / 60 >= 24 ? time / 60 - 24 : time / 60) + " " + (time % 60));
        
    }
}