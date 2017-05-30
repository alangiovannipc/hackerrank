import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by alan on 5/30/17.
 */
public class Staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String symbol = "#";
        String spaces;

        for(int i=0;i<n;i++) {
            spaces = calculateBlankSpaces(n-(i+1));
            System.out.print(spaces);
            for(int j=1;j<=i+1;j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }

    public static String calculateBlankSpaces(int count) {
        String spaces = "";
        if (count>0) {
            spaces = String.format("%"+count+"s", "");
        }

        return spaces;
    }
}
