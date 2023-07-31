package ait.emplyee.model;

public class Worker extends Employee {
    final int STANDARD_SALARY_A_MONTH = 1600;
    final int ADDITIONAL_PAYMENT = 100;
    int grade;

    int hours;

    public Worker(int id, String name, int yearOfBirth, int experience, boolean hasEducation, int grade, int hours) {
        super(id, name, yearOfBirth, experience, hasEducation);
        setGrade(grade);
        this.hours = hours;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 10) {
            this.grade = 10;
            return;
        }

        if (grade < 1) {
            this.grade = 1;
            return;
        }
        this.grade = grade;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int getSalary() {
        return STANDARD_SALARY_A_MONTH * hours / STANDARD_COUNT_HOUR_A_MONTH + grade * ADDITIONAL_PAYMENT;
    }
}
