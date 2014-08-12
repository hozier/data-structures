package com.ephemeral;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Created by MDCCLXXVI on 6/18/14.
 */
public class DogTag {

    public DogTag(int lucky, int CONST, String initial, String []track){
        this.lucky = lucky;
        this.x = CONST;
        this.init = initial;
        this.track = track;
        try{ accountant = new PrintWriter("movement.txt"); }
        catch( FileNotFoundException exception ) { System.out.println(exception); }
    }

    DogTag(){
        try{ accountant = new PrintWriter("movement.txt"); }
        catch( FileNotFoundException exception ) { System.out.println(exception); }
    }

    public static void DogTrack(int N){
        String []track = new String [N];
        String []autofill = {"F", "S", "R"};
        DogTag []dogArray = new DogTag[autofill.length];
        String []imagination = reimagine(autofill);
        int adv_lngth = 0;

        System.out.println(Arrays.toString(imagination)+"\n");

        boolean HALT = false;



        for (int i = 0; i < N; i++) { //initialize array with
            track[i] = "o";
        }


        for (int i = 0; i < dogArray.length; i++) { // automate creation of ∑i DogTag objects
            int advance =(int)((Math.random() * N)/4)+1; //new position created
            dogArray[i] = new DogTag(advance, N, imagination[i], track);
            dogArray[0].accountant.println(String.format("\n**ADVANCE (dogArray[ %s ]) =  %d \n", dogArray[i].init, dogArray[i].lucky));

            adv_lngth =(int)((String.format("\n**ADVANCE (dogArray[ %s ]) =  %d \n", dogArray[i].init, dogArray[i].lucky).length()) * 1.62) ;



            drone(dogArray, i);
        }


        while (dogArray[0].lucky < N || dogArray[1].lucky < N || dogArray[2].lucky < N){ draw(dogArray, adv_lngth);



            for (int i = 0; i < dogArray.length;  i++) {

                if ( central_intelligence(dogArray, i) ){HALT = true;break;}

            }
            if(HALT){
                break;



            }
        }dogArray[0].accountant.close();
    }

    /**
     * Executes movement of object to new location. Sets initials
     * at new position (only after lucky updates its count).
     *
     * (external)
     * //@param lucky is an argument of -> track[lucky: new position created]
     *
     * @param dogArray collection of dog objects
     * @param i represents a specific canine at ith index
     */
    private static void drone(DogTag []dogArray, int i){
        if(!dogArray[i].track[reset(dogArray[i].lucky, dogArray[i].x)].equals("o")){dogArray[i].track[reset(dogArray[i].lucky, dogArray[i].x)] += dogArray[i].init;}
        else{dogArray[i].track[reset(dogArray[i].lucky, dogArray[i].x)] = dogArray[i].init;}
        System.out.println(Arrays.toString(dogArray[i].track));
    }

    private static boolean central_intelligence(DogTag[] dogArray, int i){
        boolean fall = false;
        int advance = (int)((Math.random() * dogArray[i].x)/4)+1;
        int capture = dogArray[i].lucky;
        //PrintWriter ledger = new PrintWriter("movement.txt");


        dogArray[i].lucky += advance; //new position created
        dogArray[0].accountant.println("\n**ADVANCE (dogArray["+ dogArray[i].init + "]) += "+ advance + " equates to: "+capture +" + " +advance + "->"+dogArray[i].lucky+"\n");

        if(dogArray[i].lucky <dogArray[i].x){

            drone(dogArray, i);

        }
        else if (dogArray[i].lucky >=dogArray[i].x){
            // if new position is greater than array size, return true to stop advancements
            // immediately: object at ith element wins.
            dogArray[i].track[dogArray[i].x -1] = dogArray[i].init;
            System.out.println(Arrays.toString(dogArray[i].track));
            initToName(dogArray, i); fall = true; }//break;}




        return fall;
    }


    private static int reset (int lucky, int x){
        if(lucky == x/3 || lucky == (2*x)/3){ lucky = 0;}
        return lucky;
    }

    private static String[] reimagine(String []autofill){
        int random = (int)(Math.random() * autofill.length);
        int random_2 = (int)(Math.random() * autofill.length);
        int random_3 = (int)(Math.random() * autofill.length);

        while (random == random_2){
            random_2 = (int)(Math.random() * autofill.length);
        }


        String replacements[]= new String[autofill.length];
        replacements[0] = autofill[random];
        replacements[1] = autofill[random_2];
        replacements[2] = autofill[autofill.length - (random +random_2)];

        return replacements;
    }

    private static void initToName(DogTag[] dogArray, int i){
        if(dogArray[i].init.equals("F")){
            dogArray[i].init += "ido";
        } else if(dogArray[i].init.equals("S")){
            dogArray[i].init += "pot";
        } else if(dogArray[i].init.equals("R")){
            dogArray[i].init += "over";
        }
        System.out.println(dogArray[i].init+" wins!");
    }

    private static void draw(DogTag[] dogArray, int adv_lngth){
        String line="";
        for (int i = 0; i < adv_lngth; i++) {
            line+="_";
        }

        dogArray[0].accountant.print(line+"\n");
    }

    public static void main(){
        DogTag.DogTrack(47);
    }





    protected PrintWriter accountant;
    protected int lucky, x;
    protected String init;
    protected String [] track;

}
