package com.who;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

/**
 * Created by MDCCLXXVI on 7/19/14.
 */

interface Measurable{
    double measure(Measurable arr[]);
}

interface Filter{
    boolean accept(Object x);
}
public class Person implements Measurable, Filter{

    public Person(String y, String x, int year){
        lName = y;
        fName = x;
        this.year = year;
    }

    public Person(String y, String x, double height){
        lName = y;
        fName = x;
        this.height = height;

    }

    @Override
    public String toString(){
        return String.format("%s[name=%s][year=%d][height=%f]",getClass().getName(),getName(),getYear(),getHeight());
    }

    private String fName, lName, name;
    private int year; private double height;

    public String getName() {
        return String.format("%s, %s", getlName(), getfName());
    }

    public int getYear() {
        return year;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double measure(Measurable[] arr) {
        return height;
    }

    @Override
    public boolean accept(Object x) {
        boolean gravity = false;
        String suzyQ = (String) x;
        if (suzyQ.length() < 5) {
            gravity = true;
        }
        return gravity;

    }

    public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter f){
        ArrayList<Object> NEW = new ArrayList();

        for (int i = 0; i < objects.size(); i++) {
           if(f.accept(objects.get(i))){NEW.add(objects.get(i));}

        }
        return NEW;

    }


}
