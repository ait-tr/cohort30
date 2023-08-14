package hw_37.employee_company.dao;

import hw_37.employee_company.model.Employee;

//**Задание 5.**
//        CompanyImpl реализовать методы для поиска сотрудников по критериям:
//        - имеющих стаж более 5 лет
//        - имеющих зарплату менее 2000 евро
//        - не имеющих высшее образование
//

public class CompanyImpl implements Company {

    // это поля класса
    // заводим массив под сотрудников
    private Employee[] employees;  // массив объектов класса Employee
    // кол-во сотрудников
    private int size; // это поле отвечает за количество сотрудников

    // это конструктор
    // метод, который получив на вход capacity определяет размер массива employees
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity]; //
    }

    // метод, который добавляет нового сотрудника в массив
    @Override
    public boolean addEmployee(Employee employee) {
        // если сотрудник не null ИЛИ size еще не равен длине массива ИЛИ такой сотрудник уже есть, ТО
        if (employee == null || size == employees.length || findEmployee((int) employee.getId()) != null) {
            return false; // возвращаем false, т.к. сотрудника нельзя добавить!
        }
        employees[size++] = employee; // добавляем сотрудника в массив, и увеличиваем size на 1
        return true; // возвращаем true
    }

    // метод, который удаляет сотрудника из массива по его id
    @Override
    public Employee removeEmployee(int id) { // получили на вход id
        for (int i = 0; i < size; i++) { // перебираем весь массив
            if (employees[i].getId() == id) { // находим жертву по его id
                Employee victim = employees[i]; // в объект victim кладем найденного
//                employees[i] = employees[size - 1];
//                employees[size - 1] = null;
//                size--;
                employees[i] = employees[--size]; // берем последнего в списке и ставим его на место найденного
                employees[size] = null; // последнего в списке делаем null
                return victim; // возвращаем найденный объект
            }
        }
        return null;
    }

    // метод для поиска сотрудника по его id
    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    // метод выясняет кол-во сотрудников
    @Override
    public int size() {
        return size;
    }

    @Override
    public void printEmployees() {

    }

    // метод для печати массива
    public void printEmployees(Object[] arr, String st) {
        System.out.println("st");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("========================");
    }


}
