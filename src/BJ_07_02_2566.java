import java.util.Scanner;

public class BJ_07_02_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[9][9];

        int max = 0, x = 0, y = 0;

        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                matrix[i][j] = sc.nextInt();

                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        System.out.println(max + "\n" + (x+1) + " " + (y+1));
    }
}
