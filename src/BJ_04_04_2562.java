import java.util.Scanner;

public class BJ_04_04_2562 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int max = 0;
            int count = 0;

            for(int i=1; i<=9; i++) {
                int val = sc.nextInt();

                if(val > max) {
                    max = val;
                    count = i;
                }
            }

            System.out.println(max);
            System.out.println(count);
        }
    }
}
