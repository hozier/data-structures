package com.invest;

/**
 * Created by MDCCLXXVI on 7/16/14.
 */
public class CheckingAccount extends Account {
    int fee_count = 0;

    public CheckingAccount(double x){
        super(x);
    }

    public void withdrawal (double x){
        //() - x;
        withdraw();
        System.out.println(String .format("Withdraw: $%.2f", x));
        System.out.print(String .format("Balance: $%.2f - $%.2f = ", getBalance(), x));
        setBalance(-x);
        System.out.println((String .format("$%.2f", getBalance())));

    }

    @Override
    public double compute_balance() {


        if(getWeighted() > 3){
            fee_count++;

            setBalance( - fee_count);
        }
        return getBalance();
    }

    public double getFee_count(){
        return fee_count;
    }

    @Override
    public void deposit(double x) {
        setBalance(x);
        System.out.println(String .format("Deposit: $%.2f\nBalance: $%.2f", x, getBalance()));

    }

    @Override
    public void month_end(Account x) {

        System.out.println(String .format("Checking Account\nBalance: $%.2f\n" +
                "Transaction fees: $%.2f\nNo interest accrued.", compute_balance(), getFee_count()
        ));

        reset_weighted();
    }
}
