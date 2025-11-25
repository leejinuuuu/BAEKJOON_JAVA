import java.util.Scanner;

public class BJ_04_08_3052 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] list = new int[42];
            int count = 0;

            for(int i=0; i<10; i++) {
                list[sc.nextInt()%42] = 1;
            }

            for(int i=0; i<42; i++) {
                if(list[i] == 1) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
