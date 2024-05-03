package com.java.company;


public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Gaurav","Nashik",70000,"Manager");
        Developer developer = new Developer("Hemil","Mumbai",50000,"Developer","Java");
        Programmer programmer = new Programmer("Amey", "Yawatmal", 40000,"Programmer","Java");


        System.out.println(manager.getName());
        System.out.println(manager.getAddress());
        System.out.println(manager.getSalary());
        System.out.println(manager.getJobTitle());
        System.out.println("Manager's Bonus is ₹ " + manager.calculateBonus() );
        System.out.println(manager.generatePerformanceReport());
        System.out.println(manager.manageProject());

        System.out.println();

        System.out.println(developer.getName());
        System.out.println(developer.getAddress());
        System.out.println(developer.getSalary());
        System.out.println(developer.getJobTitle());
        System.out.println(developer.generatePerformanceReport());
        System.out.println("Programmer's Bonus is ₹ " + programmer.calculateBonus() );
        System.out.println(developer.manageProject());

        System.out.println();

        System.out.println(programmer.getName());
        System.out.println(programmer.getAddress());
        System.out.println(programmer.getSalary());
        System.out.println(programmer.getJobTitle());
        System.out.println(programmer.generatePerformanceReport());
        System.out.println("Developer's Bonus is ₹ " + developer.calculateBonus() );
        System.out.println(programmer.manageProject());







    }
}