package ait.employee.model;

public class Engineer extends Employee{
    private double baseSalary;
    private int hours;

    public Engineer(String name, int yearOfBirth, int experience,String education,double baseSalary,int hours) {
        super(name, yearOfBirth, experience,education);
        this.baseSalary = baseSalary;
        this.hours = hours;

    }


    @Override
    public double calcSalary() {
        return baseSalary*hours;
    }
}
