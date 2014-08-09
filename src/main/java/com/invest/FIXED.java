package com.invest;

/**
 * Created by MDCCLXXVI on 7/25/14.
 */
public class FIXED extends LineItem {
    FIXED(){
        this.ONE = 1;

    }


    public double add(LineItem accept) {
        return super.add(accept, this.ONE);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private final int ONE;
}
