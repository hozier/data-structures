/********************************
* File: BiasedCoin.java
* Description: This class provides an object and member functions
* for simulating a biased coin flip.
*********************************/
import java.util.Arrays;
import java.lang.Math;
import java.util.Random;

public class BiasedCoin{
    double p=0;
    Random generator;

    //Constructor takes bias probability p and random seed s 
    public BiasedCoin(double p, int s){
        this.p=p;
        this.generator = new Random(s);
    }
    
    //Sample a uniform random double between 0 and 1
    //and use it to sample a Bernoulli with probability p 
    public int flip(){
      double d = generator.nextDouble();
      if(d<p){
        return 1;
      }
      else{
        return 0;      
      }
    }
}
