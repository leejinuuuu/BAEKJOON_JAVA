import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_03_01_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sTokenizer = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(sTokenizer.nextToken());

        for(int i=1; i<10; i++) {
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
