package com.trimindtech.training.day07.day07P4;

import java.util.Scanner;

public class BankTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount(new Startup());
        //Debit d=new Debit(1000);
        System.out.println("enter the money that u want to debit...\n");
        Scanner sc= new Scanner(System.in);
       double amount=sc.nextDouble();
       // d.setDebitedAmount(amount);
       // System.out.println(d.getDebitedAmount());
        b.debit(new Debit(amount));
       // Credit c= new Credit();
        System.out.println("enter the money that u want to credit...\n");
        double amount1=sc.nextDouble();
       // c.setCreditedAmount(amount1);
        //System.out.println(c.getCreditedAmount());
        b.credit(new Credit(amount1));


        MinMaxAccount m1=new MinMaxAccount(1000,100000);
        m1.minBalance();
        m1.maxBalance();
    }
}
