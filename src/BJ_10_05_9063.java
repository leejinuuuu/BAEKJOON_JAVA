import java.util.Scanner;

public class BJ_10_05_9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x_max = -10000, y_max = -10000;
        int x_min = 10000, y_min = 10000;

        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            x_max = Math.max(x, x_max);
            y_max = Math.max(y, y_max);

            x_min = Math.min(x, x_min);
            y_min = Math.min(y, y_min);
        }

        System.out.println((x_max - x_min)*(y_max - y_min));

        sc.close();
    }
}
