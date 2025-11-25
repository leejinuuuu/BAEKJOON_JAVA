import java.util.Scanner;

public class BJ_04_10_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        double max = 0;
        double avg = 0;

        double[] list = new double[n];

        for(int i=0; i<n; i++) {
            list[i] = sc.nextDouble();

            if(max < list[i]) {
                max = list[i];
            }
        }

        for(int i=0; i<n; i++) {
            list[i] = list[i] / max * 100;

            avg += list[i];
        }
        avg /= n;

        System.out.println(avg);
    }
}
