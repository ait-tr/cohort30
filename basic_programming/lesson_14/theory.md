_________English version ____________________

# Structured programming
- this is one of the programming paradigms (the answer to the question of how to write code in general)
  [Подробнее](https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D1%80%D1%83%D0%BA%D1%82%D1%83%D1%80%D0%BD%D0%BE%D0%B5_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5) 

The main idea is to **completely** drop the **GOTO** statement.
Using only three structures according to the Boehm-Jacopini theorem:
- algorithm step
- condition (branch)
- cycle

**Structured programming** - a progressive (so far!) approach to software development,
rejection of the spaghetti code, which has given and is giving an increase in labor productivity
programmers, reducing the number of errors, etc.


## break, continue and structured programming

**break, continue** is a replacement for the **GO TO** statement,
implemented within the paradigm of structured programming.

In Java, a break statement is majorly used for:
- To exit a loop;
- Used as a “civilized” form of **goto**;
- Terminate a sequence in a switch statement.

**break** - exit from the loop body
**continue** - skipping one bar/pass of loop body


___________________________

# Objects
What is **Object (Object)** ?

is a necessary/useful "entity" for the meaning of life, for example:
object, person or animal, organization, detail, etc.

The set of homogeneous objects forms **Class (Class)**.
Example: class Cars, class Mammals, class Stars, etc.

How to describe an Object in programming terms?
Describe the Car class in words:

**So:**
Objects are described with...
- their state is changed with the help of ...

___________________________

# Packages

1. Java projects consist of a huge number of classes.
   To organize the structure of projects, classes are packaged.
   Package names are given with a dot. For example: ``ait.company.model``.
   The fully qualified class name includes the package name. For example:
   `ait.project.model.Person`
   The concept of using packages allows you to implement dot notation - a sequential call
   methods belonging to some class.

2. Method modifiers:
    - Methods with `public` access modifier can be called from other classes.
    - Methods with the `private` access modifier can only be called within the class itself.
      They perform the role of "service", internal methods of the class.
    - The `static` modifier makes it possible to refer, for example, to a class method using the class name. For example
      `Math.random()`.


____________________________

# Three principles of object-oriented programming: encapsulation, inheritance, polymorphism.

Encapsulation is a union in one place ("in a capsule"), in fact in a Class file,
program code that describes:
- the state of the object (field),
- functionality responsible for its behavior (methods).



__________Russian version ___________________

# Структурное программирование
- это одна из парадигм программирования (ответ на вопрос о том, как вообще писать код)
  [Подробнее](https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D1%80%D1%83%D0%BA%D1%82%D1%83%D1%80%D0%BD%D0%BE%D0%B5_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5)

Главная идея - **полный** отказ от **оператора GOTO НОМЕР_СТРОКИ**.
Использование только трех структур согласно теореме Бёма - Якопини:
- шаг алгоритма
- условие (ветвление), switch- case 
- цикл

**Структурное программирование** - прогрессивный (до сих пор!) подход к созданию ПО,
отказ от спагетти-кода, что дало и дает рост производительности труда
программистов, снижение кол-ва ошибок и т.д.

## break, continue и структурное программирование

**break, continue** - это замена **опреатора GO TO**,
реализованная в рамках парадигмы структурного программирования.

In Java, a break statement is majorly used for:
- To exit a loop;
- Used as a “civilized” form of **goto**;
- Terminate a sequence in a switch statement.

**break** - выход из тела цикла
**continue** - пропуск одного такта/прохода тела цикла 
- это опеаторы в Java.

___________________________

арифметические вычисления
мы можем конструировать любые алгоритмы 

У нас есть переменные (типы) - это позволяет нам описать в какой-то части наши 
задачи и окружающий мир.

# Objects 
Что такое **Объект (Object)** ?
- это нужная/полезная для смысла жизни "сущность", например:
предмет, человек или животное, организация, деталь, вселенная и т.д.

**Автомобиль:** - новый ТИП данных(!!!)
- марка - String
- цвет - String (или если код цвета, то число)
- количество колес - byte 
- мощность двигателя - double 
- тип топлива - byte, String 
- форма-тип - String
, который включает в себя все перечисленные типы.
Так можно делать со всем, что есть в нашей вселенной.

Совокупность **однородных объектов** формирует **Класс (Class)**.
Пример: класс Автомобили, класс Млекопитающие, класс Звезды, класс Человек и т.д.

**Итак:**
- объекты описывают с помощью стандартных типов данных, это есть описание объекта и его состояния
  (характеристики объекта).
- их состояние изменяют с помощью МЕТОДОВ (пример для автомобиля - стоять, ехать, разгоняться, 
тормозить).

___________________________

# Packages (пакеты)

1. Java проекты состоят из значительного числа классов. 
Для организации структуры проектов, классы разносят по пакетам = директории.

Файл - это обязательная и востребованная сущность для работы компьютера.
Для хранения файлов еще создают папки, которые вложены друг в друга.

Имена пакетам дают через точку. Например: ``ait.company.model``. 
Полное имя класса включает название пакета. Например:
   `ait.project.model.Person`
Концепция использования пакетов позволяет реализовать dot-нотацию - последовательный вызов
методов, принадлежащих какому-то классу.

2. Модификаторы методов:
   - Методы с модификатором доступа `public` можно вызывать из других классов.
   - Методы с модификатором доступа `private` можно вызывать только внутри самого класса.
   Они выполняют роль "служебных", внутренних методов класса. 
   - Модификатор `static` дает возможность обратиться, например, к методу класса, используя имя класса. Например
`Math.random()`.

____________________________


Взгляд на программирование «под новым углом» (отличным от процедурного) предложили 
**Алан Кэй** и **Дэн Ингаллс** в языке Smalltalk. Здесь понятие класса стало основообразующей идеей 
для всех остальных конструкций языка (то есть класс в Смолтоке является примитивом, 
посредством которого описаны более сложные конструкции). 
Именно он стал первым широко распространённым объектно-ориентированным языком программирования.

# Три принципа Объектно-ориентированного программирования: инкапсуляция, наследование, полиморфизм.

Инкапсуляция - это объеденение в одном месте ("в капсуле"), по сути дела в файле Класса,
программного кода, описывающего:
- состояние объекта (поля), 
- функциональность отвечающую за его поведение (методы).
