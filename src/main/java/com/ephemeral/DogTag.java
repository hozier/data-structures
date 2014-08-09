package com.ephemeral;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by MDCCLXXVI on 6/18/14.
 */
public class DogTag {
    /**
     *
     *
     *
     fido+=(int)((Math.random() * N)/4)+1;
     if(central_intelligence(fido, N, "F", track)){break;};

     *
     *
     *
     */
    DogTag(int lucky, int CONST, String initial, String []track) throws FileNotFoundException {
        this.lucky = lucky;
        this.x = CONST;
        this.init = initial;
        this.track = track;
        accountant = new PrintWriter("movement.txt");
    }
    DogTag() throws FileNotFoundException {
        accountant = new PrintWriter("movement.txt");
    }





    protected PrintWriter accountant;
    protected int lucky, x;
    protected String init;
    protected String [] track;

}
