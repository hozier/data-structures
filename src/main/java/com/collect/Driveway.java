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
                int n = in.nextInt();
                boolean found = false;
                if( n == 0){
                    done = true;
                }
                else if(n > 0){ the_bklyn_valet.driveway_stack.push(n);

                }else { n = Math.abs(n); //while(!found){

                    while(!the_bklyn_valet.driveway_stack.empty()) {

                        the_bklyn_valet.street_stack.push(the_bklyn_valet.driveway_stack.pop());

                        if(the_bklyn_valet.street_stack.peek() == n){

                            found = true;
                            System.out.printf( "[REMOVED %s]", the_bklyn_valet.street_stack.peek());
                            the_bklyn_valet.street_stack.pop();
                            break;
                        }

                    }   if (!found){
                        System.out.printf("[Car %d not found]", n);}

                        while (!the_bklyn_valet.street_stack.empty()){ the_bklyn_valet.driveway_stack.push(the_bklyn_valet.street_stack.pop()); }
                }
            }
            catch (InputMismatchException exception){
                System.out.printf("invalid_input=%s\n\n", exception.toString());
            }

            System.out.printf("%s\n\n", String.valueOf(the_bklyn_valet));

        }

    }

    public static void main(){
        Driveway.retrieve_vehicle();
    }

    @Override
    public String toString(){
        return String.format("%s[driveway_stack=%s][street_stack=%s]", getClass().getName(), driveway_stack, street_stack);
    }
}
