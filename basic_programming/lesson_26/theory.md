# Abstract classes and methods

1. If you need to create a class from which other classes should inherit, but this must be prohibited
   creation of objects of this parent class, then you can declare the parent class as abstract,
   using the abstract keyword before the class name. Abstract class objects cannot be created.

2. You can create abstract methods in abstract classes. These are methods whose signature contains
   abstract keyword and no method body. Abstract methods must be overridden in child classes.
   If the child class does not override the abstract method, then it (the class) must also be declared abstract.

## Examples of abstract classes and their methods:

### Example 1
Language:


### Example 2

Human:


### Example 3

List


### Example 4

Shape


3. Practice for today:
    - create an abstract class Employee and define an abstract method calcSalary() in it

    - create child classes Manager, SalesManager and Worker, implement payroll methods in them:
        - Manager: base + grade*hours
        - SalesManager: salesValue * percent
        - Worker: grade*hours

    - in the EmployeAppl application, hire several employees (up to 10) in the company and calculate the total annual salary.

_________________________________________________________

# Абстрактные классы и методы

1. Если необходимо создать класс от которого должны наследоваться другие классы, но при это надо запретить
   создание объектов этого родительского класса, то можно объявить родительский класс как абстрактный,
   используя ключевое слово **abstract** перед именем класса. Объекты абстрактного класса создавать нельзя.

   public abstract class Transport { ...

   тогда для этого класса будет запрещено создание его объектов


2. В абстрактных классах можно создавать абстрактные методы. Это методы у которых в сигнатуре присутствует
   ключевое слово abstract и отсутствует тело метода. Абстрактные методы должны быть переопределены в дочерних классах.
   Если дочерний класс не переопределяет абстрактный метод, то он (класс) тоже должен быть объявлен как абстрактный.


## Примеры абстрактных классов и их методов:

### Пример 1
public abstract class Language{
   String locale;
   String groupe;

   abstract void methodSetLanguage{ 
   }
}


### Пример 2

abstract class Human {
     String sex;
     String race;
     String гражданство;
   
}

### Пример 3

List (список)
абстрактные поля - имя, длина, язык
абстрактные методы


### Пример 4 

Shape (геометрическая фигура)
поля - название
методы - узнать что-то про длину или периметр, узнать площадь


3. Практика на сегодня:
   - создать абстрактный класс Employee и определить в нем абстрактный метод calcSalary()

   - создать дочерние классы Manager, SalesManager и  Worker, реализовать в них методы начисления зарплаты:
     - Manager: base + grade*hours
     - SalesManager: salesValue * percent
     - Worker: grade*hours
     
   - в приложении EmployeeAppl нанять в компанию несколько сотрудников (до 10) и подсчитать общий 
   годовой объем зарплаты. 