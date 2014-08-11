package com.collect;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by MDCCLXXVI on 8/9/14.
 * Listening is our access to understanding
 */
public class Driveway {
    public Driveway(){
        driveway_stack = new Stack<Integer>();
        street_stack = new Stack<Integer>();
    }

    private Stack<Integer> driveway_stack;
    private Stack<Integer> street_stack ;

    private static void retrieve_vehicle(){
        Driveway the_bklyn_valet = new Driveway();
        Scanner in;
        boolean done = false;

        while(!done){
            try{
                System.out.printf("[+ NUMBERS = ADD][- NUMBERS = REMOVE][0 = STOP] ");

                in = new Scanner(System.in); // inside
                int n = in.nextInt(), i = 0;
                boolean found = false;
                if( n == 0){
                    done = true;
                }
                else if(n > 0){ the_bklyn_valet.driveway_stack.push(n);

                }else { n = Math.abs(n); //while(!found){
                    System.out.println("n +/- " + n);

                    while(!the_bklyn_valet.driveway_stack.empty()) {

                        the_bklyn_valet.street_stack.push(the_bklyn_valet.driveway_stack.pop());
                      //  System.out.println("the_bklyn_valet.street_stack.get(i) = " + the_bklyn_valet.street_stack.get(i));

                        if(the_bklyn_valet.street_stack.get(i) == n){

                            found = true;
                            System.out.println( "removed " + the_bklyn_valet.street_stack.get(i));
                            the_bklyn_valet.street_stack.remove(i);
                            break;
                        }
                        i++;

                    }   if (!found){
                        System.out.printf("Car %d not found. \n", n);}

                    while (!the_bklyn_valet.street_stack.empty()){ the_bklyn_valet.driveway_stack.push(the_bklyn_valet.street_stack.pop()); }
                    System.out.println("repacked_street_stack = " + String.valueOf(the_bklyn_valet.driveway_stack));
                }
            }
            catch (InputMismatchException exception){
                System.out.printf("invalid_input=%s\n\n", exception.toString());//
            }


        }



//        while (!the_bklyn_valet.driveway_stack.empty()){
//
//        }
    }

    public static void main(){
        Driveway.retrieve_vehicle();
    }
}
