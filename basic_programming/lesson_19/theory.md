# Repetition and consolidation

# List of already acquired knowledge and skills No. 2

## Object Oriented Programming

### OOP - classes, objects, fields, methods

* Class fields

* Constructor, getters and setters

* Encapsulation:
  fields and methods are encapsulated in Class = File

* Polymorphism:
- the ability to use one method NAME inside the class to work,
  there cannot be two methods with the same signature, but with different ones - YES!

* Inheritance:
    - extends - allows you to take its fields and methods from the parent class, written in
      class name (Class inherits Class) and then expand fields and override/add
      methods
    - super - access to the fields of the parent class
    - casting (down, upper) - make a new "cast" from object types,
      parent classes they can be "cast" to child classes
      there is a class Object - all created classes extends it by default
    - instanceof (boolean) - defines belonging to a class

These are examples of object variables:
Book book1 = new Book
Computer comp1 = new Computer

Uppercasting and Downcasting are up and down type conversions.
Computer can be downcast to Laptop, Book can be downcast to Dictionary.
You can "cast" within the "Family".

toString method - prints the contents of the Object (field).

equals method - compares Objects with each other by fields.

What comparison methods do we generally have:
- by weight, by shape, by size - compare NUMBERS (<, >, ==, ...)
- String is beaten to char and compared by ALPHABETS (alphabetically, from left to right)
  There are NO other methods and methods of comparison.

______________________________________________________________

## List of already acquired knowledge and skills No. 1:
### Fundamentals of Programming (Structured Programming)
     1. Types of variables (TYPE, name, value)
int, double, long, char, float, short, byte, boolean - primitive types
String is a complex type
Question: what are types for?
Reduce/optimize memory size for data.

     2. Mathematical actions
+, -, / - integer for int, *, % - modulo
Math.method is a class with math functions in abundance.

     3. Accumulation of sum/value in a variable
sum := sum + 1; // this was written before
sum++; // increase by 1
sum--; // decrement by 1

     4. Displaying text and "results" on the screen
sout => System. etc
System.out.println("Text" + variable_name);

System.out.printf("Text template", variable_name); - this is for formatted output
pattern %.2f - numbers with two decimal places
set the number output format

     5. Request data from the user - number, string, symbol (Scanner)
But there is BufferReader, you can and should not forget it too.

Do not forget to write an invitation to the user to enter data!

     6. Checking the condition, choice - if (logical expression) ... else ... , switch...case
There is no third!!! , boolean can only be true, false
anything can follow from a lie

     7. Formal logic, logical operators
logical operator table
& - AND,
&& - And, but both conditions are required to check,
Example: x > 0 && x < 10 - both expressions must be true
||, etc.

https://www.w3schools.com/ - help

     8. Checking Divisibility Integer
if (i % 2 == 0) is divisible by 2
number%3 == 0, number%5 == 0 is the integer divisibility by 3, 5

     9. Loops - while, do...while, for
fori - frequently used,
draw flowcharts is a task

     10. Arrays - declaration and filling
int[], there is an array element index, and there is an array element itself under this index
array[i] is an array element, i is its index, indexes start from 0,
array.length - 1 is the last index in the array
array is the name of the array

     11. Random number generator
int n = (int)(Math.random() * (m - n + 1) + n) - integers in the range from n to m inclusive!
6-sided cube n = (int)(Math.random() * (6 - 1 + 1) + 1)
heads and tails n = (int)(Math.random() * (1 - 0 + 1) + 0)

     12. Methods
psvm -> public static void / or typeMethodname(parameter 1, ... )
- this is called the method signature


___________________________________

# Повторение и закрепление

# Список уже полученных знаний и умений №2

## Объектно-ориентированное программирование - это парадигма (подход, способ)

### ООП - классы, объекты, поля, методы (действия)

* Поля классов:
- модификатор доступа/видимости, тип переменной, имяПоля;

* Конструктор, геттеры и сеттеры - это специальные методы 

### Базовые принципы ООП:

* **Инкапсуляция:**
поля и методы класса помещаются в капсулу, это и есть Класс = Файл (всегда именуются с Большой буквы)

* **Полиморфизм:**
- возможность использование одного ИМЕНИ метода внутри класса для работы,
  не может быть двух методов с одинаковой сигнатурой, а с разными - ДА!

* **Наследование:**
    - extends - позволяет взять у класса-родителя его поля и методы, пишется в
      наименовании класса (Класс наследует Класс) и затем расширить поля и переопределить/добавить
      методы
    - super - обращение к полям и методам класса-родителя
    - casting (down, upper) - делаем новую "отливку" из типов объектов,
      классы-родители их можно "кастить" до классов-детей
      есть класс Object - все создаваемые классы его extends по умолчанию
    - instanceof (boolean) - определяет принадлежность к классу

Это примеры объектных переменных:
Book book1 = new Book
Computer comp1 = new Computer

Uppercasting и Downcasting - это восходящее и нисходящее преобразование типов.
Computer можно сделать downcasting до Laptop, Book можно downcasting до Dictionary.
"Кастить" можно в пределах "Семьи".

метод toString - печатает содержание Объекта (поля).

метод equals - сравнивает Объекты между собой по полям.

Какие методы сравнения у нас вообще есть:
- по весу, по форме, по размеру - сравниваем ЧИСЛА (<, >, ==, ...)
- String бьём на char и сравнивают по АЛФАВИТУ (по буквенно, слева направо)
  Других методов и способов сравнения НЕТ.

______________________________________________________________

## Список уже полученных знаний и умений №1:
### Основы программирования (структурное программирование)
    1. Типы переменных (ТИП , имя, значение )
int, double, long, char, float, short, byte, boolean - примитивные типы
при задании констант надо в конце числа указывать букву, например 1234567890L - long
String - сложный тип
Вопрос: для чего нужны типы?
Уменьшить/оптимизировать размер памяти под данные.

    2. Математические действия
+, -, / - целочисленное для int, *, % - остататок от деления
Math.method - класс с изобилием математических функций.

    3. Накопление суммы/значения в переменной
sum := sum + 1; // так писали раньше
sum++; // увеличение на 1
sum--; // уменьшение на 1
i++ 

    4. Вывод текста и "результатов" на экран
sout => System. и тд
System.out.println("Текст" + имя_переменной);

System.out.printf("Текст    шаблон", имя_переменной); - это для форматированного вывода
шаблон %.2f - числа с двумя знаками после запятой
задаем формат вывода числа

    5. Запрос данных от пользователя - число, строка, символ (Scanner)
Но есть BufferReader, его тоже можно и нужно не забывать.

Не забывать писать приглашение пользователю для ввода данных!

    6. Проверка условия, выбор - if (логическое выражение) ... else ... , switch...case
третьего НЕ ДАНО!!! , boolean может быть только true, false
из лжи может следовать все, что угодно

    7. Формальная логика, логические операторы
таблица логических операторов
& - И,
&& - И, но оба условия обязательны для проверки,
Пример: x > 0 && x < 10 - должны быть оба выражения true
||, и т.д.

https://www.w3schools.com/ - справка

    8. Проверка делимости нацело 
if (i % 2 == 0) - это делимость на 2
число %3 == 0, число % 5 == 0 - это делимость нацело на 3, 5

    9. Циклы - while, do...while, for
fori - часто применяемый,
нарисовать блок-схемы - это задание

    10. Массивы - объявление и наполнение
int[], есть индекс у элемента массива, а есть сам элемент массива под этим индеском
array[i] - это элемент массива, i - это его индекс, индексы начинаются с 0,
array.length - 1 - это последний индекс в массиве
array - это имя массива

    11. Датчик случайных чисел
int n = (int)(Math.random() * (m - n + 1) + n) - целые числа в интервале от n до m включительно!  
кубик из 6 граней n = (int)(Math.random() * (6 - 1 + 1) + 1)
орел и решка n = (int)(Math.random() * (1 - 0 + 1) + 0)

    12. Методы
psvm -> public static void/или тип имяМетода(параметр 1, ... )
- это называется **сигнатура метода**
модификаторы доступа КАКОЙ ТИП ДАННЫХ возвращается/или VOID имяМетода (передаваемые аргументы) {тело метода}