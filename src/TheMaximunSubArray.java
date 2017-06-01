import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by alan on 5/31/17.
 */
public class TheMaximunSubArray {

    public static void main(String[] args) {



        int num_test;
        int result[][];
        int i,j,num;
        int max_sub_arr_cont=0,max_sub_arr_no_cont=0;
        int max_temp=0;
        int min_neg=Integer.MIN_VALUE;

        Scanner in = new Scanner(System.in);
        num_test = in.nextInt();

        result = new int[num_test][2];

        for(i=0;i<num_test;i++) {
            int array_length = in.nextInt();

            if (array_length<=0) { continue; }

            num = in.nextInt();
            max_temp = num;
            max_sub_arr_cont = num;

            for(j=1;j<array_length;j++) {

                num = in.nextInt();

                max_sub_arr_cont = Math.max(num,max_sub_arr_cont + num);
                max_temp = Math.max(max_temp,max_sub_arr_cont);

                if (num>0) {
                    max_sub_arr_no_cont += num;
                }

                if(num>min_neg && num<0) {
                    min_neg = num;
                }
            }

            result[i][0] = max_sub_arr_cont;

            if(max_sub_arr_no_cont>0) {
                result[i][1] = max_sub_arr_no_cont;
            } else {
                result[i][1] = min_neg;
            }


            max_sub_arr_no_cont = 0;
            min_neg = Integer.MIN_VALUE;
        }

        i = 0;

        for(i=0;i<num_test;i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }

    }
}
