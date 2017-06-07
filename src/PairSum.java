import java.util.ArrayList;

/**
 * Created by AlanPolar on 02/06/2017.
 */
public class PairSum {

    public static void main(String[] args) {
        int[] vector={0,2,4,0};
        int sum = 8;

        System.out.println(hasPairSum(vector,sum));
    }

    public static boolean hasPairSum(int[] v,int sum) {
        ArrayList<Integer> complement = new ArrayList<Integer>();

        for(int i=0;i<v.length;i++) {
            if(complement.contains(v[i])){
                return true;
            } else if(v[i]<=sum){
                complement.add(sum-v[i]);
            }
        }

        return false;
    }
}
