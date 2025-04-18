import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            String[] arr = br.readLine().split(" ");
            bw.write("Case #" + i + ": " + (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])) +"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}