package hw_36.employee_company.dao;

import hw_36.employee_company.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//**Задание 5.**
//        CompanyImpl реализовать методы для поиска сотрудников по критериям:
//        - имеющих стаж более 5 лет
//        - имеющих зарплату менее 2000 евро
//        - не имеющих высшее образование
//
//        **Задание 6.**
//        Создать компараторы и получить отсортированные списки сотрудников:
//        - по возрасту
//        - по стажу работы в компании
//        - по величине зарплаты
//        - по образованию (выше образованные в начале списка)


class CompanyImplTest {

    CompanyImpl company; // что это?
    Employee[] employees; // что это? Для чего?

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(10);
        employees = new Employee[10];
        employees[0] = new Employee(101L, "John", 35, 5, "phd");
        employees[1] = new Employee(102L, "Ann", 30, 5, "hight school");
        employees[2] = new Employee(103L, "Peter", 45, 5, "hight school");
        employees[3] = new Employee(104L, "Robin", 28, 5, "real school");
        employees[4] = new Employee(105L, "Mike", 20, 5, "real school");


    }

    @Test
    void addEmployee() {



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



    }


}

//        **Задание 6.**
//        Создать компараторы и получить отсортированные списки сотрудников:
//        - по возрасту
//        - по стажу работы в компании
//        - по величине зарплаты
//        - по образованию (выше образованные в начале списка)