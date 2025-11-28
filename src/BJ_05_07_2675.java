import java.util.Scanner;

public class BJ_05_07_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        String[] str_list = new String[t];
        for(int i=0; i<t; i++) {
            String tmp = "";
            
            int r = Integer.parseInt(sc.next());
            char[] s =  sc.next().toCharArray();

            for(int j=0; j<s.length; j++) {
                for(int k=0; k<r; k++) {
                    tmp = tmp + s[j];
                }
            }
            str_list[i] = tmp;
        }

        for(int i=0; i<t; i++) {
            System.out.println(str_list[i]);
        }
    }
}
