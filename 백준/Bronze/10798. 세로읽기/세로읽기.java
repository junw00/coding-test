import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String[]> list = new ArrayList<>();
        while(true) {
            try {
                list.add(br.readLine().split(""));
            }catch(Exception e) {
                break;
            }
        }
        int row = 0;
        int col = 0;
        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < list.size(); j++) {
                try {
                    bw.write(list.get(j)[i]);
                }catch(Exception e) {
                    continue;
                }
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}