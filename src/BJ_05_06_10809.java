import java.util.Scanner;

public class BJ_05_06_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] alpha_list = new int[26];

        for(int i=0; i<26; i++) {
            alpha_list[i] = -1;
        }

        for(int i=0; i<str.length(); i++) {
            // a = 97 ~ z = 122
            if(alpha_list[(int)str.charAt(i) - 97] == -1) {
                alpha_list[(int)str.charAt(i) - 97] = i;
            }
        }

        for(int i=0; i<26; i++) {
            System.out.print(alpha_list[i] + " ");
        }
    }
}