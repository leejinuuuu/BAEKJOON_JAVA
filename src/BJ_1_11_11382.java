import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BJ_1_11_11382 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] list = br.readLine().split(" ");

        Long a = Long.parseLong(list[0]);
        Long b = Long.parseLong(list[1]);
        Long c = Long.parseLong(list[2]);
        
        System.out.println(a+b+c);
    }
}
