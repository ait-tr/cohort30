## JCF

Java Collection Framework (JCF) - a set of classes and interfaces that are implemented most often
used data structures. All these structures work with data sets and have already
implemented methods for all typical occasions.
The choice of one structure or another is based on knowledge/understanding/estimation of the costs of computing
complexity for those operations that are most often planned to be performed with these data structures.

JCF consists of two large subsections: Map and Collection.
We begin our study with collections.

The Collection interface extends the Iterable interface, i.e. all collections are iterable.
The Collection interface defines some basic set of methods for working with collections of data.
For example, adding, removing, searching, getting the number of elements in a collection, etc.

There are many interfaces that extend the Collection interface. We will look at the Set and List interfaces.
And let's start with the List interface. The List interface defines collections whose elements have indexes,
i.e., some analogue of an array, but not having a size limit. Accordingly, in the List interface,
in addition to methods inherited from Iterable and Collection, methods that work with indexes are defined.
For example:
- insert element by index,
- delete by index,
- getting an element by index,
- search for the index of a given argument, etc.

One implementation of the List interface is the ArrayList class. To implement the functionality
interface List, ArrayList encapsulates an array of some initial size. When this array
is completely filled, then its elements are copied into a new array, but of a larger size.
And now we are waiting for the new array to be filled, etc. Usually after several iterations, the length of the array
"settles down" and then ArrayList has a fairly stable size (size).
That is, in simple terms, ArrayList is a "rubber array".


_______________________________________________________________

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
Например, добавление, удаление, поиск, получение количества элементов в коллекции и т. д.

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

