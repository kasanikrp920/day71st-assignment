package com.trimindtech.training.day07;

import java.util.Scanner;

public class Manager extends Employee{
    private double tarvelClaim;

    public Manager(String name, int yearJOined, double salary,double allowance){
        super(name, yearJOined,  salary,allowance);
        //System.out.println("enter the tarvel claim  ");
    }

    public double getTarvelClaim() {
        return tarvelClaim;
    }

    public void setTarvelClaim(double tarvelClaim) {
        this.tarvelClaim = tarvelClaim;
       // super.setAllowance(this.tarvelClaim);

    }

    @Override
   /* public String toString() {
        return "For Manager  " +
                "tarvelClaim = " + tarvelClaim +" total salary = "+this.calculateSalary();

    }*/

    public double calculateSalary(){
        double totalSalary=super.getSalary()+this.getTarvelClaim();
        System.out.println("the total salary is  "+totalSalary);
        return 0;
    }

}
