## Interface Map<Key, Value>
<details>
<summary>English version</summary>

## MAP: Essence and Features

### Introduction

MAP in Java is a data structure organized as unique "key-value" pairs, closely resembling a dictionary. It serves not only as a data structure but also as an interface in the standard Java Development Kit (JDK), supporting various implementations, including the most popular—HashMap.

### Variants

MAP in Java represents the pinnacle of the Java collections hierarchy and has been included in the standard JDK since version 1.2. Over time, as Java continues to evolve and update, this interface has been enriched with new features.

#### Key Implementations

- **HashMap**
- **LinkedHashMap**
- **TreeMap**

HashMap is most commonly used in examples and applications, and will be discussed in greater detail in subsequent sections.

### Purpose and Usage

Maps are designed for efficient data retrieval. They store information in a "key-value" format, where each key is unique and unambiguously associated with a particular value. These unique "key-value" pairs form the elements of the map.

### Method Signatures

In Java, the `java.util.Map` interface offers a set of methods for adding, retrieving, and removing elements.

### Distinctive Features of Java's Map Interface

Map interfaces in the Java Collection Framework have various implementations, each with its own unique features and level of thread-safety. The most commonly encountered type is HashMap, which is widely used in the majority of Java applications.

### Uniqueness of Map Collections

Maps are special in the sense that they do not simply extend or directly implement the collection interface. This is due to their unique way of dealing with paired "key-value" elements, as opposed to handling individual values.

### Basic Operations with Map

To work efficiently with Maps in Java, it's essential to become familiar with the methods that implement various functions. These methods will be explored further, aiding in a deeper understanding of this component.


## Creating a Map

### Introduction

In a Map, keys and values can be objects of any type. Primitive data types cannot be used due to limitations related to generics. HashMap allows for one null key and multiple null values. The order of elements is not guaranteed.

### Example

An example of creating a HashMap with integer keys and string values:

```#java
Map<Integer, String> map = new HashMap<>();
```

All subsequent methods will apply to any Map implementations, as they all implement the same interface.

### Inserting Records
To add records, the `put` method is used, which takes two arguments:
* key
* value

#### Example

```java
map.put(1, "Tyrion Lannister");
map.put(2, "Arya Stark");
map.put(3, "Ned Stark");
map.put(4, "Cersei Lannister");
```

#### Table of Map Contents

| Key | Value           |
|-----|-----------------|
| 1   | Tyrion Lannister|
| 2   | Arya Stark      |
| 3   | Ned Stark       |
| 4   | Cersei Lannister|

#### Combining Maps
To add multiple records or combine two maps, the putAll method is used.

#### Keys and Duplicates
In Map, keys must be unique. If you try to add an existing key, the put method will return the previous value or null.

Example of checking the availability of a key:
```java
if (map.containsKey(4)) {
    throw new IllegalArgumentException("Duplicate key found");
}
``` 
#### Getting Data
The `get` method is used to extract information by taking the key as an argument.
```java
String value = map.get(4);  // Cersei Lannister
```
If the key is missing, the `get` method returns `null`.
Example:
```java
String value = map.get(10);  // null
```

##### Uniqueness of Keys in Map
The keys in the Map structure must be unique. If an attempt is made to add an already existing key, the following happens:

```java
map.put(4, "Daenerys Targaryen");
```
#### Table of Map Contents
| Key | Value             |
|-----|-------------------|
| 1   | Tyrion Lannister  |
| 2   | Arya Stark        |
| 3   | Ned Stark         |
| 4   | Daenerys Targaryen|

In this case, the `put` method returns the previous key value, if any. In the absence of the previous value, `null` is returned.

#### Checking For A Key
To determine the presence of a specific key, the `containsKey` method is used.

```java
if (map.containsKey(4)) {
    throw new IllegalArgumentException("Key already exists, cannot add duplicate");
}
```
#### Checking Values
To check for the presence of a certain value in the Map, the `containsValue` method is used.

```java
boolean exists = map.containsValue("Brienne of Tarth"); // Output: false
```

This method allows you to find out whether the Map contains the specified value.

#### Removing Elements from Map
In addition to adding elements, the Map structure also supports their removal. This is a basic operation that allows you to modify the contents of the Map.

##### Remove Method
To delete an element, the `remove` method is used, which works as follows:

1. Takes the key of the element as an argument.
2. Removes the corresponding element from the Map.
3. Returns the value of the deleted element or `null`, if there was none.
```java
map.remove(3); // Deletes and returns "Ned Stark"
map.remove(3); // Deletes nothing and returns null
```

#### Getting the Map Size and Checking for Emptiness
The `size` method returns the number of elements in the Map.
```java
int size = map.size(); // Getting the size
```

The 'isEmpty` method returns a Boolean value indicating whether the collection is empty or not.
```java
boolean isEmpty = map.isEmpty(); // Checking for emptiness
```
#### Viewing Map Content
Map interfaces provide methods for viewing content:

- `keySet`: Returns the set of all keys in the Map.
- `values`: Returns a collection of all values in the Map.
- `entrySet`: Returns the set of all key-value pairs in Map.

These "views" are directly related to the main map, and changes in them are reflected on the main map and vice versa. However, adding new elements through these views is not possible.

##### Clear method
To completely clear the Map, you can use the `clear` method.

```java
map.clear(); // Clears the entire map
```

#### Full Contents Of Your Map
To demonstrate the `keySet`, `values`, and `entrySet` methods, let's first look at the current contents of your Map:
##### Table of Map Contents
| Key | Value             |
|-----|-------------------|
| 1   | Tyrion Lannister  |
| 2   | Arya Stark        |
| 3   | Ned Stark         |
| 4   | Daenerys Targaryen|

#### Using keySet, values, and entrySet

##### keySet method
The `keySet` method returns a set of all keys contained in the Map.

```java
Set<Integer> keys = map.keySet();
// keys will contain [1, 2, 3, 4]
```
##### Values method
The `values` method returns a collection of all Map values.

```java
Collection<String> values = map.values();
// values will contain ["Tyrion Lannister", "Arya Stark", "Ned Stark", "Daenerys Targaryen"]
```
##### entrySet method
The 'entrySet` method returns a set of Map.Entry objects, each of which contains a key-value pair.
```java
Set<Map.Entry<Integer, String>> entries = map.entrySet();
// entries will contain:
// 1=Tyrion Lannister, 2=Arya Stark, 3=Ned Stark, 4=Daenerys Targaryen
```
With these methods you can access keys, values or a key-value pair of your Map for further use or manipulation.

#### Iterations
Iterations on maps (mapping collections) are possible in various ways. This section presents the most common iteration methods.

##### Features of exceptions
It is worth knowing that an attempt to iterate over a null map will result in a `NullPointerException` exception.

##### Application of Foreach
The most popular method of iterating over the map is using the `foreach` loop. This method is convenient for most tasks and provides access to both keys and values.

```java
map.forEach((key, value) -> {
    System.out.println("Key: " + key + ", Value: " + value);
});
```

##### Note
Above is an example of using lambda expressions in Java 8 to iterate over the map. In this case, the developer is given the opportunity to work with both keys and values.

##### Examples of iteration without using lambda expressions

##### Iteration using for-each and the `keySet()` method

```java
for (Integer key : map.keySet()) {
    String value = map.get(key);
    System.out.println("Key: " + key + ", Value: " + value);
}
```
#### Iteration using for-each and the 'entrySet()` method

```java
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
```
#### Iteration using an iterator

```java
Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<Integer, String> entry = iterator.next();
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
```

### Conclusion

#### Practical advantages of using Map (Map)

1. **Quick Access and Search**: Maps provide very quick access to key data.
2. **Unique keys**: There can be no duplicate keys in maps, which ensures data accuracy.
3. **Flexibility**: Maps can be used to store key-value pairs of different types.
4. **Ordering**: Some map implementations (for example, `TreeMap`) support data ordering.
5. **Availability of useful methods**: Built-in methods for performing basic operations such as adding, deleting and searching for elements.

#### Summary table with classes and complexity of operations

| Class | `get` | `put`   | `remove` | `containsKey` | Features |
|------------|---------|---------|----------|---------------|--------------------------------------|
| `HashMap` | O(1) | O(1) | O(1) | O(1) | Unordered |
| `TreeMap` | O(log n)| O(log n)| O(log n) | O(log n) | Ordered |
| `LinkedHashMap`| O(1) | O(1) | O(1) | O(1) | Ordered by insertion order |
| `Hashtable`| O(1) | O(1) | O(1) | O(1) | Thread-safe, but deprecated |

#### Map application options in practice

1. **Caching**: Storing the results of expensive calculations for quick re-access.
2. **Dictionaries and Thesauruses**: Building dictionaries for translation or synonyms.
3. **Data Indexing**: Maps can be used to index large amounts of data.
4. **Configuration Systems**: Storing key-value pairs for program settings.
5. **Graphs and networks**: Representation of graphs or networks using a map.
</details>
<details>
<summary>Версия на русском</summary>>
## MAP: Суть и Особенности

MAP в Java представляет собой структуру данных, организованную в форме уникальных пар "ключ-значение", и очень напоминает словарь. MAP не только является структурой данных, но и интерфейсом в стандартной Java Development Kit (JDK), поддерживающим различные реализации, включая самую популярную — HashMap.

### Введение и Разновидности

MAP в Java представляет вершину иерархии коллекций Java и включено в стандартный JDK начиная с версии 1.2. Этот интерфейс предлагает базовый набор операций для управления данными, представленными в форме "ключ-значение". С течением времени, с улучшением и обновлением Java, этот интерфейс обогащается новыми функциями.

Иерархия MAP в Java включает несколько ключевых реализаций:

- HashMap
- LinkedHashMap
- TreeMap

HashMap наиболее часто используется в примерах и приложениях, и о нем будет говориться подробнее в следующих разделах.

### Назначение и Применение

Карты (Maps) служат для эффективного поиска данных. Они хранят информацию в формате "ключ-значение", где каждый ключ является уникальным и однозначно связан с определенным значением. Такие уникальные пары "ключ-значение" и составляют элементы карты.

### Сигнатуры Основных Методов

В Java, интерфейс `java.util.Map` предлагает набор методов для добавления, извлечения и удаления элементов.

## Отличительные Характеристики Map в Java

Map интерфейсы в Java Collection Framework обладают различными реализациями, каждая с своими особенностями и уровнем потокобезопасности. Наиболее часто встречаемый тип — HashMap, который широко используется в большинстве Java-приложений.

### Уникальность Map Коллекций

Map являются особенными в том смысле, что они не просто расширяют или реализуют коллекционный интерфейс напрямую. Это связано с их особенностями работы с парными элементами "ключ-значение", в отличие от обработки индивидуальных значений.

### Основные Операции с Map

Чтобы эффективно работать с Map в Java, необходимо ознакомиться с методами, которые реализуют различные функции. Эти методы будут рассмотрены далее и помогут в дальнейшем изучении этого компонента.

#### Создание Map

В Map ключи и значения могут быть объектами любого типа. Примитивные типы данных не могут быть использованы из-за ограничений, связанных с использованием generics. HashMap позволяет иметь один нулевой ключ и множество нулевых значений. Порядок элементов не гарантирован.

Пример создания HashMap с целочисленными ключами и строковыми значениями:

```java
Map<Integer, String> map = new HashMap<>();
```

Все последующие методы будут применимы для любых реализаций Map, так как все они реализуют один и тот же интерфейс.

#### Вставка Записей
Для добавления записей используется метод put, принимающий два аргумента:
* ключ
* значение  
Пример:

```java
map.put(1, "Tyrion Lannister");
map.put(2, "Arya Stark");
map.put(3, "Ned Stark");
map.put(4, "Cersei Lannister");
```

#### Таблица содержимого Map:
| Key | Value           |
|-----|-----------------|
| 1   | Tyrion Lannister|
| 2   | Arya Stark      |
| 3   | Ned Stark       |
| 4   | Cersei Lannister|

#### Объединение Карт
Для добавления нескольких записей или объединения двух карт используется метод `putAll`.

#### Ключи и Дубликаты
В Map ключи должны быть уникальными. Если попытаться добавить существующий ключ, метод `put` вернёт предыдущее значение или `null`.

##### Пример проверки наличия ключа:
```java
if (map.containsKey(4)) {
    throw new IllegalArgumentException("Duplicate key found");
}
```  
##### Получение Данных
Метод `get` используется для извлечения информации, принимая ключ как аргумент.

Пример:
```java
String value = map.get(4);  // Cersei Lannister
```
Если ключ отсутствует, метод `get` возвращает `null`.
```java
String value = map.get(10);  // null
```

##### Уникальность Ключей в Map
Ключи в структуре Map должны быть уникальными. В случае попытки добавления уже существующего ключа происходит следующее:


```java
map.put(4, "Daenerys Targaryen");
```
#### Таблица содеражимого Map:
| Key | Value             |
|-----|-------------------|
| 1   | Tyrion Lannister  |
| 2   | Arya Stark        |
| 3   | Ned Stark         |
| 4   | Daenerys Targaryen|

В данном случае, метод `put` возвращает предыдущее значение ключа, если таковое имеется. В отсутствие предыдущего значения возвращается `null`.

#### Проверка Наличия Ключа
Для определения наличия конкретного ключа используется метод `containsKey`.


```java
if (map.containsKey(4)) {
    throw new IllegalArgumentException("Key already exists, cannot add duplicate");
}
```

#### Проверка Значений
Для проверки наличия определенного значения в Map применяется метод `containsValue`.


```java
boolean exists = map.containsValue("Brienne of Tarth"); // Output: false
```

Этот метод позволяет узнать, содержится ли в Map заданное значение.

#### Удаление Элементов из Map
Кроме добавления элементов, в структуре Map также поддерживается их удаление. Это базовая операция, которая позволяет модифицировать содержимое Map.

##### Метод Remove
Для удаления элемента используется метод `remove`, который работает следующим образом:

1. Принимает ключ элемента как аргумент.
2. Удаляет соответствующий элемент из Map.
3. Возвращает значение удаленного элемента или `null`, если такового не было.

```java
map.remove(3); // Удаляет и возвращает "Ned Stark"
map.remove(3); // Ничего не удаляет и возвращает null
```

#### Получение Размера Map и Проверка на Пустоту
Метод `size` возвращает количество элементов в Map.

```java
int size = map.size(); // Получение размера
```
Метод `isEmpty` возвращает булево значение, указывающее, пуста ли коллекция или нет.
```java
boolean isEmpty = map.isEmpty(); // Проверка на пустоту
```
#### Просмотр Содержимого Map
Интерфейсы Map предоставляют методы для просмотра содержимого:

- `keySet`: Возвращает набор всех ключей в Map.
- `values`: Возвращает коллекцию всех значений в Map.
- `entrySet`: Возвращает набор всех пар "ключ-значение" в Map.

Эти "представления" напрямую связаны с основной картой, и изменения в них отражаются на основной карте и наоборот. Однако, добавление новых элементов через эти представления невозможно.



##### Метод Clear
Чтобы полностью очистить Map, можно использовать метод `clear`.

```java
map.clear(); // Очищает всю карту
```

#### Полное Содержимое Вашей Map
Для демонстрации методов `keySet`, `values`, и `entrySet` давайте сначала посмотрим на текущее содержимое вашей Map:

##### Таблица содержимого Map:
| Key | Value             |
|-----|-------------------|
| 1   | Tyrion Lannister  |
| 2   | Arya Stark        |
| 3   | Ned Stark         |
| 4   | Daenerys Targaryen|

#### Использование keySet, values, и entrySet

##### Метод keySet
Метод `keySet` возвращает набор всех ключей, содержащихся в Map.

```java
Set<Integer> keys = map.keySet();
// keys будет содержать [1, 2, 3, 4]
```
##### Метод values
Метод `values` возвращает коллекцию всех значений Map.

```java
Collection<String> values = map.values();
// values будет содержать ["Tyrion Lannister", "Arya Stark", "Ned Stark", "Daenerys Targaryen"]
```
##### Метод entrySet
Метод `entrySet` возвращает набор объектов Map.Entry, каждый из которых содержит пару "ключ-значение".
```java
Set<Map.Entry<Integer, String>> entries = map.entrySet();
// entries будет содержать:
// 1=Tyrion Lannister, 2=Arya Stark, 3=Ned Stark, 4=Daenerys Targaryen
```
С помощью этих методов вы можете получить доступ к ключам, значениям или паре "ключ-значение" вашей Map для дальнейшего использования или манипуляций.

#### Итерации
Итерации по мапам (mapping collections) возможны различными способами. В этом разделе представлены наиболее распространенные методы итерации.

##### Особенности исключений
Стоит знать, что попытка итерации по нулевой (null) мапе приведет к исключению `NullPointerException`.

##### Применение Foreach
Наиболее популярный метод итерации по мапе — это использование цикла `foreach`. Этот метод удобен для большинства задач и предоставляет доступ как к ключам, так и к значениям.

```java
map.forEach((key, value) -> {
System.out.println("Key: " + key + ", Value: " + value);
});
```

##### Примечание
Выше представлен пример использования лямбда-выражений в Java 8 для итерации по мапе. В этом случае разработчику предоставляется возможность работать как с ключами, так и с значениями.

##### Примеры итерации без использования лямбда-выражений

###### Итерация с использованием for-each и метода `keySet()`

```java
for (Integer key : map.keySet()) {
    String value = map.get(key);
    System.out.println("Key: " + key + ", Value: " + value);
}
```
###### Итерация с использованием for-each и метода `entrySet()`

```java
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
```
###### Итерация с использованием итератора

```java
Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
while (iterator.hasNext()) {
    Map.Entry<Integer, String> entry = iterator.next();
    Integer key = entry.getKey();
    String value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
```

### Заключение

#### Практические преимущества использования мап (Map)

1. **Быстрый доступ и поиск**: Мапы предоставляют возможность очень быстрого доступа к данным по ключу.
2. **Уникальные ключи**: В мапах не может быть дубликатов ключей, что обеспечивает точность данных.
3. **Гибкость**: Мапы можно использовать для хранения пар "ключ-значение" разных типов.
4. **Упорядочение**: Некоторые реализации мап (например, `TreeMap`) поддерживают упорядочение данных.
5. **Наличие полезных методов**: Встроенные методы для выполнения основных операций, таких как добавление, удаление и поиск элементов.

#### Сводная таблица с классами и сложностью операций

| Класс      | `get`   | `put`   | `remove` | `containsKey` | Особенности                          |
|------------|---------|---------|----------|---------------|--------------------------------------|
| `HashMap`  | O(1)    | O(1)    | O(1)     | O(1)          | Неупорядоченная                      |
| `TreeMap`  | O(log n)| O(log n)| O(log n) | O(log n)      | Упорядоченная                        |
| `LinkedHashMap`| O(1) | O(1)   | O(1)     | O(1)          | Упорядоченная по порядку вставки     |
| `Hashtable`| O(1)    | O(1)    | O(1)     | O(1)          | Потокобезопасная, но устаревшая       |

#### Варианты применения мап на практике

1. **Кеширование**: Хранение результатов дорогостоящих вычислений для быстрого повторного доступа.
2. **Словари и тезаурусы**: Построение словарей для перевода или синонимов.
3. **Индексация данных**: Мапы могут быть использованы для индексации больших объемов данных.
4. **Системы конфигурации**: Хранение пар "ключ-значение" для настроек программы.
5. **Графы и сети**: Представление графов или сетей с помощью мап.
</details>