/********************************
* File: question1.java
* Description: This class defines test cases for the exponential integration class
*********************************/

import java.util.Arrays;
import java.lang.Math;

public class question3{

    public static void main(String args[]){

        test(0.5, 0.05, 1.0, 5, 100);
    
    }
    
    public static void test(double lambda, double a, double b, int step, int maxPieces){
        
        int    j;
        double[] approx = new double[maxPieces/step];
        double[] error  = new double[maxPieces/step];
        int[] numPieces = new int[maxPieces/step];
        double exact;
        
        integrateExpPDF iepdf = new integrateExpPDF(lambda);
        exact = iepdf.exactIntegrate(a,b);
        
        System.out.format("lambda=%.2f a=%.2f b=%.2f  exact=%.3f\n",lambda,a,b,exact);
        j=0;
        for(int n=step;n<=maxPieces;n+=step){
          approx[j]=iepdf.approxIntegrate(a,b,n);
          error[j]=Math.round(10000.0*Math.abs(approx[j] - exact))/10000.0;
          approx[j]=Math.round(10000.0*approx[j])/10000.0;
          numPieces[j]=n;
          j++;
        }
                
        System.out.printf("Approx: %s\n",Arrays.toString(approx));
        System.out.printf("Error:  %s\n",Arrays.toString(error));
        System.out.printf("Pieces: %s\n",Arrays.toString(numPieces));
        System.out.println("");
    }

}