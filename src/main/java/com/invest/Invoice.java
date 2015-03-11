package com.invest;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by MDCCLXXVI on 7/24/14.
 */
public class Invoice {
    public Invoice(){
        checkout = 0;

    }

    private static double checkout;
    private static ArrayList<Double> ledger = new ArrayList<Double>();

    private static LineItem APPLE(){
        return new LineItem(1.99, new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private static LineItem BROCOLLI(){
        return new LineItem(2.29, new Object(){}.getClass().getEnclosingMethod().getName());
    }

    private static LineItem CUMEN(){
        return new LineItem(3.80, new Object(){}.getClass().getEnclosingMethod().getName());
    }


    public static double addLines(){
        for (int i = 0; i < ledger.size(); i++) {
            checkout += ledger.get(i);
        }
        return checkout;
    }

    public String toString(){
        return String.format("%s [total_due=$%.2f]\n\n",getClass().getName(),Invoice.addLines());
    }



    public static void main (){
        LineItem bookkeeper = new LineItem();
        ledger.add(bookkeeper.add(new LineItem(8.90, "APRICOT"),3));

        ledger.add(bookkeeper.add(APPLE(), 6) + new FIXED().add(new LineItem(10.63, "Sh&_H.")));

        ledger.add(bookkeeper.add(BROCOLLI(), 12));
        ledger.add(bookkeeper.add(CUMEN(), 2));

        ledger.add(bookkeeper.add(new LineItem(4.32, "AVACADO"), 6));
        ledger.add(bookkeeper.add(new LineItem(2.19, "SAMUEL_ADAMS"), 4));
        System.out.printf(new Invoice().toString());
        //System.out.printf("[total_due=$%.2f]\n\n", Invoice.addLines());
        //System.out.printf("[total=$%.2f]\n\n", bookkeeper.compute_due());


    }


}
