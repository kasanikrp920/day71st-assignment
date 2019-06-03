package com.trimindtech.training.day07.day07P2;

public class Account {
    private long accountNumber;
    private double balance;
    private String dateCreated;

    public Account(long accountNumber, double balance, String dateCreated) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void withDrawel(double withaDrawelAmount){
         System.out.println("the amount your withdrawel is "+withaDrawelAmount);
        this.balance=this.balance-withaDrawelAmount;
         System.out.println("the remaing balance is "+this.balance);

     }
     public void deposit(double depositMoney){
         System.out.println("the amount your deposited is "+depositMoney);
         this.balance=this.balance+depositMoney;
         System.out.println("your total amount after deposited is "+this.balance);


     }
}
