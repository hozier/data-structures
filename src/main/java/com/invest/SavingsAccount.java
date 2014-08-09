package com.invest;

/**
 * Created by MDCCLXXVI on 7/16/14.
 */
public class SavingsAccount extends Account{
    private double RATE;

    public SavingsAccount(double x){
        super(x);
    }

    public double getRATE() {
        return RATE;
    }

    @Override
    public double compute_balance() {
        return getBalance();
    }

    @Override
    public void deposit(double x) {
        System.out.println(String.format("Deposited: $%.2f",x)); setBalance(x);
    }

    @Override
    public void month_end(Account x) {
        RATE = 0.299;

        System.out.println(String .format("Savings Account\nRate: " + String.format("%.3f", getRATE()))+"%");
        System.out.println("Current Balance: "+ String.format("$%.2f",getBalance()));
        System.out.println("Interest accrued: "+ String.format("$%.2f",getBalance() * RATE));
        setBalance((getBalance() * RATE));
        System.out.println("Total Capital: " + String.format("$%.2f\n\n",getBalance()));

    }

}
