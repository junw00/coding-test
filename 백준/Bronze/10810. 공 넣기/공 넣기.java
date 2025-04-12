import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        String[] info = br.readLine().split(" ");
        int N = Integer.parseInt(info[0]);
        int M = Integer.parseInt(info[1]);
        int[] arr = new int[N + 1];
        for(int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            for(int j = Integer.parseInt(s[0]); j <= Integer.parseInt(s[1]); j++) {
                arr[j] = Integer.parseInt(s[2]);
            }
        }
        for(int i = 1; i < arr.length; i++) {
            bw.write(Integer.toString(arr[i]));
            if(i != arr.length - 1) bw.write(" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}