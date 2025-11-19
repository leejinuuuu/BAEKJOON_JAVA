import java.util.Scanner;

public class BJ_02_06_2525 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] str = sc.nextLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);

            int time = sc.nextInt();

            m += time;
            
            if(m >= 60) {
                h += m/60;

                m %= 60;
                h %= 24;
            }
            
            System.out.println(h + " " + m);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
    }
}
