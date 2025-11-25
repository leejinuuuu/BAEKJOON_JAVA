import java.util.Scanner;

public class BJ_04_06_10813 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] list = new int[n];
            for(int i=0; i<n; i++) {
                list[i] = i+1;
            }

            int a,b, tmp;
            for(int i=0; i<m; i++) {
                a = sc.nextInt();
                b = sc.nextInt();

                tmp = list[a-1];
                list[a-1] = list[b-1];
                list[b-1] = tmp;
            }

            for(int i=0; i<n; i++) {
                System.out.print(list[i] + " ");
            }
        }
    }
}
