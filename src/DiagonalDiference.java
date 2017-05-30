import java.util.Scanner;

/**
 * Created by AlanPolar on 30/05/2017.
 */
public class DiagonalDiference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,i,j,sumDiagLeft=0,sumDiagRight=0,diffDiag=0,num;
        int[][] matriz;

        n = in.nextInt();
        if (n>0){
            matriz = new int[n][n];

            for (i=0;i<n;i++){
                for (j=0;j<n;j++) {
                  num   = in.nextInt();
                  matriz[i][j] = num;
                }
            }

            for (i=0;i<n;i++){
                for (j=0;j<n;j++){
                    if (i == j) {
                        sumDiagLeft += matriz[i][j];
                    }

                    if( (i+j) == (n-1) ){
                        sumDiagRight += matriz[i][j];
                    }
                }
            }

            diffDiag = sumDiagLeft - sumDiagRight;
            if (diffDiag<0){ diffDiag *= -1;}

            System.out.print(diffDiag);

        }



    }
}
