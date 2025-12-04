import java.util.Scanner;

public class BJ_07_04_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] paper = new boolean[100][100];

        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                paper[i][j] = false;
            }
        }

        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    paper[j+x][k+y] = true;
                }
            }

            sc.nextLine();
        }

        int num = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(paper[i][j]) {
                    num++;
                }
            }
        }

        System.out.println(num);
    }
}
