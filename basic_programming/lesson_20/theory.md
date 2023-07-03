# Modifiers

In Java, a Class contains:
- variables (given by fields) and
- methods.

- Collectively they are called class members, sometimes they are called class members.

## Public, default, pritected, private

Modifiers open or close access to the elements / members of the class, that is, to its variables (fields) and methods.

The modifiers are in order from soft to hard:
public, default, protected, private

Java uses the following access modifiers:

**public:** public, public class or class field/method.
Fields and methods declared with the public modifier are visible to other classes from the current package and from external packages.

**private:** a private class or class member, the opposite of the public modifier. Private class or class method
only accessible from code in the same class.

**protected:** such a class or class member is accessible from anywhere in the current class or package, or
in derived classes, even if they are in other packages

**default** modifier (default).
**ATTENTION!!!** The absence of a modifier for a field or class method implies that
default modifier. Such fields or methods are visible to all classes in the current package.

**A special case:**
A field marked as **final** cannot be changed after the object has been created. Therefore it should
be initialized in the constructor when the object is created.

## Data control through class methods (constructor, setter and methods implemented in the class)

We can implement data control and various logic through class methods.

__________________________________

# Модификаторы

В Java Класс содержит:
- переменные (заданы полями) и 
- методы. 

- Совокупно они называются элементами класса, иногда их называют членами класса.

## Public, default, pritected, private

Модификаторы открывают или закрывают доступ к элементам/членам класса, то есть к его переменным (полям) и методам.

Модификаторы в порядке от "мягких" к "строгим":
public, default, protected, private
слово default - не пишется

В Java используются следующие модификаторы доступа:

**public:** публичный, общедоступный класс или поле/метод класса. 
Поля и методы, объявленные с модификатором public, видны другим классам из текущего пакета и из внешних пакетов.

**private:** закрытый класс или член класса, противоположность модификатору public. Закрытый класс или метод класса 
доступен только из кода в том же классе.

**protected:** такой класс или член класса доступен из любого места в текущем классе или пакете или 
в производных классах, даже если они находятся в других пакетах

Модификатор **default** (по умолчанию). 
**ВНИМАНИЕ!!!** Отсутствие модификатора у поля или метода класса предполагает применение к нему 
модификатора по умолчанию. Такие поля или методы видны всем классам в текущем пакете.

**Особый случай:**
Поле помеченное как **final**, невозможно изменить после создания объекта. Поэтому оно должно
быть инициализировано в конструкторе, при создании объекта.

## Контроль данных за счет методов класса (конструктор, сеттер и методы, реализованные в классе)

Мы можем реализовать контроль данных и различную логику за счет методов класса.
