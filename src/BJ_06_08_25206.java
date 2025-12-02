import java.util.Arrays;
import java.util.Scanner;

public class BJ_06_08_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] score_list = {"D0", "D+", "C0", "C+", "B0", "B+", "A0", "A+"};
        Double result = 0.0;
        Double num = 0.0;
        for(int i=0; i<20; i++) {
            String[] str = sc.nextLine().split(" ");
            
            //String title = str[0];
            Double point = Double.parseDouble(str[1]);
            String score = str[2];

            if(score.equals("P")) {
                continue;
            }

            if(!score.equals("F")) {
                result += point * ((Arrays.asList(score_list).indexOf(score)*0.5) + 1.0);
            }
            
            num += point;

        }

        if(num != 0) {
            System.out.println(result / num);
        } else {
            System.out.println(num);
        }
    }
}
