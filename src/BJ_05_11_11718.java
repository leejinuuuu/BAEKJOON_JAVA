import java.util.ArrayList;
import java.util.Scanner;

public class BJ_05_11_11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> str_list = new ArrayList<>();

        while(sc.hasNextLine()) {
            String str_tmp = sc.nextLine();

            if(str_tmp.isBlank()) {
                break;
            }
            
            str_list.add(str_tmp);
        }

        for(int i=0; i<str_list.size(); i++) {
            System.out.println(str_list.get(i));
        }
    }
}
