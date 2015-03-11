package com.who;

/**
 * Created by MDCCLXXVI on 7/19/14.
 */
public class Employee extends Person{
    public Employee(String b, String a, int i, double cash){
        super(b,a,i);
        salary = cash;

    }
    private double salary;

    @Override
    public String toString(){
        return String.format("%s[salary=%d]",super.toString(),getSalary());
    }

    public double getSalary() {
        return salary;
    }
}
