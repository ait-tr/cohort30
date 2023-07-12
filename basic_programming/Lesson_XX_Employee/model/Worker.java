package ait.employee.model;

public class Worker extends Employee{
    double baseSalary;
    int hours;
    public Worker(String name, int yearOfBirth, int experience,String education, double baseSalary, int hours) {
        super(name, yearOfBirth, experience,education);
    }

    @Override
    public double calcSalary() {
        return baseSalary*hours;
    }

}
