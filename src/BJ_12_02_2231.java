import java.util.Arrays;
import java.util.Scanner;

public class BJ_12_02_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();
        Long result = (long) 0;
        boolean find = false;
        for(Long i=(long)0; i<1000000; i++) {
            String[] str_arr = (String.valueOf(i)).split("");

            Long sum = (long) 0;
            for(int j=0; j<str_arr.length; j++) {
                sum += Long.parseLong(str_arr[j]);
            }

            if(sum + i == n) {
                result = i;
                break;
            }
        }

        
        System.out.println(result);

        sc.close();
    }
}
