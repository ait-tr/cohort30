package ait.emplyee.test;

import ait.emplyee.dao.Company;
import ait.emplyee.dao.CompanyImpl;
import ait.emplyee.model.Employee;
import ait.emplyee.model.Engineer;
import ait.emplyee.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {
    Company company;
    Employee[] employees;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(8);
        employees = new Employee[]{
                new Engineer(1000, "John", 1971, 2, true),
                new Engineer(1001, "Ann", 1973, 7, true, 45),
                new Engineer(1002, "Peter", 1965, 5, false, 187),
                new Worker(1003, "Robin", 1953, 3, false, 1, 120),
                new Worker(1004, "Igor", 2001, 6, false, 4, 160),
                new Worker(1005, "Mike", 1992, 1, true, 10, 109),
        };
        for (Employee employee : employees) {
            company.hire(employee);
        }
    }

    @Test
    void hire() {
        assertFalse(company.hire(null));
        assertFalse(company.hire(employees[2]));
        Employee newEngineer = new Engineer(2001, "Robin new", 28, 5, false);
        assertTrue(company.hire(newEngineer));
        assertEquals(company.quantity(), 7);
        Employee newWorker = new Worker(2002, "Robin new", 28, 5, false, 1, 20);
        assertTrue(company.hire(newWorker));
        assertEquals(company.quantity(), 8);
        Employee newWorker2 = new Worker(2003, "Robin new", 28, 5, false, 1, 20);
        assertFalse(company.hire(newWorker2));
    }

    @Test
    void fire() {
        assertNull(company.fire(null));
        Employee newEngineer = new Engineer(2001, "Robin new", 28, 5, false);
        assertNull(company.fire(newEngineer));
        assertEquals(employees[3], company.fire(employees[3]));
        assertEquals(company.quantity(), 5);
    }

    @Test
    void findById() {
        assertNull(company.findById(4444));
        assertEquals(employees[4], company.findById(employees[4].getId()));
    }

    @Test
    void quantity() {
        assertEquals(6, company.quantity());
    }

    @Test
    void findByExperienceAfterValue() {
        Employee[] actual = company.findByExperienceAfterValue(5);
        Employee[] expected = {employees[1], employees[4]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findBySalaryBeforeValue() {
        Employee[] actual = company.findBySalaryBeforeValue(2000);
        Employee[] expected = {employees[1], employees[3]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findByEducation() {
        Employee[] actual = company.findByEducation(true);
        Employee[] expected = {employees[0], employees[1], employees[5]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortByAge() {
        Employee[] actual = company.sortByAge();
        Employee[] expected = {employees[3], employees[2], employees[0], employees[1], employees[5], employees[4]};
        assertArrayEquals(expected, actual);
        assertFalse(Arrays.equals(actual, ((CompanyImpl) company).getEmployees()));
    }

    @Test
    void sortByExperience() {
        Employee[] actual = company.sortByExperience();
        Employee[] expected = {employees[5], employees[0], employees[3], employees[2], employees[4], employees[1]};
        assertArrayEquals(expected, actual);
        assertFalse(Arrays.equals(actual, ((CompanyImpl) company).getEmployees()));
    }

    @Test
    void sortBySalary() {
        Employee[] actual = company.sortBySalary();
        Employee[] expected = {employees[1], employees[3], employees[4], employees[5], employees[0], employees[2]};
        assertArrayEquals(expected, actual);
        assertFalse(Arrays.equals(actual, ((CompanyImpl) company).getEmployees()));
    }

    @Test
    void sortByEducation() {
        Employee[] actual = company.sortByEducation();
        Employee[] expected = {employees[2], employees[3], employees[4], employees[0], employees[1], employees[5]};
        assertArrayEquals(expected, actual);
        assertFalse(Arrays.equals(actual, ((CompanyImpl) company).getEmployees()));
    }
}