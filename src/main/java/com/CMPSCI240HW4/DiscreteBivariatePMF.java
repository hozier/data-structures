/********************************
 * File: DiscreteBivariatePMF.java
 * Description: This class provides an object and member functions
 * that implement manipulations for PMFs of two variables.
 * Author: You
 * Date:
 *********************************/

import java.util.Arrays;
import java.lang.Math;

public class DiscreteBivariatePMF {
    double[][] P;  //P[i][j] gives P(X=xs[i],Y=ys[j])
    double[] xs; //xs[i] gives the ith value of the range of X
    double[] ys; //ys[j] gives the jth value of the range of Y

    /********************************
     * method: DiscreteBivariatePMF
     * Description: This method is a constructor for the DiscreteBivariatePMF
     * object. It takes the range of X in xs, the range of Y in ys, and the joint
     * PMF in P.
     * inputs: double P - matrix giving joint PMF P[i][j] gives P(X=xs[i],Y=ys[j])
     *         double[] xs - range of X
     *         double[] ys - range of Y
     *********************************/
    public DiscreteBivariatePMF(double[][] P, double[] xs, double[] ys){
        this.xs = xs; //set range of X
        this.ys = ys; //set range of Y
        this.P  = P;  //set joint PMF
    }

    /********************************
     * method: validate
     * Description: This method checks that the PMF is valid
     * inputs: none
     * outputs: true\false
     *********************************/
    public boolean validate(){
        //Replace from here
        double xCount = 0;
        for ( int i = 0 ; i < P.length ; i++ ){
            for ( int j = 0 ; j < P[i].length ; j++ ){
                xCount += P[i][j];
                System.out.println(xCount);
            }
            System.out.println();
        }
        return (xCount == 1.0);
        //to here
    }

    /********************************
     * method: marginalX
     * Description: This method computes the marginal probability P(X=x)
     * inputs: x
     * outputs: P(X=x)
     *********************************/

    public double marginalX(double x){
   
        double xCount = 0;
        for(int i = 0; i < xs.length; i++){
            if(xs[i] == x){ // if the arguement x in xs array is at ith, then we sum across ith x.
               // System.out.println("index is: " +index);

                for(int j = 0; j < P[i].length; j++){ xCount += P[i][j]; }
                    }
        }
        // System.out.printf("marginalX  ---------\n\t\t\t   %s\n\n\n",xCount);
        return xCount;
    }



    /********************************
     * method: marginalY
     * Description: This method computes the marginal probability P(Y=y)
     * inputs: y
     * outputs: P(Y=y)
     *********************************/
    public double marginalY(double y){
        double yCount = 0;
        for(int i = 0; i < ys.length; i++){
            if(ys[i] == y){

                for(int j = 0; j < P.length; j++) yCount += P[j][i]; // keep row fixed, sum across y sub ith.
                    }
        }
        // System.out.printf("marginalY  ---------\n\t\t\t   %s\n\n\n",yCount);
        return yCount;
    }


    /********************************
     * method: expectation
     * Description: This method computes the expected value of f(x,y)
     * inputs: f
     * outputs: E[f(X,Y)]
     *********************************/
    public double expectation(BivariateFunction f){

        double expectation = 0;
        for ( int i = 0 ; i < P.length ; i++ ){
            for ( int j = 0 ; j < P[i].length ; j++ ){
                expectation += ((f.compute(xs[i], ys[j])) * P[i][j]);
                // System.out.printf("expectation[i=%s][j=%s]: %s    ", i+1, j+1, expectation);
            }
            System.out.println();
        }
        // System.out.printf("\t\t\t  ---------\n\t\t\t   %s\n\n\n",expectation);

        return expectation;
    }

    /********************************
     * method: independent
     * Description: This method determines whether X and Y are independent
     * inputs: none
     * outputs: true/false
     *********************************/
    public boolean independent(){
        final double EPSILON = 0.00001;
        for ( int i = 0 ; i < P.length ; i++ ){
            for ( int j = 0 ; j < P[i].length ; j++ ){

                /** reference: http://stackoverflow.com/questions
                /2944344/java-check-if-two-double-values-match-on-specific-no-of-decimal-places **/
                if(Math.abs(marginalX(xs[i]) * marginalY(ys[j]) - P[i][j]) > EPSILON /**if the change btwn the values is greater than EPSILON, deem them !equal.**/) 
                 { System.out.println("IT IS FALSE."); return false; }

            }
            System.out.println();
        }
        return true;

    }

    /********************************
     * method: print
     * Description: This method prints the PMF
     * inputs: none
     * outputs: none
     *********************************/
    public void print(){
        System.out.print(" X\\Y |");
        for(int j=0;j<ys.length;j++){
            System.out.format(" %6.2f", ys[j]);
        }
        System.out.print("\n-----|");
        for(int j=0;j<ys.length;j++){
            System.out.print("-------");
        }
        System.out.print("\n");

        for(int i=0;i<xs.length;i++){
            System.out.format("%5.2f| ", xs[i]);
            for(int j=0;j<ys.length;j++){
                System.out.format(" %6.3f", P[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
    