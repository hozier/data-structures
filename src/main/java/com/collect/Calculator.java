package com.collect;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by MDCCLXXVI on 8/3/14.
 */
public class Calculator {
    public Calculator(){}

    public static Stack<Integer> results = new Stack<Integer>();
    public static Stack<Character> operator = new Stack<Character>(); static int x;
    static int a;

    public static void main(){

        polish_calculator();
        System.out.printf("results = %s\n\n\n", results);

    }

    private static void polish_calculator(){
        Scanner in = new Scanner(System.in);
        boolean done = false;
        boolean HALT;


        while(!done){

            System.out.print("Enter numerics or operational symbol, Q to quit: ");
            HALT = in.hasNextInt();
            if(HALT){
                results.push(in.nextInt());
            }

            else{


            try{
                char n = in.next().trim().charAt(0);
                if(Character.isLetter(n)){n = Character.toLowerCase(n);}
                switch (n){


                    case'+': prepend(); results.push(x + a); break;  // EVAULATE arithmetic // Literally, add.
                    case'-': prepend(); results.push(x - a); break;
                    case'*': prepend(); results.push(x * a); break;
                    case'x': prepend(); results.push(x * a); break;
                    case'.': prepend(); results.push(x * a); break;
                    case'/': prepend(); results.push(x / a); break;
                    case'q': done = true; break;
                    default: System.out.print("Error: Invalid entry. \n\n"); break;
                    //default: results.push(Integer.parseInt(String.format("%s", n))); break; // if not operator, push Integ. to Stack
            }
            } catch (EmptyStackException exception){
                System.out.printf("Error: Less than 2 valid elements exist within \n[stack_e=%s].\n\n",exception);
            } catch (ArithmeticException exception){
                System.out.printf("Error: [stack_e=%s].\n\n",exception);}
            }

        }
    }

    private static void prepend(){
        a = results.pop(); x = results.pop();
    }

    private static void trace(char n){
        System.out.printf("[x=%d][n=%s][a=%d]\n", x, n, a);
    }


    private static void standard(){
        Scanner in = new Scanner(System.in);
        boolean done = false;
        boolean HALT;


        while(!done){

            System.out.print("Enter numerics or operational symbol, Q to quit: ");
            HALT = in.hasNextInt();
            if(HALT){
                results.push(in.nextInt());
            }

            else{

            char n = in.next().trim().charAt(0);
            if(Character.isLetter(n)){n = Character.toLowerCase(n);}
            switch (n){

                case'+': operator.push('+'); evaluator(); break;
                case'-': operator.push('-'); evaluator(); break;
                case'*': operator.push('*'); evaluator(); break;
                case'x': operator.push('*'); evaluator(); break;
                case'.': operator.push('*'); evaluator(); break;
                case'/': operator.push('/'); evaluator(); break;
                case'q': done = true; break;
                case'(': operator.push('(');break;
                case')': operator.push(')'); evaluator(); break;
                default: System.out.print("Error: Invalid entry. \n\n"); break;
                //default: results.push(Integer.parseInt(String.format("%s", n))); break; // if not operator, push Integ. to Stack
            }

            }

        }
    }

    private static void evaluator(){

    }


}
