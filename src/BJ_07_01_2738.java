import java.util.Scanner;

public class BJ_07_01_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a_matrix = new int[n][m];
        int[][] b_matrix = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                a_matrix[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                b_matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(a_matrix[i][j] + b_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
