import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_03_03_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sTokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(sTokenizer.nextToken());

        int result = 0;

        for(int i=1;i<=n;i++) {
            result += i;
        }

        System.out.println(result);
    }
}
