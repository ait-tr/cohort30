package ait.employee.dao;

import ait.employee.model.Employee;

public interface Company {

    boolean addEmployee(Employee employee);

    Employee removeEmployee(Employee employee);

    Employee findEmployee(String name);

    int quantity();

    void printEmployees();
    Employee[] findEmployeesExpiriensUp5();
    Employee[] findEmployeesSalaryDown2000();
    Employee[] findEmployeesEducationIsNotHigher();

}
