import java.util.Scanner;

public class BJ_08_01_2745 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String strs = sc.nextLine();
            String N = new StringBuffer(strs.split(" ")[0]).reverse().toString();
            int B = Integer.parseInt(strs.split(" ")[1]);

            int result = 0;
            for(int i=0; i<N.length(); i++) {
                if(Character.isLetter(N.charAt(i))) {
                    result += Math.pow(B,i) * (N.charAt(i)-55);
                } else {
                    result += Math.pow(B,i) * Character.getNumericValue(N.charAt(i));
                }
            }

            System.out.println(result);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
   }
}
