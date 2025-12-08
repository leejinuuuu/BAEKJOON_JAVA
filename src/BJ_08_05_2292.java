import java.util.Scanner;

public class BJ_08_05_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int t = 1;
        int circle = 1;

        while(true) {
            if(t>=n) {
                break;
            }
            
            t += 6*circle;
            circle++;
        }

        System.out.println(circle);
    }
}
