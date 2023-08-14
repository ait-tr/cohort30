package hw_37.employee_company.dao;

import hw_37.employee_company.model.Employee;
import hw_37.employee_company.model.Engineer;
import hw_37.employee_company.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

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

    // поля класса
    CompanyImpl company; // поле, подключение тестируемого класса, создание объектной переменной
    Employee[] employees; // поле типа Employee, это массив, пока он получил только название

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(10); // вызов конструктора
        employees = new Employee[5];
        employees[0] = new Engineer(101, "John", 35, 7, "1 - phd", 1000.0, 5, 160);
        employees[1] = new Engineer(102, "Ann", 30, 5, "2 - university", 900.0, 4, 160);
        employees[2] = new Worker(103, "Peter", 45, 15, "3 - hight school", 850.0, 160);
        employees[3] = new Worker(104, "Robin", 28, 10, "4 - real school", 750.0, 160);
        employees[4] = new Worker(105, "Mike", 20, 2, "4 - real school", 600.0, 160);

        for (int i = 0; i < employees.length; i++) {
            company.addEmployee(employees[i]);
        }

    }

    public void printArray(Object[] arr, String string){
        System.out.println("=========" + string + "=============");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("====================================");
    }

    @Test
    void addEmployee() {
        System.out.println(company.size());
        Engineer engineer = new Engineer(106L, "Stefan", 40, 0, "3 - hight school", 900, 4, 160);
        assertTrue(company.addEmployee(engineer)); // тест на добавление
        assertEquals(6, company.size()); // проверка size
        System.out.println(company.size());
        assertFalse(company.addEmployee(null)); // тест на добавление null
        assertFalse(company.addEmployee(engineer)); // тест на добавление дубликата
    }

    @Test
    void removeEmployee() {
        System.out.println(company.size()); // печать size
        company.printEmployees();
        assertEquals(employees[4],company.removeEmployee(105) ); // тест на удаление, выбрали произвольного сотрудника
        assertEquals(4, company.size()); // проверили, что размер компании уменьшился
        assertEquals(employees[1],company.removeEmployee(102) );
        company.printEmployees();
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

    @Test
    void testSortByExpirience() {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getExperience(), o2.getExperience()); // сравнение по полю experience, которое имеет тип int
            }
        };
        Arrays.sort(employees, employeeComparator);
        printArray(employees, "Sorted by experience"); // берем правильный метод для печати
    }

}

//        **Задание 6.**
//        Создать компараторы и получить отсортированные списки сотрудников:
//        - по возрасту
//        - по стажу работы в компании
//        - по величине зарплаты
//        - по образованию (выше образованные в начале списка)