import java.util.Scanner;

public class BJ_04_09_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] list = new int[n];
        for(int i=0; i<n; i++) {
            list[i] = i+1;
        }

        int start, end;
        for(int i=0; i<m; i++) {
            start = sc.nextInt()-1;
            end = sc.nextInt()-1;

            while(start < end) {
                int tmp = list[start];
                list[start] = list[end];
                list[end] = tmp;
                start++;
                end--;
            }
        }

                    for(int k=0; k<n; k++) {
            System.out.print(list[k] + " ");
        }

    }
}
