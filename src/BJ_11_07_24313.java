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
            System.out.print("a1*n0+a0 = " + (a1*n0+a0));
            System.out.println(" , c*n0 = " + (c*n0));
            
            if((a1*n0+a0) > (c*n0)) {
                

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
