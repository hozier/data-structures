package com.ephemeral;

/**
 * Created by MDCCLXXVI on 7/19/14.
 */

interface Measurable{
    double getMeasure();
}
public class SodaCan implements Measurable{
    SodaCan(double h, double r){
        this.height = h;
        this.radius = r;

    }

    SodaCan(){

    }

    private double height, radius;

    double getSurfaceArea(){
        return Math.PI * height * radius * 2;
    }

    double getVolume(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getMeasure() {
        return Math.PI * height * radius * 2;
    }

    // runner.<!--->

    public static void main (String []args){
        final Measurable sArray [] = new Measurable[3];

        // soda measurements place here.
        sArray[0] = new SodaCan(12.3, 3.3); // ...
        sArray[1] = new SodaCan(24.6, 7.3); // ...




        new SodaCan(){
            {
                System.out.println("average(sArray): "+average(sArray));

            }
        };



    }

    public double average(Measurable[] arr){

        if(arr.length ==0){return  0;}

        double sum =0;
        for(Measurable object:arr){
            sum += object.getMeasure();
        }
        return sum / arr.length;

    }


}
