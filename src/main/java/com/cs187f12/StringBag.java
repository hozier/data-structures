package com.cs187f12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by MDCCLXXVI on 8/27/14.
 */
public class StringBag {
    StringBag(){
        bookkeeper = new LinkedList<String>();
    }

    public String remove(int x){
        ListIterator<String> iter = bookkeeper.listIterator();
        String retrieve = "Error: Invalid index. "; 

        try {
            for (int i = 0; i < bookkeeper.size(); i++) {
                retrieve = iter.next();
                if(i == x){break;}
            }
            iter.remove();
        }
        catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        return retrieve;
    }


    List<String> bookkeeper;
}
