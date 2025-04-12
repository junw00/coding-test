import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] scores = br.readLine().split(" ");
        int max = Arrays.stream(scores)
                        .map(Integer::parseInt)
                        .mapToInt(Integer::intValue)
                        .max()
                        .getAsInt();
        double avg = 0;
        for(int i = 0; i < scores.length; i++) {
            avg += (double) Integer.parseInt(scores[i]) / (double) max * (double) 100;
        }
        bw.write(Double.toString(avg / n));
        bw.flush();
        br.close();
    }
}