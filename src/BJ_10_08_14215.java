import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ_10_08_14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> line_list = new ArrayList<>();
        for(int i=0; i<3; i++) {
            line_list.add(sc.nextInt());
        }

        Collections.sort(line_list, Collections.reverseOrder());

        if(line_list.get(0) >= (line_list.get(1) + line_list.get(2))) {
            line_list.remove(0);
            line_list.add(line_list.get(0) + line_list.get(1) - 1);
        }

        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += line_list.get(i);
        }

        System.out.println(sum);

        sc.close();
    }
}
