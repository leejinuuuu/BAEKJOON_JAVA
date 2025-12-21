import java.util.Scanner;

public class BJ_11_07_24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        boolean result = true;

        for(int i=n0; i<=100; i++) {
            if((a1*i+a0) > (c*i)) {
                result = false;
                break;        
            }
        }

        if(result) {
            System.out.println("1");
        } else {
            System.out.println("0");    
        }

        sc.close();
    }
}
