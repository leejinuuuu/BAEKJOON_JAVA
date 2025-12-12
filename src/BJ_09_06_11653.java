import java.util.Scanner;

public class BJ_09_06_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n != 1) {

            int num = 2;
            while(true) {
                if(n%num == 0) {
                    System.out.println(num);

                    n /= num;

                    num = 2;
                } else {
                    num++;
                }

                if(n == 1) {
                    break;
                }
            }
        }
    }

    // private static boolean isntPrimeNumber(int num, int i) {
    //     if(i > num) {
    //         return false;
    //     }

    //     if(num % i == 0 && i != 1 && num != i) {
    //         return true;
    //     }

    //     return isntPrimeNumber(num, i+1);
    // }
}
