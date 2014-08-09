package com.collect;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by MDCCLXXVI on 8/8/14.
 */
public class StackReverse {
    public StackReverse(){

    }

    private static Stack<String>  ringo = new Stack<String>();

    public static void main(){
        rice_cripsy("Mary had a little lamb. Its fleece was white as snow.");
        System.out.println("ringo = " + String.valueOf(ringo));
    }

    private static void rice_cripsy(String stringbean){
        Scanner in = new Scanner(stringbean);

        while(in.hasNext()){

            String ctrl = in.next();
            if(ctrl.charAt(ctrl.length() - 1) == '.'){
               ctrl = String.format(String.valueOf(ctrl.charAt(0))).toUpperCase() + ctrl.substring(1);
               ringo.push(ctrl.substring(0, ctrl.length() - 1));
               while (!ringo.isEmpty()){
                   if(ringo.size() == 1){
                       String alt = ringo.pop(); alt.substring(0, alt.length() - 1);
                       System.out.printf("%s. ",alt.toLowerCase());
                   }
                   else { System.out.printf("%s ", ringo.pop()); }
               }

            }else{
               ringo.push(ctrl);
           }


        }
        System.out.println();
    }

}
