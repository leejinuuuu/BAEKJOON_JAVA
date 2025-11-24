import java.util.Arrays;
import java.util.Scanner;

public class BJ_04_05_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();;

        int[] basket_list = new int[n];

        for(int i=0; i<m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int ball = sc.nextInt();

            for(int j=start-1; j<end; j++) {
                basket_list[j] = ball;
            }
        }

        for(int i=0; i<n; i++) {
            System.out.print(basket_list[i] + " ");
        }
    }
}
