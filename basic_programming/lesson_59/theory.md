<details>
<summary>Multithreading</summary>
<details style="margin-left: 20px;">
      <summary>Multithreading in Java. Lecture 1. General information</summary>

# Multithreading in Java. Lecture 1. General information

## Introduction

One of the main elements in a computer is the processor. He, in fact, executes the computer commands that make up the
program. At the end of the XX and at the beginning of the XXI century, processors were mostly single-core. The clock
frequency of each new processor was higher than that of the previous model, due to this, the overall performance of the
systems increased. When users had a need to execute several programs simultaneously on a single-core processor (the core
of which can execute one instruction at each specific unit of time), a way was devised to achieve the visibility of a
solution to the problem. The trick is that the processor switches between executing commands from different programs.
Thus, the appearance is achieved that a single-core processor performs several actions or several programs
simultaneously, or several actions are performed within the same program.

However, the production of processors reached the technological limit when further reduction in the size of transistors
and increasing their clock frequency became impossible. Then processor manufacturers decided to increase the number of
cores in one processor in order to increase system performance.

## Brief description of the processor operation

Let's consider at the simplest level how the processor works. It consists of an ALU (arithmetic logic unit) - the main
element of the processor, registers, data buses and addresses, as well as a command decoder.

Initially, the ALU could perform only a few elementary operations: reading and writing to memory, addition, right shift,
left shift, logical AND, OR, NOT, XOR. It was not possible to subtract ALU, subtraction was carried out by adding in an
additional code, multiplication was carried out by adding and shifting to the left, division was carried out by shifting
to the right and subtracting. Later, hardware schemes were invented that support these operations and operations with
floating-point numbers. The most important conclusion to be drawn is that even the simplest operations, such as adding
or subtracting two numbers, are performed not for one processor command, but for several. Therefore, the operation can
be interrupted, and the processor can start executing commands from another program. I.e., the operations are NOT
ATOMIC, and can be interrupted by other commands.

## Support at the operating system level.

Operating systems can solve the problem of allocating processor time in different ways. Basic approaches:

1. Easy task switching. When the processes are simultaneously loaded into the system memory and the timer switches
   between processes. Processes don't have any priorities. The advantages of this system are that it can run programs
   that are designed to work in a single-threaded environment.

2. Cooperative multitasking. When the next task is executed, after the previous one explicitly indicates that it can
   give CPU time to another task. With cooperative multitasking, an application can actually capture as much CPU time as
   it sees fit. All applications share CPU time, periodically transferring control to the next task.

3. Preemptive multitasking. When the operating system itself transfers control from one running program to another in
   case of completion of I/O operations, occurrence of hardware interrupts or when certain signals are received from one
   program to another. In this kind of multitasking, the processor can be switched from executing one program to another
   without any desire of the first program, literally between any two instructions in its code. The allocation of
   processor time is carried out by the process scheduler. In addition, each task can be assigned a certain priority by
   the user or by the operating system itself. This type of multitasking provides a faster response to user actions.

## Processes and threads

Let's introduce the concepts of process and flow.

**Process** — a program running at the current time, and all its elements: address space, global variables, registers,
threads, open files, etc.

**Thread** — the smallest processing unit, the execution of which can be assigned by the operating system kernel. Or a
set of discrete processor time during which commands or code are executed for one logical part of the program.

The implementation of execution threads and processes in different operating systems differs from each other, but in
most cases the execution thread is inside the process. Multiple threads of execution can exist within the same process
and share resources such as memory, whereas processes do not share these resources.

Execution threads are different from processes:

- processes are usually independent, whereas execution threads exist as components of processes;
- processes carry significantly more information about the program, whereas several execution threads share this
  information within the process;
- processes have separate address spaces, whereas execution threads share process memory;
- switching between execution threads in a single process is usually faster than switching between processes.

When a processor has multiple cores, the code is actually executed in parallel on different cores, with each core
executing one thread at a specific unit of time. At the same time, two different cores cannot execute the same thread.
Having more cores does not guarantee an increase in the speed of program execution. If the program is single-threaded,
it will run on one core, and the other cores in the system will not be occupied. Some programming languages support the
ability to assign an execution thread to a specific processor core. This is called thread affinity, but there is no such
possibility in Java.

## Tools for working with multithreading in Java and multithreaded program models

In the first version of Java, there were few tools for working with multithreading. Fixed assets:
class `Thread', interface `Runnable', keyword `synchronized` and methods for synchronization `wait()`, `notify()`
and `notifyAll()` in the `Object` class. The Java 1.5 version already included the `java.util.concurrent` package, which
introduced many new classes and interfaces. Also in the Java 1.8 version, the `CompletableFuture` class was added, which
allows you to build chains of asynchronous tasks and combine them.

#### There are several approaches (models) in multithreaded programming:

- synchronization, locks and the volatile keyword;
- transactional memory — the layer between the JVM and the program API, recursive parallelism;
- actor model — when each object is a thread that exchanges messages with other threads.

Processors now support the concept of threads well. For example, akka (a framework for working with multithreading,
ported to different programming languages: Java, Scala, C#) is written on the basis of threads and locks.

#### Ways to organize multithreading in programs:

- threads do not interact with each other, they work by themselves;
- threads interact with each other;
- threads work by themselves, and then collect data into a single result.

## Properties of threads, starting threads, joining other threads

All methods of the program are executed in some thread. The thread that calls the `main` method is the main thread of
the application and is named main.

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

2) Implement the `Runnable` interface and pass the object of the resulting class to the constructor of the `Thread`
   class:

```java
   Runnable r=new MyRunnable(){()->
        System.out.println(“Hello!”);
        }
```

`Thread t = new Thread(r);`

### Starting threads

To start a thread, use the `Thread.start()` method. If you call the `run()` method, it will be executed in the calling
thread:  
`Thread t = new Thread(r);`

`t.run(); //r code is executed in the current thread`
`t.start(); //r code is executed in a new thread`

### The `sleep` method in Java streams

The `sleep` method in the `Thread` class in Java is used to suspend the execution of the current thread for a certain
period of time. This method takes a single parameter that specifies the number of milliseconds for which the thread
should be suspended. There is also an overloaded version of this method that takes two parameters: one for milliseconds
and one for nanoseconds. After the specified time period expires, the thread is put into a ready state and waits for the
thread scheduler to resume its execution.

The `sleep` method can be very useful for controlling execution time in a multithreaded environment, for example, to
create delays between repetitions in a loop or to wait for external conditions to change. It is important to note that
the `sleep` method does not guarantee an exact delay of up to a millisecond or nanosecond due to possible fluctuations
in system load and the time it takes for the thread scheduler to reactivate the thread. It is also worth noting that
when calling the `sleep` method, the thread does not release the locked monitors, and therefore other threads will not
be able to enter the synchronized blocks or methods blocked by this thread while it is sleeping.

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

The `join` method in the `Thread` class in Java is used to wait for the completion of another thread. When a thread
calls the `join` method on another thread, it is blocked and waits until the specified thread completes. This can be
useful in situations where one thread depends on the results of another thread.

The 'join` method has three overloads:

1. `join()` - waits indefinitely for the thread to finish.
2. `join(long millis)' - waits for the thread to finish within the specified number of milliseconds.
3. `join(long millis, int nanos)' - waits for the thread to finish within the specified number of milliseconds and
   nanoseconds.

If the thread on which the `join` method was called ends while waiting, the `join` method returns control. If the
timeout expires, the `join` method will also return control, even if the thread has not finished yet.

It is important to note that the `join` method can throw an `InterruptedException` exception if the current thread is
interrupted while waiting. This allows the thread to respond to an interrupt and possibly terminate its work ahead of
time, if necessary.

In this example, a new thread is created that prints a message, then sleeps for 2 seconds, and prints the message again.
The main thread waits for the new thread to finish using the join method before continuing execution and printing "Main
thread proceeding".

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


<details style="margin-left: 20px;">
<summary>Multithreading in Java. Lecture 2. Stopping and interrupting threads</summary>

# Multithreading in Java. Lecture 2. Stopping and interrupting threads

### Thread object. Thread names, thread priority

The object of the current thread can be obtained by calling the static method: `Thread.currentThread()`.

Thread names can be set via the `setName()` method or via a constructor parameter. It is recommended to give
meaningful names to threads, this will be useful when debugging. It is not recommended to give threads the same names, although thread names are not
validated by the JVM.

The standard format for the names of threads that were created singly is `thread-N', where `N` is the sequence number of the thread. For the pool
The standard name is `pool—N-thread-M`, where `N` denotes the sequential number of the pool (each time
you create a new pool, the global counter `N` increases), and `M` is the sequential number of the thread in the pool.

Threads have a priority that can be set as an integer from 1 to 10. The larger the number, the higher the priority of the thread.
The `main` thread has priority 5. And the priority of new threads is equal to the priority of the parent thread, it can be changed
using the 'setPriority(int)` method. A thread with a higher priority will have more CPU time to execute.
If two threads have the same priority, then the decision on which of them will be executed first depends on
the scheduler algorithm: (Round-Robin, First Come First Serve).

There are several constants for thread priority:

- `Thread.MIN_PRIORITY` — minimum priority, value 1;
- `Thread.NORM_PRIORITY` — default priority, value 5;
- `Thread.MAX_PRIORITY` — maximum thread priority, value 10

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(8);
        Thread thread = new Thread() {
            public void run() {
                Thread.currentThread().setName("My name");
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
            }
        };
        thread.start();
    }
}
```

### Daemon threads

In Java, there is such a thing as a daemon thread. The work of the JVM ends when the last
non-daemon thread has finished executing, despite the daemon threads running. There are two methods to work with this property: `setDaemon()`
and `isDaemon()'.

<details style="margin-left: 20px;">
<summary>Code example:</summary>

```java
public class DaemonThreadExample {

    public static void main(String[] args) {
        Thread nonDaemonThread = new Thread(() -> {
            try {
                System.out.println("Non-daemon thread starting work.");
                // We emulate the long work of the stream, for example, data processing
                Thread.sleep(5000); // Waiting 5 seconds
                System.out.println("Non-daemon thread finished work.");
            } catch (InterruptedException e) {
                System.err.println("Non-daemon thread was interrupted.");
            }
        });

        Thread daemonThread = new Thread(() -> {
            try {
                System.out.println("Daemon thread starting work.");
                // Emulating a long-running thread
                while (true) {
                    System.out.println("Daemon thread is working...");
                    Thread.sleep(1000); // Waiting for 1 second
                }
            } catch (InterruptedException e) {
                System.err.println("Daemon thread was interrupted.");
            }
        });
        // Installing the thread as a daemon
        daemonThread.setDaemon(true);

        nonDaemonThread.start();
        daemonThread.start();
    }
}
```
</details>

**The `ThreadGroup` class**.

All threads are in groups represented by instances of the `ThreadGroup' class. The group is specified when creating
the stream. If no group has been specified, then the thread is placed in the same group as the parent thread.
The `activeCount()` and `enumerate()` methods return, respectively, the number and complete list of all active threads in
the group.

<details style="margin-left: 20px;">
<summary>Code example:</summary>

```java
public class ThreadGroupExample {

    public static void main(String[] args) {

        // Creating a new thread group
        ThreadGroup myGroup = new ThreadGroup("MyThreadGroup");

        // Creating threads and putting them in a group
        Thread thread1 = new Thread(myGroup, createRunnable(), "Thread1");
        Thread thread2 = new Thread(myGroup, createRunnable(), "Thread2");
        Thread thread3 = new Thread(myGroup, createRunnable(), "Thread3");

        // Starting Threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Using the activeCount() method to get the number of active threads in a group
        System.out.println("Active threads in thread group " + myGroup.getName() + ": " + myGroup.activeCount());

        // Using the enumerate() method to get all active threads in a group
        Thread[] threads = new Thread[myGroup.activeCount()];
        myGroup.enumerate(threads);
        System.out.println("List of threads:");
        for (Thread thread : threads) {
            System.out.println(thread.getName());
        }
    }

    private static Runnable createRunnable() {
        return () -> {
            try {
                // The thread runs for 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }
}

```
</details>


**Ways to suspend thread execution** for a specified amount of time: `Thread.sleep(long millis)`
and `TimeUnit.<UNIT>.sleep(long timeout)`. They suspend the execution of the current thread for a specified period of time.
Calling methods requires handling the `InterruptedException' exception.

<details style="margin-left: 20px;">
<summary>Code example:</summary>

```java
import java.util.concurrent.TimeUnit;

public class SleepExample {

    public static void main(String[] args) {
        // Create and start a thread using Thread.sleep() to pause
        Thread thread1 = new Thread(createSleepRunnable("Thread1", 2000));
        thread1.start();

        // Create and start a thread using TimeUnit.SECONDS.sleep() to pause
        Thread thread2 = new Thread(createTimeUnitSleepRunnable("Thread2", 3));
        thread2.start();
    }

    // A method that creates a Runnable that uses Thread.sleep() to suspend
    private static Runnable createSleepRunnable(String threadName, int sleepTimeMillis) {
        return () -> {
            System.out.println(threadName + " started");
            try {
                // Suspending the stream by sleepTimeMillis milliseconds
                Thread.sleep(sleepTimeMillis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " woke up and finished");
        };
    }

    // Method that creates a Runnable that uses TimeUnit.SECONDS.sleep() to pause
    private static Runnable createTimeUnitSleepRunnable(String threadName, int sleepTimeSeconds) {
        return () -> {
            System.out.println(threadName + " started");
            try {
                // Suspending the stream for sleepTimeSeconds seconds
                TimeUnit.SECONDS.sleep(sleepTimeSeconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " woke up and finished");
        };
    }
}

```
</details>

The non-static `join()` method allows one thread to wait for the execution of another. If the current thread `t1` calls
another thread `t2h2t2.join()`, then the th2 thread stops until the thread `t2` completes its work.
You can also call the `join()` method with an argument indicating the timeout limit (in milliseconds or in
milliseconds with nano seconds). If the target thread `t2` does not finish working within the specified time period, the `join()` method
will still return control to the initiator `t1`.

<details style="margin-left: 20px;">
<summary>Code example:</summary>

```java
public class JoinExample {

    public static void main(String[] args) {
        // Creating two streams
        Thread t1 = new Thread(createRunnable("Thread1", 5000));
        Thread t2 = new Thread(createRunnable("Thread2", 2000));

        // Starting the first thread
        t1.start();

        // Starting the second thread
        t2.start();

        System.out.println("Started both threads");

        try {
            // The main thread will wait for the completion of the t1 thread for 7000 milliseconds
            t1.join(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread1 has finished or 7 seconds have passed since we started waiting");

        try {
            // The main thread will wait for the completion of the t2 thread without waiting time, that is, until its completion
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread2 has finished");
    }

    private static Runnable createRunnable(String threadName, int sleepTime) {
        return () -> {
            System.out.println(threadName + " started");
            try {
                // The thread sleeps the specified number of milliseconds
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " finished");
        };
    }
}
```
</details>

## Stopping and interrupting threads

To stop the stream in Java version 1, the 'stop()` method was used. However, in Java 1.1, this method
was made `deprecated` (obsolete), because using the `stop()` method does not guarantee the correct termination of
the thread and stable operation of the program as a whole. Therefore, it is strongly not recommended to use it when writing programs
.

Instead of the `stop()` method, the `interrupt()` method should be used. Unlike the 'stop()` method, which is forced
when stopping the thread, the `interrupt()` method prompts the thread to stop its execution by setting the `interrupted` flag
to `true' inside the thread. This flag displays the interrupt status and has an initial value of `false'. When a thread
is interrupted by another thread, one of two things happens:

- If the thread is waiting for the execution of an interrupted blocking method, such as `Thread.sleep()', `Thread.join()`
  or `Object.wait()`, then the wait is interrupted and the method generates an 'InterruptedException'. The `interrupted` flag
  set to `false'.
- The `interrupted` flag is set to `true'.

There are three methods for dealing with thread interrupts:

<details style="margin-left: 20px;">
<summary>Method 1:</summary>

```java
public class Thread {
    public void interrupt() { ...}

    public boolean isInterrupted() { ...}

    public static boolean interrupted() { ...}
...
}
```

```java
public class InterruptExample {

    public static void main(String[] args) {
        // Creating and starting a thread that can be interrupted
        Thread sleepingThread = new Thread(createSleepingRunnable());
        sleepingThread.start();

        // Wait 2 seconds and then interrupt sleepingThread
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepingThread.interrupt();
    }

    // A method that creates a Runnable that "sleeps" and handles the interrupt
    private static Runnable createSleepingRunnable() {
        return () -> {
            try {
                // The thread "sleeps" for 10 seconds or until it is interrupted
                System.out.println("Going to sleep");
                Thread.sleep(10000);
                System.out.println("Woke up naturally");
            } catch (InterruptedException e) {
                // If the stream was interrupted during sleep, it will enter here
                System.out.println("Was interrupted while sleeping");
            }
        };
    }
}

```
</details>

- `isInterrupted()` returns the flag value and does not change it.
- `interrupted()` returns the flag value and sets its value to false. If the interrupted flag is set to
  true and this method is called, the first time the method returns true, and subsequent calls return false.

There are two types of operations: blocking and non-blocking. Non-blocking operations do not suspend the execution of the thread.
Blocking operations include calls to the methods `sleep()`, `wait()`, `join()` and, for example, some methods of the class
`Socket`. If a thread was interrupted while it was performing non-blocking calculations, they will not be interrupted immediately.
However
, the thread is already marked as interrupted, so any next blocking operation will immediately abort and throw
`InterruptedException`.

<details style="margin-left: 20px;">
<summary>Method 2:</summary>

```java
public class Example {

    public static void main(String[] args) {
        // Create and run a thread that will perform a blocking operation
        Thread waitingThread = new Thread(() -> {
            try {
                // The thread waits 10 seconds
                System.out.println("Going to sleep");
                Thread.sleep(10000);
                System.out.println("Woke up naturally");
            } catch (InterruptedException e) {
                // If the stream is interrupted during sleep, it will enter here
                System.out.println("Was interrupted while sleeping");
            }
        });
        waitingThread.start();

        // Create and run a thread that performs a non-blocking operation
        Thread countingThread = new Thread(() -> {
            for (int i = 0; i < 1000000 && !Thread.currentThread().isInterrupted(); i++) {
// The thread just increments the counter
                if (i % 100000 == 0) {
                    System.out.println("Counting: " + i);
                }
            }
            System.out.println("Finished counting or was interrupted during counting");
        });
        countingThread.start();

        // Wait 2 seconds and then interrupt both threads
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitingThread.interrupt();
        countingThread.interrupt();
    }
}
```

In this example:

`waitingThread': Instead of using `wait()`, the thread uses `Thread.sleep(10000)`, which is also a
blocking
operation. This thread tries to "sleep" for 10 seconds, but will be interrupted after 2 seconds of execution of the main
thread, which will cause an `InterruptedException'.

`countingThread`: Everything also performs a non-blocking operation, but in order to correctly handle the thread interruption in
this
context, a check is added `!Thread.currentThread().isInterrupted()` into a loop condition. Thus, if the thread
is
interrupted during the execution of the loop, the loop will end and the last output will be executed.

</details>

### Handling `InterruptedException`.

When there is an `InterruptedException` in the method signature, it once again reminds the programmer that this method is blocking.
`InterruptedException` signals that they want to terminate the thread. At the same time, they are not asked to do it
immediately.

The first way to handle an `InterruptedException` is to declare this exception in a higher—level method. Also, when intercepting
the `InterruptedException` method, you can perform some actions (for example, cleaning resources or variables) and re
-throw the `InterruptedException`.

In the second case, when `InterruptedException` cannot be declared, when generating and intercepting `InterruptedException`
flag
`interrupted` is set to `false`, and the calling methods will not see that the thread was interrupted. However
, you can
restore the interrupt flag by calling `Thread.currentThread().interrupt()` when processing the interrupt.

Also, restoring the `interrupted` flag can be useful when the first thread has a reference to the second thread, and the first
one wants to know the status of the second flag.

It is worth carefully monitoring the handling of this exception when the code is executed in the `threadpool'. `InterruptedException`
it may
be "interesting" not only to the code, but also to the thread that executes this code.

<details style="margin-left: 20px;">
<summary>Method 3:</summary>

```java
public class InterruptedExceptionExample {

    public static void main(String[] args) {
        Thread exampleThread = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep for 5 seconds");
                // The thread sleeps for 5 seconds, this is a blocking operation and may cause an InterruptedException
                Thread.sleep(5000);
                System.out.println("Thread woke up");
            } catch (InterruptedException e) {
                // Exception handling logic
                System.out.println("Thread was interrupted during sleep");

                // First processing method: clearing and re-throwing the exception (if allowed)
                // Performing some kind of cleaning
                // cleanUpResources();
                // throw new RuntimeException(e);

                // Second processing method: restoring the interrupt flag
                // The code can continue its execution, but the interrupt flag is restored for further checks
                Thread.currentThread().interrupt();
            }
        });

        exampleThread.start();

        // The main thread sleeps for 2 seconds to be sure that exampleThread has started its execution and "sleeps"
try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupting the exampleThread thread while it is "sleeping"
exampleThread.interrupt();
    }
}

```

Let's analyze the above code:

The first method of processing: In the `catch` block, we can perform the necessary cleanup, for example, close open resources or
clear the data, and then re-throw the exception wrapped in an unchecked exception if we can't declare
`InterruptedException` in the method signature.

The second method of processing: We can restore the interrupt flag by calling `Thread.currentThread().interrupt();` in the block
`catch`. Thus, if this thread continues its execution and checks its interrupt flag in subsequent
operations,
it will know that it was interrupted.

It is important to note that in scenarios with a thread pool, you need to pay special attention to handling `InterruptedException` in order to
avoid situations where pool threads remain in a suspended or incorrect state after an interrupt.

</details>

### Comparison of flow control methods: `sleep()`, `wait()`, and `join()`

| Parameter | `sleep()` | `wait()` | `join()` |
|----------|-----------|----------|----------|
| **Main purpose** | Suspends the current thread for a specified amount of time. | Releases the monitor and puts the thread in a waiting state until another thread calls `notify()`/`notifyAll()`. | Suspends the execution of the current thread until the target thread completes its work. |
| **Sync** | Not required | Required | Not required |
| **Exceptions** | Excites `InterruptedException` | Excites `InterruptedException` | Excites `InterruptedException' |
| **Effect on the object monitor** | Does not release the object monitor if the method is called in the `synchronized` block | Frees the object monitor | Not applicable |

</details>

</details>



----------------------



<details>
<summary>Многопоточность</summary>
<details  style="margin-left: 20px;">
<summary>Многопоточность в Java. Лекция 1. Общие сведения</summary>

# Многопоточность в Java. Общие сведения

## Введение

Один из основных элементов в компьютере — процессор. Он, собственно, и выполняет компьютерные команды, которые
составляют программу. В конце XX и в начале XXI века процессоры в основном были одноядерными. Тактовая частота у каждого
нового процессора была больше, чем у предыдущей модели, за счет этого и возрастала общая производительность систем.
Когда у пользователей обозначилась потребность выполнять одновременно несколько программ на одноядерном процессоре (ядро
которого в каждую конкретную единицу времени может выполнять одну инструкцию), был придуман способ добиться видимости
решения проблемы. Трюк в том, что процессор переключается между выполнением команд из разных программ. Таким образом
достигается видимость, что одноядерный процессор выполняет несколько действий или несколько программ одновременно, или в
рамках одной программы выполняется несколько действий.

Однако производство процессоров достигло технологического предела, когда дальнейшее уменьшение размеров транзисторов и
повышение их тактовой частоты стало невозможно. Тогда производители процессоров, приняли решение об увеличении
количества ядер в одном процессоре, чтобы увеличить производительность систем.

## Краткое описание работы процессора

Рассмотрим на простейшем уровне, как работает процессор. Он состоит из АЛУ (арифметико-логического устройства) —
главного элемента процессора, регистров, шин данных и адреса, а также дешифратора команд.

Изначально АЛУ могло выполнять всего лишь несколько элементарных операций: чтение и запись в память, сложение, сдвиг
вправо, сдвиг влево, логические AND, OR, NOT, XOR. Вычитать АЛУ не умело, вычитание осуществлялось путем сложения в
дополнительном коде, умножение производилось путем сложения и сдвига влево, деление осуществлялось сдвигом вправо и
вычитанием. Позже придумали аппаратные схемы, которые поддерживают эти операции и операции с числами с плавающей
запятой. Самый главный вывод, который нужно сделать: даже самые простейшие операции как, например, сложение или
вычитание двух чисел производится не за одну команду процессора, а за несколько. Следовательно, операция может быть
прервана, и процессор может начать выполнять команды из другой программы. Т. е. операции НЕ АТОМАРНЫЕ, и могут быть
прерваны другими командами.

## Поддержка на уровне операционной системы.

Операционные системы могут решать задачу распределения процессорного времени разными способами. Основные подходы:

1. Простое переключение задач. Когда процессы одновременно загружены в память системы и по таймеру происходит
   переключение между процессами. У процессов нет никаких приоритетов. Преимущества этой системы в том, что в ней могут
   работать программы, которые предназначены для работы в однопоточной среде.

2. Кооперативная многозадачность. Когда следующая задача выполняется, после того как предыдущая явно укажет, что она
   может отдать процессорное время другой задаче. При кооперативной многозадачности приложение может захватить
   фактически столько процессорного времени, сколько оно считает нужным. Все приложения делят процессорное время,
   периодически передавая управление следующей задаче.

3. Вытесняющая многозадачность. Когда операционная система сама передает управление от одной выполняемой программы
   другой в случае завершения операций ввода-вывода, возникновения аппаратных прерываний или же при поступлении тех или
   иных сигналов от одной программы к другой. В этом виде многозадачности процессор может быть переключен с выполнения
   одной программы на другую безо всякого пожелания первой программы, буквально между любыми двумя инструкциями в её
   коде. Распределение процессорного времени осуществляется планировщиком процессов. К тому же, каждой задаче может быть
   назначен пользователем или самой операционной системой определенный приоритет. Этот вид многозадачности обеспечивает
   более быстрый отклик на действия пользователя.

## Процессы и потоки

Введем понятия процесса и потока.

**Процесс** — программа, выполняющаяся в текущий момент времени, и все её элементы: адресное пространство, глобальные
переменные, регистры, потоки, открытые файлы и т. д.

**Поток (thread)** — наименьшая единица обработки, исполнение которой может быть назначено ядром операционной системы.
Или совокупность дискретного процессорного времени, в течение которого выполняются команды, или код, для одной
логической части программы.

Реализация потоков выполнения и процессов в разных операционных системах отличается друг от друга, но в большинстве
случаев поток выполнения находится внутри процесса. Несколько потоков выполнения могут существовать в рамках одного и
того же процесса и совместно использовать ресурсы, такие как память, тогда как процессы не разделяют этих ресурсов.

Потоки выполнения отличаются от процессов:

- процессы, как правило, независимы, тогда как потоки выполнения существуют как составные элементы процессов;
- процессы несут значительно больше информации о программе, тогда как несколько потоков выполнения совместно используют
  эту информацию внутри процесса;
- процессы имеют отдельные адресные пространства, тогда как потоки выполнения совместно используют память процесса;
- переключение между потоками выполнения в одном процессе, как правило, быстрее, чем переключение между процессами.

Когда процессор имеет несколько ядер, код действительно выполняется параллельно на разных ядрах, при этом каждое ядро
выполняет один поток в конкретную единицу времени. При этом два разных ядра не могут выполнять один поток. Наличие
большего количества ядер не гарантирует увеличения скорости выполнения программ. Если программа однопоточная, она будет
выполняться на одном ядре, а остальные ядра в системе заняты не будут. Некоторые языки программирования поддерживают
возможность назначение потока выполнения конкретному ядру процессора. Это называется thread affinity, однако в Java нет
такой возможности.

## Средства для работы с многопоточностью в Java и модели многопоточных программ

В первой версии `Java` инструментов для работы с многопоточностью было немного. Основные средства: класс `Thread`,
интерфейс `Runnable`, ключевое слово `synchronized` и методы для синхронизации `wait()`, `notify()` и `notifyAll()` в
классе `Object`. В версию Java 1.5 уже был включен пакет `java.util.concurrent`, в котором появилось много новых классов
и интерфейсов. Также в версии Java 1.8 добавили класс `CompletableFuture`, который позволяет строить цепочки из
асинхронных задач и комбинировать их.

#### Существуют несколько подходов (моделей) в многопоточном программировании:

- синхронизация, блокировки и ключевое слово volatile;
- транзакционная память — прослойка между JVM и API программы, рекурсивный параллелизм;
- модель акторов — когда каждый объект это поток, который обмениваются сообщениями с другими потоками.

Сейчас процессоры хорошо поддерживают концепцию потоков. Например, akka (фрэймворк для работы с многопоточностью,
портированный на разные языки программирования: Java, Scala, C#) написан на основе потоков и блокировок.

#### Способы организации многопоточности в программах:

- потоки не взаимодействуют друг с другом, работают сами по себе;
- потоки взаимодействуют друг с другом;
- потоки работают сами по себе, а потом собирают данные в единый результат.

## Свойства потоков, запуск потоков, присоединение других потоков

Все методы программы выполняются в каком-либо потоке. Поток, который вызывает метод `main`, является главным потоком
приложения и имеет имя main.

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
Runnable r=new MyRunnable(){()->
        System.out.println(“Hello!”);
        }
```

`r.start();`

### Запуск потоков

Для запуска потока необходимо использовать метод `Thread.start()`. Если вызвать метод `run()`, то он выполнится в
вызывающем потоке:  
`Thread t = new Thread(r);`

`t.run(); //код r выполняется в текущем потоке`  
`t.start(); //код r выполняется в новом потоке`

### Метод `sleep` в потоках Java

Метод `sleep` в классе `Thread` в Java используется для приостановки выполнения текущего потока на определенный
промежуток времени. Этот метод принимает один параметр, который указывает количество миллисекунд, на которые следует
приостановить поток. Есть также перегруженная версия этого метода, которая принимает два параметра: один для миллисекунд
и один для наносекунд. После того как указанный период времени истекает, поток переводится в состояние готовности и
ждет, пока планировщик потоков возобновит его выполнение.

Метод `sleep` может быть очень полезным для контроля времени выполнения в многопоточной среде, например, для создания
задержек между повторениями в цикле или для ожидания изменения внешних условий. Важно отметить, что метод `sleep` не
гарантирует точную задержку до миллисекунды или наносекунды из-за возможных флуктуаций в загрузке системы и времени,
которое требуется планировщику потоков для реактивации потока. Также стоит отметить, что при вызове метода `sleep`,
поток не освобождает заблокированные мониторы, и, следовательно, другие потоки не смогут войти в синхронизированные
блоки или методы, заблокированные этим потоком, пока он спит.

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

Метод `join` в классе `Thread` в Java используется для того, чтобы ожидать завершения выполнения другого потока. Когда
поток вызывает метод `join` на другом потоке, он блокируется и ожидает, пока указанный поток не завершится. Это может
быть полезно в ситуациях, когда один поток зависит от результатов работы другого потока.

Метод `join` имеет три перегрузки:

1. `join()` - ожидает завершения потока неопределенно долго.
2. `join(long millis)` - ожидает завершения потока в течение указанного количества миллисекунд.
3. `join(long millis, int nanos)` - ожидает завершения потока в течение указанного количества миллисекунд и наносекунд.

Если поток, на котором был вызван метод `join`, завершится во время ожидания, метод `join` вернет управление. Если время
ожидания истекет, метод `join` также вернет управление, даже если поток еще не завершен.

Важно отметить, что метод `join` может бросить исключение `InterruptedException`, если текущий поток будет прерван во
время ожидания. Это позволяет потоку отреагировать на прерывание и возможно завершить свою работу раньше времени, если
это необходимо.

В этом примере создается новый поток, который печатает сообщение, затем спит на 2 секунды, и снова печатает сообщение.
Главный поток ожидает завершения нового потока с помощью метода join перед тем, как продолжить выполнение и напечатать "
Main thread proceeding".

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

<details style="margin-left: 20px;">
<summary>Многопоточность в Java. Лекция 2. Остановка и прерывание потоков</summary>

# Многопоточность в Java. Лекция 2. Остановка и прерывание потоков

### Объект Thread. Имена потоков, приоритет потоков

Объект текущего потока можно получить, вызвав статический метод: `Thread.currentThread()`.

Имена потокам можно задавать через метод `setName()` или через параметр конструктора. Рекомендуется давать потокам
осмысленные имена, это пригодится при отладке. Не рекомендуется давать потокам одинаковые имена, хотя имена потоков не
валидируются JVM.

Стандартный формат имен потоков, которые были созданы одиночно — `thread-N`, где `N` порядковый номер потока. Для пула
потоков, стандартное наименование — `pool-N-thread-M`, где `N` обозначает последовательный номер пула (каждый раз, когда
вы создаете новый пул, глобальный счетчик `N` увеличивается), а `M` — порядковый номер потока в пуле.

У потоков есть приоритет, который можно задать целым числом от 1 до 10. Чем больше число, тем выше приоритет потока.
Поток `main` имеет приоритет 5. А приоритет новых потоков равен приоритету потока-родителя, его можно изменить при
помощи метода `setPriority(int)`. Поток с большим приоритетом будет иметь больше процессорного времени на выполнение.
Если два потока имеют одинаковый приоритет, то решение о том, какой из них будет выполняться первым, зависит от
алгоритма планировщика: (Round-Robin, First Come First Serve).

Есть несколько констант для приоритета потоков:

- `Thread.MIN_PRIORITY` — минимальный приоритет, значение 1;
- `Thread.NORM_PRIORITY` — приоритет по умолчанию, значение 5;
- `Thread.MAX_PRIORITY` — максимальный приоритет потока, значение 10

```java
public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setPriority(8);
        Thread thread = new Thread() {
            public void run() {
                Thread.currentThread().setName("My name");
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getPriority());
            }
        };
        thread.start();
    }
}
```

### Потоки-демоны

В Java есть такое понятие, как поток-демон. Работа JVM заканчивается, когда закончил выполняться последний поток
не-демон, несмотря на работающие потоки-демоны. Для работы с этим свойством существуют два метода: `setDaemon()`
и `isDaemon()`.
<details style="margin-left: 20px;">
<summary>Пример кода:</summary>

```java
public class DaemonThreadExample {

    public static void main(String[] args) {
        Thread nonDaemonThread = new Thread(() -> {
            try {
                System.out.println("Non-daemon thread starting work.");
                // Эмулируем долгую работу потока, например, обработку данных
                Thread.sleep(5000); // Ожидаем 5 секунд
                System.out.println("Non-daemon thread finished work.");
            } catch (InterruptedException e) {
                System.err.println("Non-daemon thread was interrupted.");
            }
        });

        Thread daemonThread = new Thread(() -> {
            try {
                System.out.println("Daemon thread starting work.");
                // Эмулируем долгую работу потока
                while (true) {
                    System.out.println("Daemon thread is working...");
                    Thread.sleep(1000); // Ожидаем 1 секунду
                }
            } catch (InterruptedException e) {
                System.err.println("Daemon thread was interrupted.");
            }
        });
        // Устанавливаем поток как демон
        daemonThread.setDaemon(true);

        nonDaemonThread.start();
        daemonThread.start();
    }
}
```

</details>

**Класс `ThreadGroup`**.

Все потоки находятся в группах, представленных экземплярами класса `ThreadGroup`. Группа указывается при создании
потока. Если группа не была указана, то поток помещается в ту же группу, в которой находится поток-родитель.
Методы `activeCount()` и `enumerate()` возвращают, соответственно, количество и полный список всех активных потоков в
группе.
<details style="margin-left: 20px;">
<summary>Пример кода:</summary>

```java
public class ThreadGroupExample {

    public static void main(String[] args) {

        // Создание новой группы потоков
        ThreadGroup myGroup = new ThreadGroup("MyThreadGroup");

        // Создание потоков и помещение их в группу
        Thread thread1 = new Thread(myGroup, createRunnable(), "Thread1");
        Thread thread2 = new Thread(myGroup, createRunnable(), "Thread2");
        Thread thread3 = new Thread(myGroup, createRunnable(), "Thread3");

        // Запуск потоков
        thread1.start();
        thread2.start();
        thread3.start();

        // Использование метода activeCount() для получения количества активных потоков в группе
        System.out.println("Active threads in thread group " + myGroup.getName() + ": " + myGroup.activeCount());

        // Использование метода enumerate() для получения всех активных потоков в группе
        Thread[] threads = new Thread[myGroup.activeCount()];
        myGroup.enumerate(threads);
        System.out.println("List of threads:");
        for (Thread thread : threads) {
            System.out.println(thread.getName());
        }
    }

    private static Runnable createRunnable() {
        return () -> {
            try {
                // Поток выполняется в течение 2 секунд
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }
}

```

</details>


**Способы приостановления выполнения потока** на указанное количество времени: `Thread.sleep(long millis)`
и `TimeUnit.<UNIT>.sleep(long timeout)`. Они приостанавливают выполнение текущего потока на указанный период времени.
Вызов методов требует обработки исключения `InterruptedException`.

<details style="margin-left: 20px;">
<summary>Пример кода:</summary>

```java
import java.util.concurrent.TimeUnit;

public class SleepExample {

    public static void main(String[] args) {
        // Создаем и запускаем поток, используя Thread.sleep() для приостановки
        Thread thread1 = new Thread(createSleepRunnable("Thread1", 2000));
        thread1.start();

        // Создаем и запускаем поток, используя TimeUnit.SECONDS.sleep() для приостановки
        Thread thread2 = new Thread(createTimeUnitSleepRunnable("Thread2", 3));
        thread2.start();
    }

    // Метод, создающий Runnable, использующий Thread.sleep() для приостановки
    private static Runnable createSleepRunnable(String threadName, int sleepTimeMillis) {
        return () -> {
            System.out.println(threadName + " started");
            try {
                // Приостановка потока на sleepTimeMillis миллисекунд
                Thread.sleep(sleepTimeMillis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " woke up and finished");
        };
    }

    // Метод, создающий Runnable, использующий TimeUnit.SECONDS.sleep() для приостановки
    private static Runnable createTimeUnitSleepRunnable(String threadName, int sleepTimeSeconds) {
        return () -> {
            System.out.println(threadName + " started");
            try {
                // Приостановка потока на sleepTimeSeconds секунд
                TimeUnit.SECONDS.sleep(sleepTimeSeconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " woke up and finished");
        };
    }
}

```

</details>

Нестатический метод `join()` позволяет одному потоку дождаться выполнения другого. Если текущий поток `t1` вызывает у
другого потока `t2h2t2.join()`, то поток th2 останавливается до тех пор, пока поток `t2` не завершит свою работу.
Вызвать метод `join()` можно также и с аргументом, указывающим лимит времени ожидания (в миллисекундах или в
миллисекундах с нано секундами). Если целевой поток `t2` не закончит работу за указанный период времени, метод `join()`
все равно вернет управление инициатору `t1`.

<details style="margin-left: 20px;">
<summary>Пример кода:</summary>

```java
public class JoinExample {

    public static void main(String[] args) {
        // Создаем два потока
        Thread t1 = new Thread(createRunnable("Thread1", 5000));
        Thread t2 = new Thread(createRunnable("Thread2", 2000));

        // Запускаем первый поток
        t1.start();

        // Запускаем второй поток
        t2.start();

        System.out.println("Started both threads");

        try {
            // Поток main будет ждать завершения потока t1 в течение 7000 миллисекунд
            t1.join(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread1 has finished or 7 seconds have passed since we started waiting");

        try {
            // Поток main будет ждать завершения потока t2 без времени ожидания, то есть до его завершения
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread2 has finished");
    }

    private static Runnable createRunnable(String threadName, int sleepTime) {
        return () -> {
            System.out.println(threadName + " started");
            try {
                // Поток спит указанное количество миллисекунд
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " finished");
        };
    }
}
```

</details>

## Остановка и прерывание потоков

Для остановки потока в Java версии 1 использовался метод `stop()`. Однако в версии Java 1.1 этот метод
сделали `deprecated` (устаревший), потому что использование метода `stop()` не гарантирует корректного завершения работы
потока и стабильной работы программы в целом. Поэтому при написании программ использовать его настоятельно не
рекомендуется.

Вместо метода `stop()` следует использовать метод `interrupt()`. В отличие от метода `stop()`, который принудительно
останавливал поток, метод `interrupt()` предлагает потоку остановить свое выполнение путем установки флага `interrupted`
в `true` внутри потока. Этот флаг отображает статус прерывания и имеет начальное значение `false`. Когда поток
прерывается другим потоком, происходит одно из двух:

- Если поток ожидает выполнения прерываемого метода блокирования, таких как `Thread.sleep()`, `Thread.join()`
  или `Object.wait()`, то ожидание прерывается и метод генерирует `InterruptedException`. Флаг `interrupted`
  устанавливается в `false`.
- Флаг `interrupted` устанавливается в `true`.

Есть три метода для работы с прерыванием потока:
<details style="margin-left: 20px;">
<summary>Метод 1:</summary>

```java
public class Thread {
    public void interrupt() { ...}

    public boolean isInterrupted() { ...}

    public static boolean interrupted() { ...}
...
}
```

```java
public class InterruptExample {

    public static void main(String[] args) {
        // Создаем и запускаем поток, который может быть прерван
        Thread sleepingThread = new Thread(createSleepingRunnable());
        sleepingThread.start();

        // Ждем 2 секунды и затем прерываем sleepingThread
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepingThread.interrupt();
    }

    // Метод, создающий Runnable, который "спит" и обрабатывает прерывание
    private static Runnable createSleepingRunnable() {
        return () -> {
            try {
                // Поток "спит" 10 секунд или до тех пор, пока его не прервут
                System.out.println("Going to sleep");
                Thread.sleep(10000);
                System.out.println("Woke up naturally");
            } catch (InterruptedException e) {
                // Если поток был прерван во время сна, он войдет сюда
                System.out.println("Was interrupted while sleeping");
            }
        };
    }
}

```

</details>

- `isInterrupted()` возвращает значение флага и не изменяет его.
- `interrupted()` возвращает значение флага и устанавливает его значение в false. Если флаг interrupted установлен в
  true и вызывается этот метод, то первый раз метод вернет true, а последующие вызовы вернут false.

Существуют два вида операций: блокирующие и неблокирующие. Неблокирующие операции не приостанавливают выполнения потока.
К блокирующим операциям можно отнести вызовы методов `sleep()`, `wait()`, `join()` и, например, некоторые методы класса
`Socket`. Если поток был прерван, пока он выполнял неблокирующие вычисления, они не будут прерваны незамедлительно.
Однако
поток уже отмечен как прерванный, поэтому любая следующая блокирующая операция немедленно прервется и выбросит
`InterruptedException`.

<details style="margin-left: 20px;">
<summary>Метод 2:</summary>

```java
public class Example {

    public static void main(String[] args) {
        // Создаем и запускаем поток, который будет выполнять блокирующую операцию
        Thread waitingThread = new Thread(() -> {
            try {
                // Поток ожидает 10 секунд
                System.out.println("Going to sleep");
                Thread.sleep(10000);
                System.out.println("Woke up naturally");
            } catch (InterruptedException e) {
                // Если поток прерван во время сна, он войдет сюда
                System.out.println("Was interrupted while sleeping");
            }
        });
        waitingThread.start();

        // Создаем и запускаем поток, который выполняет неблокирующую операцию
        Thread countingThread = new Thread(() -> {
            for (int i = 0; i < 1000000 && !Thread.currentThread().isInterrupted(); i++) {
                // Поток просто увеличивает счетчик
                if (i % 100000 == 0) {
                    System.out.println("Counting: " + i);
                }
            }
            System.out.println("Finished counting or was interrupted during counting");
        });
        countingThread.start();

        // Ждем 2 секунды и затем прерываем оба потока
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitingThread.interrupt();
        countingThread.interrupt();
    }
}
```

В этом примере:

`waitingThread`: Вместо использования `wait()`, поток использует `Thread.sleep(10000)`, который также является
блокирующей
операцией. Этот поток пытается "спать" в течение 10 секунд, но будет прерван через 2 секунды выполнения основного
потока, что вызовет `InterruptedException`.

`countingThread`: Всё также выполняет неблокирующую операцию, но, чтобы корректно обработать прерывание потока и в
данном
контексте, добавляется проверка `!Thread.currentThread().isInterrupted()` в условие цикла. Таким образом, если поток
будет
прерван во время выполнения цикла, цикл завершится, и последний вывод будет выполнен.

</details>

Обработка InterruptedException.

Когда в сигнатуре метода есть `InterruptedException`, это еще раз напоминает программисту, что этот метод блокирующий.
`InterruptedException` сигнализирует о том, что работу потока хотят завершить. При этом не просят сделать это
немедленно.

Первый способ обработки `InterruptedException` — объявление этого исключения в вышестоящем методе. Также при перехвате
метода `InterruptedException` можно произвести какие-то действия (например, очистку ресурсов или переменных) и повторно
пробросить `InterruptedException`.

Во втором случае, когда `InterruptedException` объявить невозможно, при генерации и перехвате `InterruptedException`
флаг
`interrupted` устанавливается в `false`, и вызывающие методы не увидят, что было совершено прерывание потока. Однако
можно
восстановить флаг прерывания, вызвав `Thread.currentThread().interrupt()` при обработке прерывания.

Также восстановление флага `interrupted` может быть полезным, когда первый поток имеет ссылку на второй поток, и первый
хочет узнать состояние флага второго.

Стоит внимательно следить за обработкой этого исключения когда код выполняется в `threadpool`. `InterruptedException`
может
быть «интересен» не только коду, но и потоку, который выполняет этот код.

<details style="margin-left: 20px;">
<summary>Метод 3:</summary>

```java
public class InterruptedExceptionExample {

    public static void main(String[] args) {
        Thread exampleThread = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep for 5 seconds");
                // Поток спит 5 секунд, это блокирующая операция и может вызвать InterruptedException
                Thread.sleep(5000);
                System.out.println("Thread woke up");
            } catch (InterruptedException e) {
                // Логика обработки исключения
                System.out.println("Thread was interrupted during sleep");

                // Первый способ обработки: очистка и повторное пробрасывание исключения (если это допустимо)
                // Выполняем какую-то очистку
                // cleanUpResources();
                // throw new RuntimeException(e);

                // Второй способ обработки: восстановление флага прерывания
                // Код может продолжать свое выполнение, но флаг прерывания восстанавливается для дальнейших проверок
                Thread.currentThread().interrupt();
            }
        });

        exampleThread.start();

        // Основной поток спит 2 секунды, чтобы быть уверенным, что exampleThread начал свое выполнение и "спит"
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Прерываем поток exampleThread, пока он "спит"
        exampleThread.interrupt();
    }
}
```

Давайте разберем приведенный выше код:

Первый способ обработки: В блоке `catch` мы можем выполнить необходимую очистку, например, закрыть открытые ресурсы или
очистить данные, и затем повторно бросить исключение, обернутое в непроверяемое исключение, если не можем объявить
`InterruptedException` в сигнатуре метода.

Второй способ обработки: Мы можем восстановить флаг прерывания, вызвав `Thread.currentThread().interrupt();` в блоке
`catch`. Таким образом, если этот поток продолжит свое выполнение и проверит свой флаг прерывания в последующих
операциях,
он узнает, что был прерван.

Важно отметить, что в сценариях с пулом потоков нужно уделять особое внимание обработке `InterruptedException`, чтобы
избежать ситуаций, когда потоки пула остаются в подвешенном или неправильном состоянии после прерывания.

</details>


### Сравнение методов управления потоками: `sleep()`, `wait()`, и `join()`

| Параметр | `sleep()` | `wait()` | `join()` |
|----------|-----------|----------|----------|
| **Основное назначение** | Приостанавливает текущий поток на заданное количество времени. | Освобождает монитор и переводит поток в состояние ожидания до тех пор, пока другой поток не вызовет `notify()`/`notifyAll()`. | Приостанавливает выполнение текущего потока до тех пор, пока целевой поток не завершит свою работу. |
| **Синхронизация** | Не требуется | Требуется | Не требуется |
| **Исключения** | Возбуждает `InterruptedException` | Возбуждает `InterruptedException` | Возбуждает `InterruptedException` |
| **Влияние на монитор объекта** | Не освобождает монитор объекта, если метод вызван в блоке `synchronized` | Освобождает монитор объекта | Не применимо |
| **Управление** | Не предоставляет механизмов уведомлений от других потоков | Может быть возобновлен досрочно через `notify()`/`notifyAll()` другим потоком | Нельзя прервать, пока целевой поток не завершит выполнение (за исключением `interrupt()`) |
| **Применение** | Используется для временной приостановки выполнения | Используется для реализации сценариев по производителю-потребителю | Используется, чтобы дождаться завершения работы другого потока |

#### Примечания
- Метод `sleep()` является статическим и всегда вызывает приостановку текущего потока.
- Метод `wait()` требует, чтобы поток держал монитор объекта (обычно через блок `synchronized`), на котором он вызывается.
- Метод `join()` вызывается на экземпляре потока, выполнение которого мы хотим дождаться.


</details>


</details>

