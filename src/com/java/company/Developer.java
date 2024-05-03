package com.java.company;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, String address, int salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }



    @Override
    public double calculateBonus() {
        return getSalary() * 0.05;
    }

    @Override
    public String generatePerformanceReport() {
        return "Performance of developer " + getName() + " is good";
    }

    public String manageProject(){
        return "Developer " +getName() + " is working on prgramming language" + programmingLanguage;
    }


}
