import java.util.Scanner;

public class BJ_04_07_5597 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] student_list = new int[30];

            for(int i=0; i<28; i++) {
                student_list[sc.nextInt()-1] = 1;
            }

            for(int i=0; i<30; i++) {
                if(student_list[i] == 0) {
                    System.out.println(i+1);
                }
            }
        }
    }
}
