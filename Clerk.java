package com.trimindtech.training.day07;

public class Clerk extends Employee {
    private int overtimeHours;
    private double overtimeRate;

    public Clerk(String name, int yearJOined, double salary, double allowance){
        super(name, yearJOined,  salary, allowance);
       /*System.out.println("enter the overtime  ");
        System.out.println("enter the overtimeRate  ");*/
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    @Override
   /* public String toString() {
        return "Clerk{" +
                "overtimeHours=" + overtimeHours +
                ", overtimeRate=" + overtimeRate +
                '}'+"total salary is "+this.calculateSalary();
    }*/
    public double calculateSalary(){
        double totalSalary=super.getSalary()+((this.getOvertimeHours()*this.getOvertimeRate()));
        System.out.println("the total salary is  "+totalSalary);
        return 0;
    }

}

