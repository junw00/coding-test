import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<int[]> list = new ArrayList<>();
        int[] max = new int[2];
        for(int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            list.add(new int[] {Integer.parseInt(arr[0]), Integer.parseInt(arr[1])});
            max[0] = Math.max(max[0], Integer.parseInt(arr[0]));
            max[1] = Math.max(max[1], Integer.parseInt(arr[1]));
        }
        int[][] a = new int[max[1] + 10][max[0] + 10];

        for(int[] t : list) {
            for(int i = t[1]; i < t[1] + 10; i++) {
                for(int j = t[0]; j < t[0] + 10; j++) {
                    a[i][j] += 1;
                }
            }
        }
        //17
        int total = 0;
        for(int i = 0; i < max[1] + 10; i++) {
            int cnt = 0;
            //25
            for(int j = 0; j < max[0] + 10; j++) {
                if(a[i][j] >= 1) cnt++;
            }
            total += cnt;
        }
        System.out.println(total);
    }
}