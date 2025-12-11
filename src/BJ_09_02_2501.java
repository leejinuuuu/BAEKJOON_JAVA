import java.util.ArrayList;
import java.util.Scanner;

public class BJ_09_02_2501 {
    static ArrayList<Integer> div_list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        findDivisor(n, 1);

        try {
            System.out.println(div_list.get(k-1));
        } catch(Exception e) {
            System.out.println(0);
        }

        sc.close();
    }

    private static void findDivisor(int num, int i) {
        if(i>num) {
            return;
        }

        if(num % i == 0) {
            div_list.add(i);
        }

        findDivisor(num, i+1);
    }
}
