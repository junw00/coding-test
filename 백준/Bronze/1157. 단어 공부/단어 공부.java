import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String result = "";
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++) {
            String ss = String.valueOf(s.charAt(i)).toUpperCase();
            map.put(ss, map.getOrDefault(ss, 0) + 1);
        }
       
        for(String key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                result = key;
            }else if(map.get(key) == max) {
                result = "?";
            }
        }
        System.out.println(result);
    }
}