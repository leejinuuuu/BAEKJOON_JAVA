import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BJ_03_06_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sTokenizer = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(sTokenizer.nextToken());

        String line;
        int a,b;

        for(int i=0; i<t; i++) {
            line = br.readLine();
            
            a = Integer.parseInt(line.split(" ")[0]);
            b = Integer.parseInt(line.split(" ")[1]);
            bw.write((a+b) + "\n");
        }
            bw.flush();
            bw.close();
    }
}
