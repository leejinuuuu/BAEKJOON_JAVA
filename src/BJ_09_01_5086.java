import java.util.ArrayList;
import java.util.Scanner;

public class BJ_09_01_5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> result_list = new ArrayList<>();

        while(true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == 0 && y == 0) {
                break;
            } else if(y%x == 0) {
                result_list.add("factor");
            } else if(x%y == 0) {
                result_list.add("multiple");
            } else {
                result_list.add("neither");
            }
        }

        for(int i=0; i<result_list.size(); i++) {
            System.out.println(result_list.get(i));
        }
    }
}
