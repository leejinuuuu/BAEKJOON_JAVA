import java.util.Scanner;

public class BJ_12_03_19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble(), e = sc.nextDouble(), f = sc.nextDouble();

        double y = 0;
        if(b*d - a*e != 0) {
            y = (c*d - a*f) / (b*d - a*e);
        } 
        double x = 0;
        if(a != 0) {
            x = (c - b*y) / a;
        } else {
            y = c / b;
            x = (f - e*y) / d;
        }

        System.out.println(Math.round(x) + " " + Math.round(y));

        sc.close();
    }
}
