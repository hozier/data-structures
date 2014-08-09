package com.collect;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by MDCCLXXVI on 8/1/14.
 */
public class ListDemo {

    public ListDemo(){

    }

    private static LinkedList<String> stringbean = new LinkedList<String>();
    private static LinkedList<String> employer = new LinkedList<String>();


    public static void main(){

        ListDemo classified = new ListDemo();
        classified.stringbean.addFirst("Jack");
        classified.stringbean.addLast("Bobby");
        classified.stringbean.addFirst("Jill");
        classified.stringbean.addFirst("Jane");

        ListIterator<String> iter = classified.stringbean.listIterator();
        alter(iter);
        alter(iter);

        iter.add("Sansa");
        iter.add("Greyjoy");
        //jane, jill, || sansa, greyjoy, || jack, bobby

        alter(iter);
        takeaway(iter); // where?

        for (String s:classified.stringbean){
            System.out.println("s = " + s);
        }

    }

    public static void main_2(){
        employer.add("a");
        employer.add("b");
        employer.add("c");
        employer.add("d");
        employer.add("e");
        employer.add("f");
        employer.add("g");
        employer.add("h");
        employer.add("i");
        employer.add("j");
        employer.add("k");

        downsize(employer, 2);
        System.out.println( String.valueOf(employer));
    }

    public static void downsize(LinkedList<String> employeeNames, int n){
        ListIterator<String> iter = employeeNames.listIterator();
        int count = 0;
        while(iter.hasNext()){
            count ++;

            String name = iter.next();

            if(count % n == 0){
                //count = 0;
                System.out.printf("[removed=%s]",name);
                iter.remove();


            }
        }
    }

    public static void main_3(){
        reverse(employer);
        System.out.println("employer = " + String.valueOf(employer));
    }

    public static void reverse(LinkedList<String> stringbeans){

        ListIterator<String> ctrl = stringbeans.listIterator();
        LinkedList<String> transfer = new LinkedList<String>();
        while(ctrl.hasNext()){
             transfer.addFirst(ctrl.next());
        }

        stringbeans.clear();

        for (int i = 0; i < transfer.size(); i++) {
            stringbeans.add(transfer.get(i));
        }


    }

    private static String alter(ListIterator<String> iter){

            String porcupine = iter.next();
            return porcupine;
            /*while(iter.hasNext()){ if(porcupine.length() > 5){
                iter.remove();

            }}*/

    }

    private static void takeaway(Iterator<String> iter){
        iter.remove();
    }

}
