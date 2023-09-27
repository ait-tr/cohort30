## Задача 1.

1. Переписать следующий код с использованием Stream API:

#### Цикл для фильтрации элементов:

```java
List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> output = new ArrayList<>();
        for(Integer i : input) {
        if(i % 2 == 0) {
        output.add(i);
        }
}
```

#### Цикл для преобразования элементов:

```java
List<String> input = Arrays.asList("apple", "banana", "cherry");
        List<Integer> output = new ArrayList<>();
        for(String s : input) {
        output.add(s.length());
        }
```

 #### Цикл для подсчета элементов, удовлетворяющих условию:

```java
List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        int count = 0;
        for(Integer i : input) {
        if(i % 2 == 0) {
        count++;
        }
        }
```



