package com.cs187f12;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by MDCCLXXVI on 8/27/14.
 */
public class StringBag {
    public StringBag(){
        bookkeeper = new LinkedList<String>();
    }

    public void insert(String ctrl){
        bookkeeper.add(ctrl);
    }

    public void clear(){
        bookkeeper.clear();
    }

    public boolean isFull(){
        if (bookkeeper.size() == 0){ return false;}
        return bookkeeper.get(bookkeeper.size()-1)==null;
    }

    public int size(){
        return bookkeeper.size();
    }

    @Override
    public String toString(){
        return String.format("%s[linkedlist=%s]",getClass().getName(),bookkeeper);
    }

    public String remove(){ //randomizes kth selection // return selected
        ListIterator<String> iter = bookkeeper.listIterator();
        int random = (int)(Math.random()*bookkeeper.size());
        System.out.println("\n\n***RANDOM = " + random);
        String retrieve = bookkeeper.get(random);
        int i = -1; while (i<random){ i++; iter.next(); } iter.remove();
        return retrieve;
    }

    public String remove(int x){
        ListIterator<String> iter = bookkeeper.listIterator();
        String retrieve = "Error: Invalid index. ";

        try {
            retrieve = bookkeeper.get(x); //bookkeeper.remove(x);
            int i = -1; while (i<x){ i++; iter.next(); } iter.remove();
        }
        catch (IndexOutOfBoundsException exception){
            System.out.printf("Invalid index: %s\n", exception);
        }
        return retrieve;
    }

    public static void main(String[] args){
        List<String> hold = new LinkedList<String>(); // additional code, not required.
        StringBag stewie = new StringBag();

        stewie.bookkeeper.add("Mary");
        stewie.bookkeeper.add("had");
        stewie.bookkeeper.add("a");
        stewie.bookkeeper.add("little");
        stewie.bookkeeper.add("lamb.");
        System.out.println("stewie.bookkeeper.toString() = " + stewie.bookkeeper.toString());


        hold.add(stewie.remove(3));
        System.out.println("stewie.bookkeeper.toString() = " + stewie.bookkeeper.toString());

        hold.add(stewie.remove(7));

        hold.add(stewie.remove(2));
        System.out.println("stewie.bookkeeper.toString() = " + stewie.bookkeeper.toString());
        for(String leftover:hold){  if(!leftover.contains("Error:")){ stewie.bookkeeper.add(leftover); }  }
        System.out.println("stewie.bookkeeper.toString() = " + stewie.bookkeeper.toString());

        hold.clear();
        hold.add(stewie.remove(3));
        System.out.println("stewie.bookkeeper.toString() = " + stewie.bookkeeper.toString());

        hold.add(stewie.remove(7));

        hold.add(stewie.remove(2));
        hold.add(stewie.remove(9));
        hold.add(stewie.remove(0));
        hold.add(stewie.remove(1));
        hold.add(stewie.remove(0));
        hold.add(stewie.remove(0));
        hold.add(stewie.remove(1));
        hold.add(stewie.remove(9));
        hold.add(stewie.remove(0));
        hold.add(stewie.remove(2));
        hold.add(stewie.remove(1));

        System.out.println("stewie.bookkeeper.toString() = " + stewie.bookkeeper.toString());
        for(String leftover:hold){  if(!leftover.contains("Error:")){ stewie.bookkeeper.add(leftover); }  }
        System.out.println("stewie.bookkeeper.toString() = " + stewie.bookkeeper.toString());


    }




    List<String> bookkeeper;
}
