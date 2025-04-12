import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arr = br.readLine().split(" ");
        int[] b = new int[Integer.parseInt(arr[0])];
        int n = Integer.parseInt(arr[1]);
        for(int i = 0; i < b.length; i++) {
            b[i] = i;
        }
        
        for(int i = 0; i < n; i++) {
            String[] info = br.readLine().split(" ");
            int start = Integer.parseInt(info[0]) - 1;
            int end = Integer.parseInt(info[1]) - 1;
            for(int j = 0; j < (Integer.parseInt(info[1]) - Integer.parseInt(info[0]) + 1) / 2; j++) {
                int temp = b[start];
                b[start++] = b[end];
                b[end--] = temp;
            }
        }
        
        for(int i = 0; i < b.length; i++) {
            bw.write(Integer.toString(b[i] + 1));
            if(i != b.length - 1) bw.write(" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}