## static and non-static fields and methods in a Java class
Modifier **static** 
"static", "permanent" - makes a variable or method "independent" of the Class object,
in which they are created.

Static methods can be accessed both through the name of the object and through the name of the class.
object.method()
class.method()

Non-static methods must be accessed exclusively through the name of class objects:
object.method()

A static method cannot be overridden, this method is "one for the class and its descendants"
- just like a static variable "one for a class and all its objects".

Static methods can only refer to static variables. This guarantees
that during the execution of the method, all elements will be initialized and will work.
This is called "static context".

The ``static`` modifier makes it possible, for example, to refer to a class method using the class name. For example
``Math.random()``, in class Math all methods are static.

Methods with the ``public`` access modifier can be called from other classes.

Methods with the ``private`` access modifier can only be called within the class itself.
They act as "utility" methods.

Useful Reading Link:
https://vertex-academy.com/tutorials/ru/modifikator-static-v-java-methody/#:~:text=%D0%9C%D0%BE%D0%B4%D0%B8%D1%84 %D0%B8%D0%BA%D0%B0%D1%82%D0%BE%D1%80%D0%B0%20static%20%2D%20%D1%81%20%D0%B0%D0%BD %D0%B3%D0%BB.,%D0%BC%D0%B5%D1%82%D0%BE%D0%B4%20%22%D0%BD%D0%B5%D0%B7%D0%B0 %D0%B2%D0%B8%D1%81%D0%B8%D0%BC%D1%8B%D0%BC%D0%B8%22%20%D0%BE%D1%82%20%D0%BE %D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%B0

__________________________________

## static и не static поля и методы в Java-классе
Модификатора static - с англ. "статичный", "постоянный" - делает переменную или метод "независимыми" от объекта Класса,
в котором они созданы.

К статическим методам можно обращаться и через название объекта, и через название класса.
    объект.метод()
    Класс.метод()

К нестатическим методам нужно обращаться исключительно через название объектов класса:
    объект.метод()

Cтатический метод нельзя переопределить, этот метод "один для класса и его наследников" 
- так же, как статическая переменная "одна для класса и всех его объектов".

Cтатические методы могут ссылаться только на статические переменные. Это гарантирует, 
что во время выполнения метода все элементы будут инициализированы и будут работать. 
Это называется "статическим контекстом".

Модификатор ``static`` дает возможность обратиться, например, к методу класса, используя имя класса. Например
``Math.random()``, в классе Math все методы static.

Методы с модификатором доступа ``public`` можно вызывать из других классов.

Методы с модификатором доступа ``private`` можно вызывать только внутри самого класса.
Они выполняют роль "служебных" методов.

Полезная ссылка для чтения:
https://vertex-academy.com/tutorials/ru/modifikator-static-v-java-metody/#:~:text=%D0%9C%D0%BE%D0%B4%D0%B8%D1%84%D0%B8%D0%BA%D0%B0%D1%82%D0%BE%D1%80%D0%B0%20static%20%2D%20%D1%81%20%D0%B0%D0%BD%D0%B3%D0%BB.,%D0%BC%D0%B5%D1%82%D0%BE%D0%B4%20%22%D0%BD%D0%B5%D0%B7%D0%B0%D0%B2%D0%B8%D1%81%D0%B8%D0%BC%D1%8B%D0%BC%D0%B8%22%20%D0%BE%D1%82%20%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%B0
