package com.who;

/**
 * Created by MDCCLXXVI on 7/19/14.
 */
public class Manager extends Employee{
    Manager(String b,String a,int i,double s, String dept){
        super(b,a,i,s);
        this.department=dept;
    }

    private String department;

    @Override
    public String toString(){
        return String.format("%s[department=%s]",super.toString(),getDepartment());
    }

    public String getDepartment() {
        return department;
    }
}
