import java.util.ArrayList;
import java.util.Scanner;

public class BJ_03_02_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int a,b;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<num;i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            result.add(a+b);
        }

        for(int i=0; i<result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
