package ait.employee.dao;

import ait.employee.model.Employee;

import java.util.Comparator;
import java.util.function.Predicate;

public class CompanyImpl implements Company{

    private Employee[] employees;
    private int size;

    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if(employee == null || size == employees.length || findEmployee(employee.getName()) != null) {
            return false;
        }
        employees[size++] = employee;
        return true;
    }

    @Override
    public Employee removeEmployee(Employee employee) {
        Employee victim = null;
        for(int i = 0; i < size; i++) {
        if(employees[i].equals(employees)){
            victim = employees[i];
            employees[i] = employees[--size];
            employees[size] = null;
            return victim;
            }
        }
        return null;
    }


    @Override
    public Employee findEmployee(String name) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getName().equals(name)) {
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
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public Employee[] findEmployeesExpiriensUp5() {
        return findEmployeesByPredicate(e -> e.getExperience() > 5);
    }

    @Override
    public Employee[] findEmployeesSalaryDown2000() {
        return findEmployeesByPredicate(e -> e.calcSalary() < 2000);
    }

    @Override
    public Employee[] findEmployeesEducationIsNotHigher() {
        return findEmployeesByPredicate(e -> !e.getEducation().equals("higher"));
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(employees[i])){
                count++;
            }
        }
        Employee[] res = new Employee[count];
        for (int i = 0,j = 0; j < res.length; i++) {
            if(predicate.test(employees[i])) {
                res[j++] = employees[i];
            }
        }
        return res;
    }
    Comparator<Employee> comparatorAge = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getYearOfBirth() - o2.getYearOfBirth();
        }
    };
    Comparator<Employee> comparatorExpiriens = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getExperience() - o2.getExperience();
        }
    };
    Comparator<Employee> comparatorSalary = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.calcSalary() - o2.calcSalary());
        }
    };
    Comparator<Employee> comparatorEducation = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (o1.getEducation().compareTo(o2.getEducation()));
        }
    };
}



