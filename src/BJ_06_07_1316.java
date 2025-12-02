import java.util.Scanner;

public class BJ_06_07_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        boolean[] alpha_list = new boolean[26];

        int count = 0;
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();

            for(int j=0; j<alpha_list.length; j++) {
                alpha_list[j] = false;
            }

            for(int j=0; j<str.length(); j++) {
                if(j == 0) {
                    alpha_list[str.charAt(j) - 97] = true;

                    if(j == str.length() - 1) {
                        count++;
                    }

                    continue;
                }

                if(str.charAt(j) == str.charAt(j-1)) {

                    if(j == str.length() - 1) {
                        count++;
                    }

                    continue;
                } else {
                    if(!alpha_list[str.charAt(j) - 97]) {
                        alpha_list[str.charAt(j) - 97] = true;
                    } else {
                        break;
                    }
                }

                if(j == str.length() - 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
