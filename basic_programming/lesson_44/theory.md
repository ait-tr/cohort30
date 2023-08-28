## Iterator

If the object encapsulates inside itself some set of elements, and there is a need to iterate
all the elements of this set, then this may be a problem.
If a getter is created to pass this set, then by returning a reference, we essentially give an unsafe
access to the set outside of the object. The programmer who has received this access can, without our knowledge,
modify an object - change the composition of elements, reduce its size, etc.
If you return a copy of the set, then this can affect performance.

To solve this problem, there is the "Iterator" pattern.

The essence of the pattern is to create a third-party object that knows how to "sort" (iterate) a set
elements encapsulated in the original object.
An iterator object should have two functionality:
1) know how to determine if there is a next element;
2) return the current element and move on to the next one.

Java has an Iterator<T> interface with two abstract methods: boolean hasNext(),
returning true if there are still elements, and false if the end of the set has been reached, and T next()
returns the current element, and translates the "pointer" to the next element.
The Iterator interface also has an additional default void remove() method,
which has an empty body. But if we need to implement the correct deletion functionality
the current element during iteration, then the remove method must be overridden.

The class that encapsulates the set to be iterated can implement the Iterable<T> interface,
which has only one abstract method Iterator<T> iterator() that returns an iterator for objects
of this class.

For Iterable objects, you can use a for-each loop. Its signature is this:
for(T e: "set of T"){
do something};

In the body of this loop, the variable "e" takes on the value of each element in turn
(T e: "set of T"){
do something};
In the body of this loop, the variable "e" takes in turn the value of each element from the iterated set.
You cannot modify an iterable in a for-each loop.


## Complexity (computational complexity)

The concept of Complexity (computational complexity) allows you to evaluate the effectiveness of algorithmic solutions.
In simple terms, we can say that the computational complexity says, in proportion to which function grows
the number of actions when processing a set of elements, if you increase the number of elements of this
sets.

To describe the computational complexity, the so-called. "Big O notation".
For example, the notation O(n) indicates the linear complexity of the algorithm.
And O(log(n)), characterizes the logarithmic complexity.
_______________________________

## Итератор

Итератор и итерации - это способ перебора всего множества элементов. 

Это системная проблема: 
**Если объект инкапсулирует внутри себя какое-то множество элементов, и есть необходимость перебрать 
все элементы этого множества, то с этим может возникнуть проблема. 
Если для передачи этого множества создать геттер, то возвращая ссылку, мы по сути даем небезопасный 
доступ к множеству за пределами объекта. Получивший этот доступ программист может без нашего ведома
модифицировать объект - изменить состав элементов, сократить его размер и т.д**.

**Если возвращать копию множества, то это может повлиять на производительность.**

Для решения этой проблемы существует **паттерн "Итератор"**. 

Суть паттерна это создать сторонний объект, который знает как "перебирать" (итерировать) множество 
элементов инкапсулированных в исходном объекте. 
Объект итератор должен иметь две функциональности: 
1) знать как определить есть ли следующий элемент; 
2) вернуть текущий элемент и перейти к следующему.

В Java существует интерфейс Iterator<T> с двумя абстрактными методами: **boolean hasNext()**, 
возвращающий true, если еще есть элементы, и false если дошли до конца множества, и **T next()** 
возвращающий текущий элемент, и переводящий "указатель" к следующему элементу. 
В интерфейсе Iterator существует еще дополнительный дефолтный метод void remove(), 
который имеет пустое тело. Но если нам надо реализовать функциональность корректного удаления 
текущего элемента в процессе итерирования, то метод remove надо переопределить.

Класс инкапсулирущий множество, которое надо итерировать, может имплементировать интерфейс Iterable<T>,
у которого только один абстрактный метод Iterator<T> iterator(), возвращающий итератор для объектов 
данного класса.

Для Iterable объектов можно использовать цикл for-each. Его сигнатура вот такая: 
for(T e: "set of T"){ 
do something}; 

В теле этого цикла переменная "e" принимает поочередно значение каждого элемента
(T e: "set of T"){ 
do something}; 
В теле этого цикла переменная "e" принимает поочередно значение каждого элемента из итерируемого множества. 
В цикле for-each нельзя модифицировать итерируемое множество.


## Complexity (вычислительная сложность)

Понятие Complexity (вычислительная сложность), позволяет оценить эффективность алгоритмических решений.
Простым языком можно сказать, что вычислительная сложность говорит, пропорционально какой функции растет
колличество действий при обработке множества элементов, если увеличивать колличество элементов этого
множества.

Для описания вычислительной сложности используется т. н. "Big O notation".
Например, запись O(n), говорит о линейной сложности алгоритма.
А O(log(n)), характеризует логарифмическую сложность.




## JCF 

Java Collection Framework (JCF) - множество классов и интерфейсов которые реализуют наиболее часто 
используемые структуры данных. Эти все структуры работают с наборами данных и имеют уже 
реализованные методы на все типовые случаи жизни.
Выбор той или иной структуры основывается на знании/понимании/оценке затрат на вычислительную
сложность для тех операций, которые с этими структурами данных планируется чаще всего производить.

JCF состоит из двух больших подразделов: Map и Collection. 
Мы начинаем наше изучение с коллекций.

Интерфейс Collection расширяет интерфейс Iterable, т. е. все коллекции итерируемые. 
Интерфейс Collection определяет некоторый основной набор методов для работы с коллекциями данных. 
Например, добавление, удаление, поиск, получение колличества элементов в коллекции и т. д.

Есть множество интерфейсов расширяющих интерфейс Collection. Мы рассмотрим интерфейсы Set и List. 
И начнем с интерфейса List. Интерфейс List определяет коллекции элементы которых имеют индексы, 
т. е. некий аналог массива, но не имеющий ограничения по размеру. Соответственно в интерфейсе List, 
помимо методов унаследованных от Iterable и Collection, определены методы работающие с индексами. 
Например:
- вставка элемента по индексу, 
- удаление по индексу, 
- получение элемента по индексу, 
- поиск индекса заданного аргумента и т. п.

Одной из имплементаций интерфейса List является класс ArrayList. Для реализации функциональности 
интерфейса List, ArrayList инкапсулирует в себе массив некоторого начального размера. Когда этот массив 
полностью заполняется, то его элементы копируются в новый массив, но уже большего размера. 
И теперь ждем когда заполнится новый массив и т.д. Обычно почсле нескольких итераций, длина массива
"устаканивается" и далее ArrayList имеет достаточно стабильный размер (size).
Т. е. простым языком ArrayList представляет из себя "резиновый массив".

