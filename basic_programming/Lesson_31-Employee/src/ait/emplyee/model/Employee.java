package ait.emplyee.model;

import java.util.Objects;

public abstract class Employee implements Comparable<Employee> {
    final int STANDARD_COUNT_HOUR_A_MONTH = 160;

    int id;
    String name;
    int yearOfBirth;
    int experience;

    boolean hasEducation;

    public Employee(int id, String name, int yearOfBirth, int experience, boolean hasEducation) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.experience = experience;
        this.hasEducation = hasEducation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isHasEducation() {
        return hasEducation;
    }

    public void setHasEducation(boolean hasEducation) {
        this.hasEducation = hasEducation;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().toString().substring(24));
        sb.append(" { id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", yearOfBirth=").append(yearOfBirth);
        sb.append(", experience=").append(experience);
        sb.append(", hasEducation=").append(hasEducation);
        sb.append(", salary=").append(this.getSalary());
        sb.append('}');
        return sb.toString();
    }

    public abstract int getSalary();
}
