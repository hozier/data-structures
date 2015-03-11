package com.look;

import java.util.Arrays;
import java.util.LinkedList;

import com.*;
import com.registrar.CashRegister;
import com.registrar.Coin;


/**
 * Created by Nijito Tanaka on 7/28/14.
 */
public class Selection_Sort {


    public static int[] select_1(int...x){

        for (int i = 0; i < x.length; i++) {

            swap(x, i, key(i, x));

            System.out.println("+ arrayx @i"  +"="  + Arrays.toString(x)); //<------ CHECKING SORTED ARRAY SO FAR . . .
        }

        return x;
    }

    private static void swap(int anArray[], int i, int[]smallest){
        final int temporary = anArray[i], theSmallestNumber_at_this_index = smallest[1], theSmallestNumber = smallest[0];

        if ( theSmallestNumber_at_this_index !=0 ){ // if the smallest element IS located at [0] already, there is no need to swap !

        anArray[i] = theSmallestNumber; // set smallest
        anArray[theSmallestNumber_at_this_index] = temporary;}

    }

    private static int[]key(int k, int...array){

        int smallest[] = new int[2];
        //System.out.println("+ arrayx @i"  +"="  + Arrays.toString(array));


        smallest[0] = array[k]; // SMALLEST
        for (int i = k; i < array.length; i++) {
            if(smallest[0] > array[i]){

                smallest[0] = array[i]; // SMALLEST
                smallest[1] = i; // ITH
            }

        }

        return smallest;

    }

    public static int[] random(int n){
//        int r =(int) (Math.random() * n) + 1;
        int ctrl[] = new int[n];
        for (int i = 0; i < n; i++) {
            ctrl[i] = (int) (Math.random() * n) + 1;;
        }
        return ctrl;
    }
    public static void main(){


        int[] coins = {new Coin("Quarter", 25).getVal(),CashRegister.Q().getVal(),CashRegister.D().getVal(),CashRegister.P().getVal(),CashRegister.N().getVal()};
        Coin[] c_aray = {CashRegister.Q(),CashRegister.D(),CashRegister.P(),CashRegister.N()};
        c_aray[0].getVal();

        System.out.println("coins = " + Arrays.toString(coins));
        System.out.printf("select_1 = %s\n\n\n\n", Arrays.toString((Selection_Sort.select_1(coins))));


        int random[] = random(17);
        System.out.println("random = " + Arrays.toString(random));
        System.out.printf("select_1 = %s\n\n\n\n", Arrays.toString((Selection_Sort.select_1(random))));

        System.out.printf("select_1 = %s\n\n\n\n", Arrays.toString((Selection_Sort.select_1(6,5,4,3,2,1))));

        System.out.printf("select_1 = %s\n\n\n\n", Arrays.toString((Selection_Sort.select_1(11,2,9,17,5,12))));
        System.out.println("select_1 = " + Arrays.toString(Selection_Sort.select_1(11, 9, 17, 5, 12, 4, 4, 4, 2, 5, 6, 643, 23, 23, 2, 21, 13, 5, 61, 1, 2, 3, 0)));


    }
}
