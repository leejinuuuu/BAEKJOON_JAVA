import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ_10_06_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> angle_list = new ArrayList<>();
        int sum = 0;
        String result = "";
        for(int i=0; i<3; i++) {
            int ang = sc.nextInt();
            angle_list.add(ang);

            sum += ang;
            if(Collections.frequency(angle_list, ang) == 2) {
                result = "Isosceles";
            } else {
                result = "Scalene";   
            }
        }

        if(sum != 180) {
            result = "Error";
        } else {
            if(Collections.frequency(angle_list, 60) == 3) {
                result = "Equilateral";
            } 
        }

        System.out.println(result);
        sc.close();
    }   
}
