import java.util.Scanner;

public class BJ_08_02_11005 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int b = sc.nextInt();

            String result = "";

            while(true) {
                if(n%b >= 10) {
                    result += new Character((char)(n%b+55)).toString();
                } else {
                    result += n%b;
                }
                
                n = n/b;

                if(n <= 0) {
                    break;
                }
            }

            System.out.println(new StringBuffer(result).reverse().toString());
        }
    }
}
