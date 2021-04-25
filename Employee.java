package com.foo;

import java.util.Scanner;

public class Employee {
    static void getInfo(int h,double s){
        int hours=h;
        double salary=s;
    }
    public static int AddSal(double s){
        int salary=0;
        if(s<500){
            salary=10;
        }
        return salary;
    }
    public static int AddWork(int h){
        int hours=0;
        if(hours>6){
            hours=5;
        }
        return hours;
    }
    public static double cal(int d,double t){
        double finalSalary=(t*d);
        return finalSalary;
    }


    public static void main(String[] args) {
        System.out.println("Please enter your salary of the employee: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextInt();
        System.out.println("Please enter the hours the employee spent per a day: ");
        int hours = scanner.nextInt();
        getInfo(hours, salary);
        double addSal = AddSal(salary);
        int addWork = AddWork(hours);
        double totalAmount = salary + addSal + addWork;
        System.out.println("how many days has the employee worked");
        int days = scanner.nextInt();
        double finalSalary = cal(days, totalAmount);
        System.out.println("The final salary of the employee is " + finalSalary);
    }
}
