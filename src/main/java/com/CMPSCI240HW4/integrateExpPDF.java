/********************************
* File: integrateExpPDF.java
* Description: This class provides an object and member functions
* for numerical integration of the exponential probability density 
* density function. 
* Author: You
* Date: 
*********************************/
import java.util.Arrays;
import java.lang.Math;

class integrateExpPDF{
    double lambda;

    /********************************
    * method: integrateExpPDF
    * Description: Constructor. Save the value of lambda for the PDF
    * inputs: double lambda - paramter of the exponential PDF
    *********************************/  
    public integrateExpPDF(double lambda){
        this.lambda = lambda;
    }


    /********************************
    * method: expPDF
    * Description: Computes the value of the exponential pdf at x
    * inputs: double x 
    * outputs: value of the PDF at x
    *********************************/  
    public double expPDF(double x){
        // val exponential_expr:Int = scala.Math
        double exponential_expr = java.lang.Math.pow(java.lang.Math.E, -1/this.lambda * x);
        return 1/this.lambda * exponential_expr;
        // this.lambda = lambda;
    }


    /********************************
    * method: partitionInterval
    * Description: Partitions the interval [a,b] into n equal size pieces.
    * Returns the answer in an array x where x[0]=a, x[1]=a+(b-a)/n,...,
    * x[n]=b.     
    * inputs: double a - start of interval
    *         double b - end of interval
    *         int n - number of pieces    
    * outputs: double array x holding break points of the n pieces
    *********************************/      
    public double[] partitionInterval(double a, double b,int n){

        // This function should return a 1D double array x
        final int zeroth_n = 1;
        double[] x = new double[zeroth_n + n]; //acount for the zeroth n

        for(int i = 0; i <= n; i++){
            x[i] = a + (((b - a) / n) * i);
        }
        return x;
    }
    
    /********************************
    * method: approxIntegrate
    * Description: Uses the rectangle rule to integrate the exponential
    * PDF from a to b using n rectangles.
    * inputs: double a - start of interval
    *         double b - end of interval
    *         int n - number of pieces    
    * outputs: approximate value of the integral
    *********************************/      
    public double approxIntegrate(double a, double b,int n){
        double approximation = 0; //        float approximation = 0;
        double[] nth_rec = partitionInterval(a, b, n);

        for(int i = 0; i < n; ++i){ approximation = approximation+ expPDF(nth_rec[i]) * ((b - a) / n);  }

        return approximation; // return the approximated integral.
    }

    /********************************
    * method: exactIntegrate
    * Description: Uses the exact formula to integrate the exponential
    * PDF from a to b.
    * inputs: double a - start of interval
    *         double b - end of interval
    *         int n - number of pieces    
    * outputs: exact value of the integral
    *********************************/      

    public double exactIntegrate(double a, double b){
        //replace from here 
        double b_exponential_expr = java.lang.Math.pow(java.lang.Math.E, -1/this.lambda * b);
        double a_exponential_expr = java.lang.Math.pow(java.lang.Math.E, -1/this.lambda * a);
        // the analytical definite integral.
        return a_exponential_expr - b_exponential_expr;
    }
 
}