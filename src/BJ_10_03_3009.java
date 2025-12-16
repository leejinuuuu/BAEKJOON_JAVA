import java.util.ArrayList;
import java.util.Scanner;

public class BJ_10_03_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> x_list = new ArrayList<>();
        ArrayList<Integer> y_list = new ArrayList<>();

        for(int i=0;i<3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x_list.contains(x)) {
                x_list.remove(x_list.indexOf(x));
            } else {
                x_list.add(x);
            }
            
            if(y_list.contains(y)) {
                y_list.remove(y_list.indexOf(y));
            } else {
                y_list.add(y);
            }
        }

        System.out.println(x_list.get(0) + " " + y_list.get(0));

        sc.close();
    }
}