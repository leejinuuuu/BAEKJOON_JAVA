import java.util.Scanner;

public class BJ_05_09_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = change_order(sc.nextInt());
        int b = change_order(sc.nextInt());

        int result;
        if(a>b) {
            result = a;
        } else {
            result = b;
        }

        System.out.println(result);
    }

    public static int change_order(int num) {
        int result = 0;

        while(num != 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }

        return result;
    }
}
