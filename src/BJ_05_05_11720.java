import java.util.Scanner;

public class BJ_05_05_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String[] str_arr = sc.nextLine().split("");
        int add = 0;
        for(int i=0; i<str_arr.length; i++) {
            add += Integer.parseInt(str_arr[i]);
        }

        System.out.println(add);
    }
}
