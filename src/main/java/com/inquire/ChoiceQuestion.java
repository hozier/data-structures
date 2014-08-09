package com.inquire;

import java.util.Scanner;

/**
 * Created by MDCCLXXVI on 7/16/14.
 */
public class ChoiceQuestion extends Question {
    public int SIZE;
    //Scanner in = new Scanner(System.in);

    public ChoiceQuestion(int x){
        super();
        setSIZE(x);
    }


    public String array[];  // = new String[SIZE];

    private void setSIZE(int x){
        this.SIZE = x;
    }


    public void addChoice(){
        array = new String[SIZE];
        Scanner in;// = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            in = new Scanner(System.in);
            System.out.println("Please enter choice " + (i+1) +": ");
           // if(i > 0){            if (in.nextLine().equals("\n")){in.next();}}
            String stacy = in.nextLine().trim();
            array[i] = (i+1)+". "+stacy;
            //in.next();
            System.out.println(array[i]);
            System.out.println("Checking.. Set correct answer to choice "+ (i+1) +"?\nEnter boolean option: ");
            matchAns(in.nextBoolean(), i);
            System.out.println();
        }


    }

    public void addChoice_alt(){
        Scanner in;// = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            in = new Scanner(System.in);
            System.out.println("Please enter choice " + (i+1) +": ");

            addText((i+1)+". "+in.nextLine().trim());

            System.out.println(choiceArr.get(i));
            System.out.println("Checking.. Set correct answer to choice "+ (i+1) +"?\nEnter boolean option: ");
            matchAns(in.nextBoolean(), i);
            System.out.println();
        }


    }

    protected void matchAns(boolean isAns, int i){
        if(isAns){
            setAnswer(array[i]);
        }

    }

    @Override
    public void saySomething(){
        super.saySomething();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Override
    public String toString(){
        return String.format("%s,[choiceArr=%s]",super.toString(), String.valueOf(choiceArr));
    }
}
