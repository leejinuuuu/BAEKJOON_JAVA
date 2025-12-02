import java.util.Scanner;

public class BJ_06_06_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] croati_alphas = {"c=", "c-", "dz=", "d-", "d-", "lj", "nj", "s=", "z="};

        for(int i=0; i<croati_alphas.length; i++) {
            str = str.replace(croati_alphas[i],"a");
        }

        System.out.println(str.length());
    }
}
