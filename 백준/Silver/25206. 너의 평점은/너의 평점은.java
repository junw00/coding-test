import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        /**
        A+	4.5
        A0	4.0
        B+	3.5
        B0	3.0
        C+	2.5
        C0	2.0
        ObjectOrientedProgramming1 3.0 A+
        D+	1.5
        D0	1.0
        F	0.0
        */
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        double total = 0;
        while(true) {
            try {
                
                String[] arr = br.readLine().split(" ");
                if(arr[2].equals("P")) continue;
                double a = map.get(arr[2]);
                double n = Double.valueOf(arr[1]);
                total += (a * n);
                cnt += n;    
            }catch(Exception e) {
                break;
            }
        }
        
        System.out.println((double) (total / cnt));
    }
}