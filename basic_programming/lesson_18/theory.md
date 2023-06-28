# Comparing objects in Java

## What is the problem?
Every object in Java contains the values of all the fields that make it up.
Comparing objects using "==" is incorrect, because "==" formally compares references, i.e.
addresses of objects in memory, but they are different.

## Solution
Comparison of objects should be made according to the content of the fields and plus use the necessary logic.

If we want the objects of our class to be compared with each other according to the fields we need, then we need to
override the equals method in our class, specifying in it the logic of comparing one given object
with another.

This method is inherited from the Object class in which it is defined. This method for your class
must be overridden, since all our classes are heirs of the Object class, and it has this method.

How does the equals method work?
On the example of the Computer class:

        `public boolean equals(Object obj) {   //
         if (!(obj instanceof Computer)) {    //
             return false;   //
             }    //
         Computer other = (Computer)obj;    //
         return brand.equals(other.brand) && cpu.equals(other.cpu) && ram == other.ram && ssd == other.ssd;
            //
         }`

instanceof - returns a boolean, checks if the object belongs to the specified class.
Computer other = (Computer)obj; is a downcasting of obj of type Object to an object of type Computer.

# Сравнение объектов в Java 

## В чем проблема?
Каждый объект в Java содержит в себе значения всех полей, которые его составляют.
Сравнивать объекты через "==" некорректно, т. к. "==" сравнивает формально ссылки, т. е.
адреса объектов в памяти, а они разные.

## Решение 
Сравнение объектов неоходимо производить по содержимому полей и плюс использовать нужную логику.

Если хотим, чтобы объекты нашего класса сравнивались между собой по нужным нам полям, то надо
переопределить метод equals в нашем классе, указав в нем логику сравнения одного заданного объекта
с другим. 

Этот метод наследуется от класса Object, в котором он определен. Этот метод для своего класса
надо переопределить, так как все наши классы - это наследники класса Object, а в нем этот метод есть.

Как работает метод equals? 
На примере класса Computer:

        `public boolean equals(Object obj) {   // сигнатура метода - модификаторы, тип возвр. значения, аргументы
         if (!(obj instanceof Computer)) {    //  проверка, что объект взят из класса Computer
             return false;   // возвращаем фальш
             }    //
         Computer other = (Computer)obj;    // downcastind 
         return brand.equals(other.brand) && cpu.equals(other.cpu) && ram == other.ram && ssd == other.ssd;
            //
         }`

 instanceof - возвращает boolean, проверяет, принадлежит ли объект указанному классу.
 Computer other = (Computer) obj; - это downcasting объекта obj типа Object до объекта типа Computer. 

   