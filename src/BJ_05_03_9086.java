import java.util.Scanner;

public class BJ_05_03_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        sc.nextLine();

        String[] strArr = new String[t];
        for(int i=0; i<t; i++) {
            String[] tmp_arr = sc.nextLine().split("");
            strArr[i] = tmp_arr[0] + tmp_arr[tmp_arr.length-1];
        }

        for(int i=0; i<t; i++) {
            System.out.println(strArr[i]);
        }
    }
}
