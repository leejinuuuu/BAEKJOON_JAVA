import java.util.Scanner;

public class BJ_03_04_25304 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int total_price = sc.nextInt();
            int total_count = sc.nextInt();

            int price, count, compare_price = 0;

            for(int i=0; i<total_count; i++) {
                price = sc.nextInt();
                count = sc.nextInt();

                compare_price += price * count;
            }

            if(compare_price == total_price) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
