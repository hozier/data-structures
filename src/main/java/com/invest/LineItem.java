package com.invest;

import java.util.ArrayList;

/**
 * Created by MDCCLXXVI on 7/24/14.
 */
public class LineItem {
    LineItem(double price, String productName){
        this.price = price;
        this.productName = productName;
        NEW();

    }

    public LineItem(){
        NEW();

    }

    void NEW(){
        stewie = new ArrayList();
        ctrl = 0;
    }

    private static ArrayList<LineItem> stewie; private static double ctrl;
    private double price; private String productName;

    public double add(LineItem accept, int q){ // add pre - built items.
        NEW();
        int x = 1;
        while(x<=q){
            stewie.add(accept);
            x++;
        }

        System.out.printf("%s\t[quantity=%d]\t[total=$%.2f]\n",accept.toString(),q,LineItem.compute_due()); // keep record
        return ctrl;

    }

    private static double compute_due(){
        double track = 0;
        for (int i = 0; i < stewie.size(); i++) {
            track += stewie.get(i).getPrice();
        }
        ctrl = track;
        return track;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString(){
        return String.format("%s[price=$%-5.2f][productName=%-12s]", getClass().getName(),getPrice(),getProductName());
    }
}
