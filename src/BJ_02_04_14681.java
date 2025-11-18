import java.io.IOException;
import java.util.Scanner;

public class BJ_02_04_14681 {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int x = Integer.parseInt(st.nextToken());
        // int y = Integer.parseInt(st.nextToken());

        try (Scanner sc = new Scanner(System.in)) {
            int x,y;

            x = sc.nextInt();
            y = sc.nextInt();

            if(x>0)
                if(y>0)
                    System.out.println("1");
                else
                    System.out.println("4");
            else
                if(y>0)
                    System.out.println("2");
                else
                    System.out.println("3");
        }
    }
}
