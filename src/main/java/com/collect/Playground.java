package com.collect;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by MDCCLXXVI on 8/2/14.
 */
public class Playground {

    public static void main(){
        for (String s : through_theLookingGlass){
            if(!dictionary.contains(s)){
                System.out.println("s != dictionary " + s);
            }
        }

    }

    //Set<String> treehouse = new TreeSet<String>();
    private static Set<String> dictionary = alter("words");// new HashSet<String>();
    public static Set<String> through_theLookingGlass = alter("alice30.txt"); // new HashSet<String>();

    public static Set<String> alter(String filename){

        Set<String> the_giver = new HashSet<String>();

        Scanner in;
        try{
            in = new Scanner(new File(filename));// scan for file name

            in.useDelimiter("[^a-zA-Z]+"); // any character that is not alphabetic, treat it as a break

            while (in.hasNext()){
                the_giver.add(in.next().toLowerCase());
            }

        }
        catch(FileNotFoundException exception){
            exception.printStackTrace();
        }

        return the_giver;
    }


}
