import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BJ_06_05_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = (sc.nextLine()).toLowerCase();

        int[] alpha_list = new int[26];
        for(int i=0; i<alpha_list.length; i++) {
            alpha_list[i] = 0;
        }

        int max = 0;
        int p = 0;
        for(int i=0; i<str.length(); i++) {

            alpha_list[(int)(str.charAt(i) - 97)]++;

            if(max < alpha_list[(int)(str.charAt(i) - 97)]) {
                max = alpha_list[(int)(str.charAt(i) - 97)];
                p = (int)(str.charAt(i) - 97);
            }
        }

        String result = new Character((char)(p + 97)).toString();
        for(int i=0; i<alpha_list.length; i++) {
            if((alpha_list[i] == max) && (p != i)) {
                result = "?";

                break;
            }
        }

        System.out.println(result.toUpperCase());
    }
}
