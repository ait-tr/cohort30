package hw_37.employee_company.model;

public class Engineer extends Employee {
    // поля класса
    private double baseSalary;
    private int grade;
    private int hours;

    // конструктор класса, по имени он совпадает с наименованием класса, НО ничего не возвращает и не void
    public Engineer(long id, String name, int age, int experience, String education, double baseSalary, int grade, int hours) {
        super(id, name, age, experience, education);
        this.baseSalary = baseSalary;
        this.grade = grade;
        this.hours = hours;
    }

    // еще один конструктор (это ПОЛИМОРФИЗМ!)
    public Engineer(double baseSalary, int grade, int hours) {
        this.baseSalary = baseSalary;
        this.grade = grade;
        this.hours = hours;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double calcSalary() {
        double salary = baseSalary + grade * hours;
        return salary;
    }

}
