package com.registrar;

import java.util.ArrayList;

/**
 * Created by MDCCLXXVI on 7/23/14.
 */
public class CashRegister {
    public CashRegister(double price){
        this.price=price;



    }

    public CashRegister(){

    }
    private double price;
    private int a = 0;

    public int giveChange(Coin x){



        double i = (int)((price*100) % x.getVal());  // captures r e m a i n d e r
        double j = (int) ((price*100) / x.getVal()); // how many of ith c o i n s

        System.out.println("how many currently " + j + " " + x.getName());
        System.out.println("new price " + i + " " + x.getName());


        price = i/100;
        return (int)j;

    }

    /**
     *
     * @param x coin array: Quartes, Dimes, Nickles, Pennies
     * @return sorted contents according to coin values (ranging from biggest to small)
     * RECURSIVE:
     */
    public String giveChange(Coin...x){

        if(price == 0){
            return "";
        }

        int BOSS = (int)((price*100));
        if(a == 0){ BOSS = (int)Math.ceil((price*100));}

                                            // System.out.println("PRICE IS "+BOSS);
        double i = (BOSS % x[a].getVal());  // captures r e m a i n d e r
        double j = (BOSS / x[a].getVal());  // how many of ith c o i n s

        price = i/100;
        return String.format("%s\t[count=%d]\t[remaining=%d]\n", x[a++].toString(),(int)j,(int)i )+giveChange(x);

    }

    public int bill_handler(){
        int ctrl = (int)((price * 100) / 100);
        this.price = (int)((price * 100) % 100);
        this.price = price / 100;
        System.out.println(String.format("$%.2f", price));

        return ctrl;

    }

    private static void introduce(int ctrl, CashRegister cmd){
        System.out.println(String.format("%s[name=%s][value=%s]\t\t\t[count=%s]", cmd.toString(),"Dollar","1.00",ctrl));

    }

    @Override
    public String toString(){
        return String.format("%s", getClass().getName());
    }

    public static Coin Q(){
        return new Coin("Quarter", 25);
    }
    public static Coin N(){
        return new Coin("Nickel", 5);
    }
    public static Coin D(){
        return new Coin("Dime", 10);
    }
    public static Coin P(){
        return new Coin("Penny", 1);
    }



    public static void main(double xx){
        int w, x, y, z;
        CashRegister stewie = new CashRegister(xx);

        int ctrl = stewie.bill_handler();
        System.out.println(String.format("$%.2f", (double)ctrl));

        introduce(ctrl, stewie);
        System.out.println(stewie.giveChange(Q(), D(), N(), P()));


//        w = stewie.giveChange(stewie.Q());
//        x = stewie.giveChange(stewie.D());
//        y = stewie.giveChange(stewie.N());
//        z = stewie.giveChange(stewie.P());
//
//        System.out.println(String.format("%d:%d:%d:%d",w,x,y,z));



    }


}
