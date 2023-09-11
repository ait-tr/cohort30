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

One implementation of the List interface is the LinkedList class. LinkedList is a linear data structure, in which 
elements are not stored at a contiguous location, rather they are linked using pointers. Linked List forms a series
of connected nodes, where each node stores the data and the address of the next node.

Node Structure: A node in a linked list typically consists of two components:
Data: It holds the actual value or data associated with the node.
Next Pointer: It stores the memory address (reference) of the next node in the sequence.
Head and Tail: The linked list is accessed through the head node, which points to the first node in the list. 
The last node in the list points to NULL or nullptr, indicating the end of the list. This node is known as the tail node.

Why linked list data structure needed?
Here are a few advantages of a linked list that is listed below, it will help you understand why it is necessary to know.

Dynamic Data structure: The size of memory can be allocated or de-allocated at run time based on the operation 
insertion or deletion.
Ease of Insertion/Deletion: The insertion and deletion of elements are simpler than arrays since no elements need to 
be shifted after insertion and deletion, Just the address needed to be updated.
Efficient Memory Utilization: As we know Linked List is a dynamic data structure the size increases or decreases as per 
the requirement so this avoids the wastage of memory.
Implementation: Various advanced data structures can be implemented using a linked list like a stack, queue, graph, 
hash maps, etc.

1. Single-linked list:
      In a singly linked list, each node contains a reference to the next node in the sequence. Traversing a singly 
linked list is done in a forward direction.
   ![img.png](img.png)

2. Double-linked list:
   In a doubly linked list, each node contains references to both the next and previous nodes. This allows for 
traversal in both forward and backward directions, but it requires additional memory for the backward reference.
   ![img_1.png](img_1.png)

3. Circular linked list:
   In a circular linked list, the last node points back to the head node, creating a circular structure. 
It can be either singly or doubly linked.
   ![img_2.png](img_2.png)

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

Одной из имплементаций интерфейса List является класс linkedList. Связанный список — это линейная структура данных, в 
которой элементы не хранятся в смежных местах, а связаны с помощью указателей. Связанный список образует серию связанных
узлов, где каждый узел хранит данные и адрес следующего узла.

Структура узла. Узел в связанном списке обычно состоит из двух компонентов:
Данные: он содержит фактическое значение или данные, связанные с узлом.
Следующий указатель: хранит адрес памяти (ссылку) следующего узла в последовательности.
Голова и хвост: доступ к связанному списку осуществляется через головной узел, который указывает на первый узел в 
списке. Последний узел в списке указывает на NULL или nullptr, указывая на конец списка. Этот узел известен как 
хвостовой узел.

Зачем нужна структура данных связанного списка?
Вот несколько преимуществ связанного списка, перечисленных ниже, которые помогут вам понять, почему это необходимо знать.

Динамическая структура данных: размер памяти может быть выделен или освобожден во время выполнения в зависимости от 
операции вставки или удаления.
Простота вставки/удаления. Вставка и удаление элементов проще, чем массивов, поскольку после вставки и удаления 
элементы не нужно перемещать. Необходимо обновить только адрес.
Эффективное использование памяти. Как мы знаем, связанный список представляет собой динамическую структуру данных, 
размер которой увеличивается или уменьшается в соответствии с требованиями, что позволяет избежать потери памяти.
Реализация: различные расширенные структуры данных могут быть реализованы с использованием связанного списка, такого 
как стек, очередь, график, хэш-карты и т. д.

1. Односвязный список :
   В односвязном списке каждый узел содержит ссылку на следующий узел последовательности. Обход односвязного списка 
осуществляется в прямом направлении.
![img.png](img.png)

2. Двусвязный список :
      В двусвязном списке каждый узел содержит ссылки как на следующий, так и на предыдущий узлы. Это позволяет 
осуществлять обход как в прямом, так и в обратном направлении, но требует дополнительной памяти для обратной ссылки.
![img_1.png](img_1.png)

3. Круговой связанный список :
   В циклическом связанном списке последний узел указывает обратно на головной узел, создавая циклическую структуру. 
Он может быть как одинарным, так и двусвязным.
![img_2.png](img_2.png)