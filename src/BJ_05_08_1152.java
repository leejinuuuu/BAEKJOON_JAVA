import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_05_08_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sTokenizer = new StringTokenizer(br.readLine());

        ArrayList<String> str_list = new ArrayList<>();
        
        while(sTokenizer.hasMoreTokens()) {
            str_list.add(sTokenizer.nextToken());
        }

        System.out.println(str_list.size());
    }
}
