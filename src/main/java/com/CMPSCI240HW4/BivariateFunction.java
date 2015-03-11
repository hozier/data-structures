/********************************
* File: BivariateFunction.java
* Description: This class provides an object and member functions
* for computing a function of two variables of the form ax^2 + bx^2 +cxy
*********************************/

import java.util.Arrays;
import java.lang.Math;

public class BivariateFunction{
    double a=0;
    double b=0;
    double c=0; 

    //Store the function coefficients 
    public BivariateFunction(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    //Compute the function on inputs x and y
    public double compute(double x, double y){
        return a*Math.pow(x,2) + b*Math.pow(y,2) + c*x*y;
    } 

}