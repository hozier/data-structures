package com.ephemeral;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by MDCCLXXVI on 7/11/14.
 */
public class MenuClass {

    MenuClass(){
        select = 0;

    }

    private int select;


    public void selectChoice() {
        boolean cease;

        String _open = "Open new account";
        String _log = "Log into existing account";
        String _help = "Help";
        String _quit = "Quit";




        do {

            cease = false;

            do {
                try {
                    prompt(_open, _log, _help, _quit);
                    cease = true;
                } catch (InputMismatchException exception) {
                    System.out.println("Error: Please enter a numeric value, thank you.");
                }

            } while (!cease);


        } while (select > 4 || select < 1);


        switch (select) {
            case 1:
                System.out.println(_open);
                break;
            case 2:
                System.out.println(_log);
                break;
            case 3:
                System.out.println(_help);
                break;
            case 4:
                System.out.println(_quit);
                break;
        }
    }

    private void prompt(String _open, String _log, String _help, String _quit){
        Scanner in = new Scanner(System.in);
        System.out.println(String.format("Please Select\n1)%s\n2)%s\n3)%s\n4)%s\n",_open, _log, _help,_quit));

        select = in.nextInt();

    }



}


