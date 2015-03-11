/********************************
* File: question2.java
* Description: This class defines test cases for the GamblersRuin class
*********************************/
import java.util.Arrays;
public class question2{

    public static void main(String args[]){
        int N0=10;
        double p=0.25;
        int R = 1000;
        int[] N;
        double[] P;
        GamblersRuin GR = new GamblersRuin(N0, p, (int)System.currentTimeMillis()); 
        N = GR.simulateN();
        P = GR.approximatePMF(R);        

        System.out.printf("N0=%d  p=%.3f\n",N0,p);
        System.out.printf("Simulation: %s\n",Arrays.toString(N));
        System.out.printf("Approx PMF: %s\n",Arrays.toString(P));
    }

}