package com.trimindtech.training.day07.day07P4;

public class MinMaxAccount extends BankAccount {
    public MinMaxAccount(double minBalance, double maxBalance) {
        super(minBalance, maxBalance);
    }
    public void minBalance(){
        System.out.println("the minimum balance in your account is "+super.minBalance);
    }
    public void maxBalance(){
        System.out.println("the minimum balance in your account is "+super.maxBalance);
    }
}
