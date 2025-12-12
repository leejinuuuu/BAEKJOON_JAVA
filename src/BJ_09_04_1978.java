import java.util.Scanner;

public class BJ_09_04_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        
        for(int i=0; i<n; i++) {
            int tmp = sc.nextInt();

            if(!isPrimeNumber(tmp, 1) && tmp != 1) {
                count++;
            }
        }

        sc.close();

        System.out.println(count);
    }

    private static boolean isPrimeNumber(int num, int i) {
        if(i > num) {
            return false;
        }

        if(num % i == 0 && num != i && i != 1) {
            return true;
        }

        return isPrimeNumber(num, i+1);
    }
}
