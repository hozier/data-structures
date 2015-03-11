package com.cs187f12;

/**
 * Created by MDCCLXXVI on 8/27/14.
 */
public class Project_0 {

    Project_0(){

    }

    static class Echo{
        public String echo(String input){
            return input;
        }
    }
    public static void main(String []args){
        Echo stewie = new Echo();
        String output = stewie.echo("question");
        System.out.println("output = " + output);


    }
}
