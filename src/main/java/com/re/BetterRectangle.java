package com.re;

import java.awt.*;

/**
 * Created by MDCCLXXVI on 7/19/14.
 */
public class BetterRectangle extends Rectangle {
    BetterRectangle(int x, int y){
        super();
        setLocation(x, y);
        setSize(x, y);
    }

    int getPerimiter(){
        return getSize().height*2 + getSize().width*2;
    }

    int getArea(){
        return getSize().height * getSize().width;

    }
}
