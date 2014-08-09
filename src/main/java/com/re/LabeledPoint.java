package com.re;

/**
 * Created by MDCCLXXVI on 7/19/14.
 */
public class LabeledPoint extends BetterRectangle {
    LabeledPoint(int a, int b, String label){
        super(a,b);
        this.label=label;
    }
    private String label;

    @Override
    public String toString(){
        return String.format("%s[label=%s]",super.toString(),label);
    }
}
