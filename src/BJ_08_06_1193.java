import java.util.Scanner;

public class BJ_08_06_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int a=1, b=1, grd=1;
        for(int i=2; i<=x; i++) {
            if(grd == 0) {
                a++;
                b--;
            } else {
                a--;
                b++;
            }

            if(a < 1) {
                a=1;
                grd=0;
            } else if(b < 1) {
                b=1;
                grd=1;
            }
        }
        System.out.println(a + "/" + b);

    }
}
