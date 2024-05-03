package com.java.company;

public class Manager extends Employee{
    public Manager(String name, String address, int salary, String jobTitle) {
        super(name, address, salary, jobTitle);

    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.15;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance of manager " + getName() + " is good";
    }

    public String manageProject(){
        return "Manager " + getName() + "is managing a project";
    }

}
