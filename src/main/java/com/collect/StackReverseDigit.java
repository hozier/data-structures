package com.collect;

import java.util.Stack;

/**
 * Created by MDCCLXXVI on 8/8/14.
 */
public class StackReverseDigit {

    public StackReverseDigit(){
    }
    private static Stack<Integer> nero = new Stack<Integer>();

    public static void main(){
        reverse_digit(1729);
        //System.out.println("nero = " + String.valueOf(nero));
    }

    public static void reverse_digit(int n){

        if(n <= 0){ while (!nero.isEmpty()){
            System.out.printf("%s ",nero.pop());} return;
        }
        nero.push(n%10);
        ;
        reverse_digit(n/10);
    }
}
