import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = 0;
        if(x > 0 && y > 0)a = 1;
        if(x > 0 && y < 0)a = 4;
        if(x < 0 && y > 0)a = 2;
        if(x < 0 && y < 0)a = 3;
        System.out.println(a);
    }
}