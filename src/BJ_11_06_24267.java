import java.util.Scanner;

public class BJ_11_06_24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sum = 0;
        for(long i=0; i<n-1; i++) {
            sum+=i*(i+1)/2;
        }
        System.out.println(sum);
        System.out.println("3");

        sc.close();
    }
}
