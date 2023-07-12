package ait.emplyee.dao;

import ait.emplyee.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class CompanyImpl implements Company {
    Employee[] employees;
    int size;

    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public boolean hire(Employee employee) {
        if (employee == null || size >= employees.length || findById(employee.getId()) != null) {
            return false;
        }

        employees[size++] = employee;
        return true;
    }

    @Override
    public Employee fire(Employee employee) {
        if (employee == null || findById(employee.getId()) == null) {
            return null;
        }
        employees[getIndexById(employee.getId())] = employees[--size];
        return employee;
    }

    @Override
    public Employee findById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public Employee[] findByExperienceAfterValue(int experience) {
        return findEmployeesByPredicate(employee -> employee.getExperience() > experience);
    }

    @Override
    public Employee[] findBySalaryBeforeValue(int salary) {
        return findEmployeesByPredicate(employee -> employee.getSalary() < salary);

    }

    @Override
    public Employee[] findByEducation(boolean isExist) {
        return findEmployeesByPredicate(employee -> employee.isHasEducation() == isExist);
    }

    @Override
    public Employee[] sortByAge() {
        Employee[] sortedEmployee = getNewEmployees();
        Arrays.sort(sortedEmployee, (e1, e2) -> e1.getYearOfBirth() - e2.getYearOfBirth());
        return sortedEmployee;
    }

    @Override
    public Employee[] sortByExperience() {
        Employee[] sortedEmployee = getNewEmployees();
        Arrays.sort(sortedEmployee, (e1, e2) -> e1.getExperience() - e2.getExperience());
        return sortedEmployee;
    }

    @Override
    public Employee[] sortBySalary() {
        Employee[] sortedEmployee = getNewEmployees();
        Arrays.sort(sortedEmployee, (e1, e2) -> e1.getSalary() - e2.getSalary());
        return sortedEmployee;
    }

    @Override
    public Employee[] sortByEducation() {
        Employee[] sortedEmployee = getNewEmployees();
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.isHasEducation() == o2.isHasEducation()) {
                    return 0;
                }
                return o1.isHasEducation() ? 1 : -1;
            }
        };
        Arrays.sort(sortedEmployee, comparator);
        return sortedEmployee;
    }

    private int getIndexById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(employees[i])) {
                count++;
            }
        }

        Employee[] newEmployees = new Employee[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(employees[i])) {
                newEmployees[index++] = employees[i];
            }
        }

        return newEmployees;
    }

    private Employee[] getNewEmployees() {
        Employee[] newEmployees = new Employee[size];
        for (int i = 0; i < newEmployees.length; i++) {
            newEmployees[i] = employees[i];
        }

        return newEmployees;
    }

}
