import java.util.Scanner;

public class BJ_08_04_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int dis = 1;
        int result = 3;
        for(int i=1; i<n; i++) {
            dis *= 2;
            result += dis;
        }

        System.out.println(result*result);
    }
}
