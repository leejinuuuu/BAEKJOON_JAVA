import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.management.RuntimeErrorException;

public class BJ_1_10_2588 {
        public static void main(String[] args) throws Exception{
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // List<Integer> ints = new ArrayList<>();
        
        // try{
        //     String str = new String();
            
        //     while(!((str = br.readLine()).equals(""))) {
        //         ints.add(Integer.parseInt(str));
        //     }
        // } catch(Error e) {
        //     throw new RuntimeErrorException(e);
        // }

        // System.out.println(ints.get(0)*(ints.get(ints.size()-1)%10));
        // System.out.println(ints.get(0)*(ints.get(ints.size()-1)%100%10));
        // System.out.println(ints.get(0)*(ints.get(ints.size()-1)/100));
        // System.out.println(ints.get(0)*ints.get(ints.size()-1));

        Scanner sc = new Scanner(System.in);

        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(a*(b%10));
        System.out.println(a*(b%100/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}
