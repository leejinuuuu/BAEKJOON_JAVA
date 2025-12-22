import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ_12_01_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Long m = sc.nextLong();

        ArrayList<Long> card_list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            card_list.add(sc.nextLong());
        }

        Collections.sort(card_list);

        Long sum = (long) 0;
        Long dif = m;
        for(int i=0; i<card_list.size(); i++) {
            for(int j=i+1; j<card_list.size(); j++) {
                for(int k=j+1; k<card_list.size(); k++) {
                    Long tmp = card_list.get(i) + card_list.get(j) + card_list.get(k);
                    
                    if(tmp <= m) {
                        dif = m - tmp;
                        
                        if(dif < m - sum) {
                            sum = tmp;
                        } else if(dif == 0) {
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
