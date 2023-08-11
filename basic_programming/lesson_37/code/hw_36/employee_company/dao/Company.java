package hw_36.employee_company.dao;

import hw_36.employee_company.model.Employee;

public interface Company {
    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    int size();

    void printEmployees();
}
