# Lesson plan No. 25 dated 14/07/2023:

1. Discussion of homework:
- the Bus class and its methods
- splitting a group of students into two randomly

2. Topic of the lesson:
   abstract classes and methods
   StringBuilder and its append method

3. Practice:
- create an abstract class practice.model.Employee and define an abstract method calcSalary() in it

- create child classes practice.model.Manager, practice.model.SalesManager and Worker, implement payroll methods in them:
    - practice.model.Manager: base + grade*hours
    - practice.model.SalesManager: salesValue * percent
    - Worker: grade*hours

- in the EmployeAppl application, hire several employees (up to 10) in the company and calculate the total annual salary.

______________________

# План урока № 26 от 17.07.2023:

1. Обсуждение домашнего задания:
- класс Bus и его методы
- разбиение группы студентов на две случайным образом

Алгоритм разделения группы студентов на 2 части случайным образом: 
шаг 1. создать массив String студентов из фамилий 
шаг 2. определить длину массива l
шаг 3. вычисляем длину 1-го массива (дочернего) l/2 = m 
шаг 4. вычислить длину 2-го массива l - l/2 = n
шаг 5. в цикле "бросить монетку" - 0 или 1, записывать студента в тот или иной массив в зависимости от 0 или 1
при этом нельзя превысить размеры любого из массивов

2. Тема занятия:
абстрактные классы и методы
StringBuilder и его метод append

3. Практика:
- создать абстрактный класс practice.model.Employee и определить в нем абстрактный метод calcSalary()

- создать дочерние классы practice.model.Manager, practice.model.SalesManager и Worker, реализовать в них методы начисления зарплаты:
    - practice.model.Manager: base + grade*hours
    - practice.model.SalesManager: salesValue * percent
    - Worker: wage*hours

- в приложении EmployeAppl нанять в компанию несколько сотрудников (до 10) и подсчитать общий месячный объем зарплаты. 







