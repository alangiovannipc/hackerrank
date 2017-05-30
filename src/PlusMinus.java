
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by alan on 5/30/17.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        calculateFraction(arr,n);
    }

    public static void calculateFraction(int arr[],int n) {

        double positives=0,negatives=0,zeros=0;
        double fraction_pos,fraction_neg,fraction_ze;

        for(int arr_i=0; arr_i < n; arr_i++){
            if (arr[arr_i] > 0) {
                positives += 1;
                continue;
            }

            if (arr[arr_i] < 0) {
                negatives += 1;
                continue;
            }

            if (arr[arr_i] == 0) {
                zeros += 1;
                continue;
            }
        }

        fraction_pos = positives / n;
        fraction_neg = negatives / n;
        fraction_ze = zeros / n;

        System.out.println(round(fraction_pos));
        System.out.println(round(fraction_neg));
        System.out.println(round(fraction_ze));
    }

    public static String round(double value) {

        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.CEILING);

        return df.format(value);
    }

}
