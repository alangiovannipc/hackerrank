import java.io.*;
import java.util.*;
/**
 * Created by AlanPolar on 30/05/2017.
 */
public class VeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num, sum = 0;
        int i, n=0;
        boolean validN = false;

        while (!validN) {
            n = in.nextInt();
            if (n>=1 && n<=10) {
                validN = true;
            }
        }

        for(i=0;i<n;i++) {
            num = in.nextInt();
            sum += num;
        }

        System.out.print(sum);

    }
}
