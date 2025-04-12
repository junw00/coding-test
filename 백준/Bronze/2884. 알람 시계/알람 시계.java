import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        if(H == 0) H = 24;
        int M= sc.nextInt();
        int a = H * 60 + M - 45;

        System.out.println((a / 60 == 24 ? 0 : a / 60) + " " + (a % 60));
        
    }
}