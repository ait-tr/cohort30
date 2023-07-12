1. In Java, there are structures that can only work with objects, but not with primitives.
   To solve this problem, Java has created "wrapper classes" for each primitive type:
   Byte, Short, Character, Integer, Long, Float, Double, Boolean.
   Each such class encapsulates the corresponding primitive type.

2. For the convenience of working with wrapper classes, Java implements autoboxing and autounboxing mechanisms.
   This means that we can use objects of "wrapper classes" in mathematical operations on a par with
   with primitive types. Java, if necessary, will automatically convert the "wrapper class" object
   into the primitive type corresponding to it (autounboxing), or vice versa - the primitive type will pack into an object
   class wrapper (autoboxing).

2. Wrapper classes also have useful constants and methods. For example Integer.MAX_VALUE stores the maximum possible
   integer type number, while the static methods Double.isNaN(double a) and Double.isInfinite(double a),
   can check if the passed argument holds the special values NaN and Infinite, respectively.

3. Wrapper classes using parsing methods (begin with the word parse...), can transform strings
   into the primitive type corresponding to the given wrapper class. If the string contains text that can be interpreted
   as a number, then the parsing will succeed. If not, then there will be an error.


_________________________


1. В Java существуют структуры, которые могут работать только с объектами, но не с примитивами.
   Для решения этой проблемы в Java созданы "классы обертки", для каждого примитивного типа:
   Byte, Short, Character, Integer, Long, Float, Double, Boolean.
   Каждый такой класс инкапсулирует соответствующий примитивный тип. 

2. Для удобства работы с wrapper classes в Java реализован механизм автоупаковки (autoboxing) и автораспаковки (autounboxing).
   Это означает, что мы можем использовать в математических действиях объекты "классов оберток" наравне
   с примитивными типами. Java, при необходимости, автоматически преобразует объект "класса обертки"
   в соответствующий ему примитивный тип (autounboxing), или наоборот - примитивный тип упакует в объект
   wrapper класса (autoboxing).

3. Wrapper classes также имеют полезные константы и методы. Например Integer.MAX_VALUE хранит максимально возможное
   число целого типа, а статические методы Double.isNaN(double a) и Double.isInfinite(double a),
   могут проверить хранит ли передаваемый аргумент специальные значения NaN и Infinite соответственно.

4. Wrapper classes при помощи методов парсинга (начинаются со слова parse...), могут преобразовать стринги
   в соответсвующий данному wrapper классу примитивный тип. Если строка содержит текст который можно интерпретировать
   как число, то парсинг пройдет успешно. Если нет, то будет ошибка.