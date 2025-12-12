import java.util.Scanner;

public class BJ_09_05_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int min = 10000;
        for(int i=m; i<=n; i++) {
            if(!isPrimeNumber(i, 1) && i != 1) {
                sum+=i;

                if(min > i) {
                    min = i;
                }
            }
        }

        if(sum == 0) {
            System.out.println("-1");
        } else {
            System.out.println(sum + "\n" + min);
        }
    }

    private static boolean isPrimeNumber(int num, int i) {
        if(i > num) {
            return false;
        }

        if(num % i == 0 && i != 1 && num != i) {
            return true;
        }

        return isPrimeNumber(num, i+1);
    }
}
