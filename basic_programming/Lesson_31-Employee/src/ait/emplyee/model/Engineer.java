package ait.emplyee.model;

public class Engineer extends Employee{
    final int STANDARD_SALARY_A_MONTH = 4500;
    int hours;

    public Engineer(int id, String name, int yearOfBirth, int experience, boolean hasEducation) {
        super(id, name, yearOfBirth, experience, hasEducation);
        hours = STANDARD_COUNT_HOUR_A_MONTH;
    }

    public Engineer(int id, String name, int yearOfBirth, int experience, boolean hasEducation, int hours) {
        super(id, name, yearOfBirth, experience, hasEducation);
        this.hours = hours;
    }

    @Override
    public int getSalary() {
        return STANDARD_SALARY_A_MONTH * hours / STANDARD_COUNT_HOUR_A_MONTH;
    }
}
