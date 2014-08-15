package com.cs187f12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MDCCLXXVI on 8/27/14.
 */
public class StringBag {
    StringBag(){
        bookkeeper = new ArrayList<String>();
    }

    public String remove(int x){
        String retrieve = "Error: Invalid index. ";
        try {
            retrieve= bookkeeper.get(x);
            bookkeeper.remove(x);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        return retrieve;
    }

    List<String> bookkeeper;
}
