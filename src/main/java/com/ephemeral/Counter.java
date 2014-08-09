package com.ephemeral;

/**
 * Created by MDCCLXXVI on 7/9/14.
 */
public class Counter {

    protected int marker;

    public void setMarker(int marker) {
        this.marker = marker;
    }

    public void undo () {marker = marker > 0? marker-- : 0;}

    public int getMarker() {
        return marker;
    }

    public Counter() {
        marker = 0;
    }

    public void increment(){
       marker++;
    }

    public boolean comesBefore(Counter other){ //if caller obj is LESS; return true
        boolean first = false;

        Integer x = marker;
        Integer y = other.getMarker();

        if(x.compareTo(y) < 0){
            first = true;
            return first;
        }
        return first;

    }
}
