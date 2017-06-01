import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by alan on 5/31/17.
 */
public class TheMaximumSubArray {

    public static void main(String[] args) {

        int num_tests;
        int result[][];
        int i,j,num;
        int max_sub_arr_cont=0,max_sub_arr_no_cont=0;
        int max_temp=0;

        Scanner in = new Scanner(System.in);
        num_tests = in.nextInt();

        result = new int[num_tests][2];

        //loop over the test
        for(i=0;i<num_tests;i++) {

            int array_length = in.nextInt(); // read the quantity numbers

            if (array_length<=0) { continue; }

            num = in.nextInt();
            max_temp = num;
            max_sub_arr_cont = num;

            // If the number is positive add the number to the max array non-contiguous
            if (num>0) {
                max_sub_arr_no_cont += num;
            }

            for(j=1;j<array_length;j++) {

                num = in.nextInt();
                max_sub_arr_cont = Math.max(num,max_sub_arr_cont + num);
                max_temp = Math.max(max_temp,max_sub_arr_cont);

                // If the number is positive add the number to the max array non-contiguous
                if (num>0) {
                    max_sub_arr_no_cont += num;
                }
            }

            result[i][0] = max_temp;

            if(max_sub_arr_no_cont>0) {
                result[i][1] = max_sub_arr_no_cont;
            }else{
                result[i][1] = max_temp;
            }

            max_sub_arr_no_cont = 0;
        }

        i = 0;

        for(i=0;i<num_tests;i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }

    }
}
