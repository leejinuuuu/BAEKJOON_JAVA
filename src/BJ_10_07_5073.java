import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ_10_07_5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> result_list = new ArrayList<>();

        while(true) {
            String result = "";
            ArrayList<Integer> line_list = new ArrayList<>();
            for(int i=0; i<3; i++) {
                line_list.add(sc.nextInt());
            }
            sc.nextLine();

            if(Collections.frequency(line_list, line_list.get(0)) == 3) {
                result = "Equilateral";
            } else if((Collections.frequency(line_list, line_list.get(0)) == 2) || 
                    (Collections.frequency(line_list, line_list.get(1)) == 2) ||
                    (Collections.frequency(line_list, line_list.get(2)) == 2)) {
                result = "Isosceles";
            } else {
                result = "Scalene";
            }

            Collections.sort(line_list, Collections.reverseOrder());

            if(line_list.get(0) >= (line_list.get(1) + line_list.get(2))) {
                result = "Invalid";
            }


            if(line_list.get(0) == 0 && line_list.get(1) == 0 && line_list.get(2) == 0) {
                break;
            }

            result_list.add(result);
        }

        for(int i=0; i<result_list.size(); i++) {
            System.out.println(result_list.get(i));
        }

        sc.close();
    }
}
