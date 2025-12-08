import java.util.Scanner;

public class BJ_08_03_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[][] result = new int[t][4];

        for(int i=0; i<t; i++) {
            int money = sc.nextInt();

            result[i][0] = (money / 25);
            result[i][1] = ((money % 25) / 10);
            result[i][2] = ((money % 25 % 10) / 5);
            result[i][3] = ((money % 25 % 10 % 5) / 1);
        }

        for(int i=0; i<t; i++) {
            for(int j=0; j<result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
