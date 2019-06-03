package com.trimindtech.training.day07;

public class Employee {
    private  String name;
    private  int yearJOined;
    private double salary;
    private double allowance;

    public Employee(String name, int yearJOined, double salary, double allowance) {
        this.name = name;
        this.yearJOined = yearJOined;
        this.salary = salary;
        this.allowance = allowance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJOined() {
        return yearJOined;
    }

    public void setYearJOined(int yearJOined) {
        this.yearJOined = yearJOined;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearJOined=" + yearJOined +
                ", salary=" + salary +
                ", allowance=" + allowance +
                '}';
    }
    public double calculateSalary(){
        double totalSalary=this.salary+this.allowance;
        System.out.println("the total salary is  "+totalSalary);
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e=(Employee)obj;
        return this.getName().equals(e.getName());
    }
}
