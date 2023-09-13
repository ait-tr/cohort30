# Contract for `hashCode` and `equals` Methods in Java

## `equals` Contract

1. **Reflexivity**: An object must be equal to itself.
    ```java
    x.equals(x) // should return true
    ```

2. **Symmetry**: If `x` is equal to `y`, then `y` should be equal to `x`.
    ```java
    x.equals(y) == y.equals(x) // should be true
    ```

3. **Transitivity**: If `x` is equal to `y` and `y` is equal to `z`, then `x` should be equal to `z`.
    ```java
    if (x.equals(y) && y.equals(z)) {
        x.equals(z); // should return true
    }
    ```

4. **Consistency**: Multiple invocations of `equals` on the same objects should return the same result, provided no information used in the `equals` comparisons is modified.

5. **Non-equality to `null`**: Any non-null reference `x.equals(null)` should return `false`.

## `hashCode` Contract

1. **Consistency**: During a single execution of an application, the method should consistently return the same integer value, provided no information used in the `equals` method has changed.

2. **Equality of Objects implies Equality of Hash Codes**: If `x.equals(y)` returns `true`, then `x.hashCode()` should return the same hash code as `y.hashCode()`.

## Relationship between `hashCode` and `equals`

If two objects are considered equal according to the `equals` method, their hash codes must also be equal. However, the reverse is not necessarily true: equal hash codes do not guarantee object equality. In other words, two different objects can have the same hash code, leading to a collision.

Therefore, when overriding one of these methods, it's generally necessary to override the other as well, adhering to the specified contract.

# Set in Java

## Overview

The `Set` interface is present in the `java.util` package and extends the `Collection` interface. It is an unordered collection of objects in which duplicate values cannot be stored. Essentially, it implements the mathematical concept of a set. This interface contains methods inherited from the `Collection` interface, and adds a feature that restricts the insertion of duplicate elements.

There are two main sub-interfaces that extend the `Set` interface:

- `SortedSet`
- `NavigableSet`


## NavigableSet and SortedSet

In the above diagram, the `NavigableSet` interface extends the `SortedSet` interface. Since a set doesn't retain the insertion order, the `NavigableSet` interface provides the implementation to navigate through the set. The class which implements `NavigableSet` is `TreeSet`, which is an implementation of a self-balancing tree. Therefore, this interface provides us with a way to navigate through this tree.

## Declaration

The `Set` interface is declared as:

```java
public interface Set<E> extends Collection<E>
```

## Creating Set Objects
Since Set is an interface, objects cannot be created of the type Set. We always need a class that extends this list in order to create an object. After the introduction of Generics in Java 1.5, it is possible to restrict the type of object that can be stored in the Set. A type-safe set can be defined as:
```java
// Obj is the type of the object to be stored in Set
Set<Object> set = new HashSet<Object>();
```
## Classes Implementing the Set Interface in Java

| Class          | Storage Mechanism                 | Order Retention                   | Time Complexity for Basic Operations | Thread-Safety       | Null Elements                   |
|----------------|-----------------------------------|-----------------------------------|-------------------------------------|---------------------|---------------------------------|
| `HashSet`      | Hash Table                        | Does not retain order             | Constant time                       | No                  | Allows                          |
| `TreeSet`      | Red-Black Tree                    | Elements are sorted               | Logarithmic time                    | No                  | Not allowed (Java 7 and above)  |
| `LinkedHashSet`| Hash Table and Doubly-linked List | Retains insertion order           | Constant time                       | No                  | Allows                          |

  

<hr style="height:2px; border-width:0; color:gray; background-color:gray;">

# Контракт методов `hashCode` и `equals` в Java

## Контракт `equals`

1. **Рефлексивность**: Объект должен быть равен самому себе.
    ```java
    x.equals(x) // должно вернуть true
    ```

2. **Симметричность**: Если `x` равно `y`, то `y` должно быть равно `x`.
    ```java
    x.equals(y) == y.equals(x) // должно быть true
    ```

3. **Транзитивность**: Если `x` равно `y` и `y` равно `z`, то `x` должно быть равно `z`.
    ```java
    if (x.equals(y) && y.equals(z)) {
        x.equals(z); // должно вернуть true
    }
    ```

4. **Консистентность**: Многократные вызовы `equals` с теми же объектами должны возвращать одинаковый результат, при условии, что информация, используемая в сравнениях на равенство, не меняется.

5. **Неравенство с `null`**: Любая не-null ссылка `x.equals(null)` должна возвращать `false`.

## Контракт `hashCode`

1. **Консистентность**: В течение одного выполнения приложения, метод должен всегда возвращать одно и то же целочисленное значение, если информация, используемая в методе `equals`, не изменилась.

2. **Если объекты равны, хеш-коды тоже должны быть равны**: Если `x.equals(y)` возвращает `true`, то `x.hashCode()` должен возвращать тот же хеш-код, что и `y.hashCode()`.

## Взаимосвязь `hashCode` и `equals`

Если два объекта считаются равными по методу `equals`, их хеш-коды также должны быть равны. Однако обратное не всегда верно: равенство хеш-кодов не гарантирует равенство объектов. Другими словами, два различных объекта могут иметь одинаковый хеш-код, что является коллизией.

Таким образом, при переопределении одного из этих методов, как правило, необходимо переопределить и другой, соблюдая указанный контракт.

# Множество (Set) в Java

## Обзор

Интерфейс `Set` находится в пакете `java.util` и расширяет интерфейс `Collection`. Это неупорядоченная коллекция объектов, в которой не могут храниться дубликаты. По сути, он реализует математическое понятие множества. Этот интерфейс содержит методы, унаследованные от интерфейса `Collection`, и добавляет функцию, которая ограничивает вставку дублирующих элементов.

Есть два основных подинтерфейса, которые расширяют интерфейс `Set`:

- `SortedSet`
- `NavigableSet`


## NavigableSet и SortedSet

На приведенной выше диаграмме интерфейс `NavigableSet` расширяет интерфейс `SortedSet`. Поскольку множество не сохраняет порядок вставки, интерфейс `NavigableSet` предоставляет реализацию для навигации по множеству. Класс, который реализует `NavigableSet`, — это `TreeSet`, являющийся реализацией самобалансирующегося дерева. Таким образом, этот интерфейс предоставляет нам способ навигации по этому дереву.

## Объявление

Интерфейс `Set` объявлен так:

```java
public interface Set<E> extends Collection<E>
```

## Создание объектов Set
Поскольку Set является интерфейсом, объекты типа `Set` создать нельзя. Нам всегда нужен класс, который расширяет этот список, чтобы создать объект. После введения обобщений в `Java 1.5` стало возможным ограничить тип объекта, который может быть сохранен в `Set`. Типобезопасное множество можно определить так:
```java
// Obj is the type of the object to be stored in Set
Set<Object> set = new HashSet<Object>();
```

## Классы, реализующие интерфейс Set в Java

| Класс         | Хранение                          | Порядок                           | Сложность операций                     | Потокобезопасность | Null-элементы                  |
|---------------|-----------------------------------|-----------------------------------|---------------------------------------|--------------------|--------------------------------|
| `HashSet`      | Хеш-таблица                       | Не сохраняет порядок               | Константное время для основных операций| Нет                | Допускает                       |
| `TreeSet`      | Красно-черное дерево              | Элементы отсортированы            | Логарифмическое время                 | Нет                | Не допускает (Java 7 и выше)    |
| `LinkedHashSet`| Хеш-таблица и двусвязный список   | Сохраняет порядок вставки          | Константное время для основных операций| Нет                | Допускает                       |

