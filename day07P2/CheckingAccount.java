package com.trimindtech.training.day07.day07P2;

public class CheckingAccount extends Account{
    private static final  int noOfTransactions=5;

    public CheckingAccount(long accountNumber, double balance, String dateCreated) {
        super(accountNumber, balance, dateCreated);
    }
    public void costForAdditionalTransactions(int transaction){
        if(transaction>noOfTransactions){
            double money=(transaction-noOfTransactions)*5;
            System.out.println("thank u for using our bank sir\n");
            System.out.println("the tax applied for transaction is in rupees "+money);
        }else{
            System.out.println("thank u for using our bank sir \n rs.0/- will be appied for transaction\n");
        }
    }
}
