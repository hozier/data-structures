package com.registrar;

/**
 * Created by MDCCLXXVI on 7/23/14.
 */
public class Coin {
    public Coin(String name, int val){
        this.name = name;
        this.val = val;

    }

    @Override
    public String toString(){
        return String.format("%s[name=%-7s][value=%-4.2f]",getClass().getName(),getName(),(double)getVal()/100);
    }

    public int getVal() {
        return val;
    }

    public String getName() {
        return name;
    }

    private String name;
    private int val;
}
