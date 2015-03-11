package com.ephemeral;

import htmlprocessor.HTMLProcessor;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import htmlprocessor.*;


/**
 * Created by MDCCLXXVI on 8/25/14.
 */
public class TrackID {

    public static void main(String[] args){

        try {
            ArrayList<String> filter = new ArrayList();
            filter.add("class=\"example-sentence\"");
            PairString pair = new PairString(
                    "div class=\"js-collapse-expand-zone source-title\" data-href=\"source-example-sentences\"",
                    "/section");
            LinkedList<String> lines = HTMLProcessor.getFilteredPortions(
                    "\"div class=\"js-collapse-expand-zone source-title\" data-href=\"source-example-sentences",
                    pair);
                    //HTMLProcessor.getFilteredLines("http://dictionary.reference.com/browse/university?s=t", filter);
            ListIterator<String> iter = lines.listIterator();
            while(iter.hasNext()){
                System.out.println(iter.next()); //one sec // can we speak to each othe on hangouts, i can't stay on ide and txt you at the smae time

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void open_stream(){
        boolean done = false;
        String address;
        while(!done){
        try {
            Scanner in = new Scanner(System.in);
            System.out.printf("Address: ");
            address = in.next();
            URL open = new URL(address);
            done = true;
        }
        catch (InputMismatchException exception){
            System.out.printf("exception: %s\n", exception);
            System.out.println("Enter a string...");
        }
        catch (MalformedURLException exception){
            System.out.printf("exception: %s\n", exception);
            System.out.println("Enter valid url stream...");
        }}

    }
}
