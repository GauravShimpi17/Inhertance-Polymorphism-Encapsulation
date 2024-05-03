package com.java.company;

public class Employee {

    private String name;
    private String address;
    private int salary;
    private String jobTitle;

    public Employee(String name, String address, int salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double calculateBonus(){
        return 0.0;
    }

    public String generatePerformanceReport(){
        return "No performance report generated";
    }
}
