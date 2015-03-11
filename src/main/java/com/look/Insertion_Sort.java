package com.look;

import java.util.Arrays;

/**
 * Created by MDCCLXXVI on 7/29/14.
 */
public class Insertion_Sort {
    Insertion_Sort(){
        ctrl = new Insertion_Sort();
        array = Selection_Sort.select_1(2, 11, 2, 9, 17, 5, 12);
    }
    private static Insertion_Sort ctrl; private int[] array;

    public static void insertion_1(int...x){

        for (int i = 0; i < x.length; i++) {

            int next = x[i];
            int j = i;
            while ( j > 0  && x[j - 1] > next){

                x[j] = x[j - 1];
                j--; // int j = i;

            }

            x[i] = next;

        }
    }

    public static void main(){
        insertion_1(ctrl.array);
        System.out.println("ctrl = " + Arrays.toString(ctrl.array));
    }



}
