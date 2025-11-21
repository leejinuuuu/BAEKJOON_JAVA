import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_04_01_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int count = 0;
        int n, v;
        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            int e = Integer.parseInt(st.nextToken());
            list.add(e);
        }

        st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++) {
            if(list.get(i) == v) {
                count++;
            }
        }

        bw.write(count+"\n");
        bw.flush();
        bw.close();
    }
}
