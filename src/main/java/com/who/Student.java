package com.who;

/**
 * Created by MDCCLXXVI on 7/19/14.
 */
public class Student extends Person {

    public Student(String b, String a, int i, String major){
        super(b, a, i);
        this.major = major;
    }

    private String major;

    @Override
    public String toString(){
        return String.format("%s[major=%s]",super.toString(),getMajor());
    }

    public String getMajor() {
        return major;
    }
}
