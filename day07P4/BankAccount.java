
package com.trimindtech.training.day07.day07P4;

import java.util.Scanner;

public class BankAccount {
    private double initialAmount;
    protected double minBalance;
    protected double maxBalance;

    public BankAccount(double minBalance, double maxBalance) {
        this.minBalance = minBalance;
        this.maxBalance = maxBalance;
    }

    public BankAccount(Startup s) {
        this.initialAmount=s.getIntialAmount();
        System.out.println(initialAmount);
    }
    public void debit(Debit d) {
        // BankAccount b=(BankAccount)d;
        // System.out.println(Debit.debitedAmount);
        if (d.getDebitedAmount() <this.minBalance){
            this.initialAmount = this.initialAmount - d.getDebitedAmount();
        System.out.println("the remaining balace is " + this.initialAmount);
    }else{
            System.out.println("sorry sir..\n the amount is lessthan minimum balance...");
        }
    }
    public void credit(Credit c){
              if((c.getCreditedAmount()<this.maxBalance) ){
                  this.initialAmount = this.initialAmount + c.getCreditedAmount();
                  System.out.println("the total balance in ur account is " + this.initialAmount);
              }else{
                  System.out.println("sorry sir..\n the amount is higher than max balance limit....");
              }
    }
public double getBalance(){
        return this.initialAmount;
}


}

