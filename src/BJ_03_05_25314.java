import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_03_05_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(sTokenizer.nextToken());

        for(int i=0; i<n/4; i++) {
            System.out.print("long ");
        }
        System.out.print("int ");
    }
}
