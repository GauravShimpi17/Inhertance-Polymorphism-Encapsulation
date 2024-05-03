package com.java.company;

public class Programmer extends Developer{

    public Programmer(String name, String address, int salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle, programmingLanguage);
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.12;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance of " + getName() + " is good";
    }

    public String manageProject(){
        return "Programmer " + getName() + " is working on project with " +getProgrammingLanguage();
    }
}
