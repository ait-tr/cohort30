<details>
<summary>Stream API. Introduction to Functional Programming and Stream API in Java</summary>

# Functional Interface in Java

A functional interface in Java is an interface that contains exactly one abstract method. It can also contain one or more default methods or static methods. Functional interfaces are the basis of lambda expressions in Java 8 and above.

## Defining The Functional Interface

The annotation `@FunctionalInterface` is used to define the functional interface. This annotation is optional, but it helps the compiler to throw an error if the interface does not meet the definition of a functional interface.

```java 
@FunctionalInterface
public interface MyFunctionalInterface {
    void myAbstractMethod();
}
```
## Using The Functional Interface

Functional interfaces can be used to create functional interface objects using lambda expressions, method references, or constructors.

### Lambda expressions

```java
MyFunctionalInterface myFunc = () -> System.out.println("Hello World!");
myFunc.myAbstractMethod();  // Output: Hello World!
```
### References to methods

```java
public class Example {
    public static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunc = Example::sayHello;
        myFunc.myAbstractMethod();  // Output: Hello World!
    }
}
```
### References to constructors

```java
public class MyClass {
    public MyClass() {
        System.out.println("Constructor Called!");
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunc = MyClass::new;
        myFunc.myAbstractMethod();  // Output: Constructor Called!
    }
}
```
## Predefined Functional Interfaces in Java

Java offers a set of predefined functional interfaces, such as `Function`, `Consumer`, `Supplier`, `Predict`, etc., which simplifies working with functional programming.

### Example of using the Function interface
```java

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5
    }
}
```

## Comparison Table and examples for Function, Consumer, Supplier and Predict in Java

| Interface | Description | Method | Example |
|-----------|-----------|--------|---------|
| Function | Takes one argument and returns the result. | `R apply(T t)` | #CODE `Function<String, Integer> func = String::length; int length = func.apply("Hello"); // Output: 5` |
| Consumer | Accepts a single argument and does not return a result. | `void accept(T t)` | #CODE `Consumer<String> consumer = System.out::println; consumer.accept("Hello"); // Output: Hello` |
| Supplier  | Accepts no arguments, but returns the result. | `T get()` | #CODE `Supplier<String> supplier = () -> "Hello"; String str = supplier.get(); // Output: Hello` |
| Predicate | Takes one argument and returns boolean. | `boolean test(T t)` | #CODE `Predicate<String> predicate = String::isEmpty; boolean result = predicate.test(""); // Output: true` |

## Usage examples

### Function

The `Function` interface takes one argument and returns the result.
```java
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5
    }
}
```
### Consumer

The `Consumer` interface accepts a single argument and does not return a result.

```java
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");  // Output: Hello
    }
}
```
### Supplier

The `Supplier` interface does not accept arguments, but returns a result.

```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello";
        String str = supplier.get();
        System.out.println(str);  // Output: Hello
    }
}
```
### Predicate

The `Predict` interface takes one argument and returns boolean.

```java
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = String::isEmpty;
        boolean result = predicate.test("");
        System.out.println(result);  // Output: true
    }
}
```

# Stream API. Introduction to Functional Programming and Stream API in Java
Data processing is a standard task in development. Previously, it was necessary to use loops or recursive functions for this. With the advent of the Java 8 Stream API, the data processing process has accelerated significantly. This language tool allows you to describe how to process data, briefly and succinctly.

## What is the Java Stream API

It is a Java language tool that allows you to use a functional style when working with different data structures.

To begin with, the stream needs a source from which it will receive objects. Most often these are collections, but not always. For example, you can take as a source a generator that has rules for creating objects.

The data in the stream is processed on intermediate operations. For example: we can filter the data, skip a few elements, limit the selection, perform sorting. Then a terminal operation is performed. It absorbs the data and outputs the result.

## Stream on the example of a simple task

For clarity, let's look at the example of using streams in comparison with the old solution of a similar problem.

The task is to find the sum of odd numbers in the collection.

```java
Integer odd = collection.stream().filter(p -> p % 2 != 0).reduce((c1, c2) -> c1 + c2).orElse(0);
```

Here we see a functional style. Without streams, the same task has to be solved through the use of the loop:
```java
Integer oldOdd = 0;
for(Integer i: collection) {
if(i % 2 != 0) {
oldOdd += i;
}
}
```

Yes, at first glance, the cycle looks more understandable. But this is a matter of experience interacting with streams. Very quickly you get used to the fact that you can process data without using cycles.

## Advantages of Stream

Thanks to streams, you no longer need to write stereotypical code every time you have to do something with data: sort, filter, transform. Developers think less about the standard implementation and spend more time on more complex things.

##### A few more advantages of streams:

 - Support for weak connectivity. The less classes know about each other, the better.
 - Parallelizing operations with collections has become easier. Where previously it would have been necessary to cycle, streams significantly reduce the amount of code.
 - Methods

The `Stream API` does not modify the original collections, reducing the number of side effects.
Even complex data processing operations thanks to the `Stream API`
The `Stream API` looks concise and clear. In general, it becomes more convenient to write, and easier to read.

## How to create streams
#### The table below shows the main ways to create streams.

| Source | Method | Example |
|---------------------------------------------------------------|---------------------|-----------------------------------------------------------------------|
| Collection | `collection.stream()`| ```java Collection<String> collection = Arrays.asList("f5", "b6", "z7"); Stream<String> collectionS = collection.stream();``` |
| Values | `Stream.of(v1,... vN)` | ``java Stream<String> valuesS = Stream.of("f5", "b6", "z7");``       |
| Primitives | `IntStream.of(1, ... N)`| ```java IntStream intS = IntStream.of(9, 8, 7);```                    |
|                                                               | `DoubleStream.of(1.1, … N)`| ```java DoubleStream doubleS = DoubleStream.of(2.4, 8.9);```     |
| Array | `Arrays.stream(arr)` | ``java String[] arr = {"f5","b6","z7"}; Stream<String> arrS = Arrays.stream(arr);`` |
| File — each new line becomes an element | `Files.lines(file_path)` |``java Stream<String> fromFileS = Files.lines(Paths.get("doc.txt "))`` |
| Stream.builder                                                 | `Stream.builder().add(...)....build()` | ```java Stream.builder().add("f5").add("b6").build();```    |

## Streaming Methods

There are two types of methods available in the Stream API — pipeline and terminal. In addition, there are a number of special methods for working with numeric streams and several methods for checking parallelism /consistency. But this is a formal separation.

There can be many pipeline methods in the stream. There is only one terminal method. After its execution, the stream ends.

Nothing happens until you call the terminal method. That's because conveyor methods are lazy. This means that they are processing data and waiting for a command to pass it to the terminal method. We recommend not to be lazy as pipeline methods, but to be trained in order to have full knowledge to work with the Java Stream API.

### Conveyor

| Method | Description | Usage | Example |
|--------|-------------|-------|---------|
| `filter` | Works as a filter, returning values that fit the specified condition | `collection.stream().filter("e22"::equals).count();` |
| `sorted` | Sorts the elements in natural order; can use `Comparator` | `collection.stream().sorted().collect(Collectors.toList());` |
| `limit` | Limits output by the specified amount | `collection.stream().limit(10).collect(Collectors.toList());` |
| `skip` | Skips the specified number of elements | `collection.stream().skip(3).findFirst().orElse("4");` |
| `distinct` | Finds and removes repeated elements; returns elements without repetitions | `collection.stream().distinct().collect(Collectors.toList());` |
| `peek` | Performs an action on each element of the elements, returns a stream with the original elements | `collection.stream().map(String::toLowerCase).peek((e) -> System.out.print("," + e)). collect(Collectors.toList());` |
| `map` | Performs actions on each element; returns elements with function results | `Stream.of("3", "4", "5").map(Integer::parseInt).map(x -> x + 10).forEach(System.out::println);` |
| `MapPoint` | Works as `map`, only returns numeric `stream` | `collection.stream().mapToInt((s) -> Integer.parseInt(s)).toArray();` |
| `flatMap` | Works as a `map`, but converts one element to zero, one or many others | `collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);` |

### Terminal

| Method | Description | Usage | Example |
|--------|-------------|-------|---------|
| `findFirst` | Returns the element corresponding to the condition that stands first | `collection.stream().findFirst().orElse("10");` |
| `findAny` | Returns any element matching the condition | `collection.stream().findAny().orElse("10");` |
| `collect` | Collects the processing results in a collection and not only | `collection.stream().filter((s) -> s.contains("10")).collect(Collectors.toList());` |
| `count` | Counts and outputs how many elements correspond to the condition | `collection.stream().filter("f5"::equals).count();` |
| `anyMatch` | Returns true when at least one element meets the conditions | `collection.stream().anyMatch("f5"::equals);` |
| `noneMatch` | Returns true when no element matches the conditions | `collection.stream().noneMatch("b6"::equals);` |
| `allMatch` | Returns true when all elements meet the conditions | `collection.stream().allMatch((s) -> s.contains("8"));` |
| `min` | Finds the smallest element using the passed comparator | `collection.stream().min(String::compareTo).get();` |
| `max` | Finds the largest element using the passed comparator | `collection.stream().max(String::compareTo).get();` |
| `forEach` | Applies the function to all elements, but cannot guarantee the order of execution | `set.stream().forEach((p) -> p.append("_2"));` |
| `forEachOrdered` | Applies the function to all elements in turn, the order of execution can guarantee | `list.stream().forEachOrdered((p) -> p.append("_nv"));` |
| `toArray` | Brings the stream values to the array | `collection.stream().map(String::toLowerCase).toArray(String[]::new);` |
| `reduce` | Converts all elements into one object | `collection.stream().reduce((c1, c2) -> c1 + c2).orElse(0);` |

### Pipeline operations process data and pass it further down the pipeline without terminating the stream, while terminal operations process data and return the result, terminating the stream.

#### Examples Of Pipeline Operations:
- filter:
```java
List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
   myList
   .stream()
   .filter(s -> s.startsWith("c"))
   .map(String::toUpperCase)
   .sorted()
   .forEach(System.out::println);  // Output: C1 C2
```

- map:
```java
myList
    .stream()
    .map(String::toUpperCase)
    .sorted((a, b) -> b.compareTo(a))
    .forEach(System.out::println);  // Output: C2 C1 B1 A2 A1
```

#### Examples Of Terminal Operations:
- forEach:
```java
myList
    .stream()
    .filter(s -> s.startsWith("a"))
    .forEach(System.out::println);  // Output: a1 a2
```
- collect:
```java
List<String> result List = myList
    .stream()
    .map(String::toUpperCase)
    ..collect(Collectors.toList());  // result List: [A1, A2, B1, C2, C1]
```
<details>
<summary>IO streams. Information input and output streams</summary>

# Java Input/Output Streams

## 1. Input Streams:
- Used to read data from various sources (e.g. files, network connections, etc.).
- Main abstract class: `java.io.InputStream'.
    - Methods: `read()` to read individual bytes or an array of bytes.

## 2. Output Streams:
- Used to write data to various destinations (e.g. files, network connections, etc.).
- Main abstract class: `java.io.OutputStream'.
    - Methods: `write()` to write individual bytes or an array of bytes.

## 3. Readers and Writers:
- Wrap I/O streams and provide methods for working with symbolic data.
- Basic abstract classes: `java.io .Reader` and `java.io.Writer'.
    - Methods: `read()` and `write()` for reading and writing character data.

##4. Buffered Streams:
- Allow you to collect or store data in a buffer before they are actually read or written, which can improve I/O performance.
- Examples of classes: `BufferedReader', `BufferedWriter', `BufferedInputStream', and `BufferedOutputStream'.

## 5. Exception Handling:
- It is important to handle exceptions such as `IOException' when working with I/O.

# Examples:

## Reading from file:
```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt "))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```
## Write to file:
```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
    bw.write("Hello, world!");
} catch (IOException e) {
    e.printStackTrace();
}
```
</details>
</details>

-------------------------------------
<details>
<summary>Stream API. Введение в Функциональное Программирование и Stream API в Java</summary>

<details>
<summary>Функциональный Интерфейс в Java</summary>

# Функциональный Интерфейс в Java

Функциональный интерфейс в Java - это интерфейс, который содержит ровно один абстрактный метод. Он может содержать также один или несколько методов по умолчанию или статических методов. Функциональные интерфейсы являются основой лямбда-выражений в Java 8 и выше.

## Определение Функционального Интерфейса

Для определения функционального интерфейса используется аннотация `@FunctionalInterface`. Эта аннотация не обязательна, но она помогает компилятору выдать ошибку, если интерфейс не соответствует определению функционального интерфейса.

```java 
@FunctionalInterface
public interface MyFunctionalInterface {
    void myAbstractMethod();
}
```
## Использование Функционального Интерфейса

Функциональные интерфейсы можно использовать для создания объектов функциональных интерфейсов с помощью лямбда-выражений, ссылок на методы или конструкторов.

### Лямбда-выражения

```java
    MyFunctionalInterface myFunc = () -> System.out.println("Hello World!");
    myFunc.myAbstractMethod();  // Output: Hello World!
```
### Ссылки на методы

```java
public class Example {
    public static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunc = Example::sayHello;
        myFunc.myAbstractMethod();  // Output: Hello World!
    }
}
```
### Ссылки на конструкторы

```java
public class MyClass {
    public MyClass() {
        System.out.println("Constructor Called!");
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunc = MyClass::new;
        myFunc.myAbstractMethod();  // Output: Constructor Called!
    }
}
```
## Предопределённые Функциональные Интерфейсы в Java

Java предлагает набор предопределённых функциональных интерфейсов, таких как `Function`, `Consumer`, `Supplier`, `Predicate` и т.д., что упрощает работу с функциональным программированием.

### Пример использования интерфейса Function
```java

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5
    }
}
```

## Сравнительная таблица и примеры для Function, Consumer, Supplier и Predicate в Java

| Интерфейс | Описание | Метод | Пример                                                                                                    |
|-----------|-----------|--------|-----------------------------------------------------------------------------------------------------------|
| `Function`  | Принимает один аргумент и возвращает результат. | `R apply(T t)` | ``` Function<String, Integer> func = String::length; int length = func.apply("Hello"); // Output: 5```      |
| `Consumer`  | Принимает один аргумент и не возвращает результат. | `void accept(T t)` | `Consumer<String> consumer = System.out::println; consumer.accept("Hello"); // Output: Hello`       |
| `Supplier`  | Не принимает аргументов, но возвращает результат. | `T get()` | `Supplier<String> supplier = () -> "Hello"; String str = supplier.get(); // Output: Hello`          |
| `Predicate` | Принимает один аргумент и возвращает `boolean`. | `boolean test(T t)` | `Predicate<String> predicate = String::isEmpty; boolean result = predicate.test(""); // Output: true` |

## Примеры использования

### Function

Интерфейс `Function` принимает один аргумент и возвращает результат.
```java
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        int length = function.apply("Hello");
        System.out.println(length);  // Output: 5
    }
}
```
### Consumer

Интерфейс `Consumer` принимает один аргумент и не возвращает результат.

```java
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");  // Output: Hello
    }
}
```
### Supplier

Интерфейс `Supplier` не принимает аргументов, но возвращает результат.

```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello";
        String str = supplier.get();
        System.out.println(str);  // Output: Hello
    }
}
```
### Predicate

Интерфейс `Predicate` принимает один аргумент и возвращает boolean.

```java
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> predicate = String::isEmpty;
        boolean result = predicate.test("");
        System.out.println(result);  // Output: true
    }
}
```
</details>

<details>
<summary>Stream API. Введение в Функциональное Программирование и Stream API в Java</summary>

# Stream API. Введение в Функциональное Программирование и Stream API в Java
Обработка данных — стандартная задача при разработке. Раньше для этого приходилось использовать циклы или рекурсивные функции. С появлением в Java 8 Stream API процесс обработки данных значительно ускорился. Этот инструмент языка позволяет описать, как нужно обработать данные, кратко и емко.

## Что такое Java Stream API

Это инструмент языка Java, который позволяет использовать функциональный стиль при работе с разными структурами данных.

Для начала стриму нужен источник, из которого он будет получать объекты. Чаще всего это коллекции, но не всегда. Например, можно взять в качестве источника генератор, у которого заданы правила создания объектов.

Данные в стриме обрабатываются на промежуточных операциях. Например: мы можем отфильтровать данные, пропустить несколько элементов, ограничить выборку, выполнить сортировку. Затем выполняется терминальная операция. Она поглощает данные и выдает результат.

## Stream на примере простой задачи

Для наглядности посмотрим на примере использование стримов в сравнении со старым решением аналогичной задачи.

Задача — найти сумму нечетных чисел в коллекции.

```java
Integer odd = collection.stream().filter(p -> p % 2 != 0).reduce((c1, c2) -> c1 + c2).orElse(0);
```

Здесь мы видим функциональный стиль. Без стримов эту же задачу приходится решать через использование цикла:
```java
Integer oldOdd = 0; 
    for(Integer i: collection) {
        if(i % 2 != 0) {
            oldOdd += i;
        }
    }
```

Да, на первый взгляд цикл выглядит более понятным. Но это вопрос опыта взаимодействия со стримами. Очень быстро привыкаешь к тому, что можно обрабатывать данные без использования циклов.

## Преимущества Stream

Благодаря стримам больше не нужно писать стереотипный код каждый раз, когда приходится что-то делать с данными: сортировать, фильтровать, преобразовывать. Разработчики меньше думают о стандартной реализации и больше времени уделяют более сложным вещам.

##### Еще несколько преимуществ стримов:

 - Поддержка слабой связанности. Чем меньше классы знают друг про друга, тем лучше.
 - Распараллеливать проведений операций с коллекциями стало проще. Там, где раньше пришлось бы проходить циклом, стримы значительно сокращают количество кода.
 - Методы

`Stream API` не изменяют исходные коллекции, уменьшая количество побочных эффектов.
Даже сложные операции по обработке данных благодаря `Stream API`
`Stream API` выглядят лаконично и понятно. В общем, писать становится удобнее, а читать — проще.

## Как создавать стримы
#### В таблице ниже — основные способы создания стримов.

| Источник                                                      | Способ               | Пример                                                                |
|---------------------------------------------------------------|---------------------|-----------------------------------------------------------------------|
| Коллекция                                                      | `collection.stream()`| ``` Collection<String> collection = Arrays.asList("f5", "b6", "z7"); Stream<String> collectionS = collection.stream();``` |
| Значения                                                       | `Stream.of(v1,… vN)` | ``` Stream<String> valuesS = Stream.of("f5", "b6", "z7");```       |
| Примитивы                                                      | `IntStream.of(1, … N)`| ``` IntStream intS = IntStream.of(9, 8, 7);```                    |
|                                                               | `DoubleStream.of(1.1, … N)`| ``` DoubleStream doubleS = DoubleStream.of(2.4, 8.9);```     |
| Массив                                                         | `Arrays.stream(arr)` | ``` String[] arr = {"f5","b6","z7"}; Stream<String> arrS = Arrays.stream(arr);``` |
| Файл — каждая новая строка становится элементом                | `Files.lines(file_path)` | ``` Stream<String> fromFileS = Files.lines(Paths.get("doc.txt"))``` |
| Stream.builder                                                 | `Stream.builder().add(...)....build()` | ``` Stream.builder().add("f5").add("b6").build();```    |

## Методы стримов

В Stream API доступны методы двух видов — конвейерные и терминальные. Кроме них можно выделить ряд спецметодов для работы с числовыми стримами и несколько методов для проверки параллельности/последовательности. Но это формальное разделение.

Конвейерных методов в стриме может быть много. Терминальный метод — только один. После его выполнения стрим завершается.

Пока вы не вызвали терминальный метод, ничего не происходит. Все потому, что конвейерные методы ленятся. Это значит, что они обрабатывают данные и ждут команды, чтобы передать их терминальному методу. Мы рекомендуем не лениться как конвейерные методы, а пройти обучение чтобы иметь полноценные знания для работы с Java Stream API.

### Конвейерные

| Метод             | Что сделает                                                                          | Использование                                                                                       |
|-------------------|--------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| `filter`          | Отработает как фильтр, вернет значения, которые подходят под заданное условие        | ``` collection.stream().filter("e22"::equals).count();```                                       |
| `sorted`          | Отсортирует элементы в естественном порядке; можно использовать `Comparator`          | ``` collection.stream().sorted().collect(Collectors.toList());```                               |
| `limit`           | Лимитирует вывод по тому, количеству, которое вы укажете                               | ``` collection.stream().limit(10).collect(Collectors.toList());```                               |
| `skip`            | Пропустит указанное вами количество элементов                                         | ``` collection.stream().skip(3).findFirst().orElse("4");```                                      |
| `distinct`        | Найдет и уберет элементы, которые повторяются; вернет элементы без повторов          | ``` collection.stream().distinct().collect(Collectors.toList());```                              |
| `peek`            | Выполнит действие над каждым элементом элементов, вернет стрим с исходными элементами| ``` collection.stream().map(String::toLowerCase).peek((e) -> System.out.print("," + e)). collect(Collectors.toList());```|
| `map`             | Выполнит действия над каждым элементом; вернет элементы с результатами функций       | ``` Stream.of("3", "4", "5").map(Integer::parseInt).map(x -> x + 10).forEach(System.out::println);``` |
| `mapToInt`        | Сработает как `map`, только вернет числовой `stream`                                 | ``` collection.stream().mapToInt((s) -> Integer.parseInt(s)).toArray();```                       |
| `flatMap`         | Сработает как `map`, но преобразует один элемент в ноль, один или множество других   | ``` collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);``` |

### Терминальные
| Метод             | Что сделает                                                                         | Использование                                                                                        |
|-------------------|-------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------|
| `findFirst`       | Вернет элемент, соответствующий условию, который стоит первым                       | ``` collection.stream().findFirst().orElse("10");```                                              |
| `findAny`         | Вернет любой элемент, соответствующий условию                                      | ``` collection.stream().findAny().orElse("10");```                                                |
| `collect`         | Соберет результаты обработки в коллекции и не только                                | ``` collection.stream().filter((s) -> s.contains("10")).collect(Collectors.toList());```          |
| `count`           | Посчитает и выведет, сколько элементов, соответствующих условию                     | ``` collection.stream().filter("f5"::equals).count();```                                          |
| `anyMatch`        | True, когда хоть один элемент соответствует условиям                                | ``` collection.stream().anyMatch("f5"::equals);```                                                |
| `noneMatch`       | True, когда ни один элемент не соответствует условиям                               | ``` collection.stream().noneMatch("b6"::equals);```                                               |
| `allMatch`        | True, когда все элементы соответствуют условиям                                    | ``` collection.stream().allMatch((s) -> s.contains("8"));```                                      |
| `min`             | Найдет самый маленький элемент, используя переданный сравнитель                    | ``` collection.stream().min(String::compareTo).get();```                                          |
| `max`             | Найдет самый большой элемент, используя переданный сравнитель                     | ``` collection.stream().max(String::compareTo).get();```                                          |
| `forEach`         | Применит функцию ко всем элементам, но порядок выполнения гарантировать не может   | ``` set.stream().forEach((p) -> p.append("_2"));```                                                |
| `forEachOrdered`  | Применит функцию ко всем элементам по очереди, порядок выполнения гарантировать может | ``` list.stream().forEachOrdered((p) -> p.append("_nv"));```                                      |
| `toArray`         | Приведет значения стрима к массиву                                                  | ``` collection.stream().map(String::toLowerCase).toArray(String[]::new);```                       |
| `reduce`          | Преобразует все элементы в один объект                                              | ``` collection.stream().reduce((c1, c2) -> c1 + c2).orElse(0);```                                 |


### Конвейерные операции обрабатывают данные и передают их дальше по конвейеру, не завершая поток, в то время как терминальные операции обрабатывают данные и возвращают результат, завершая поток.

#### Примеры Конвейерных Операций:
 - filter:
```java
List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
   myList
   .stream()
   .filter(s -> s.startsWith("c"))
   .map(String::toUpperCase)
   .sorted()
   .forEach(System.out::println);  // Output: C1 C2
```

 - map:
```java
myList
    .stream()
    .map(String::toUpperCase)
    .sorted((a, b) -> b.compareTo(a))
    .forEach(System.out::println);  // Output: C2 C1 B1 A2 A1
```

#### Примеры Терминальных Операций:
 - forEach:
```java
myList
    .stream()
    .filter(s -> s.startsWith("a"))
    .forEach(System.out::println);  // Output: a1 a2
```
 - collect:
```java
List<String> resultList = myList
    .stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());  // resultList: [A1, A2, B1, C2, C1]
```

</details>
<details>
<summary>IO streams. Потоки ввода и вывода информации</summary>

# Java Input/Output Streams

## 1. Input Streams (Потоки ввода):
- Используются для чтения данных из различных источников (например, файлы, сетевые соединения и т. д.).
- Основной абстрактный класс: `java.io.InputStream`.
    - Методы: `read()` для чтения отдельных байтов или массива байтов.

## 2. Output Streams (Потоки вывода):
- Используются для записи данных в различные назначения (например, файлы, сетевые соединения и т. д.).
- Основной абстрактный класс: `java.io.OutputStream`.
    - Методы: `write()` для записи отдельных байтов или массива байтов.

## 3. Readers and Writers:
- Оборачивают потоки ввода-вывода и предоставляют методы для работы с символьными данными.
- Основные абстрактные классы: `java.io.Reader` и `java.io.Writer`.
    - Методы: `read()` и `write()` для чтения и записи символьных данных.

## 4. Buffered Streams (Буферизованные потоки):
- Позволяют собирать или хранить данные в буфере перед их фактическим чтением или записью, что может улучшить производительность I/O.
- Примеры классов: `BufferedReader`, `BufferedWriter`, `BufferedInputStream`, и `BufferedOutputStream`.

## 5. Exception Handling (Обработка исключений):
- Важно обрабатывать исключения, такие как `IOException`, при работе с I/O.

# Примеры:

## Чтение из файла:
```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```
## Запись в файл:
```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
    bw.write("Hello, world!");
} catch (IOException e) {
    e.printStackTrace();
}
```
</details>
</details>