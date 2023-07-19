package ait.employee.model;

import java.util.Objects;

public abstract class Employee {
    protected String name;
    protected int yearOfBirth;
    protected int experience;
    protected String education;

    public Employee(String name, int yearOfBirth, int experience, String education) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.experience = experience;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return yearOfBirth == employee.yearOfBirth && experience == employee.experience && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth, experience);
    }

    @Override
    public String toString() {
        return "practice.model.Employee " +
                "name = " + name +
                ", yearOfBirth = " + yearOfBirth +
                ", experience = " + experience;
    }

    public abstract double calcSalary();
}
