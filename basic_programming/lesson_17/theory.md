# OOP - Object Oriented Programming

## Inheritance
1. Inheritance - the concept of object-oriented programming,
   according to which an abstract data type can inherit data and functionality
   some existing type, facilitating the reuse of software components
   security. In Java, abstract data types are called classes.

A simpler and more practical definition of inheritance:
the class being created can inherit fields and methods from an already existing class.

2. One class can inherit from another class using the special word **extends**.
   The parent class is also called the super class (**super**). An inheritor class is called a child class.
   You can only inherit from one class. With inheritance, in Java, you can
   build complex class hierarchies.

3. Child-class inherits the fields and methods of the super-class. In a child class, you can override
   methods of the parent class, if necessary, change, or define a new one in them
   functionality. Constructors are not inherited (except for the default one, if other constructors
   No). In addition to public and private modifiers, there are also protected and package modifiers.
   protected (which is the default modifier).

4. All classes that do not explicitly specify a super-class inherit from the Object class. For example, they
   inherit from the Object class the toString method, which returns a string representation of the object.

5. A parent type reference can refer to an object of a child type. In this case Java itself
   will perform upper casting. If you try to assign a child type link the value of the link
   parent type, the compiler will require explicit down casting. Wherein,
   if the reference of the parent type points to another child object, then during execution
   code, an error will occur. Type matching can be checked using the instanceof operator.

________________________

# OOП - объектно-ориентированное программирование

## Наследование
1. Наследование (англ. inheritance) — концепция объектно-ориентированного программирования,
   согласно которой абстрактный тип данных может наследовать данные и функциональность
   некоторого существующего типа, способствуя повторному использованию компонентов программного
   обеспечения. В Java абстрактные типы данных называют классами.

Более простое и практичное определение наследования:
создаваемый класс может наследовать поля и методы от уже существующего класса.

2. Один класс может наследовать от другого класса используя специальное слово **extends**.
   Родительский класс называют еще супер-классом (**super**). Класс наследник, называют дочерним классом.
   Наследовать разрешено только от одного класса. При помощи наследования, в Java, можно
   строить сложные иерархии классов.

3. Класс наследник, наследует поля и методы супер-класса. В дочернем классе можно переопределить
   методы родительского класса, если необходимо изменить, или определить в них новую
   функциональность. Конструкторы не наследуются (кроме дефолтного, если других конструкторов
   нет). Кроме модификаторов public, private, существуют еще модификаторы protected и package
   protected (являющийся дефолтным модификатором).

4. Все классы у которых явно не указан супер-класс, наследуют от класса Object. Например, они
   наследуют от класса Object метод toString, возвращающий строковое представление объекта.

5. Ссылка родительского типа может ссылаться на объект дочернего типа. В этом случае Java сама
   проведет upper casting. Если попытаться ссылке дочернего типа присвоить значение ссылки
   родительского типа, то компилятор потребует явно провести кастинг (down casting). При этом,
   если ссылка родительского типа указывает на другой дочерний объект, то в процессе выполнения
   кода, произойдет ошибка. Проверить соответствие типов, можно при помощи оператора instanceof.