package com.ephemeral;

/**
 * Created by MDCCLXXVI on 6/13/14.
 */
public class JavaRecursion {

    int getTriNumber(int num){
        if(num ==1){
            return 1;
        }
        else{
            return num + getTriNumber(num-1);
        }

    }

    int factorial(int num){
        if(num == 1)
            return 1;
        else{
            return num * factorial(num - 1);
        }
    }

    public static String verser(String word){
        if(word.length() == 1){
            return  word;
        }
        return word.charAt(0) + verser(word.substring(0, word.length()-1));
    }


}
