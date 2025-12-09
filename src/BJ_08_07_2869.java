import java.util.Scanner;

public class BJ_08_07_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double v = sc.nextInt();

        System.out.println((int) (Math.ceil((v-a)/(a-b))+1));

        // int dist = 0;
        // int day = 0;
        // while(true) {
        //     if(dist > b) {
        //         dist -= b;
        //     }

        //     day++;

        //     dist += a;

        //     if(dist >= v) {
        //         break;
        //     }
        // }

        // System.out.println(day);
    }
}
