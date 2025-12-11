import java.util.ArrayList;
import java.util.Scanner;

public class BJ_09_03_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> div_list;
        ArrayList<String> result_list = new ArrayList<>();

        while(true) {
            div_list = new ArrayList<>();
            
            int x = sc.nextInt();

            if(x == -1) {
                break;
            }

            div_list = findDiv(div_list, x, 1);

            int sum=0;
            String result = x + " = ";
            for(int i=0; i<div_list.size()-1; i++) {
                sum += div_list.get(i);
                
                result += div_list.get(i);

                if(i < div_list.size() - 2) {
                    result += " + ";
                }
            }       

            if(x == sum) {
                result_list.add(result);
            } else {
                result_list.add(x + " is NOT perfect.");
            }
        }

        for(int i=0; i<result_list.size(); i++) {
            System.out.println(result_list.get(i));
        }
    }

    private static ArrayList<Integer> findDiv(ArrayList<Integer> list, int num, int i) {

        if(i > num) {
            return list;
        }

        if(num % i == 0) {
            list.add(i);
        }

        findDiv(list, num, i+1);

        return list;
    }
}
