import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 위한 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 정수 입력

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" "); // 공백 기준으로 자르기
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            bw.write((a + b) + "\n"); // 출력
        }

        bw.flush(); // 출력은 마지막에 한 번만 flush!
        bw.close();
        br.close();
    }
}