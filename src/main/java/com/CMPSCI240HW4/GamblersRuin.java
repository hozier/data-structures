/********************************
* File: GamblersRuin.java
* Description: This class provides an object and member functions
* for simulating the Gambler's Ruin problem. 
* Author: You
* Date: 
*********************************/
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;


public class GamblersRuin{
  BiasedCoin coin;
  int N0;
  
  /********************************
  * method: GamblersRuin
  * Description: This method is a constructor for the GamblersRuin
  * object. It takes the intial amount of money N0, the coin bias probability
  * p and a random seed s.
  * inputs: int N0: initial amount of money
  *         double p: coin bias probability 
  *         int s: random seed
  *********************************/  
  public GamblersRuin(int N0, double p, int s){
    this.coin = new BiasedCoin(p,s);
    this.N0   = N0; 
  }
  
  /********************************
  * method: simulateN
  * Description: Starting with N0 dollars, this method simulates flipping a coin
  * using coin.flip() and keeps track of the amount of money the player has 
  * in each round. When the player reaches 0 dollars remaining or 100 rounds have
  * been played, the function returns the amount of money the player had in each
  * round in an array.
  * inputs: None
  * outputs: Array containing amount of money the player had in each round.
  *********************************/  

public int[] simulateN() {
    int max = 100;
    ArrayList<Integer> myLittleList = new ArrayList<Integer>(); 
    myLittleList.add(this.N0);
    final int ZERO_DOLLARS = 0;


    for (int i = 1; i <= max; i++) { // begin @ sub i = 1 because initial amount is N[0]
      int win_some = myLittleList.get(i-1) + 1;
      int lose_some = myLittleList.get(i-1) - 1; 
      if (this.coin.flip() == 1) {  myLittleList.add(win_some);} 
      else { myLittleList.add(lose_some); }

      if ( myLittleList.get(i) == ZERO_DOLLARS ) { break; }
    }

    int[] N = new int[myLittleList.size()]; 
    for(int x = 0; x < myLittleList.size(); x++) { N[x] = myLittleList.get(x);} // return an array w/o nulls
    return N; 
    
}

  /********************************
  * method: simulateX
  * Description: Starting with N0 dollars, this method simulates flipping a coin
  * using coin.flip() and keeps track of the amount of money the player has 
  * in each round. When the player reaches 0 dollars remaining or 100 rounds have
  * been played, the function returns the number of rounds played.
  * inputs: None
  * outputs: The number of roundds played before running out of money (with a 
  * maximum of 100 rounds).
  *********************************/  


  public int simulateX() {
    int count = 100;
    final int ZERO_DOLLARS = 0;

    int cash = this.N0; 
    for (int i = 1; i <= count; ++i) {
      cash+= (this.coin.flip() == 1) ?  1 : -1;
      if (cash == ZERO_DOLLARS) { return i; }
    }
  return count; }





  /********************************
  * method: approximatePMF
  * Description: This method computes an approximation to the PMF of the number of
  * rounds before the player runs out of money in the Gambler's Ruin problem.
  * It does this by simulating R experiments starting from N0 dollars using a
  * coin with bias p. The approximate probability that the game ends after k 
  * rounds is simply the number of times the game was observed to end after k 
  * rounds in the R simulations, divded by the number of simulations R.  
  * inputs: R - number of simulations
  * outputs: A double array P holding the approximation to the PMF. 
  * P[i] should be the probability that the last round played is round i. 
  *********************************/  
  public double[] approximatePMF(int R) {
        int max = 100;
        double[] P = new double[max + 1];
        int[] C = new int[P.length];
        for(int x = 0; x < C.length; ++x){ C[x] = 0; }

        for(int y = 1; y <= R; y++){ C[this.simulateX()] += 1; }

        for(int z = 0; z < C.length; z++){ P[z] = C[z] / (double)R; }

        return P;
  }
  
}