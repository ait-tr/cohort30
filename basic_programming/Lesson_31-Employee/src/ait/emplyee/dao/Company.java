package ait.emplyee.dao;

import ait.emplyee.model.Employee;

public interface Company {
    boolean hire(Employee employee);

    Employee fire(Employee employee);

    Employee findById(int id);

    int quantity();

    Employee[] findByExperienceAfterValue(int experience);

    Employee[] findBySalaryBeforeValue(int salary);

    Employee[] findByEducation(boolean isExist);

    Employee[] sortByAge();

    Employee[] sortByExperience();

    Employee[] sortBySalary();

    Employee[] sortByEducation();

    default void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
