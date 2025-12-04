import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_07_03_10798 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sTokenizer;

        ArrayList<ArrayList<String>> matrix = new ArrayList<>();

        for(int i=0; i<5; i++) {
            ArrayList<String> tmp = new ArrayList<>();
            String[] str = sc.nextLine().split("");
            for(int j=0; j<15; j++) {
                if(j >= str.length) {
                    tmp.add("");
                } else {
                    tmp.add(str[j]);
                }
            }
            matrix.add(tmp);
        }

        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(!matrix.get(j).get(i).equals("")) {
                    System.out.print(matrix.get(j).get(i));
                }
            }
        }
    }
}
