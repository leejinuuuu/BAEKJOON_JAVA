import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_04_03_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        long max = -1000000, min = 1000000;

        st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Long> st_list = new ArrayList<>();
        while(st.hasMoreTokens()) {
            long tmp = Long.parseLong(st.nextToken());
            st_list.add(tmp);

            if(tmp < min) {
                min = tmp;
            }
            if(tmp > max) {
                max = tmp;
            }
        }

        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
    }
}
