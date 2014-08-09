package com.ephemeral;

/**
 * Created by MDCCLXXVI on 5/27/14.
 */
public class Aguatic {
    Aguatic(double event, double outcome){

        this.e = event;
        this.o = outcome;
    }

    double chance (Aguatic v){

        return v.o /v.e;

    }

    protected double e , o;
    protected String mist;
}
