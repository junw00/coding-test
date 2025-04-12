import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int cnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] arr = br.readLine().split(" ");
        String n = br.readLine();
        cnt = (int) Arrays.stream(arr).filter(e -> e.equals(n)).count();
        System.out.println(cnt);
        br.close();
    }
}