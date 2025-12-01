import java.util.Scanner;

public class BJ_06_04_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int i = 0;
        while(i<str.length()) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("0");
                break;
            }

            i++;
        }
        
        if(i == str.length()) {
            System.out.println("1");
        }
    }
}
