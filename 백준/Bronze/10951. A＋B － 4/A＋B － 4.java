import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            try {
                String[] arr = br.readLine().split(" ");
                int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
                bw.write(sum + "\n"); 
            }catch(Exception e) {
                break;
            }
            
            
        }
        bw.flush();
        br.close();
        bw.close();
    }
}