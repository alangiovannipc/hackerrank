import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by AlanPolar on 31/05/2017.
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        int arr_i;
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(arr_i=0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        calculateMaxMinSum(arr);
    }

    public static void calculateMaxMinSum(int[] arr) {
        int max=0;
        int arr_i;
        int min=Integer.MAX_VALUE;
        long maxSum=0,minSum=0,sumTotal=0;

        for(arr_i=0; arr_i < 5; arr_i++) {
            sumTotal += arr[arr_i];
            max = Math.max(max,arr[arr_i]);
            min = Math.min(min,arr[arr_i]);
        }

        System.out.print( (sumTotal - max) + " " + (sumTotal - min));

    }
}
