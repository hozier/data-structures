package com.ephemeral;

/**
 * Created by MDCCLXXVI on 5/30/14.
 */
public class Tile{

    void a (int i, int j, String [][] array){
        if(j%2 == 0){
            array[i][j] = "[b]";
            saySomething(i,j,array);
        }
        else{
            array[i][j] = "[w]";
            saySomething(i,j,array);
        }
    }

    void b(int i, int j, String[][] array){
        if(j%2 == 0){
            array[i][j] = "[w]";
            saySomething(i,j,array);
        }
        else{
            array[i][j] = "[b]"; saySomething(i,j,array);
            /*System.out.print(array[i][j]);*/
        }
    }


    void saySomething(int i, int j, String[][] array){
        System.out.print(String.format("%s", array[i][j]));
    }


    int[] keys(int i, int j, String[][] array, int [] masterlock, int bCount, int wCount){

        make(i, j, array);
        if(array[i][j].equals("[b]")){
            bCount++;
            masterlock[0] += bCount;
        }
        if(array[i][j].equals("[w]")){
            wCount++;
            masterlock[1] += wCount;
        }

        return masterlock;
    }

    void deliberate(int i, int j, String[][] array){
        if(i%2==0){
            a(i,j,array);
        }
        else{
            b(i,j,array);
        }
    }

    void make(int i, int j, String[][] array){

        if(i == 0){
            a(i,j,array); // set init color
        }
        if(i > 0) {
            if (array[i-1][0].equals("[b]")) {
                b(i, j, array); //start with [w]
            } else {
                a(i, j, array); //else [w], start with [b]
            }
        }

    }

    /**
     *
     * @param L user inputs length
     * @param W user inputs width
     *          note: both multiples of 4
     */
    void tile(int L, int W){
        final int MULTIPLE = 4;

        int masterlock[] = new int[2];
        int ll = L/MULTIPLE, ww = W/MULTIPLE, bCount = 0, wCount = 0;

        String [][]array = new String[ll][ww]; // rows, jth element in row
        // String switcheroo = "black";
        for (int i = 0; i < ll; i++) {
            for (int j = 0; j < ww; j++) {
                masterlock = keys(i, j, array, masterlock, bCount, wCount); // keep running indexed counts
            }
            /*if(!array[i][0].equals(array[i][ww - 1])){ System.out.print(" j-- for symmetry") ;}*/ System.out.print("\n");
        }


        System.out.println(String.format("tiles [b] = %d", masterlock[0]));
        System.out.println(String.format("tiles [w] = %d", masterlock[1]));


    }
}