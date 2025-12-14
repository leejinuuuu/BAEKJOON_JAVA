import java.util.Scanner;

public class BJ_10_02_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        // int min = 1000;
        // if(x < min) {
        //     min = x;
        // }

        // if(y < min) {
        //     min = y;
        // }

        // if(w-x < min) {
        //     min = w-x;
        // }

        // if(h-y < min) {
        //     min = h-y;
        // }

        // System.out.println(min);

        System.out.println(Math.min(Math.min(x,y),Math.min(w-x,h-y)));

        sc.close();
    }
}
