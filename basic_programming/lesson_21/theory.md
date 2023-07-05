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

## The String class and its methods

1. The String class encapsulates a set of characters and methods for working with it.
   Objects of the String class are immutable. Any "change" to an object of class String,
   actually leads to the creation of a new string.

2. The most popular methods for working with strings:

- length() - returns the number of characters in the string;

- charAt(int position) - returns the character at the given position (position numbering starts from zero);

- equalsIgnoreCase(String str) - compares strings ignoring the difference between large and small letters;

- toUpperCase() and toLowerCase() - returns a string in upper or lower case, respectively;

- indexOf(String str), indexOf(char c), lastIndexOf(String str), lastIndexOf(char c) - return the position of the first
  the found string or character in the string, starting to search from the beginning (indexOf) or from the end (lastIndexOf),
  can also search starting from a given position indexOf(String str, int pos);

- substring(int start, int end) - returns a part of the string (substring) starting from the start position,
  and ending at the end position, while the character at the starting position will be included in the resulting string,
  and the character at position end is not included;

- replace( str1, str2) - replaces all strings found in the string str1 with str2;

- trim() - removes spaces at the beginning and at the end of a string;

- split("regx") - splits the string, puts the result into an array of type String.

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

## Класс String и его методы

1. Класс String инкапсулирует в себе множество символов, и методы для работы с ним.
   Объекты класса String являются неизменными (immutable). Любое "изменение" объекта класса String,
   на самом деле ведет к созданию нового стринга.

2. Наиболее популярные методы для работы со стрингами:

- length() - возвращает колличество символов в стринге;

- charAt(int position) - возвращает символ находящийся на данной позиции (нумерация позиций начинается с нуля);

- equalsIgnoreCase(String str) - сравнивает стринги игнорируя разницу между большими и маленькими буквами;

- toUpperCase() и toLowerCase() - возвращает строку в верхнем, или нижнем регистре соответственно;

- indexOf(String str), indexOf(char c), lastIndexOf(String str), lastIndexOf(char c) - возвращают позицию первой
  найденной строки или символа в стринге, начиная искать с начала (indexOf) или с конца (lastIndexOf),
  могут искать также начиная с заданной позиции indexOf(String str, int pos);

- substring(int start, int end) - возвращает часть стринга (подстроку), начиная с позиции start,
  и заканчивая позицией end, при этом символ стоящий на стартовой позиции будет включен в результирующую строку,
  а символ стоящий на позиции end не включен;

- replace( str1, str2) - заменяет все найденные в стринге строки str1 на str2;

- trim() - убирает пробелы в начале и в конце строки;

- split("regx") - разделяет строку, результат помещает в массив типа String.