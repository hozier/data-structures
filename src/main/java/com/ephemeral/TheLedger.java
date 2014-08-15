package com.ephemeral;

import java.util.LinkedList;

/**
 * Created by MDCCLXXVI on 8/12/14.
 */
public class TheLedger {

    /**
     * what if it were possible to rent out parts of your finanical responsibilies?
     * @param current_bill
     */
    public TheLedger(double current_bill){
        this.current_bill = current_bill;
        original_price = current_bill;
        tenant_charge= 0; ratio_first= 0; ratio_second= 0;

    }

    private void choice_b(double collective_charge){
        //(current_bill / 2);

        double new_price = current_bill - collective_charge;
        current_bill = new_price;
        tenant_charge = collective_charge / 2;
        ratio_first = current_bill / original_price;
        ratio_second = collective_charge / original_price;

    }

    @Override
    public String toString(){
        double foo = ratio_first/ratio_first, bar = ratio_second/ratio_first;        if(ratio_first== 0){foo = 0; bar = 0;}
        return String.format("%s[original_price=$%.2f][reduced_current_bill=$%.2f][tenant_charge=$%.2f][ratio=%.2f:%.2f][simplified_ratio=%.0f:%.2f]",getClass().getName(), original_price, current_bill, tenant_charge, ratio_first, ratio_second, foo,bar);
    }

    public static double fractional_part(){
        return percent+= 0.025;
    }

    public static void setPercent(double percent) {
        TheLedger.percent = percent;
    }

    public static void run(TheLedger x){
        setPercent(0);
        do{
            System.out.printf("%.1f%s ", percent*100,"%");
            System.out.printf("%s\n", x);
            x = new TheLedger(original_price);
            x.choice_b(original_price * fractional_part());


        }while(current_bill > 0);
        System.out.println("________________________________________________________________________");

    }



    public static void main(){
        run(new TheLedger(82 + (82*0.0875)));
        run(new TheLedger(82));
        run(new TheLedger(75));
        run(new TheLedger(75 + (75 *.0875)));



    }

    private static double current_bill, tenant_charge, original_price, ratio_first, ratio_second, percent = .5 - 0.025;

}
