import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = 0;
        int col = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 9; i++) {
            String[] arr = br.readLine().split(" ");
            for(int j = 0; j < 9; j++) {
                int n = Integer.parseInt(arr[j]);
                if(n >= max) {
                    row = i + 1;
                    col = j + 1;
                    max = n;
                }
            }
        }
        System.out.println(max);
        System.out.print(row + " " + col);
    }
}