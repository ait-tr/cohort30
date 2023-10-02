<details>
<summary>Multithreading</summary>
<details>
<summary>Multithreading in Java. General information</summary>

# Multithreading in Java. General information

## Introduction

One of the main elements in a computer is the processor. He, in fact, executes the computer commands that make up the program. At the end of the XX and at the beginning of the XXI century, processors were mostly single-core. The clock frequency of each new processor was higher than that of the previous model, due to this, the overall performance of the systems increased. When users had a need to execute several programs simultaneously on a single-core processor (the core of which can execute one instruction at each specific unit of time), a way was devised to achieve the visibility of a solution to the problem. The trick is that the processor switches between executing commands from different programs. Thus, the appearance is achieved that a single-core processor performs several actions or several programs simultaneously, or several actions are performed within the same program.

However, the production of processors reached the technological limit when further reduction in the size of transistors and increasing their clock frequency became impossible. Then processor manufacturers decided to increase the number of cores in one processor in order to increase system performance.

## Brief description of the processor operation
Let's consider at the simplest level how the processor works. It consists of an ALU (arithmetic logic unit) - the main element of the processor, registers, data buses and addresses, as well as a command decoder.

Initially, the ALU could perform only a few elementary operations: reading and writing to memory, addition, right shift, left shift, logical AND, OR, NOT, XOR. It was not possible to subtract ALU, subtraction was carried out by adding in an additional code, multiplication was carried out by adding and shifting to the left, division was carried out by shifting to the right and subtracting. Later, hardware schemes were invented that support these operations and operations with floating-point numbers. The most important conclusion to be drawn is that even the simplest operations, such as adding or subtracting two numbers, are performed not for one processor command, but for several. Therefore, the operation can be interrupted, and the processor can start executing commands from another program. I.e., the operations are NOT ATOMIC, and can be interrupted by other commands.

## Support at the operating system level.
Operating systems can solve the problem of allocating processor time in different ways. Basic approaches:

1. Easy task switching. When the processes are simultaneously loaded into the system memory and the timer switches between processes. Processes don't have any priorities. The advantages of this system are that it can run programs that are designed to work in a single-threaded environment.

2. Cooperative multitasking. When the next task is executed, after the previous one explicitly indicates that it can give CPU time to another task. With cooperative multitasking, an application can actually capture as much CPU time as it sees fit. All applications share CPU time, periodically transferring control to the next task.

3. Preemptive multitasking. When the operating system itself transfers control from one running program to another in case of completion of I/O operations, occurrence of hardware interrupts or when certain signals are received from one program to another. In this kind of multitasking, the processor can be switched from executing one program to another without any desire of the first program, literally between any two instructions in its code. The allocation of processor time is carried out by the process scheduler. In addition, each task can be assigned a certain priority by the user or by the operating system itself. This type of multitasking provides a faster response to user actions.

## Processes and threads
Let's introduce the concepts of process and flow.

**Process** — a program running at the current time, and all its elements: address space, global variables, registers, threads, open files, etc.

**Thread** — the smallest processing unit, the execution of which can be assigned by the operating system kernel. Or a set of discrete processor time during which commands or code are executed for one logical part of the program.

The implementation of execution threads and processes in different operating systems differs from each other, but in most cases the execution thread is inside the process. Multiple threads of execution can exist within the same process and share resources such as memory, whereas processes do not share these resources.

Execution threads are different from processes:

- processes are usually independent, whereas execution threads exist as components of processes;
- processes carry significantly more information about the program, whereas several execution threads share this information within the process;
- processes have separate address spaces, whereas execution threads share process memory;
- switching between execution threads in a single process is usually faster than switching between processes.

When a processor has multiple cores, the code is actually executed in parallel on different cores, with each core executing one thread at a specific unit of time. At the same time, two different cores cannot execute the same thread. Having more cores does not guarantee an increase in the speed of program execution. If the program is single-threaded, it will run on one core, and the other cores in the system will not be occupied. Some programming languages support the ability to assign an execution thread to a specific processor core. This is called thread affinity, but there is no such possibility in Java.

## Tools for working with multithreading in Java and multithreaded program models

In the first version of Java, there were few tools for working with multithreading. Fixed assets: class `Thread', interface `Runnable', keyword `synchronized` and methods for synchronization `wait()`, `notify()` and `notifyAll()` in the `Object` class. The Java 1.5 version already included the `java.util.concurrent` package, which introduced many new classes and interfaces. Also in the Java 1.8 version, the `CompletableFuture` class was added, which allows you to build chains of asynchronous tasks and combine them.

#### There are several approaches (models) in multithreaded programming:

- synchronization, locks and the volatile keyword;
- transactional memory — the layer between the JVM and the program API, recursive parallelism;
- actor model — when each object is a thread that exchanges messages with other threads.

Processors now support the concept of threads well. For example, akka (a framework for working with multithreading, ported to different programming languages: Java, Scala, C#) is written on the basis of threads and locks.

#### Ways to organize multithreading in programs:

- threads do not interact with each other, they work by themselves;
- threads interact with each other;
- threads work by themselves, and then collect data into a single result.

## Properties of threads, starting threads, joining other threads

All methods of the program are executed in some thread. The thread that calls the `main` method is the main thread of the application and is named main.

In `Java`, a thread is represented by the `Thread` class. There are two ways to create and start a stream:

1) Create an heir from the `Thread` class and override the `run()` method:

```java
public class MyThread extends Thread {
    public void run() {
        long sum = 0;
        for (int i = 0; i < 1000; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```
`MyThread t = new MyThread();`

2) Implement the `Runnable` interface and pass the object of the resulting class to the constructor of the `Thread` class:
```java
   Runnable r = new MyRunnable() { () ->
   System.out.println(“Hello!”);
   }
```
`Thread t = new Thread(r);`

### Starting threads

To start a thread, use the `Thread.start()` method.  If you call the `run()` method, it will be executed in the calling thread:  
`Thread t = new Thread(r);` 

`t.run(); //r code is executed in the current thread`
`t.start(); //r code is executed in a new thread`


### The `sleep` method in Java streams

The `sleep` method in the `Thread` class in Java is used to suspend the execution of the current thread for a certain period of time. This method takes a single parameter that specifies the number of milliseconds for which the thread should be suspended. There is also an overloaded version of this method that takes two parameters: one for milliseconds and one for nanoseconds. After the specified time period expires, the thread is put into a ready state and waits for the thread scheduler to resume its execution.

The `sleep` method can be very useful for controlling execution time in a multithreaded environment, for example, to create delays between repetitions in a loop or to wait for external conditions to change. It is important to note that the `sleep` method does not guarantee an exact delay of up to a millisecond or nanosecond due to possible fluctuations in system load and the time it takes for the thread scheduler to reactivate the thread. It is also worth noting that when calling the `sleep` method, the thread does not release the locked monitors, and therefore other threads will not be able to enter the synchronized blocks or methods blocked by this thread while it is sleeping.
```java
class SleeperRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // Приостанавливаем поток на 1 секунду (1000 миллисекунд)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Печатаем сообщение после каждого пробуждения
            System.out.println("Slept for 1 second, count: " + i);
        }
    }
}
```

### The `join` method in Java streams

The `join` method in the `Thread` class in Java is used to wait for the completion of another thread. When a thread calls the `join` method on another thread, it is blocked and waits until the specified thread completes. This can be useful in situations where one thread depends on the results of another thread.

The 'join` method has three overloads:

1. `join()` - waits indefinitely for the thread to finish.
2. `join(long millis)' - waits for the thread to finish within the specified number of milliseconds.
3. `join(long millis, int nanos)' - waits for the thread to finish within the specified number of milliseconds and nanoseconds.

If the thread on which the `join` method was called ends while waiting, the `join` method returns control. If the timeout expires, the `join` method will also return control, even if the thread has not finished yet.

It is important to note that the `join` method can throw an `InterruptedException` exception if the current thread is interrupted while waiting. This allows the thread to respond to an interrupt and possibly terminate its work ahead of time, if necessary.

In this example, a new thread is created that prints a message, then sleeps for 2 seconds, and prints the message again. The main thread waits for the new thread to finish using the join method before continuing execution and printing "Main thread proceeding".
```java
public class JoinExample {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread started");
                Thread.sleep(2000); // thread sleeps for 2 seconds
                System.out.println("Thread finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start(); // starting a thread

        try {
            thread.join(); // waiting for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread proceeding");
    }
}
```

| Characteristic | `sleep()`                                    | `join()`                                    |
|---------------------|----------------------------------------------|--------------------------------------------|
| Assignment | Suspends the execution of the current thread for the specified number of milliseconds. | Blocks the current thread until the specified thread completes execution. |
| Return value | No | No |
| Exceptions | `InterruptedException`                          | `InterruptedException`                      |
| Example | `Thread.sleep(2000);` | `thread.join();`                            |
| Note | A thread may be awakened prematurely if another thread interrupts it. | If the thread is already completed, the `join()` method immediately returns control.        |

</details>
</details>

----------------------

<details>
<summary>Многопоточность</summary>
<details>
<summary>Многопоточность в Java. Общие сведения</summary>

# Многопоточность в Java. Общие сведения

## Введение

Один из основных элементов в компьютере — процессор. Он, собственно, и выполняет компьютерные команды, которые составляют программу. В конце XX и в начале XXI века процессоры в основном были одноядерными. Тактовая частота у каждого нового процессора была больше, чем у предыдущей модели, за счет этого и возрастала общая производительность систем. Когда у пользователей обозначилась потребность выполнять одновременно несколько программ на одноядерном процессоре (ядро которого в каждую конкретную единицу времени может выполнять одну инструкцию), был придуман способ добиться видимости решения проблемы. Трюк в том, что процессор переключается между выполнением команд из разных программ. Таким образом достигается видимость, что одноядерный процессор выполняет несколько действий или несколько программ одновременно, или в рамках одной программы выполняется несколько действий.

Однако производство процессоров достигло технологического предела, когда дальнейшее уменьшение размеров транзисторов и повышение их тактовой частоты стало невозможно. Тогда производители процессоров, приняли решение об увеличении количества ядер в одном процессоре, чтобы увеличить производительность систем.

## Краткое описание работы процессора
Рассмотрим на простейшем уровне, как работает процессор. Он состоит из АЛУ (арифметико-логического устройства) — главного элемента процессора, регистров, шин данных и адреса, а также дешифратора команд.

Изначально АЛУ могло выполнять всего лишь несколько элементарных операций: чтение и запись в память, сложение, сдвиг вправо, сдвиг влево, логические AND, OR, NOT, XOR. Вычитать АЛУ не умело, вычитание осуществлялось путем сложения в дополнительном коде, умножение производилось путем сложения и сдвига влево, деление осуществлялось сдвигом вправо и вычитанием. Позже придумали аппаратные схемы, которые поддерживают эти операции и операции с числами с плавающей запятой. Самый главный вывод, который нужно сделать: даже самые простейшие операции как, например, сложение или вычитание двух чисел производится не за одну команду процессора, а за несколько. Следовательно, операция может быть прервана, и процессор может начать выполнять команды из другой программы. Т. е. операции НЕ АТОМАРНЫЕ, и могут быть прерваны другими командами.

## Поддержка на уровне операционной системы.
Операционные системы могут решать задачу распределения процессорного времени разными способами. Основные подходы:

1. Простое переключение задач. Когда процессы одновременно загружены в память системы и по таймеру происходит переключение между процессами. У процессов нет никаких приоритетов. Преимущества этой системы в том, что в ней могут работать программы, которые предназначены для работы в однопоточной среде.

2. Кооперативная многозадачность. Когда следующая задача выполняется, после того как предыдущая явно укажет, что она может отдать процессорное время другой задаче. При кооперативной многозадачности приложение может захватить фактически столько процессорного времени, сколько оно считает нужным. Все приложения делят процессорное время, периодически передавая управление следующей задаче.

3. Вытесняющая многозадачность. Когда операционная система сама передает управление от одной выполняемой программы другой в случае завершения операций ввода-вывода, возникновения аппаратных прерываний или же при поступлении тех или иных сигналов от одной программы к другой. В этом виде многозадачности процессор может быть переключен с выполнения одной программы на другую безо всякого пожелания первой программы, буквально между любыми двумя инструкциями в её коде. Распределение процессорного времени осуществляется планировщиком процессов. К тому же, каждой задаче может быть назначен пользователем или самой операционной системой определенный приоритет. Этот вид многозадачности обеспечивает более быстрый отклик на действия пользователя.

## Процессы и потоки
Введем понятия процесса и потока.

**Процесс** — программа, выполняющаяся в текущий момент времени, и все её элементы: адресное пространство, глобальные переменные, регистры, потоки, открытые файлы и т. д.

**Поток (thread)** — наименьшая единица обработки, исполнение которой может быть назначено ядром операционной системы. Или совокупность дискретного процессорного времени, в течение которого выполняются команды, или код, для одной логической части программы.

Реализация потоков выполнения и процессов в разных операционных системах отличается друг от друга, но в большинстве случаев поток выполнения находится внутри процесса. Несколько потоков выполнения могут существовать в рамках одного и того же процесса и совместно использовать ресурсы, такие как память, тогда как процессы не разделяют этих ресурсов.

Потоки выполнения отличаются от процессов:

 - процессы, как правило, независимы, тогда как потоки выполнения существуют как составные элементы процессов;
 - процессы несут значительно больше информации о программе, тогда как несколько потоков выполнения совместно используют эту информацию внутри процесса;
 - процессы имеют отдельные адресные пространства, тогда как потоки выполнения совместно используют память процесса;
 - переключение между потоками выполнения в одном процессе, как правило, быстрее, чем переключение между процессами.

Когда процессор имеет несколько ядер, код действительно выполняется параллельно на разных ядрах, при этом каждое ядро выполняет один поток в конкретную единицу времени. При этом два разных ядра не могут выполнять один поток. Наличие большего количества ядер не гарантирует увеличения скорости выполнения программ. Если программа однопоточная, она будет выполняться на одном ядре, а остальные ядра в системе заняты не будут. Некоторые языки программирования поддерживают возможность назначение потока выполнения конкретному ядру процессора. Это называется thread affinity, однако в Java нет такой возможности.

## Средства для работы с многопоточностью в Java и модели многопоточных программ

В первой версии `Java` инструментов для работы с многопоточностью было немного. Основные средства: класс `Thread`, интерфейс `Runnable`, ключевое слово `synchronized` и методы для синхронизации `wait()`, `notify()` и `notifyAll()` в классе `Object`. В версию Java 1.5 уже был включен пакет `java.util.concurrent`, в котором появилось много новых классов и интерфейсов. Также в версии Java 1.8 добавили класс `CompletableFuture`, который позволяет строить цепочки из асинхронных задач и комбинировать их.

#### Существуют несколько подходов (моделей) в многопоточном программировании:

 - синхронизация, блокировки и ключевое слово volatile;
 - транзакционная память — прослойка между JVM и API программы, рекурсивный параллелизм;
 - модель акторов — когда каждый объект это поток, который обмениваются сообщениями с другими потоками.

Сейчас процессоры хорошо поддерживают концепцию потоков. Например, akka (фрэймворк для работы с многопоточностью, портированный на разные языки программирования: Java, Scala, C#) написан на основе потоков и блокировок.

#### Способы организации многопоточности в программах:

 - потоки не взаимодействуют друг с другом, работают сами по себе;
 - потоки взаимодействуют друг с другом;
 - потоки работают сами по себе, а потом собирают данные в единый результат.

## Свойства потоков, запуск потоков, присоединение других потоков

Все методы программы выполняются в каком-либо потоке. Поток, который вызывает метод `main`, является главным потоком приложения и имеет имя main.

В `Java` поток представлен классом `Thread`. Создать и запустить поток можно двумя способами:

1) Создать наследника от класса `Thread` и переопределить метод `run()`:

```java
public class MyThread extends Thread {
    public void run() {
        long sum = 0;
        for (int i = 0; i < 1000; ++i) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```
`MyThread t = new MyThread();`

2) Реализовать интерфейс `Runnable` и передать объект полученного класса в конструктор класса `Thread`:
```java
Runnable r = new MyRunnable() { () ->
    System.out.println(“Hello!”);
}
```
`r.start();`

### Запуск потоков

Для запуска потока необходимо использовать метод `Thread.start()`.  Если вызвать метод `run()`, то он выполнится в вызывающем потоке:  
`Thread t = new Thread(r);` 

`t.run(); //код r выполняется в текущем потоке`  
`t.start(); //код r выполняется в новом потоке`


### Метод `sleep` в потоках Java

Метод `sleep` в классе `Thread` в Java используется для приостановки выполнения текущего потока на определенный промежуток времени. Этот метод принимает один параметр, который указывает количество миллисекунд, на которые следует приостановить поток. Есть также перегруженная версия этого метода, которая принимает два параметра: один для миллисекунд и один для наносекунд. После того как указанный период времени истекает, поток переводится в состояние готовности и ждет, пока планировщик потоков возобновит его выполнение.

Метод `sleep` может быть очень полезным для контроля времени выполнения в многопоточной среде, например, для создания задержек между повторениями в цикле или для ожидания изменения внешних условий. Важно отметить, что метод `sleep` не гарантирует точную задержку до миллисекунды или наносекунды из-за возможных флуктуаций в загрузке системы и времени, которое требуется планировщику потоков для реактивации потока. Также стоит отметить, что при вызове метода `sleep`, поток не освобождает заблокированные мониторы, и, следовательно, другие потоки не смогут войти в синхронизированные блоки или методы, заблокированные этим потоком, пока он спит.
```java
class SleeperRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // Приостанавливаем поток на 1 секунду (1000 миллисекунд)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Печатаем сообщение после каждого пробуждения
            System.out.println("Slept for 1 second, count: " + i);
        }
    }
}
```

### Метод `join` в потоках Java

Метод `join` в классе `Thread` в Java используется для того, чтобы ожидать завершения выполнения другого потока. Когда поток вызывает метод `join` на другом потоке, он блокируется и ожидает, пока указанный поток не завершится. Это может быть полезно в ситуациях, когда один поток зависит от результатов работы другого потока.

Метод `join` имеет три перегрузки:

1. `join()` - ожидает завершения потока неопределенно долго.
2. `join(long millis)` - ожидает завершения потока в течение указанного количества миллисекунд.
3. `join(long millis, int nanos)` - ожидает завершения потока в течение указанного количества миллисекунд и наносекунд.

Если поток, на котором был вызван метод `join`, завершится во время ожидания, метод `join` вернет управление. Если время ожидания истекет, метод `join` также вернет управление, даже если поток еще не завершен.

Важно отметить, что метод `join` может бросить исключение `InterruptedException`, если текущий поток будет прерван во время ожидания. Это позволяет потоку отреагировать на прерывание и возможно завершить свою работу раньше времени, если это необходимо.

В этом примере создается новый поток, который печатает сообщение, затем спит на 2 секунды, и снова печатает сообщение. Главный поток ожидает завершения нового потока с помощью метода join перед тем, как продолжить выполнение и напечатать "Main thread proceeding".
```java
public class JoinExample {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread started");
                Thread.sleep(2000);  // поток спит 2 секунды
                System.out.println("Thread finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();  // запуск потока

        try {
            thread.join();  // ожидание завершения потока
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread proceeding");
    }
}
```

| Характеристика      | `sleep()`                                    | `join()`                                    |
|---------------------|----------------------------------------------|--------------------------------------------|
| Назначение          | Приостанавливает выполнение текущего потока на указанное количество миллисекунд. | Блокирует текущий поток до тех пор, пока указанный поток не завершит выполнение. |
| Возвращаемое значение | Нет                                           | Нет                                           |
| Исключения          | `InterruptedException`                          | `InterruptedException`                      |
| Пример              | `Thread.sleep(2000);`                         | `thread.join();`                            |
| Примечание          | Поток может быть пробужден преждевременно, если другой поток прерывает его. | Если поток уже завершен, метод `join()` немедленно возвращает управление.        |

</details>
</details>