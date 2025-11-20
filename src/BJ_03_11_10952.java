import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_03_11_10952 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a,b;
        String line;

        while(true) {
            line = br.readLine();
            
            a = Integer.parseInt(line.split(" ")[0]);
            b = Integer.parseInt(line.split(" ")[1]);

            if(a != 0 || b != 0) {
                bw.write((a+b)+"\n");
            } else {
               break;
            }
        }

        bw.flush();
        bw.close();
    }
}
