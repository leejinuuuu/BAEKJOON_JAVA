import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BJ_03_10_2439 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().split(" ")[0]);

        for(int i=0; i<n; i++) {
            for(int j=n-i; j>1; j--) {
                bw.write(" ");
            }
            for(int j=0; j<=i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
