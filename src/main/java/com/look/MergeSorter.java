package com.look;

import java.util.Arrays;

/**
 * Created by MDCCLXXVI on 7/29/14.
 */
public class MergeSorter {

    private static int[] a = {11, 9, 17, 5, 12, 4, 4, 4, 2, 5, 6, 643, 23, 23, 2, 21, 13, 5, 61, 1, 2, 3, 0};

    public static void sort(int[]a){
        System.out.println("a = " + Arrays.toString(a));

        if(a.length <= 1) { return; }


        final int SIZE = a.length/2;
        int[] first = new int[SIZE];
        int[] second = new int[a.length - SIZE];
        System.out.println("First.length = " + first.length);
        System.out.println("Second.length = " + second.length);

//        for (int i = 0; i < first.length; i++)
//        {
//            first[i] = a[i];
//        }
//        for(int i= 0; i < second.length; i++)
//        {
//            second[i] = a[first.length + i];
//        }

        for (int i = 0; i < second.length; i++) {
            int adjust = first.length + i;
            second[i] = a[adjust];
            if(i < first.length){
                first[i] = a[i];
            }
            adjust++;
        }

        sort(first);
        sort(second);
        merge(first, second, a);
    }




    public static void merge(int []first,int []second,int[]a){
        int iFirst = 0, iSecond = 0, j = 0;

        while(iFirst < first.length &&iSecond < second.length){

            if(first[iFirst] < second[iSecond]){
                a[j] = first[iFirst];
                iFirst++;

            }else {
                a[j] = second[iSecond];
                //a[j + 1] = first[iFirst];
                iSecond++;
            }
            j++;
        }


        // Note that only one of the two loops below copies entries // Copy any remaining entries of the first array
        while (iFirst < first.length){
            a[j] = first[iFirst];
            iFirst++; j++;
        }

        // Copy any remaining entries of the second half
        while (iSecond < second.length){
            a[j] = second[iSecond];
            iSecond++; j++;
        }

    }

    public static void main() {


        sort(a);
        System.out.println("ctrl = " + Arrays.toString(a));

    }
}
