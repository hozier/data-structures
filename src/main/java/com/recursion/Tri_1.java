package com.recursion;

import java.util.ArrayList;

/**
 * Created by MDCCLXXVI on 7/25/14.
 */
public class Tri_1 {
    public Tri_1(){
        square = "[]";
        display = "";


    }

    private final String square; private String display; private final static int count = 0;


    public static int pow2(int n){
        if(n == 1){
            return 2;
        }
        return 2 * pow2(n - 1);

    }

    public static int fibonacci(int n){
        int i = 0;
        int current = 0,  before = 1, temp;

        while(i <= n){
            temp = current;
            current = before + current;
            before = temp;
            i++;
        }

        return current;
    }
    public static int fibonacci$(int n){

        if(n <= 1){
            return 1;
        }

        //while(i <= n){
//            temp = current;
//            current = before + current;
//            before = temp;
          //  i++;
       // }
        //  propinquity

        else return fibonacci$(n-1) + fibonacci$(n - 2);
    }


    public static boolean isP (String ephemeral){

        if (count == 0){
            ephemeral = indirection(ephemeral);}

        int x=ephemeral.length()-1;



        if(ephemeral.length()<=1){
            return true;
        }

        char a = ephemeral.charAt(0);
        char b = ephemeral.charAt(x);

        if (a==b){  String ctrl = ephemeral.substring(1, x);

            System.out.println("ctrl = " + ctrl);
            return isP(ctrl);

        }
        else return false;
    }

    private static String indirection(String ephemeral){
        char[] accept = new char[ephemeral.length()];
        for (int i = 0; i < accept.length; i++) {
            if (Character.isLetter(ephemeral.charAt(i))) {
                accept[i] = Character.toLowerCase(ephemeral.charAt(i));
            }
        }
        return String.valueOf(accept).toLowerCase().trim();

    }

    private void add(){
        display += square;
    }

    public String getDisplay() {
        return display;
    }

    public String $builder (int ctrl){
        add(); // make String longer
        if(ctrl == 1){ // if you have reached last line: BUILD NOW.
            return getDisplay();
        }
        System.out.println("ctrl is now:" + ctrl);
        System.out.println("getDisplay() = " + getDisplay());



        return getDisplay() +"\n"+$builder(ctrl-1); // after final retrun: EVALUATED as EVERYTHING ELSE EXCEPT THE [CALL] ! ! !
                                                    // basically at: an ith arg., method call result will be everything but call
    }

    public static void  permuation(String str){
        //ArrayList<String> ctrl = new ArrayList<String>();
        
        String leftover;
        for (int i = 0; i < str.length(); i++) {

            String shorter_word = str.substring(0, i) + str.substring(i + 1);
            System.out.println("shorter_word = " + shorter_word);
//            for (int j = 0; j < ; j++) {
//
//            }
        }


    }

    public static String reversing_strings(String str){
        if(str.length() == 1){
            return str;
        }
        return str.charAt(str.length()-1) + reversing_strings(str.substring(0, str.length()-1));
    }

    public static void main(){
        Tri_1 stewie = new Tri_1();

        Tri_1.permuation("eat");
        //System.out.println("Tri_1.permuation(\"eat\") "+Tri_1.permuation("eat"));

        System.out.println("Tri_1.fibonacci(9) = " + Tri_1.fibonacci(9));

        System.out.println("stewie = " + String.valueOf(Tri_1.isP("A man, a plan, a canal, Panama!")));

        System.out.println(stewie.$builder(6));

        System.out.println("stewie = " + Tri_1.pow2(11));

    }
}
