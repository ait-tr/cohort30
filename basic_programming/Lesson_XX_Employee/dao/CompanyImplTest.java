package ait.employee.dao;

import ait.employee.model.Employee;
import ait.employee.dao.CompanyImpl;
import ait.employee.dao.Company;
import ait.employee.model.Engineer;
import ait.employee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {
    CompanyImpl company;
    Employee[] firm;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        firm = new Employee[4];
        firm[0] = new Engineer("John", 1990, 4, "higher", 5000,140);
        firm[1] = new Engineer( "Ann", 1989, 3, "average",4000,160);
        firm[2] = new Worker( "Peter", 1978, 6, "base",1800, 80);
        firm[3] = new Worker( "Rabindranat", 1987, 7, "higher",1000, 120);
        for (int i = 0; i < firm.length; i++) {
            company.addEmployee(firm[i]);
        }
    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(firm[1]));
        Employee employee = new Worker("Fedor", 1988, 6, "base",1800, 80);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.quantity());
        employee = new Engineer("Rabindranat", 1987, 7, "higher",2000, 120);
        assertFalse(company.addEmployee(employee));
    }

    @Test
    void removeEmployee() {
        Employee employee = new Worker("Peter", 1978, 6, "base",1800, 80);
        assertEquals(firm[2], company.removeEmployee(employee));
        assertEquals(3, company.quantity());
        assertNull(company.removeEmployee(firm[3]));
        assertNull(company.findEmployee("Rabindranat"));
    }

    @Test
    void findEmployee() {
        assertEquals(firm[1], company.findEmployee("Ann"));
        assertNull(company.findEmployee("jsncfi"));
    }

    @Test
    void quantity() {
        assertEquals(4, company.quantity());
    }

    @Test
    void printEmployees() {
        company.printEmployees();
    }

    @Test
    void findEmployeesExpiriensUp5() {
    }

    @Test
    void findEmployeesSalaryDown2000() {
        Employee[] actual = company.findEmployeesSalaryDown2000();
        Employee[] expected = {firm[2],firm[3]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeesEducationIsNotHigher() {
        Employee[] actual = company.findEmployeesEducationIsNotHigher();
        Employee[] expected = {firm[1], firm[2]};
        assertArrayEquals(expected, actual);
    }
}