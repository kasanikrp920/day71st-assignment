package com.trimindtech.training.day07.day07P2;

import java.util.Scanner;

public class AccountRunner {
    public static void main(String[] args) {
       Savings s1=new Savings(123456,20000,"03/06/2019");
        System.out.println(" enter the number of  years to calculate amount \n");
        Scanner sc=new Scanner(System.in);
        int noOfYear=sc.nextInt();
        s1.calculateAmount(noOfYear);

        CheckingAccount c1=new CheckingAccount(123456,20000,"03/06/2019");
        System.out.println("enter the number of transactions..\n");
        int transactions=sc.nextInt();
        c1.costForAdditionalTransactions(transactions);

        System.out.println("enter the amount that you want to deposit...\n");
        double depositMoney=sc.nextDouble();
        c1.deposit(depositMoney);
        System.out.println("enter the amount that you want to withdraw...\n");
        double withdrawMoney=sc.nextDouble();
        c1.withDrawel(withdrawMoney);
    }
}
