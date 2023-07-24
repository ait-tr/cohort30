package company_employee.tests;

import company_employee.dao.Company;
import company_employee.dao.CompanyImpl;
import company_employee.model.Employee;
import company_employee.model.Manager;
import company_employee.model.SalesManager;
import company_employee.model.WageEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyImplTest {
    Company company; // создали объект класса Company
    Employee[] firm;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        firm = new Employee[4];
        firm[0] = new Manager(100, "John","Smith",174,5000,5);
        firm[1] = new SalesManager(101, "Bread", "Pitt", 174, 300000, 0.1);
        firm[2] = new SalesManager(102, "Julia", "Roberts", 174, 300000, 0.1);
        firm[3] = new WageEmployee(103, "Robert", "Robert", 80,20 );

//        for (int i = 0; i < firm.length; i++) {
//            company.addEmployee(firm[i]);
//        }

    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null)); // нельзя добавить "пустого" сотрудника
        assertTrue(company.addEmployee(firm[0])); // можно добавить сотрудника
        assertTrue(company.addEmployee(firm[1])); // можно добавить сотрудника
        assertTrue(company.addEmployee(firm[2])); // можно добавить сотрудника
        assertTrue(company.addEmployee(firm[3])); // можно добавить сотрудника
        assertEquals(4, company.size());
        Employee employee = new SalesManager(106, "Peter", "Petrov", 180, 40000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.size());
        assertFalse(company.addEmployee(firm[3]));// нельзя добавить уже имеющегося сотрудника
        employee = new SalesManager(106, "Vasia", "Ivanov", 180, 40000, 0.1);
        assertFalse(company.addEmployee(employee)); //нельзя выйти за размер компании

    }

    @Test
    void removeEmployee() {

    }

    @Test
    void findEmployee() {

    }

    @Test
    void size() {

    }

    @Test
    void printEmployees() {

        company.printEmployees();
    }

}
