import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String s = "";
        for(int i = 0; i < A / 4; i++) {
            s += "long ";
        }
        System.out.println(s + "int");
    }
}