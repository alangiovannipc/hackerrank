import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by AlanPolar on 31/05/2017.
 */
public class BirthDayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }

        printCandlesBlowOut(height,n);
    }

    public static void printCandlesBlowOut(int height[],int n) {
        int height_i;
        int max = 0;
        int countTallest = 0;
        for(height_i=0; height_i < n; height_i++) {
           if (height[height_i]>max) {
               max = height[height_i];
               countTallest = 0;
           }

           if(max==height[height_i]) {
               countTallest += 1;
           }
        }

        System.out.print(countTallest);
    }
}
