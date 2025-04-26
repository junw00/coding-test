/**
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
    **/
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int star = 1;
        for (int i = 0; i < n; i++) {
            for(int j = i; j < n - 1; j++) {
                bw.write(" ");
            }
            bw.write("*".repeat(star));
            bw.newLine();
            star += 2;
        }
        star -= 2;
        for (int i = 0; i < n - 1; i++) {
            star -= 2;
            for(int j = n - i - 1; j < n; j++) {
                bw.write(" ");
            }
            bw.write("*".repeat(star));
            bw.newLine();
        }
        bw.flush();
    }
} 