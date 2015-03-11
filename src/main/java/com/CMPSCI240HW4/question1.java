/********************************
* File: question1.java
* Description: This class defines test cases for the DiscreteBivariatePMF class
*********************************/

 public class question1{
 
    public static void main(String args[]){

    double[][] P0 = {{0.2, 0.3 },{0,0.5}};
    double[][] P1 = {{-0.1, 0.5 },{0.4, 0.2 }};
    double[][] P2 = {{0.4,0.3 },{0.1,0.4}};
    double[]   xs1= {1, 2}; 
    double[]   ys1= {-1, 1}; 

    double[][] P3 = {{0.1, 0.3 },{0.2,0.1},{0.25,0.05}};    
    double[]   xs3= {1,2, 3}; 
    double[]   ys3= {1, 2}; 
    
    double[][] P4 = {{0.05, 0.15},{0.075, 0.225},{0.125, 0.375 }};    
    double[]   xs4= {-1,0, 1}; 
    double[]   ys4= {-0.5, 0.5}; 
    
    DiscreteBivariatePMF PMF = new DiscreteBivariatePMF(P0,xs1,ys1);
    
    System.out.println("P0:");
    PMF.print();
    System.out.format("P0 valid: %1$B\n",PMF.validate()); 
    
    PMF = new DiscreteBivariatePMF(P1,xs1,ys1);
    System.out.println("P1:");
    PMF.print();
    System.out.format("P1 valid: %1$B\n",PMF.validate()); 

    PMF = new DiscreteBivariatePMF(P2,xs1,ys1);
    System.out.println("P2:");
    PMF.print();
    System.out.format("P2 valid: %1$B\n\n",PMF.validate()); 

    PMF = new DiscreteBivariatePMF(P3,xs3,ys3);
    System.out.println("P3:");
    PMF.print();
    BivariateFunction f = new BivariateFunction(1.0,1.0,1.0);     
    System.out.format("P3(X=%.2f)=%.2f\n", xs3[1],PMF.marginalX(xs3[1])); 
    System.out.format("P3(Y=%.2f)=%.2f\n", ys3[0],PMF.marginalY(ys3[0])); 
    System.out.format("E[f(X,Y)]=%.2f\n", PMF.expectation(f));
    System.out.format("P3 independent: %1$B\n\n", PMF.independent());
    
    PMF = new DiscreteBivariatePMF(P4,xs4,ys4);
    System.out.println("P4:");
    PMF.print();
    f = new BivariateFunction(1.0,1.0,-1.0);     
    System.out.format("P4(X=%.2f)=%.2f\n", xs4[1],PMF.marginalX(xs4[1])); 
    System.out.format("P4(Y=%.2f)=%.2f\n", ys4[0],PMF.marginalY(ys4[0])); 
    System.out.format("E[f(X,Y)]=%.2f\n", PMF.expectation(f));
    System.out.format("P4 independent: %1$B\n\n", PMF.independent());

    }    
 
 }