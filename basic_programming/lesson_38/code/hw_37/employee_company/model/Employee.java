package hw_37.employee_company.model;

public abstract class Employee implements Comparable<Employee>{

    //поля, которые описывают объект
    long id; // идентификатор
    String name; // имя
    int age; // возраст
    int experience; // стаж работы
    String education; // образование: 4 - real school, 3 - high school, 3 - technical school, 3 - college, 2 - university, 1 - PHD


    //конструктор на все поля
    public Employee(long id, String name, int age, int experience, String education) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.education = education;
    }

    //пустой конструктор
    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee" + "id=" + id + ", name='" + name + ", age=" + age + ", experience=" + experience + ", education=" + education;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id; // находим сотрудника по табельному номеру
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    } // по имени, в алфавитном порядке
}
