package com.ephemeral;

/**
 * Created by MDCCLXXVI on 7/12/14.
 */
public class Fish {

    private int yumhum;
    private final int ZERO = Eat.NOT_HUNGRY.getValue();
    private final int TWO = Eat.VERY_HUNGRY.getValue();



    private enum Eat {
        NOT_HUNGRY(0),
        SOMEWHAT_HUNGRY(1),
        VERY_HUNGRY(2);


        Eat(int x) {
            value = x;
        }


        private int getValue() {
            return value;
        }

        private final int value;

    }

    Fish (){
        yumhum = ZERO;
    }


    private void eat(){

        yumhum = ZERO;
        System.out.println("Fish is now " + yumhum + " //void eat()");

    }

    public void move(){

        if(yumhum == TWO){
            System.out.println("Fish is currently " + yumhum + " //void move() // ==");
            eat();
            move();
        }

        if(yumhum < TWO){
            yumhum++;
            System.out.println("Fish is now " + yumhum + " //void move() // <");
        }


    } //end



}
