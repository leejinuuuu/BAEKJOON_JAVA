import java.util.Scanner;

public class BJ_05_10_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str_list = sc.nextLine();

        int time = 0;
        for(int i=0; i<str_list.length(); i++) {
            // A = 65 ~ Z = 90
            int n = str_list.charAt(i) - 65;
            if(n < 3) {
                time += 3;
            } else if(n < 6) {
                time += 4;
            } else if(n < 9) {
                time += 5;
            } else if(n < 12) {
                time += 6;
            } else if(n < 15) {
                time += 7;
            } else if(n < 19) {
                time += 8;
            } else if(n < 22) {
                time += 9;
            } else { //25
                time += 10;
            }
        }

        System.out.println(time);
    }
}
