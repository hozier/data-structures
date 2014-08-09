package com.invest;

/**
 * Created by MDCCLXXVI on 7/16/14.
 */
public abstract class Account {
    private int weighted;
    private double initialBalance;
    private double balance = 0;

    public abstract double compute_balance();
    public abstract void deposit(double x);
    Account(){
        balance += initialBalance;
    }

    Account(double x){
        balance += x;
    }

    @Override
    public String toString(){
        return String.format("%s[balance=%s]", getClass().getName(), balance);
    }

    @Override
    public boolean equals(Object x){
        Account ctrl = (Account)x;

        return balance==ctrl.balance;
    }

    public abstract void month_end(Account x);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double x){
        this.balance += x;
    }

    void withdraw(){
        weighted++;
    }

    int getWeighted(){
        return weighted;
    }

    void reset_weighted(){
        weighted = 0;
    }


}
