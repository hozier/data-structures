package com.cs187f12;

/**
 * Created by MDCCLXXVI on 8/30/14.
 */
public class Board {

    Board(){}
    Board(String [] ctrl){
        //this.boardArray = ctrl;
    }

    private int [][]boardArray; //board obj holds two dimensional array
    private boolean [][]isFixed; // booleans telling which cells are "fixed"

    public boolean isBad(){
       boolean isRepeated = false;

        for(int[] a:boardArray){
            for (int j = 0; j < a.length; j++) {      //boolean check for each element in row
                for (int k = j; k < a.length; k++) {
                    if(a[j] == a[k]){isRepeated = true; return isRepeated;}
                }
            }
        }

        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray.length; j++) {


                for (int k = i; k < boardArray.length; k++) {
                    if(boardArray[i] == boardArray[k]){isRepeated = true; return isRepeated;}
                }
                //int col = boardArray[j][i];

            }
        }


        return isRepeated;
    }

}
