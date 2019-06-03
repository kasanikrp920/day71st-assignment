package com.trimindtech.training.day07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* Manager m1= new Manager("raghu",2019,20000,0);  testing for the manager class salry if he get travelClaim
        System.out.println("enter the travel that u claim...");
        Scanner sc = new Scanner(System.in);
        double tc=sc.nextDouble();
        m1.setTarvelClaim(tc);
        m1.calculateSalary();
        System.out.println(m1.toString());*/

       /* Clerk c1=new Clerk("raghu",2019,20000,0);  testing for the manager class salry if he done over time work
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the overtime  ");
        System.out.println("enter the overtimeRate  ");
        int ot=sc.nextInt();
        double otr=sc.nextDouble();
        c1.setOvertimeHours(ot);
        c1.setOvertimeRate(otr);
        c1.calculateSalary();
        System.out.println(c1.toString());*/

        Manager m1 = new Manager("raghu", 2019, 20000, 0);
        Manager m2 = new Manager("ram", 2018, 30000, 0);
        Manager m3 = new Manager("raj", 2017, 40000, 0);
        Manager m4 = new Manager("raki", 2016, 50000, 0);

        ArrayList<Employee> manager = new ArrayList<>();
        manager.add(m1);
        manager.add(m2);
        manager.add(m3);
        manager.add(m4);

       Clerk c1 = new Clerk("raghu", 2019, 20000, 0);
        Clerk c2 = new Clerk("steve", 2018, 30000, 0);
        Clerk c3 = new Clerk("rhodes", 2017, 40000, 0);
        Clerk c4 = new Clerk("natasha", 2016, 50000, 0);

        ArrayList<Employee> clerk = new ArrayList<>();
        clerk.add(c1);
        clerk.add(c2);
        clerk.add(c3);
        clerk.add(c4);


        System.out.println("enter the type of employee");// printing employee details based on type of employee
       String type= sc.nextLine();
       if(type.equals("manager")){
           printElements(manager);

       }
       else{
           EmployeeRunner.printElements(clerk);
       }
        System.out.println(m1.equals(c1));

    }
        public static void  printElements(ArrayList<Employee> employee) {


                for (Employee emp : employee) {
                    System.out.println(emp.toString());
                }

            }
        }


