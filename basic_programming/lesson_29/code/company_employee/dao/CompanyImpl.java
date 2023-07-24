package company_employee.dao;

import company_employee.model.Employee;

public class CompanyImpl implements Company {

    // поля о компании
    private Employee[] employees;
    private int size; // размер компании

    // конструктор
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity]; // capacity становится длиной массива
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || size == employees.length || findEmployee(employee.getId()) != null ) {
            return false;
        }
        employees[size] = employee; // добавление в конец массива
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        // алгоритм удаления сотрудника из массива по его id
        // ищем в цикле по всем employee (перебираем в цикле, обегаем массив)
        // если нашелся сотрудник с заданным id,
        // 1. сохранить удаляемого сотрудника victim в объектную переменную
        // 2. на место удаленного переносим последнего в массиве
        // 3. последнего затираем с помощью null
        // 4. size-- - уменьшаем размер массива
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id ) {
                Employee victim = employees[i];
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printEmployees() {

    }
}
