<details>
<summary>OOP. Object-oriented programming</summary>

<details style="margin-left: 20px;">
<summary>Principles of OOP.</summary>

## Fundamentals of Object-oriented Programming (OOP)

### Introduction

OOP is a programming paradigm that uses "objects" to model data and functionality. OOP
allows you to simplify the structure of the program and make the code more reusable and easy to test and debug.

#### Why do I need OOP?

- **Modularity**: OOP allows you to break a complex task into simpler parts.
- **Code Reuse**: Objects and classes can be used in various projects.
- **Ease of support**: Changes in one class do not require massive changes in other classes.

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>

OOP can be compared to building a house. Typical blocks (classes), such as bricks (
objects), are used for construction. Each brick (object) has its own properties (fields) and can perform certain functions (methods). Different
rooms (modules) are built from these bricks and combined into one house (program).
</details>

---

### Encapsulation

#### General concepts

Encapsulation is an OOP mechanism that combines data (fields) and methods for working with this data into a single structure
— object. Encapsulation allows you to hide the details of the implementation and open only the necessary interface for interacting with
the object.

#### Why is encapsulation needed?

- **Security**: Hiding implementation details prevents unauthorized access to data.
- **Modularity**: Encapsulation makes the system more manageable and the individual parts less dependent on each other.

<details style="margin-left: 20px;">
<summary>Task 1:</summary>

Create a `Person` class in which the `password` field will be hidden and there will be an available method for changing the password.
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>

Encapsulation in OOP is similar to using a safe in a hotel. You have important things (data) that you want to protect.
The safe (class) has certain functions, such as 'open' and 'close' (methods), and only you know the code from the safe (
encapsulation). The rest of the hotel guests and even the staff do not need to know what things you have there and what is the code for the safe.
</details>

---

### Inheritance

#### General concepts

Inheritance is an OOP mechanism that allows you to create a new class based on an existing one (parent).
The new class inherits the fields and methods of the parent class.

#### Why is inheritance necessary?

- **Avoiding code duplication**: Reuse of existing code.
- **Extensibility**: It is convenient to add new functionality by modifying only the parent or child class.

<details style="margin-left: 20px;">
<summary>Task 2:</summary>
Create the `Vehicle` class and the `Car` and `Bicycle` classes based on it. Add specific fields and methods to them.
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>

Inheritance in programming is similar to recipes in cooking. You have a basic pancake recipe (parent class), and
you can create pancake recipes based on it with berries, cheese or meat (child classes) by adding or changing
some ingredients or cooking steps.
</details>

---

### Polymorphism

#### General concepts

Polymorphism is the ability of objects with the same specification to have different implementations. In Java, this is done
using redefinition methods and interfaces.

#### Why do we need polymorphism?

- **Flexibility**: The same code can work with objects of different classes.
- **Extensibility**: It is convenient to add new classes without changing existing code.

<details style="margin-left: 20px;">
<summary>Task 3:</summary>

Create a `Drawable` interface that will have a `draw()` method. Implement this interface in the `Circle`
and `Square` classes.
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>

Polymorphism can be compared to a TV remote control. You click the "turn on" button (method), and it doesn't matter what
TV model you have (object class). Different TV models may react to this command in different ways (
polymorphism), but only the result is important to you - the TV turns on.
</details>

---

### Abstraction

#### General concepts

Abstraction in OOP means highlighting the key characteristics of an object and ignoring minor ones. It helps
to focus on what the object is doing rather than how it is doing it.

#### Why do we need abstraction?

- **Reduction of Complexity**: Abstraction helps simplify complex systems by breaking them into smaller parts.
- **Improved efficiency**: Easier to work with simplified models.
- **Code reuse**: General characteristics can be put into abstract classes or interfaces.

<details style="margin-left: 20px;">
<summary>Task 4:</summary>

Create an abstract class `Appliance` with methods `TurnOn()` and `turnOff()'. Based on it, implement
the `WashingMachine` and `Refrigerator` classes.
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>

Abstraction in programming is similar to using a map. A map is an abstract representation of an area that
highlights the most important elements (roads, cities, rivers) and ignores less significant ones (for example, individual trees or
houses). This makes the map convenient for orientation.
</details>
</details>

<details style="margin-left: 20px;">
<summary>Static variables and methods</summary>

# Static variables and methods

### What are static variables and methods?

- Static variables are variables that belong to a class, not its instances (
  objects).
  They are created in a single instance and are shared among all objects of the class.

- Static methods are methods that also belong to a class, not its instances. They can
  work only with static class data and do not have access to non-static data and methods.

<details style="margin-left: 20px;">
<summary>Code example</summary>

```java
public class Calculator {
    static double pi = 3.14159; // static variable

    public static int add(int a, int b) { // static method
        return a + b;
    }

    public double circleArea(double radius) { // non-static method
        return pi * radius * radius;
    }
}
```

</details>

_why is this necessary in programming?_

1. **Shared resources:** Static variables can be used to store data that should be available to all
   instances of the class. For example, a counter of created objects or constants (for example, the value of pi in a calculator).

2. **Utilitarian methods:** Static methods are good when you need to perform some function that does not depend on
   the state of the object. For example, methods in the Math class in Java are Math.sqrt(), Math.sin(), and so on.

3. **Avoiding code duplication:** If some method does not interact with the fields of the object and its behavior is the same
   for everyone
   of course, it is better to make it static. This will make the code cleaner and clearer.

4. **Memory optimization:** Using static variables and methods allows you to optimize memory usage,
   so
   how they are created in a single instance.

Thus, static variables and methods play an important role in structuring code, optimizing resources, and
creating user-friendly programming interfaces.

### How do static variables and methods differ from non-static ones?

1. **Non—static variables** (or instance fields) are variables that belong to a specific class object.
   Each
   new instance of the class gets its own copy of these variables.

2. **Non—static methods** are methods that can interact with instance fields and can be
   overridden in
   subclasses.

<details style="margin-left: 20px;">
<summary>Code example</summary>

```java
public class Dog {
    String name; // non-static variable

    public Dog(String name) {
        this.name = name;
    }

    public void bark() { // non-static method
        System.out.println(name + " says Woof!");
    }

    public static void howManyLegs() { // static method
        System.out.println("A dog has 4 legs.");
    }
}

```

</details>

<details style="margin-left: 20px;">
  <summary><strong><em>Analogies:</em></strong></summary>

**Example 1:**  
**_Static variables and methods:_** Imagine that you have a school. The school has laws (rules) that
are the same
for
all students. These laws do not change depending on a particular student. It's like static variables and methods —
they are the same for all objects (students).

**_nestatic variables and methods:_** Each student has their own characteristics: name, age, favorite subject, and so
on.
It's like non—static variables - each object has its own.

**Example 2:**
**_Static variables and methods_** can be compared to general rules or resources in the gym. For example, the rules
of behavior
in the hall are the same for everyone, regardless of who came. Or balls for playing basketball: they are common, everyone can
take and play.

_**Non-static variables and methods**_ are similar to personal things that everyone has their own. Everyone brought their own bottle
of water, their own
headphones and so on. They belong to a specific person and can be different.

</details>

**Key differences**

- **Affiliation:** Static belong to the class, non-static belong to the instance (object).

- **Access:** Static can be called via the class name. Non-static require instantiation for access.

- **Memory:** Static ones are created once and shared between all instances, saving memory. Non-static
  ones are created anew for each new object.

- **Restrictions:** Static methods cannot access non-static variables and methods. Non - static can
  refer to static.

### Why are they needed and in what cases should they be used?

**Static variables:**

- Global access: Sometimes it is necessary to have access to a variable from different parts of the program without creating an instance
  class.
- Saving the state: They can store information that should be shared by all instances of the class.
- Examples: Object counters, constants, settings.

**Static methods:**

- Utilitarian methods: Methods that do not depend on the state of the object and solve common problems.
- Factory methods: Used to create objects with certain initial parameters.
- Examples: `Math.sqrt()`, `Arrays.sort()'.

<details style="margin-left: 20px;">
<summary>Code example</summary>

```java
public class Calculator {
    public static final double PI = 3.14159; // static variable

    public static int add(int a, int b) { // static method
        return a + b;
    }

    public int multiply(int a, int b) { // non-static method
        return a * b;
    }
}

```

In this example, PI is a static variable because the value of π is the same for all instances. 'add()` is
a static method because it does not depend on the state of the instance.
</details>

**_So, when to use?_**

- Use **_static_** elements when they do not depend on the state of the object and should be common to all
  instances.

- Use **_nestatic_** elements when they need to interact with instance fields and/or need to be
  redefined in subclasses.

<details style="margin-left: 20px;">
<summary>Practice:</summary>
<details style="margin-left: 20px;">
<summary>Task 1:</summary>

```java
public class Library {
// Library name
private String libraryName;

    // Library Address
    private String address;

    // Number of books in the library
    private int bookCount;

    // Number of employees in the library
    private int staffCount;

    // Total number of libraries
    private int totalLibraries;

    // Constructor
    public Library(String libraryName, String address, int bookCount, int staffCount) {
        this.libraryName = libraryName;
        this.address = address;
        this.bookCount = bookCount;
        this.staffCount = staffCount;
    }

    // Getters and setters for fields
// ...
}

```

</details>

<details style="margin-left: 20px;">
<summary>Task 2:</summary>

```java
public class Car {
    // Car Brand
    private String brand;

    // Number of doors
    private int doors;

    // Vehicle speed
    private int speed;

    // Total number of cars created
    private int totalCars;

    // Constructor
    public Car(String brand, int doors) {
        this.brand = brand;
        this.doors = doors;
        this.speed = 0;
    }

    // Method for increasing the speed
    public void accelerate(int amount) {
        speed += amount;
    }

    // Method for reducing the speed
    public void decelerate(int amount) {
        speed -= amount;
    }

    // Method for getting the current speed
    public int getSpeed() {
        return speed;
    }

    // Method for getting the total number of cars created 
    public int getTotalCars() {
        return totalCars;
    }

    // Getters and setters for fields
// ...
}


```

</details>

<details style="margin-left: 20px;">
<summary>Task 3:</summary>

```java
public class BankAccount {
// Account ID
private String accountId;

    // Account balance
    private double balance;

    // Interest rate on all accounts 
    private double interestRate;

    // Total number of bank accounts
    private int totalAccounts;

    // Constructor
    public BankAccount(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    // Method for replenishing the balance
public void deposit(double amount) {
this.balance += amount;
}

    // Method for withdrawing funds
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // Method for getting the current balance
public double getBalance() {
return balance;
}

    // Method for setting the interest rate
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    // Method for getting the interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Method for getting the total number of accounts
    public int getTotalAccounts() {
        return totalAccounts;
    }
}

```

</details>
</details>
</details>

<details style="margin-left: 20px;">
<summary>Inheritance</summary>

## What is inheritance?

### Theoretical part

- **Inheritance** is one of the four basic principles of OOP, which allows you to create a new class based
  on an existing one (base/parent).
- The keyword in Java for implementing inheritance is `extends'.
- The subclass inherits the fields and methods of the parent class, while it can expand and modify them.
- `super` is a keyword for accessing elements of the parent class.

<details style="margin-left: 20px;">
<summary>Code example</summary>

```java
// Base class
public class Animal {
public void makeSound() {
System.out.println("Some generic animal sound");
}
}

// Subclass
public class Dog extends Animal {
// Redefining the method
@Override
public void makeSound() {
System.out.println("Woof");
}

    // Dog-specific method
    public void fetch() {
        System.out.println("Fetching...");
    }
}

```

Using
`Animal myAnimal = new Animal();`
`myAnimal.makeSound(); // output: Some generic animal sound`

`Dog myDog = new Dog();`
`myDog.makeSound(); // output: Woof`
`myDog.fetch(); // output: Fetching...`
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>

Imagine that the base class is a common pancake recipe. All pancakes have basic ingredients and
cooking steps (methods). But everyone can add something of their own to the recipe: for example, add berries or chocolate (new fields
and methods in the subclass). Thus, you will have a new recipe, but the basis (base class) will remain unchanged.
</details>

### Using `super`

`super` is a keyword that is used to refer to the methods and fields of the parent class.  
It is often used to call the constructor of the parent class.  
You can use `super` to call a method of the parent class that has been redefined in the subclass.

<details style="margin-left: 20px;">
<summary>Code example</summary>

```java
public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a generic sound");
    }
}
```

```java
public class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name); // calling the constructor of the parent class
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        super.makeSound(); // calling the method of the parent class
        System.out.println(name + " the " + breed + " says woof");
    }
}

```

Explanation:

- **Creating an Object:** Here we create a new myDog object of the `Dog` class and pass it two arguments: the name "Buddy" and
  the breed "
  Beagle".

- **Calling the Parent Constructor:** The constructor of the `Dog` class calls the constructor of the parent `Animal` class via
  key
  the word `super', giving him the name "Buddy". This is necessary in order to correctly initialize the fields of the parent
  class.

- **Method Call:** Then the `makeSound()` method is called for the `myDog` object.

- **The work of super in the Method:** Inside the `makeSound()` method of the `Dog' class, a similar method is first called from
  the parent class
  `Animal` via `super.makeSound()'. This outputs the string "Buddy makes a generic sound".

- **Additional Actions:** After that, in the `makeSound()` method of the `Dog` class, the string "Buddy the Beagle
  says woof" is added,
  which is specific to the `myDog' object.

</details>

<details style="margin-left: 20px;">
  <summary><strong><em>Analogy:</em></strong></summary>
<details style="margin-left: 20px;">
<summary>Example 1:</summary>

Imagine that you have already made pancakes according to the basic recipe (parent class). Now you want
to modify them a bit
by adding chocolate (subclass). The keyword `super` is as if you said, "We'll do everything according to the basic recipe, but
we'll add chocolate."
</details>

<details style="margin-left: 20px;">
<summary>Example 2:</summary>

Imagine you have a basic pizza recipe (this is our parent class `Animal'). This recipe includes
instructions
for making dough, sauce and topping.

Now, let's say you want to make pepperoni pizza (this will be our `Dog` subclass).

Using the basic recipe: First you follow the basic recipe to make the dough and sauce (this is
`super.makeSound()` in our code). This forms the basis of your pizza and preserves the basic characteristics of all pizzas.

Adding unique ingredients: After that, you add pepperoni and possibly additional cheese or spices (this
is a unique implementation of the `makeSound()` method in the 'Dog` class). This makes your pizza unique and different from all
the others.

In this case, the super keyword allows us to "inherit" the basic pizza recipe and then add our unique
ingredients to make it special.

This analogy helps to understand how the super keyword allows us to use an already existing "recipe" (or method)
from the parent class, adding something of our own to it.

</details>
</details>

<details style="margin-left: 20px;">
<summary>Practice:</summary>

<details style="margin-left: 20px;">
<summary>Task 1:</summary>

**Task 1: Cars and Electric Vehicles**
Class `Car`: Create a class `Car` with the fields `make` (make), `model` (model) and the method `StartEngine()`, which outputs
the message "The engine is running".

`ElectricCar` Class: Create an `ElectricCar` class that inherits from `Car'. Add the `BatteryLevel` field.

`StartEngine` method in `ElectricCar`: Redefine the `StartEngine()' method` so that it first calls the parent
method, and
then outputs an additional message "The battery is in use".

```java
public class Car {
    String make;
    String model;

    public void StartEngine() {
System.out.println("Engine started");
    }
}

```

```java
public class ElectricCar extends Car {
    int batteryLevel;

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Battery in use");
    }
}
```

</details>

<details style="margin-left: 20px;">
<summary>Task 2:</summary>

**Task 2: Shapes and Circles**

`Shape` Class: Create a `Shape` class with the `draw()` method, which outputs the message "Draw a shape".

`Circle` Class: Create a `Circle` class that inherits from `Shape'. Add the `radius` field.

`draw` method in `Circle`: Override the `draw()' method` so that it first calls the method of the parent class, and then
outputs the message "This is a circle".

```java
public class Shape {
    public void draw() {
System.out.println("Draw a shape");
    }
}
```

```java
public class Circle extends Shape {
    int radius;

    @Override
    public void draw() {
super.draw();
System.out.println("This is a circle");
    }
}
```

</details>

<details style="margin-left: 20px;">
<summary>Task 3:</summary>

Let's create an example with the `Animal` class and its `Bird` subclass. In this case, not all methods from `Animal` will be
overridden in
`Bird`.

```java
public class Animal {
    public void makeSound() {
System.out.println("Animal makes a sound");
    }

    public void eat() {
System.out.println("Animal eats");
    }
}

```

```java
public class Bird extends Animal {
    @Override
    public void makeSound() {
System.out.println("The bird sings");
    }
}

```

Usage example:

```java
public static void main(String[]args){
        Bird myBird=new Bird();
        myBird.makeSound(); // Output: "Bird sings"
myBird.eat(); // Output: "Animal eats"
}

```

</details>
</details>

## How do interfaces work?

### What is the interface?

- An interface in Java is a schema that provides a system for application development. This is a declaration of methods that
  one or more classes will implement.

### Main Features

- In the interface, all default methods are `public` and `abstract` (with the exception of static and default methods).
- The interface cannot contain fields with state (that is, all fields are `public`, `static`, `final`).

### Types of methods in interfaces

- **Abstract methods**: methods without implementation that must be implemented in the class that implements this
  interface.
- **Default methods**: methods with an implementation that can be overridden in the implementing class.
- **Static methods**: methods with an implementation that cannot be overridden and are called through the interface itself.

### Examples

#### Abstract method in the interface

```java
public interface Flyable {
    void fly();
}

```

```java
public class Bird implements Flyable {
    public void fly() {
System.out.println("The bird is flying");
    }
}

```

#### Default method in the interface

```java
public interface Flyable {
    default void glide() {
System.out.println("Smooth flight");
    }
}
```

```java
public class Bird implements Flyable {
}
```

#### Static method in the interface

```java
public interface Flyable {
    static void altitude() {
System.out.println("Flight altitude not determined");
    }
}
```

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>

1. **Interface as a contract**: Imagine that the interface is like a contract between the builder (class) and the customer (
   other code). If the builder signs the contract, he is obliged to fulfill all the points (methods) specified in it.

2. **Default methods as additional services**: It's as if there were optional services in the builder's contract. They
   are already included, but if the customer wants, the builder can change them.

3. **Static methods as reference information**: It's like a standard instruction or FAQ that you can read without
   signing a contract. It is available to everyone and does not change.

</details>

<details style="margin-left: 20px;">
<summary>Practice:</summary>

<details style="margin-left: 20px;">
<summary>Task 1:</summary>

**Task 1: Flying and Floating objects**

`Flyable` Interface: Create a `Flyable` interface with the `fly()` method that outputs the 'Flying' message.

`Swimmable' Interface: Create a `Swimmable` interface with the `swim()` method that outputs the message "Swimming".

`Airplane` Class: Create an `Airplane` class that implements the `Flyable' interface.

`Duck` Class: Create a `Duck` class that implements the `Flyable` and `Swimmable` interfaces.

```java
public interface Flyable {
    void fly();
}
```

```java
public interface Swimmable {
    void swim();
}
```

```java
public class Airplane implements Flyable {
    public void fly() {
System.out.println("Flying");
    }
}
```

```java
public class Duck implements Flyable, Swimmable {
    public void fly() {
System.out.println("Flying");
    }

    public void swim() {
        System.out.println("Floating");
    }
}
```

</details>

<details style="margin-left: 20px;">
<summary>Task 2:</summary>

**Task 2: Shapes with default methods**

`Drawable` Interface: Create a `Drawable` interface with the default `draw()` method that outputs the message "Draw
a shape".

`Circle` Class: Create a `Circle` class that implements the 'Drawable' interface.

```java
public interface Drawable {
    default void draw() {
System.out.println("Draw a shape");
    }
}
```

```java
public class Circle implements Drawable {
}
```

</details>

<details style="margin-left: 20px;">
<summary>Task 3:</summary>

**Task 3: Static methods in interfaces**

`Calculable` Interface: Create a `Calculable` interface with a static `square(int a)' method that returns
the square of a number.

```java
public interface Calculable {
    static int square(int a) {
        return a * a;
    }
}
```

Usage example:

```java
public static void main(String[]args){
System.out.println(Calculable.square(5)); // Output: 25
}
```

</details>
</details>

## Abstract, static and default methods in interfaces

### Abstract methods

**_abject methods** are methods without implementation. They are declared in interfaces and must be implemented in classes
that implement this interface.

```java
public interface Drawable {
    void draw();
}
```

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>
Imagine that the interface is a menu in a restaurant. An abstract method is a dish that needs to be cooked. Each chef (class) decides for himself exactly how to cook this dish (implement the method).
</details>

### Static methods

Static methods in interfaces cannot be overridden. They belong to the interface itself and are called
directly through it.

```java
public interface Util {
    static int add(int a, int b) {
        return a + b;
    }
}
```

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>
It's as if the restaurant menu already had a ready-made dish that doesn't change. For example, a bottle of water.
</details>

### Default methods

Default methods allow you to set the default implementation of the method directly in the interface. This is useful when you need to add
a new method, but you don't want to break existing implementations.

```java
public interface Drawable {
    default void draw() {
        System.out.println("Drawing a shape");
    }
}
```

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>
It's like an additional sauce to the main dish on the menu. If the chef wants to, he can change the sauce, but if he doesn't want to, it will still be delicious.
</details>

<details style="margin-left: 20px;">
<summary>Practice:</summary>

<details style="margin-left: 20px;">
<summary>Task 1:</summary>

**Task 1: The `Drawable` interface**
Create a `Drawable` interface with an abstract `draw()` method and a default `describe()` method that outputs "This
is a shape".

```java
public interface Drawable {
    void draw();

    default void describe() {
System.out.println("This is a figure");
    }
}
```

</details>

<details style="margin-left: 20px;">
<summary>Task 2:</summary>

**Task 2: Combined `Calculator` interface**

Let's create the `Calculator` interface with:

- Abstract method `divide(int a, int b)` for dividing two numbers
- Using the static method `add(int a, int b)` to add two numbers
- The default method `multiply(int a, int b)' for multiplying two numbers

```java
public interface Calculator {
    int divide(int a, int b);

    static int add(int a, int b) {
        return a + b;
    }

    default int multiply(int a, int b) {
        return a * b;
    }
}
```

Let's create a `SimpleCalculator` class that implements the `Calculator` interface. Implement the `divide()` method so that it
returns the result of division, or outputs an error when dividing by zero.

```java
public class SimpleCalculator implements Calculator {
    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: division by zero");
            return 0;
        }
        return a / b;
    }
}
```

Usage example:

```java
public static void main(String[]args){
        SimpleCalculator calc=new SimpleCalculator();
        System.out.println(calc.divide(10,2)); // Output: 5
System.out.println(calc.multiply(3,4)); // Output: 12
        System.out.println(Calculator.add(5,5)); // Output: 10
}
```

</details>

<details style="margin-left: 20px;">
<summary>Task 3:</summary>

**Task 3: The `TaskManager` interface**

The essence of the interface: Task management. This interface is designed for creating, deleting, changing the status and viewing
all tasks.

Methods:

1. `CreateTask(String name, String description)`: Creates a new task with the specified name and description.
2. `DeleteTask(int id)`: deletes the task by ID.
3. `markAsDone(int id)`: Marks the task as completed by ID.
4. 'getAllTasks()`: Returns a list of all tasks.
5. `getTaskById(int id)`: returns the task by ID.
6. `getTasksByStatus(String status)`: Returns a list of tasks with the specified status.

Your task is to determine which of these methods is better to make static, default or leave abstract.

```java
public interface TaskManager {
    void createTask(String name, String description);

    void deleteTask(int id);

    void markAsDone(int id);

    List<Task> getAllTasks();

    Task getTaskById(int id);

    List<Task> getTasksByStatus(String status);
}
```

<details style="margin-left: 20px;">
<summary>Solution:</summary>

```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface TaskManager {

    // An abstract method, since the creation of a task may depend on a specific implementation.
    void createTask(String name, String description);

    // Abstract method, deleting a task may also depend on the specific implementation.
    void deleteTask(int id);

    // Abstract method, changing the status of a task may depend on a specific mechanism for storing and managing tasks.
    void markAsDone(int id);

    // Abstract method, the sampling logic may depend on the specific implementation.
    List<Task> getAllTasks();

    // Abstract method, task selection by ID may also depend on the specific implementation.
    Task getTaskById(int id);

    // The default method, since its implementation is likely to be the same for all classes implementing this interface.
    default List<Task> getTasksByStatus(String status) {
        return getAllTasks().stream()
                .filter(task -> status.equals(task.getStatus()))
                .collect(Collectors.toList());
    }
}
```

```java
// Class of the task for demonstration.
class Task {
private int id;
private String name;
private String description;
private String status;

    // Getters and setters
// ...
}
```

```java
// Example of TaskManager interface implementation.
class SimpleTaskManager implements TaskManager {
private List<Task> tasks = new ArrayList<>();
private int currentId = 0;

    @Override
    public void createTask(String name, String description) {
        Task task = new Task();
        task.setId(++currentId);
        task.setName(name);
        task.setDescription(description);
        task.setStatus("Not Done");
        tasks.add(task);
    }

    @Override
    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    @Override
    public void markAsDone(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setStatus("Done");
                break;
            }
        }
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    @Override
    public Task getTaskById(int id) {
        return tasks.stream().filter(task -> task.getId() == id).findFirst().orElse(null);
    }
}
```

</details>
</details>
</details>

### Inheritance and extension of classes

1. **Class inheritance** is usually used to create a new class based on an existing one. It's like when you
   you take a standard pancake recipe and add your ingredients to it.

2. **Why are we extending a specific class?** If we need all the functions of the parent class and we want to add our own to them
   , expanding a specific class is a logical step.

### Abstract classes

1. **Abstract classes** are templates designed to be extended. Imagine that you have a drawing
   houses without specific room sizes and without specifying materials.

2. **Why are we extending an abstract class?** When you have a common logic that needs to be implemented in several
   places, but which cannot be fully defined without context, abstract classes become very useful.

### Interfaces

1. **Interfaces** are contracts that oblige classes to perform certain actions. Imagine the interface as a menu
   in the restaurant.

2. **Why do we use interfaces?** If what is important to you is not how something is being done, but what should be done,
   the interfaces are perfect.

### Conclusion

- **Use inheritance and extension of specific classes** when you need to supplement existing
  functionality.

- **Abstract classes are suitable for creating basic templates** that will have many unique implementations.

- **Interfaces are great for defining a common contract** when the implementation can be radically different.

</details>

<details style="margin-left: 20px;">
<summary>Access modifiers `private`, `default', `protected` and `public'</summary>

## Access modifiers in Java

### Introduction

Access modifiers in Java play an important role in managing the visibility of classes, variables, methods, and constructors. They
determine which parts of your code can be accessed from other classes and packages.

### Types of access modifiers

#### Public

This modifier makes a class or class member accessible from anywhere. This is the most "open" type of access.

`public class MyClass { }`

#### Private

Prohibits access to a class member from outside this class.

`private int myVariable;`

#### Protected

Provides access within the same package and also for all subclasses.

`protected void myMethod() { }`

#### Package-private (default)

If no access modifier is specified, the package-private modifier is used. This modifier grants access
only within the same package.

`class MyClass { }`

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>

<details style="margin-left: 20px;">
<summary>Example 1:</summary>

Imagine that your code is a building. `Public` is the entrance to the building, accessible to everyone. `Private' is your own
office, which no one can enter without your permission. `Protected` is the premises accessible to employees and
visitors with passes. `Package-private` is a common room accessible to all employees of the building, but not to visitors.

</details>

<details style="margin-left: 20px;">
<summary>Example 2:</summary>

Imagine that a class is a library, and methods and variables are books and magazines inside.

`public`: It's like an open shelf with books and magazines, accessible to everyone. Anyone can come and get a book.

`private`: It's like a private archive, accessible only to the librarian (class). No one except the librarian can
access these materials.

`protected`: It is like a closed sectional catalog, accessible to a certain group of readers — for example, for students
of a certain faculty (subclasses).

`default' (batch access): It's like a shelf with books, accessible only to club members (classes in the same package).

Thus, the rules of access modifiers help us to regulate "who, what and from where" can take or change in the "
library" of our code.
</details>
</details>

<details style="margin-left: 20px;">
<summary>Practice:</summary>

<details style="margin-left: 20px;">
<summary>Task 1:</summary>

**Task 1:**
Arrange access modifiers according to the logic executed in this part of the code:

### Description of the "Car" class

#### Fields
- `brand' - the brand of the car.
- `model' - car model.
- `year` - year of release.
- `mileage' - mileage in kilometers.
- `isEngineOn' - engine status (on or off).

#### Methods
- `StartEngine()' - starts the engine.
- `stopEngine()' - stops the engine.
- `drive(int distance)` - drives the specified distance, increasing mileage.
- `getDetails()' - outputs information about the machine.
- `service()' - performs car maintenance.

```java
class Car {
    // Car brand
    String brand;
    // Car Model
    String model;
    // Year of release
    int year;
    // Mileage in kilometers
    int mileage;
    // Engine status: on or off
    boolean isEngineOn;

    // Starts the engine
    void startEngine() {
        isEngineOn = true;
    }

    // Stops the engine
    void stopEngine() {
        isEngineOn = false;
    }

    // Drives the specified distance, increases mileage
    void drive(int distance) {
        if (isEngineOn) {
            mileage += distance;
        }
    }

    // Displays information about the machine
    void getDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Is engine on? " + isEngineOn);
    }

    // Performs car maintenance
    void service() {
// Let's say there is some kind of service logic here
    }
}

```

<details style="margin-left: 20px;">
<summary>Solution:</summary>

```java
public class Car {
    // Car brand. It usually doesn't change, so we make it private and final.
    private final String brand;
    
    // Car model. Also, it should not change, we make it private and final.
    private final String model;
    
    // Year of release. Public, but final, since the year of release does not change.
    public final int year;
    
    // Mileage of the car. Private, since it changes only through the methods of the class.
    private int mileage;
    
    // The state of the engine, private to prevent direct change.
    private boolean isEngineOn;

    // Constructor for initializing all fields
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = 0;
        this.isEngineOn = false;
    }
    
    // Public method for starting the engine
    public void startEngine() {
        isEngineOn = true;
    }

    // Public method for stopping the engine
    public void stopEngine() {
        isEngineOn = false;
    }

    // Public method for driving, changes mileage
    public void drive(int distance) {
        if (isEngineOn) {
            mileage += distance;
        }
    }

    // Public method for getting information about the machine
    public String getDetails() {
return brand + " " + model + ", " + year + " year, mileage: " + mileage;
    }

    // Private method for car maintenance, not accessible from outside
    private void service() {
// service logic
    }
}

```
</details>
</details>

<details style="margin-left: 20px;">
<summary>Task 2:</summary>

## Assignment for the "Library" class

### Fields
- `books': A list of books in the library.
- `isOpen': Library status (open or closed).
- `librarianName': The name of the librarian.

### Methods
- `openLibrary()': Opens the library.
- `closeLibrary()`: Closes the library.
- `addBook(String book)`: Adds a book to the list.
- `removeBook(String book)`: Removes a book from the list.
- `listBooks()`: Returns a list of all books in the library.


```java
import java.util.ArrayList;
import java.util.List;

class Library {
    List<String> books;
    boolean isOpen;
    String librarianName;

    void openLibrary() {
        isOpen = true;
    }

    void closeLibrary() {
        isOpen = false;
    }

    void addBook(String book) {
        books.add(book);
    }

    void removeBook(String book) {
        books.remove(book);
    }

    List<String> listBooks() {
        return books;
    }

    // Constructor for initializing the librarian's name and creating an empty list of books.
    Library(String librarianName) {
        this.librarianName = librarianName;
        this.books = new ArrayList<>();
    }
}

```

<details style="margin-left: 20px;">
<summary>Solution:</summary>

```java
import java.util.ArrayList;
import java.util.List;

public class Library {
// We make the list of books private in order to control it through methods.
    private List<String> books;

    // The library's open state is also private.
    private boolean isOpen;

    // The name of the librarian should not change, we make it private and final.
    private final String librarianName;

    // The opening of the library is available to everyone, therefore it is public.
    public void openLibrary() {
        isOpen = true;
    }

    // The closure of the library is also public.
    public void closeLibrary() {
        isOpen = false;
    }

    // Adding a book should be controlled, so the method is public.
    public void addBook(String book) {
        books.add(book);
    }

    // Deleting a book is also public.
    public void removeBook(String book) {
        books.remove(book);
    }

    // The list of books is returned as a copy to prevent it from being changed.
    public List<String> listBooks() {
        return new ArrayList<>(books);
    }

    // Public constructor for creating instances of the class.
    public Library(String librarianName) {
        this.librarianName = librarianName;
        this.books = new ArrayList<>();
    }
}

```
</details>
</details>
</details>
</details> <!-- access modifiers-->

<details style="margin-left: 20px;">
<summary>SOLID Principles</summary>

## SOLID Principles

### Introduction

SOLID is an abbreviation consisting of the first letters of the five basic principles of object—oriented programming and
design. Compliance with these principles makes the program code more understandable, flexible and supported.

### Single Responsibility Principle

- **Description**: Each class should have only one reason to change.
- **Why this is important**: Makes it easier to split the application into parts. Reduces code connectivity.

<details style="margin-left: 20px;">
<summary>Task 1:</summary>

Create a `Report` class that has two responsibilities: generating and printing a report. Then divide it so that
each class has only one responsibility.
</details>

### Open/Closed Principle (The principle of openness/closeness)

- **Description**: Program entities should be open for expansion, but closed for modification.
- **Why it's important**: Simplifies adding new functionality and reduces the risk of breaking existing code.

<details style="margin-left: 20px;">
<summary>Task 2:</summary>

Create a 'Shape` interface with the 'area()` method. Use this interface to create the `Circle` and `Rectangle` classes.
After that, implement a function that takes an array of objects of type `Shape` and calculates the total area.
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>

Imagine that SOLID principles are the foundations of architecture in the construction of a building. If these foundations are strong, then the building
will stand for a long time and confidently. Architects can add new floors or rooms without fear that everything will collapse.
</details>

### Liskov Substitution Principle (Barbara Liskov Substitution Principle)

- **Description**: Objects in the program must be replaceable with instances of their subtypes without changing the correctness
  of the program execution.
- **Why it is important**: Compliance with this principle simplifies the use of polymorphism and increases the flexibility of the system.

<details style="margin-left: 20px;">
<summary>Task 3:</summary>

Create a `Bird` class with the `fly()` method, then implement the `Penguin` and `Eagle` subclasses. Both should inherit `Bird',
but only `Eagle` can fly.
</details>

### Interface Segregation Principle

- **Description**: Clients should not depend on interfaces that they do not use.
- **Why it's important**: Reduces the number of unnecessary dependencies, simplifying the system.

**The main idea:** Classes should not depend on interfaces that they do not use. If the interface is too "heavy"
,
it should be divided into smaller and more specific ones so that classes can depend only on the methods they need.

**Application:** This principle is often used to improve the modularity and reusability of code by creating "
easy"
interfaces that are easy to implement.

<details style="margin-left: 20px;">
<summary>Task 4:</summary>

Create a `Machine` interface with the `print()`, `fax()` and `scan()` methods. Implement the `Printer` and `Photocopier` classes,
which implement only the necessary methods.
</details>

### Dependency Inversion Principle (Dependency Inversion Principle)

- **Description**: Dependency on abstractions. There is no dependence on something specific.
- **Why this is important**: Simplifies dependency management and makes the system more modular.

**The main idea:** High-level modules should not depend on low-level modules. Both types of modules should depend
on
abstractions.

**Application:** This principle helps to invert the direction of dependency in the system, making high-level modules
independent of the implementation details of low-level modules, and thereby simplifies refactoring and testing.

<details style="margin-left: 20px;">
<summary>Task 5:</summary>

Create a `Database` interface with the `read()` and `write()` methods. Use this interface to create
the `MySQLDatabase` and `MongoDatabase' classes.
</details>

### Conclusion

#### What are the SOLID principles used for?

SOLID principles serve as the fundamental "building blocks" of well-designed code. They help to improve
the readability, ease of support and extensibility of the code, while reducing the risk of errors and bugs.

#### When should I stick to SOLID principles?

SOLID principles are most effective in large and complex systems where numerous objects interact with each other.
However, even in small projects, following these principles can be beneficial, especially if they are expected
to scale further.

#### Advantages of using SOLID principles

- **Improved support convenience**: It is easier to read and understand the code, which simplifies its further support.
- **Improved extensibility**: The code becomes more modular, which makes it easier to add new features.
- **Complexity Reduction**: Each class and method does "one thing", and does it well.
- **Improved error tolerance**: Well-designed code is less prone to errors and bugs.
- **Ease of testing**: Modular code is easier to test because its components can be tested in isolation.

<details style="margin-left: 20px;">
<summary><strong><em>Analogy:</em></strong></summary>

The principles of SOLID can be compared with the rules of the road. If everyone follows the rules, traffic goes smoothly and
the risk of accidents is minimal. Similarly, if all parts of the code "play by the rules", the development and support of the program are
much more efficient.
</details>

<details style="margin-left: 20px;">
<summary>The code does not comply with the principles of SOLID:</summary>

```java
import java.util.List;

public class Car {
    private String model;
    private String brand;
    private int year;
    private boolean engineOn;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engineOn = false;
    }

    public void startEngine() {
        engineOn = true;
        System.out.println("Engine is started.");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("Engine is stopped.");
    }

    // This method does too much. It changes the state and deals with the output.
    public void showCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        if (engineOn) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }

    // Method for adding a car to the database (violates SRP and DIP)
public void saveCarToDatabase(List<Car> database) {
        database.add(this);
        System.out.println("Car saved to database.");
    }
}

```

There are several problems in this code:

1. **Single Responsibility Principle (SRP)**: The `Car` class has more than one responsibility. It manages
   the car data and
   saves it to a database.

2. **Open/Closed Principle (OCP)**: If you need to change the way data is saved, the `Car` class will need
   modify.

3. **Liskov Substitution Principle (LSP)**: In this simple example, LSP is not very applicable, but one can imagine that if
   we
   expanding this class, problems may arise.

4. **Interface Segregation Principle (ISP)**: The `Car` class has a `saveCarToDatabase()` method, which is not related to
   main
   responsibility of the class.

5. **Dependency Inversion Principle (DIP)**: The `Car` class depends on a specific list, which makes it dependent on
   a low-level detail.

</details>

<details style="margin-left: 20px;">
<summary>Code conforming to the principles of SOLID:</summary>

1. **Single Responsibility Principle (SRP)**: Divide the responsibilities, allocate the `saveCarToDatabase()` method into a separate
   interface and class.

2. **Open/Closed Principle (OCP)**: Using the interface to save data will allow us to expand
   functionality without changing existing code.

3. **Liskov Substitution Principle (LSP)**: There is nothing to change here yet, but we will remember the principle when expanding
   functionality.

4. **Interface Segregation Principle (ISP)**: We will create an interface only to save data, so as not to violate
   the main functions of the Car class.

5. **Dependency Inversion Principle (DIP)**: The `Car` class will depend on the abstraction, not on a specific class.

```java
import java.util.List;

// Interface for saving a car
interface CarSaver {
    void save(Car car);
}
```

``java
// Implementation of the CarSaver interface
class DatabaseCarSaver implements CarSaver {
private List<Car> database;

    public DatabaseCarSaver(List<Car> database) {
        this.database = database;
    }

    public void save(Car car) {
        database.add(car);
        System.out.println("Car saved to database.");
    }
}

// The Car class now follows the principles of SOLID
public class Car {
private String model;
private String brand;
private int year;
private boolean engineOn;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engineOn = false;
    }

    // Methods related only to the car
    public void startEngine() {
        engineOn = true;
        System.out.println("Engine is started.");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("Engine is stopped.");
    }

    public void showCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        if (engineOn) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }
}
```

``java
// Using
public static void main(String[]args){
List<Car> carDatabase=new ArrayList<>();
        CarSaver carSaver=new DatabaseCarSaver(carDatabase);

        Car myCar=new Car("Model S","Tesla",2020);
        myCar.startEngine();
        myCar.showCarDetails();

        // Saving the car to the database
        carSaver.save(myCar);
        }
```

</details>

<details style="margin-left: 20px;">
<summary>Practice:</summary>

```java
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public void displayTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public void saveTasksToDatabase() {
// Simple simulation of saving data to a database
        System.out.println("Saving tasks to database...");
    }

    public void loadTasksFromDatabase() {
        // Simple simulation of loading data from a database
        System.out.println("Loading tasks from database...");
    }

    public void sendTaskByEmail(String task, String email) {
// Simple simulation of sending a task by email
        System.out.println("Sending task to " + email + ": " + task);
    }
}

```

**Comments on the code**
`addTask`, `removeTask`, `displayTasks`: methods for adding, deleting and displaying tasks.
`saveTasksToDatabase`: A method for saving all tasks to a database.
`loadTasksFromDatabase': method for loading tasks from the database.
`sendTaskByEmail': Method for sending the task by email.

What principles does this code violate? What refactoring would you suggest?

<details style="margin-left: 20px;">
<summary>Solution:</summary>
This code violates several SOLID principles:

- **Single Responsibility Principle:** the class does too many things (manages tasks, works with the database,
  sends emails).
- **Open/Closed Principle:** expanding functionality (for example, adding new ways to save tasks)
  will require
  changing existing code.
- **Dependency Inversion Principle:** the class depends on the specific implementation of saving data and sending
  emails,
  not on abstraction.

First, we will create interfaces for working with the database and sending emails. This will help us apply
Dependency Inversion Principle and Interface Segregation Principle.

```java
interface TaskDatabase {
    void saveTasks(List<String> tasks);

    List<String> loadTasks();
}
```

```java

interface EmailService {
    void sendEmail(String task, String email);
}
```

Now let's rewrite the `TaskManager` class so that it conforms to the SOLID principles.

```java
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks;
    private TaskDatabase database;
    private EmailService emailService;

    public TaskManager(TaskDatabase database, EmailService emailService) {
        this.tasks = new ArrayList<>();
        this.database = database;
        this.emailService = emailService;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public void displayTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public void saveTasks() {
        database.saveTasks(tasks);
    }

    public void loadTasks() {
        this.tasks = database.loadTasks();
    }

    public void sendTaskByEmail(String task, String email) {
        emailService.sendEmail(task, email);
    }
}
```

**Comments on the code**

- **Single Responsibility Principle (SRP):** Now `TaskManager' deals only with task management. Working with the database
  and sending emails are delegated to separate interfaces.

- **Open/Closed Principle (OCP):** The `TaskManager` class is open for expansion (you can add new implementations of `TaskDatabase` and
  `EmailService`), but closed for modification (its code will not need to be changed when adding new functionality).

- **Liskov Substitution Principle (LSP):** This principle does not apply directly here, but the code is written so that new
  implementations of interfaces can be easily substituted for the current ones.

- **Interface Segregation Principle (ISP):** We have created highly specialized interfaces for working with the database and sending
  emails.

- **Dependency Inversion Principle (DIP):** `TaskManager` now depends on abstractions (`TaskDatabase` and `EmailService`), and not on
  specific implementations.
</details>
</details>
</details>
</details> <!-- <url> block-->

---------

<details>
<summary>ООП. Объектно ориентированное программирование</summary>

<details style="margin-left: 20px;">
<summary>Принципы ООП.</summary>

## Основы объектно-ориентированного программирования (ООП)

### Введение

ООП — это парадигма программирования, которая использует "объекты" для моделирования данных и функциональности. ООП
позволяет упростить структуру программы и сделать код более переиспользуемым и легким для тестирования и отладки.

#### Зачем нужно ООП?

- **Модульность**: ООП позволяет разбить сложную задачу на более простые части.
- **Переиспользование кода**: Объекты и классы могут быть использованы в различных проектах.
- **Легкость в поддержке**: Изменения в одном классе не требуют массовых изменений в других классах.

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>

ООП можно сравнить с построением дома. Для строительства используются типовые блоки (классы), такие как кирпичи (
объекты). Каждый кирпич (объект) имеет свои свойства (поля) и может выполнять определенные функции (методы). Разные
комнаты (модули) строятся из этих кирпичей и объединяются в один дом (программа).
</details>

---

### Инкапсуляция

#### Общие понятия

Инкапсуляция — это механизм ООП, который объединяет данные (поля) и методы для работы с этими данными в единую структуру
— объект. Инкапсуляция позволяет скрыть детали реализации и открыть только нужный интерфейс для взаимодействия с
объектом.

#### Зачем нужна инкапсуляция?

- **Безопасность**: Скрытие деталей реализации предотвращает несанкционированный доступ к данным.
- **Модульность**: Инкапсуляция делает систему более управляемой и отдельные части — менее зависимыми друг от друга.

<details style="margin-left: 20px;">
<summary>Задание 1:</summary>

Создать класс `Person`, в котором будет скрыто поле `password` и будет доступный метод для изменения пароля.
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>

Инкапсуляция в ООП похожа на использование сейфа в отеле. У вас есть важные вещи (данные), которые вы хотите защитить.
Сейф (класс) имеет определенные функции, такие как 'открыть' и 'закрыть' (методы), и только вы знаете код от сейфа (
инкапсуляция). Остальным гостям отеля и даже персоналу не нужно знать, какие у вас там вещи и какой код от сейфа.
</details>

---

### Наследование

#### Общие понятия

Наследование — это механизм ООП, который позволяет создавать новый класс на основе уже существующего (родительского).
Новый класс наследует поля и методы родительского класса.

#### Зачем нужно наследование?

- **Избежание дублирования кода**: Переиспользование уже существующего кода.
- **Расширяемость**: Удобно добавлять новые функциональности, модифицируя только родительский или дочерний класс.

<details style="margin-left: 20px;">
<summary>Задание 2:</summary>
Создать класс `Vehicle` и на его основе классы `Car` и `Bicycle`. Добавить в них специфичные поля и методы.
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>

Наследование в программировании похоже на рецепты в кулинарии. У вас есть базовый рецепт блинов (родительский класс), и
вы можете создать на его основе рецепты блинов с ягодами, сыром или мясом (дочерние классы), добавляя или изменяя
некоторые ингредиенты или шаги приготовления.
</details>

---

### Полиморфизм

#### Общие понятия

Полиморфизм — это способность объектов с одинаковой спецификацией иметь различные реализации. В Java это осуществляется
с помощью методов переопределения и интерфейсов.

#### Зачем нужен полиморфизм?

- **Гибкость**: Один и тот же код может работать с объектами разных классов.
- **Расширяемость**: Удобно добавлять новые классы, не изменяя существующий код.

<details style="margin-left: 20px;">
<summary>Задание 3:</summary>

Создать интерфейс `Drawable`, который будет иметь метод `draw()`. Реализовать этот интерфейс в классах `Circle`
и `Square`.
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>

Полиморфизм можно сравнить с пультом управления телевизором. Вы нажимаете кнопку "включить" (метод), и не важно, какая у
вас модель телевизора (класс объекта). Разные модели телевизоров могут реагировать на эту команду по-разному (
полиморфизм), но для вас важен только результат — телевизор включается.
</details>

---

### Абстракция

#### Общие понятия

Абстракция в ООП означает выделение ключевых характеристик объекта и игнорирование незначительных. Это помогает
сосредоточиться на том, что делает объект, а не на том, как он это делает.

#### Зачем нужна абстракция?

- **Сокращение сложности**: Абстракция помогает упростить сложные системы, разбивая их на более мелкие части.
- **Повышение эффективности**: Легче работать с упрощенными моделями.
- **Повторное использование кода**: Общие характеристики можно вынести в абстрактные классы или интерфейсы.

<details style="margin-left: 20px;">
<summary>Задание 4:</summary>

Создать абстрактный класс `Appliance` с методами `turnOn()` и `turnOff()`. На его основе реализовать
классы `WashingMachine` и `Refrigerator`.
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>

Абстракция в программировании похожа на использование карты. Карта — это абстрактное представление местности, которое
выделяет наиболее важные элементы (дороги, города, реки) и игнорирует менее значимые (например, отдельные деревья или
дома). Это делает карту удобной для ориентации.
</details>
</details>

<details style="margin-left: 20px;">
<summary>Модификаторы доступа `private`, `default`, `protected` и `public`</summary>

## Модификаторы доступа в Java

### Введение

Модификаторы доступа в Java играют важную роль в управлении видимостью классов, переменных, методов и конструкторов. Они
определяют, какие части вашего кода могут быть доступны из других классов и пакетов.

### Типы модификаторов доступа

#### Public

Этот модификатор делает класс или член класса доступным из любого места. Это наиболее "открытый" тип доступа.

`public class MyClass { }`

#### Private

Запрещает доступ к члену класса извне этого класса.

`private int myVariable;`

#### Protected

Предоставляет доступ в пределах того же пакета и также для всех подклассов.

`protected void myMethod() { }`

#### Package-private (default)

Если модификатор доступа не указан, используется модификатор package-private. Этот модификатор предоставляет доступ
только в пределах того же пакета.

`class MyClass { }`

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>

<details style="margin-left: 20px;">
<summary>Пример 1:</summary>

Представьте, что ваш код — это здание. `Public` это вход в здание, доступный всем. `Private` — это ваш собственный
кабинет, в который никто не может войти без вашего разрешения. `Protected` — это помещения, доступные сотрудникам и
посетителям с пропусками. `Package-private` — это общие помещения, доступные всем сотрудникам здания, но не посетителям.

</details>

<details style="margin-left: 20px;">
<summary>Пример 2:</summary>

Представь, что класс — это библиотека, а методы и переменные — это книги и журналы внутри.

`public`: Это как открытая полка с книгами и журналами, доступная для всех. Любой может прийти и взять книгу.

`private`: Это как закрытый архив, доступный только библиотекарю (классу). Никто, кроме библиотекаря, не может получить
доступ к этим материалам.

`protected`: Это как закрытый секционный каталог, доступный для определенной группы читателей — например, для студентов
определенного факультета (подклассов).

`default` (пакетный доступ): Это как полка с книгами, доступная только для членов клуба (классов в том же пакете).

Таким образом, правила модификаторов доступа помогают нам регулировать "кто, что и откуда" может брать или изменять в "
библиотеке" нашего кода.
</details>
</details>

<details style="margin-left: 20px;">
<summary>Практика:</summary>

<details style="margin-left: 20px;">
<summary>Задание 1:</summary>

**Задание 1:**
Расставить модификаторы доступа, согласно логике выполняемой в этой части кода:

### Описание класса "Автомобиль"

#### Поля
- `brand` - марка автомобиля.
- `model` - модель автомобиля.
- `year` - год выпуска.
- `mileage` - пробег в километрах.
- `isEngineOn` - состояние двигателя (включен или выключен).

#### Методы
- `startEngine()` - запускает двигатель.
- `stopEngine()` - останавливает двигатель.
- `drive(int distance)` - проезжает заданное расстояние, увеличивая пробег.
- `getDetails()` - выводит информацию о машине.
- `service()` - выполняет обслуживание автомобиля.

```java
class Car {
    // Марка автомобиля
    String brand;
    // Модель автомобиля
    String model;
    // Год выпуска
    int year;
    // Пробег в километрах
    int mileage;
    // Состояние двигателя: включен или выключен
    boolean isEngineOn;

    // Запускает двигатель
    void startEngine() {
        isEngineOn = true;
    }

    // Останавливает двигатель
    void stopEngine() {
        isEngineOn = false;
    }

    // Проезжает заданное расстояние, увеличивает пробег
    void drive(int distance) {
        if (isEngineOn) {
            mileage += distance;
        }
    }

    // Выводит информацию о машине
    void getDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Is engine on? " + isEngineOn);
    }

    // Выполняет обслуживание автомобиля
    void service() {
        // Допустим, здесь какая-то логика обслуживания
    }
}

```

<details style="margin-left: 20px;">
<summary>Решение:</summary>

```java
public class Car {
    // Марка автомобиля. Обычно не меняется, поэтому делаем его приватным и финальным.
    private final String brand;
    
    // Модель автомобиля. Также не должна меняться, делаем приватным и финальным.
    private final String model;
    
    // Год выпуска. Публичный, но финальный, так как год выпуска не изменяется.
    public final int year;
    
    // Пробег автомобиля. Приватный, так как изменяется только через методы класса.
    private int mileage;
    
    // Состояние двигателя, приватное для предотвращения непосредственного изменения.
    private boolean isEngineOn;

    // Конструктор для инициализации всех полей
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = 0;
        this.isEngineOn = false;
    }
    
    // Публичный метод для запуска двигателя
    public void startEngine() {
        isEngineOn = true;
    }

    // Публичный метод для остановки двигателя
    public void stopEngine() {
        isEngineOn = false;
    }

    // Публичный метод для езды, изменяет пробег
    public void drive(int distance) {
        if (isEngineOn) {
            mileage += distance;
        }
    }

    // Публичный метод для получения информации о машине
    public String getDetails() {
        return brand + " " + model + ", " + year + " год, пробег: " + mileage;
    }

    // Приватный метод для обслуживания автомобиля, недоступен извне
    private void service() {
        // логика обслуживания
    }
}

```
</details>
</details>

<details style="margin-left: 20px;">
<summary>Задание 2:</summary>

## Задание на класс "Библиотека"

### Поля
- `books`: Список книг в библиотеке.
- `isOpen`: Состояние библиотеки (открыта или закрыта).
- `librarianName`: Имя библиотекаря.

### Методы
- `openLibrary()`: Открывает библиотеку.
- `closeLibrary()`: Закрывает библиотеку.
- `addBook(String book)`: Добавляет книгу в список.
- `removeBook(String book)`: Удаляет книгу из списка.
- `listBooks()`: Возвращает список всех книг в библиотеке.


```java
import java.util.ArrayList;
import java.util.List;

class Library {
    List<String> books;
    boolean isOpen;
    String librarianName;

    void openLibrary() {
        isOpen = true;
    }

    void closeLibrary() {
        isOpen = false;
    }

    void addBook(String book) {
        books.add(book);
    }

    void removeBook(String book) {
        books.remove(book);
    }

    List<String> listBooks() {
        return books;
    }

    // Конструктор для инициализации имени библиотекаря и создания пустого списка книг.
    Library(String librarianName) {
        this.librarianName = librarianName;
        this.books = new ArrayList<>();
    }
}

```

<details style="margin-left: 20px;">
<summary>Решение:</summary>

```java
import java.util.ArrayList;
import java.util.List;

public class Library {
    // Список книг делаем приватным, чтобы контролировать его через методы.
    private List<String> books;

    // Состояние открытия библиотеки также приватное.
    private boolean isOpen;

    // Имя библиотекаря не должно меняться, делаем его приватным и финальным.
    private final String librarianName;

    // Открытие библиотеки доступно всем, поэтому публичное.
    public void openLibrary() {
        isOpen = true;
    }

    // Закрытие библиотеки тоже публичное.
    public void closeLibrary() {
        isOpen = false;
    }

    // Добавление книги должно быть контролируемым, поэтому метод публичный.
    public void addBook(String book) {
        books.add(book);
    }

    // Удаление книги тоже публичное.
    public void removeBook(String book) {
        books.remove(book);
    }

    // Список книг возвращается как копия, чтобы предотвратить его изменение.
    public List<String> listBooks() {
        return new ArrayList<>(books);
    }

    // Конструктор публичный для создания экземпляров класса.
    public Library(String librarianName) {
        this.librarianName = librarianName;
        this.books = new ArrayList<>();
    }
}

```
</details>
</details>
</details>
</details> <!-- модификаторы доступа-->

<details style="margin-left: 20px;">
<summary>Статические переменные и методы</summary>

# Статические переменные и методы

### Что такое статические переменные и методы?

- Статические переменные (static variables) — это переменные, которые принадлежат классу, а не его экземплярам (
  объектам).
  Они создаются в единственном экземпляре и разделяются между всеми объектами класса.

- Статические методы (static methods) — это методы, которые также принадлежат классу, а не его экземплярам. Они могут
  работать только со статическими данными класса и не имеют доступа к нестатическим данным и методам.

<details style="margin-left: 20px;">
<summary>Пример кода</summary>

```java
public class Calculator {
    static double pi = 3.14159; // статическая переменная

    public static int add(int a, int b) { // статический метод
        return a + b;
    }

    public double circleArea(double radius) { // нестатический метод
        return pi * radius * radius;
    }
}
```

</details>

_Зачем это нужно в программировании?_

1. **Общие ресурсы:** Статические переменные могут использоваться для хранения данных, которые должны быть доступны всем
   экземплярам класса. Например, счётчик созданных объектов или константы (например, значение pi в калькуляторе).

2. **Утилитарные методы:** Статические методы хороши, когда вам нужно выполнить какую-то функцию, которая не зависит от
   состояния объекта. Например, методы в классе Math в Java — Math.sqrt(), Math.sin(), и так далее.

3. **Избегание дублирования кода:** Если какой-то метод не взаимодействует с полями объекта и его поведение одинаково
   для всех
   экземпляров, его лучше сделать статическим. Это сделает код более чистым и понятным.

4. **Оптимизация памяти:** Использование статических переменных и методов позволяет оптимизировать использование памяти,
   так
   как они создаются в единственном экземпляре.

Таким образом, статические переменные и методы играют важную роль в структурировании кода, оптимизации ресурсов и
создании удобных программных интерфейсов.

### Как статические переменные и методы отличаются от нестатических?

1. **Нестатические переменные** (или поля экземпляра) — это переменные, которые принадлежат конкретному объекту класса.
   Каждый
   новый экземпляр класса получает свою копию этих переменных.

2. **Нестатические методы** — это методы, которые могут взаимодействовать с полями экземпляра и могут быть
   переопределены в
   подклассах.

<details style="margin-left: 20px;">
<summary>Пример кода</summary>

```java
public class Dog {
    String name;  // нестатическая переменная

    public Dog(String name) {
        this.name = name;
    }

    public void bark() { // нестатический метод
        System.out.println(name + " says Woof!");
    }

    public static void howManyLegs() { // статический метод
        System.out.println("A dog has 4 legs.");
    }
}

```

</details>

<details style="margin-left: 20px;">
  <summary><strong><em>Аналогии:</em></strong></summary>

**Пример 1:**  
**_Статические переменные и методы:_** Представь, что у тебя есть школа. В школе есть законы (правила), которые
одинаковы
для
всех учеников. Эти законы не изменяются в зависимости от конкретного ученика. Это как статические переменные и методы —
они одинаковы для всех объектов (учеников).

**_Нестатические переменные и методы:_** Каждый ученик имеет свои особенности: имя, возраст, любимый предмет и так
далее.
Это как нестатические переменные — у каждого объекта свои.

**Пример 2:**
**_Статические переменные и методы_** можно сравнить с общими правилами или ресурсами в спортзале. Например, правила
поведения
в зале одинаковы для всех, не зависимо от того, кто пришел. Или же мячя для игры в баскетбол: они общие, каждый может
взять и поиграть.

_**Нестатические переменные и методы**_ аналогичны личным вещам, которые у каждого свои. Каждый принес свою бутылку
воды, свои
наушники и так далее. Они принадлежат конкретному человеку и могут быть разными.

</details>

**Ключевые различия**

- **Принадлежность:** Статические принадлежат классу, нестатические принадлежат экземпляру (объекту).

- **Доступ:** Статические можно вызвать через имя класса. Нестатические требуют создания экземпляра для доступа.

- **Память:** Статические создаются один раз и разделяются между всеми экземплярами, экономя память. Нестатические
  создаются заново для каждого нового объекта.

- **Ограничения:** Статические методы не могут обращаться к нестатическим переменным и методам. Нестатические могут
  обращаться к статическим.

### Зачем они нужны и в каких случаях их использовать?

**Статические переменные:**

- Глобальный доступ: Иногда необходимо иметь доступ к переменной из разных частей программы, не создавая экземпляр
  класса.
- Сохранение состояния: Они могут хранить информацию, которая должна быть общей для всех экземпляров класса.
- Примеры: Счётчики объектов, константы, настройки.

**Статические методы:**

- Утилитарные методы: Методы, которые не зависят от состояния объекта и решают общие задачи.
- Фабричные методы: Используются для создания объектов с определенными начальными параметрами.
- Примеры: `Math.sqrt()`, `Arrays.sort()`.

<details style="margin-left: 20px;">
<summary>Пример кода</summary>

```java
public class Calculator {
    public static final double PI = 3.14159; // статическая переменная

    public static int add(int a, int b) { // статический метод
        return a + b;
    }

    public int multiply(int a, int b) { // нестатический метод
        return a * b;
    }
}

```

В этом примере, PI является статической переменной, потому что значение π одинаково для всех экземпляров. `add()` —
статический метод, потому что он не зависит от состояния экземпляра.
</details>

**_Итак, когда использовать?_**

- Используйте **_статические_** элементы, когда они не зависят от состояния объекта и должны быть общими для всех
  экземпляров.

- Используйте **_нестатические_** элементы, когда они должны взаимодействовать с полями экземпляра и/или должны быть
  переопределены в подклассах.

<details style="margin-left: 20px;">
<summary>Практика:</summary>
<details style="margin-left: 20px;">
<summary>Задача 1:</summary>

```java
public class Library {
    // Название библиотеки
    private String libraryName;

    // Адрес библиотеки
    private String address;

    // Количество книг в библиотеке
    private int bookCount;

    // Количество работников в библиотеке
    private int staffCount;

    // Общее количество библиотек
    private int totalLibraries;

    // Конструктор
    public Library(String libraryName, String address, int bookCount, int staffCount) {
        this.libraryName = libraryName;
        this.address = address;
        this.bookCount = bookCount;
        this.staffCount = staffCount;
    }

    // Геттеры и сеттеры для полей
    // ...
}

```

</details>

<details style="margin-left: 20px;">
<summary>Задача 2:</summary>

```java
public class Car {
    // Бренд автомобиля
    private String brand;

    // Количество дверей
    private int doors;

    // Скорость автомобиля
    private int speed;

    // Общее количество созданных автомобилей
    private int totalCars;

    // Конструктор
    public Car(String brand, int doors) {
        this.brand = brand;
        this.doors = doors;
        this.speed = 0;
    }

    // Метод для увеличения скорости
    public void accelerate(int amount) {
        speed += amount;
    }

    // Метод для уменьшения скорости
    public void decelerate(int amount) {
        speed -= amount;
    }

    // Метод для получения текущей скорости
    public int getSpeed() {
        return speed;
    }

    // Метод для получения общего количества созданных автомобилей 
    public int getTotalCars() {
        return totalCars;
    }

    // Геттеры и сеттеры для полей
    // ...
}


```

</details>

<details style="margin-left: 20px;">
<summary>Задача 3:</summary>

```java
public class BankAccount {
    // Идентификатор аккаунта
    private String accountId;

    // Баланс на аккаунте
    private double balance;

    // Процентная ставка по всем аккаунтам 
    private double interestRate;

    // Общее количество аккаунтов в банке
    private int totalAccounts;

    // Конструктор
    public BankAccount(String accountId, double initialBalance) {
        this.accountId = accountId;
        this.balance = initialBalance;
    }

    // Метод для пополнения баланса
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Метод для снятия средств
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }

    // Метод для установки процентной ставки
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    // Метод для получения процентной ставки
    public double getInterestRate() {
        return interestRate;
    }

    // Метод для получения общего количества аккаунтов
    public int getTotalAccounts() {
        return totalAccounts;
    }
}

```

</details>
</details>
</details>

<details style="margin-left: 20px;">
<summary>Наследование</summary>

## Что такое наследование?

### Теоретическая часть

- **Наследование** — это один из четырёх основных принципов ООП, позволяющий создать новый класс на основе уже
  существующего (базового/родительского).
- Ключевое слово в Java для реализации наследования — `extends`.
- Подкласс наследует поля и методы родительского класса, при этом может их расширять и модифицировать.
- `super` — ключевое слово для обращения к элементам родительского класса.

<details style="margin-left: 20px;">
<summary>Пример кода</summary>

```java
// Базовый класс
public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Подкласс
public class Dog extends Animal {
    // Переопределение метода
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    // Метод, специфичный для Dog
    public void fetch() {
        System.out.println("Fetching...");
    }
}

```

Использование
`Animal myAnimal = new Animal();`
`myAnimal.makeSound(); // вывод: Some generic animal sound`

`Dog myDog = new Dog();`
`myDog.makeSound(); // вывод: Woof`
`myDog.fetch(); // вывод: Fetching...`
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>

Представьте, что базовый класс — это общий рецепт блинов. У всех блинов есть основные ингредиенты и этапы
приготовления (методы). Но каждый может добавить что-то своё в рецепт: например, добавить ягоды или шоколад (новые поля
и методы в подклассе). Таким образом, у вас будет новый рецепт, но основа (базовый класс) останется неизменной.
</details>

### Использование `super`

`super` — это ключевое слово, которое используется для обращения к методам и полям родительского класса.  
Оно часто применяется для вызова конструктора родительского класса.  
Можно использовать `super` для вызова метода родительского класса, который был переопределен в подклассе.

<details style="margin-left: 20px;">
<summary>Пример кода</summary>

```java
public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a generic sound");
    }
}
```

```java
public class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name);  // вызов конструктора родительского класса
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        super.makeSound();  // вызов метода родительского класса
        System.out.println(name + " the " + breed + " says woof");
    }
}

```

Пояснение:

- **Создание Объекта:** Здесь мы создаём новый объект myDog класса `Dog` и передаём ему два аргумента: имя "Buddy" и
  породу "
  Beagle".

- **Вызов Конструктора Родителя:** Конструктор класса `Dog` вызывает конструктор родительского класса `Animal` через
  ключевое
  слово `super`, передавая ему имя "Buddy". Это нужно для того, чтобы корректно инициализировать поля родительского
  класса.

- **Вызов Метода:** Затем вызывается метод `makeSound()` для объекта `myDog`.

- **Работа super в Методе:** Внутри метода `makeSound()` класса `Dog` сначала вызывается аналогичный метод из
  родительского класса
  `Animal` через `super.makeSound()`. Это выводит строку "Buddy makes a generic sound".

- **Дополнительные Действия:** После этого, в методе `makeSound()` класса `Dog`, добавляется строка "Buddy the Beagle
  says woof",
  которая является специфичной для объекта `myDog`.

</details>

<details style="margin-left: 20px;">
  <summary><strong><em>Аналогия:</em></strong></summary>
<details style="margin-left: 20px;">
<summary>Пример 1:</summary>

Представьте, что вы уже сделали блины по базовому рецепту (родительский класс). Теперь вы хотите их немного
модифицировать,
добавив шоколад (подкласс). Ключевое слово `super` — это как если бы ты сказал: "Сделаем всё по базовому рецепту, но
добавим шоколад".
</details>

<details style="margin-left: 20px;">
<summary>Пример 2:</summary>

Представь, у тебя есть базовый рецепт пиццы (это наш родительский класс `Animal`). Этот рецепт включает в себя
инструкции
по приготовлению теста, соуса и топпинга.

Теперь, допустим, ты хочешь сделать пиццу с пепперони (это будет наш подкласс `Dog`).

Использование базового рецепта: Сначала ты следуешь базовому рецепту, чтобы приготовить тесто и соус (это
`super.makeSound()` в нашем коде). Это формирует основу твоей пиццы и сохраняет базовые характеристики всех пицц.

Добавление уникальных ингредиентов: После этого, ты добавляешь пепперони и, возможно, дополнительный сыр или специи (это
уникальная реализация метода `makeSound()` в классе `Dog`). Это делает твою пиццу уникальной и отличной от всех
остальных.

В этом случае, ключевое слово super позволяет нам "наследовать" базовый рецепт пиццы, а затем добавить наши уникальные
ингредиенты, чтобы сделать её особенной.

Эта аналогия помогает понять, как ключевое слово super позволяет нам использовать уже существующий "рецепт" (или метод)
от родительского класса, добавляя к нему что-то своё.

</details>
</details>

<details style="margin-left: 20px;">
<summary>Практика:</summary>

<details style="margin-left: 20px;">
<summary>Задание 1:</summary>

**Задание 1: Автомобили и Электромобили**
Класс `Car`: Создайте класс `Car` с полями `make` (марка), `model` (модель) и методом `startEngine()`, который выводит
сообщение "Двигатель запущен".

Класс `ElectricCar`: Создайте класс `ElectricCar`, который наследует от `Car`. Добавьте поле `batteryLevel`.

Метод `startEngine` в `ElectricCar`: Переопределите метод `startEngine()` так, чтобы он сначала вызывал родительский
метод, а
затем выводил дополнительное сообщение "Батарея используется".

```java
public class Car {
    String make;
    String model;

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }
}

```

```java
public class ElectricCar extends Car {
    int batteryLevel;

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Батарея используется");
    }
}
```

</details>

<details style="margin-left: 20px;">
<summary>Задание 2:</summary>

**Задание 2: Формы и Круги**

Класс `Shape`: Создайте класс `Shape` с методом `draw()`, который выводит сообщение "Рисуем фигуру".

Класс `Circle`: Создайте класс `Circle`, который наследует от `Shape`. Добавьте поле `radius`.

Метод `draw` в `Circle`: Переопределите метод `draw()` так, чтобы он сначала вызывал метод родительского класса, а затем
выводил сообщение "Это круг".

```java
public class Shape {
    public void draw() {
        System.out.println("Рисуем фигуру");
    }
}
```

```java
public class Circle extends Shape {
    int radius;

    @Override
    public void draw() {
        super.draw();
        System.out.println("Это круг");
    }
}
```

</details>

<details style="margin-left: 20px;">
<summary>Задание 3:</summary>

Создадим пример с классом `Animal` и его подклассом `Bird`. В этом случае, не все методы из `Animal` будут
переопределены в
`Bird`.

```java
public class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void eat() {
        System.out.println("Животное ест");
    }
}

```

```java
public class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Птица поет");
    }
}

```

Пример использования:

```java
public static void main(String[]args){
        Bird myBird=new Bird();
        myBird.makeSound();  // Вывод: "Птица поет"
        myBird.eat();        // Вывод: "Животное ест"
        }

```

</details>
</details>

## Как работают интерфейсы?

### Что такое интерфейс?

- Интерфейс в Java – это схема, которая предоставляет систему для разработки приложений. Это объявление методов, которые
  один или несколько классов будут реализовывать.

### Основные характеристики

- В интерфейсе все методы по умолчанию являются `public` и `abstract` (за исключением статических и дефолтных методов).
- Интерфейс не может содержать полей с состоянием (то есть все поля являются `public`, `static`, `final`).

### Типы методов в интерфейсах

- **Абстрактные методы**: методы без реализации, которые должны быть реализованы в классе, который реализует этот
  интерфейс.
- **Дефолтные методы**: методы с реализацией, которые можно переопределить в реализующем классе.
- **Статические методы**: методы с реализацией, которые не могут быть переопределены и вызываются через сам интерфейс.

### Примеры

#### Абстрактный метод в интерфейсе

```java
public interface Flyable {
    void fly();
}

```

```java
public class Bird implements Flyable {
    public void fly() {
        System.out.println("Птица летает");
    }
}

```

#### Дефолтный метод в интерфейсе

```java
public interface Flyable {
    default void glide() {
        System.out.println("Плавный полет");
    }
}
```

```java
public class Bird implements Flyable {
}
```

#### Статический метод в интерфейсе

```java
public interface Flyable {
    static void altitude() {
        System.out.println("Высота полета не определена");
    }
}
```

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>

1. **Интерфейс как контракт**: Представь, что интерфейс — это как договор между строителем (классом) и заказчиком (
   другим кодом). Если строитель подписывает договор, он обязан выполнить все пункты (методы), указанные в нём.

2. **Дефолтные методы как дополнительные услуги**: Это как если бы в договоре строителя были опциональные услуги. Они
   уже включены, но если заказчик хочет, строитель может их изменить.

3. **Статические методы как справочная информация**: Это как стандартная инструкция или FAQ, которую можно прочесть, не
   заключая договор. Она доступна всем и не изменяется.

</details>

<details style="margin-left: 20px;">
<summary>Практика:</summary>

<details style="margin-left: 20px;">
<summary>Задание 1:</summary>

**Задание 1: Летающие и Плавающие объекты**

Интерфейс `Flyable`: Создайте интерфейс `Flyable` с методом `fly()`, который выводит сообщение "Летаю".

Интерфейс `Swimmable`: Создайте интерфейс `Swimmable` с методом `swim()`, который выводит сообщение "Плаваю".

Класс `Airplane`: Создайте класс `Airplane`, который реализует интерфейс `Flyable`.

Класс `Duck`: Создайте класс `Duck`, который реализует интерфейсы `Flyable` и `Swimmable`.

```java
public interface Flyable {
    void fly();
}
```

```java
public interface Swimmable {
    void swim();
}
```

```java
public class Airplane implements Flyable {
    public void fly() {
        System.out.println("Летаю");
    }
}
```

```java
public class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Летаю");
    }

    public void swim() {
        System.out.println("Плаваю");
    }
}
```

</details>

<details style="margin-left: 20px;">
<summary>Задание 2:</summary>

**Задание 2: Фигуры с методами по умолчанию**

Интерфейс `Drawable`: Создайте интерфейс `Drawable` с дефолтным методом `draw()`, который выводит сообщение "Рисуем
фигуру".

Класс `Circle`: Создайте класс `Circle`, который реализует интерфейс `Drawable`.

```java
public interface Drawable {
    default void draw() {
        System.out.println("Рисуем фигуру");
    }
}
```

```java
public class Circle implements Drawable {
}
```

</details>

<details style="margin-left: 20px;">
<summary>Задание 3:</summary>

**Задание 3: Статические методы в интерфейсах**

Интерфейс `Calculable`: Создайте интерфейс `Calculable` с статическим методом `square(int a)`, который возвращает
квадрат числа.

```java
public interface Calculable {
    static int square(int a) {
        return a * a;
    }
}
```

Пример использования:

```java
public static void main(String[]args){
        System.out.println(Calculable.square(5)); // Вывод: 25 
        }
```

</details>

</details>

## Абстрактные, статические и дефолтные методы в интерфейсах

### Абстрактные методы

**_Абстрактные методы_** — это методы без реализации. Они объявляются в интерфейсах и должны быть реализованы в классах,
которые реализуют данный интерфейс.

```java
public interface Drawable {
    void draw();
}
```

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>
Представьте, что интерфейс — это меню в ресторане. Абстрактный метод — это блюдо, которое нужно приготовить. Каждый шеф-повар (класс) решает сам, как именно приготовить это блюдо (реализовать метод).
</details>

### Статические методы

Статические методы в интерфейсах не могут быть переопределены. Они принадлежат самому интерфейсу и вызываются
непосредственно через него.

```java
public interface Util {
    static int add(int a, int b) {
        return a + b;
    }
}
```

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>
Это как если бы в меню ресторана уже было готовое блюдо, которое не изменяется. Например, бутылка воды.
</details>

### Дефолтные методы

Дефолтные методы позволяют задать дефолтную реализацию метода прямо в интерфейсе. Это полезно, когда нужно добавить
новый метод, но не хочется ломать уже существующие реализации.

```java
public interface Drawable {
    default void draw() {
        System.out.println("Drawing a shape");
    }
}
```

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>
Это как дополнительный соус к основному блюду в меню. Если шеф-повар хочет, он может изменить соус, но если не хочет — всё равно будет вкусно.
</details>

<details style="margin-left: 20px;">
<summary>Практика:</summary>

<details style="margin-left: 20px;">
<summary>Задание 1:</summary>

**Задание 1: Интерфейс `Drawable`**
Создать интерфейс `Drawable` с абстрактным методом `draw()` и дефолтным методом `describe()`, который выводит "Это
фигура".

```java
public interface Drawable {
    void draw();

    default void describe() {
        System.out.println("Это фигура");
    }
}
```

</details>

<details style="margin-left: 20px;">
<summary>Задание 2:</summary>

**Задание 2: Комбинированный интерфейс `Calculator`**

Создадим интерфейс `Calculator` с:

- Абстрактным методом `divide(int a, int b)` для деления двух чисел
- Статическим методом `add(int a, int b)` для сложения двух чисел
- Дефолтным методом `multiply(int a, int b)` для умножения двух чисел

```java
public interface Calculator {
    int divide(int a, int b);

    static int add(int a, int b) {
        return a + b;
    }

    default int multiply(int a, int b) {
        return a * b;
    }
}
```

Создадим класс `SimpleCalculator`, который реализует интерфейс `Calculator`. Реализуйте метод `divide()` так, чтобы он
возвращал результат деления, или выводил ошибку при делении на ноль.

```java
public class SimpleCalculator implements Calculator {
    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль");
            return 0;
        }
        return a / b;
    }
}
```

Пример использования:

```java
public static void main(String[]args){
        SimpleCalculator calc=new SimpleCalculator();
        System.out.println(calc.divide(10,2));  // Вывод: 5
        System.out.println(calc.multiply(3,4)); // Вывод: 12
        System.out.println(Calculator.add(5,5)); // Вывод: 10
        }
```

</details>

<details style="margin-left: 20px;">
<summary>Задание 3:</summary>

**Задание 3: Интерфейс `TaskManager`**

Суть интерфейса: Управление задачами. Этот интерфейс предназначен для создания, удаления, изменения статуса и просмотра
всех задач.

Методы:

1. `createTask(String name, String description)`: создает новую задачу с указанным именем и описанием.
2. `deleteTask(int id)`: удаляет задачу по идентификатору.
3. `markAsDone(int id)`: помечает задачу как выполненную по идентификатору.
4. `getAllTasks()`: возвращает список всех задач.
5. `getTaskById(int id)`: возвращает задачу по идентификатору.
6. `getTasksByStatus(String status)`: возвращает список задач с указанным статусом.

Ваша задача: определить, какие из этих методов лучше сделать статическими, дефолтными или оставить абстрактными.

```java
public interface TaskManager {
    void createTask(String name, String description);

    void deleteTask(int id);

    void markAsDone(int id);

    List<Task> getAllTasks();

    Task getTaskById(int id);

    List<Task> getTasksByStatus(String status);
}
```

<details style="margin-left: 20px;">
<summary>Решение:</summary>

```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface TaskManager {

    // Абстрактный метод, так как создание задачи может быть зависимо от конкретной реализации.
    void createTask(String name, String description);

    // Абстрактный метод, удаление задачи также может зависеть от конкретной реализации.
    void deleteTask(int id);

    // Абстрактный метод, изменение статуса задачи может зависеть от конкретного механизма хранения и управления задачами.
    void markAsDone(int id);

    // Абстрактный метод, логика выборки может зависеть от конкретной реализации.
    List<Task> getAllTasks();

    // Абстрактный метод, выборка задачи по ID также может зависеть от конкретной реализации.
    Task getTaskById(int id);

    // Дефолтный метод, так как его реализация скорее всего будет одинаковой для всех классов, реализующих этот интерфейс.
    default List<Task> getTasksByStatus(String status) {
        return getAllTasks().stream()
                .filter(task -> status.equals(task.getStatus()))
                .collect(Collectors.toList());
    }
}
```

```java
// Класс задачи для демонстрации.
class Task {
    private int id;
    private String name;
    private String description;
    private String status;

    // Геттеры и сеттеры
    // ...
}
```

```java
// Пример реализации интерфейса TaskManager.
class SimpleTaskManager implements TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private int currentId = 0;

    @Override
    public void createTask(String name, String description) {
        Task task = new Task();
        task.setId(++currentId);
        task.setName(name);
        task.setDescription(description);
        task.setStatus("Not Done");
        tasks.add(task);
    }

    @Override
    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    @Override
    public void markAsDone(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setStatus("Done");
                break;
            }
        }
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    @Override
    public Task getTaskById(int id) {
        return tasks.stream().filter(task -> task.getId() == id).findFirst().orElse(null);
    }
}
```

</details>
</details>
</details>

### Наследование и расширение классов

1. **Наследование классов** обычно используется для создания нового класса на основе существующего. Это как когда ты
   берёшь стандартный рецепт блинов и добавляешь в него свои ингредиенты.

2. **Почему расширяем конкретный класс?** Если нам нужны все функции родительского класса и мы хотим добавить к ним
   свои, расширение конкретного класса — логичный шаг.

### Абстрактные классы

1. **Абстрактные классы** представляют собой шаблоны, предназначенные для расширения. Представь, что у тебя есть чертёж
   дома без конкретных размеров комнат и без указания материалов.

2. **Почему расширяем абстрактный класс?** Когда у тебя есть общая логика, которая должна быть реализована в нескольких
   местах, но которую нельзя полностью определить без контекста, абстрактные классы становятся очень полезными.

### Интерфейсы

1. **Интерфейсы** — это контракты, которые обязуют классы выполнять определённые действия. Представь интерфейс как меню
   в ресторане.

2. **Почему используем интерфейсы?** Если тебе важно не то, _как_ что-то делается, а _что_ должно быть сделано,
   интерфейсы идеально подходят.

### Заключение

- **Используй наследование и расширение конкретных классов**, когда тебе нужно дополнить уже существующую
  функциональность.

- **Абстрактные классы подходят для создания базовых шаблонов**, которые будут иметь множество уникальных реализаций.

- **Интерфейсы же прекрасны для определения общего контракта**, когда реализация может кардинально отличаться.

</details>

<details style="margin-left: 20px;">
<summary>SOLID Принципы</summary>

## SOLID Принципы

### Введение

SOLID — это аббревиатура, состоящая из первых букв пяти основных принципов объектно-ориентированного программирования и
проектирования. Соблюдение этих принципов делает программный код более понятным, гибким и поддерживаемым.

### Single Responsibility Principle (Принцип единственной ответственности)

- **Описание**: У каждого класса должна быть только одна причина для изменения.
- **Почему это важно**: Упрощает разбиение приложения на части. Уменьшает связанность кода.

<details style="margin-left: 20px;">
<summary>Задание 1:</summary>

Создать класс `Report`, который имеет две ответственности: формирование и печать отчёта. Затем разделите его так, чтобы
каждый класс имел только одну ответственность.
</details>

### Open/Closed Principle (Принцип открытости/закрытости)

- **Описание**: Программные сущности должны быть открыты для расширения, но закрыты для изменения.
- **Почему это важно**: Упрощает добавление новых функциональностей и уменьшает риск нарушения существующего кода.

<details style="margin-left: 20px;">
<summary>Задание 2:</summary>

Создать интерфейс `Shape` с методом `area()`. Используйте этот интерфейс для создания классов `Circle` и `Rectangle`.
После этого реализуйте функцию, которая принимает массив объектов типа `Shape` и вычисляет общую площадь.
</details>

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>

Представьте, что SOLID принципы — это основы архитектуры при строительстве здания. Если эти основы прочны, то здание
будет стоять долго и уверенно. Архитекторы могут добавить новые этажи или помещения, не опасаясь, что всё рухнет.
</details>

### Liskov Substitution Principle (Принцип подстановки Барбары Лисков)

- **Описание**: Объекты в программе должны быть заменяемыми на экземпляры их подтипов без изменения правильности
  выполнения программы.
- **Почему это важно**: Соблюдение этого принципа упрощает использование полиморфизма и повышает гибкость системы.

<details style="margin-left: 20px;">
<summary>Задание 3:</summary>

Создать класс `Bird` с методом `fly()`, затем реализуйте подклассы `Penguin` и `Eagle`. Оба должны наследовать `Bird`,
но только `Eagle` может летать.
</details>

### Interface Segregation Principle (Принцип разделения интерфейса)

- **Описание**: Клиенты не должны зависеть от интерфейсов, которые они не используют.
- **Почему это важно**: Уменьшает количество ненужных зависимостей, упрощая систему.

**Основная идея:** Классы не должны зависеть от интерфейсов, которые они не используют. Если интерфейс слишком "тяжёлый"
,
его следует разделить на более мелкие и специфические, чтобы классы могли зависеть только от необходимых им методов.

**Применение:** Этот принцип часто используется для улучшения модульности и переиспользуемости кода, путём создания "
лёгких"
интерфейсов, которые легко имплементировать.

<details style="margin-left: 20px;">
<summary>Задание 4:</summary>

Создать интерфейс `Machine` с методами `print()`, `fax()` и `scan()`. Реализуйте классы `Printer` и `Photocopier`,
которые имплементируют только необходимые методы.
</details>

### Dependency Inversion Principle (Принцип инверсии зависимостей)

- **Описание**: Зависимость на абстракциях. Нет зависимости на что-то конкретное.
- **Почему это важно**: Упрощает управление зависимостями и делает систему более модульной.

**Основная идея:** Высокоуровневые модули не должны зависеть от низкоуровневых модулей. Оба типа модулей должны зависеть
от
абстракций.

**Применение:** Этот принцип помогает инвертировать направление зависимости в системе, делая высокоуровневые модули
независимыми от деталей реализации низкоуровневых модулей, и тем самым упрощает рефакторинг и тестирование.

<details style="margin-left: 20px;">
<summary>Задание 5:</summary>

Создать интерфейс `Database` с методами `read()` и `write()`. Используйте этот интерфейс для создания
классов `MySQLDatabase` и `MongoDatabase`.
</details>

### Заключение

#### Для чего используются принципы SOLID?

Принципы SOLID служат фундаментальными "строительными блоками" хорошо спроектированного кода. Они помогают улучшить
читаемость, удобство поддержки и расширяемость кода, снижая при этом риск появления ошибок и багов.

#### Когда стоит придерживаться принципов SOLID?

Принципы SOLID наиболее эффективны в больших и сложных системах, где многочисленные объекты взаимодействуют между собой.
Однако даже в небольших проектах следование этим принципам может принести пользу, особенно если ожидается их дальнейшее
масштабирование.

#### Плюсы использования принципов SOLID

- **Повышение удобства поддержки**: Легче читать и понимать код, что упрощает его дальнейшую поддержку.
- **Улучшение расширяемости**: Код становится более модульным, что облегчает добавление новых функций.
- **Снижение сложности**: Каждый класс и метод делают "одну вещь", и делают ее хорошо.
- **Повышение устойчивости к ошибкам**: Хорошо спроектированный код менее подвержен ошибкам и багам.
- **Легкость тестирования**: Модульный код легче тестировать, так как его компоненты могут быть изолировано проверены.

<details style="margin-left: 20px;">
<summary><strong><em>Аналогия:</em></strong></summary>

Принципы SOLID можно сравнить с правилами дорожного движения. Если каждый соблюдает правила, движение идет гладко, и
риск аварий минимален. Аналогично, если все части кода "играют по правилам", разработка и поддержка программы происходят
гораздо эффективнее.
</details>

<details style="margin-left: 20px;">
<summary>Код не соответствующий принципам SOLID:</summary>

```java
import java.util.List;

public class Car {
    private String model;
    private String brand;
    private int year;
    private boolean engineOn;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engineOn = false;
    }

    public void startEngine() {
        engineOn = true;
        System.out.println("Engine is started.");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("Engine is stopped.");
    }

    // Этот метод делает слишком много. Он изменяет состояние и занимается выводом.
    public void showCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        if (engineOn) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }

    // Метод для добавления автомобиля в базу данных (нарушает SRP и DIP)
    public void saveCarToDatabase(List<Car> database) {
        database.add(this);
        System.out.println("Car saved to database.");
    }
}

```

В этом коде есть несколько проблем:

1. **Single Responsibility Principle (SRP)**: Класс `Car` имеет больше одной ответственности. Он управляет данными
   автомобиля и
   сохраняет их в базу данных.

2. **Open/Closed Principle (OCP)**: Если нужно изменить способ сохранения данных, класс `Car` потребуется
   модифицировать.

3. **Liskov Substitution Principle (LSP)**: В этом простом примере LSP не очень применим, но можно представить, что если
   мы
   расширяем этот класс, проблемы могут возникнуть.

4. **Interface Segregation Principle (ISP)**: Класс `Car` имеет метод `saveCarToDatabase()`, который не связан с
   основной
   ответственностью класса.

5. **Dependency Inversion Principle (DIP)**: Класс `Car` зависит от конкретного списка, что делает его зависимым от
   низкоуровневой детали.

</details>

<details style="margin-left: 20px;">
<summary>Код соответствующий принципам SOLID:</summary>

1. **Single Responsibility Principle (SRP)**: Разделим ответственности, выделим метод `saveCarToDatabase()` в отдельный
   интерфейс и класс.

2. **Open/Closed Principle (OCP)**: Использование интерфейса для сохранения данных позволит нам расширять
   функциональность без изменения существующего кода.

3. **Liskov Substitution Principle (LSP)**: Пока здесь нечего менять, но будем помнить о принципе при расширении
   функциональности.

4. **Interface Segregation Principle (ISP)**: Мы создадим интерфейс только для сохранения данных, чтобы не нарушать
   основные функции класса Car.

5. **Dependency Inversion Principle (DIP)**: Класс `Car` будет зависеть от абстракции, а не от конкретного класса.

```java
import java.util.List;

// Интерфейс для сохранения автомобиля
interface CarSaver {
    void save(Car car);
}
```

```java
// Реализация интерфейса CarSaver
class DatabaseCarSaver implements CarSaver {
    private List<Car> database;

    public DatabaseCarSaver(List<Car> database) {
        this.database = database;
    }

    public void save(Car car) {
        database.add(car);
        System.out.println("Car saved to database.");
    }
}

// Класс Car теперь следует принципам SOLID
public class Car {
    private String model;
    private String brand;
    private int year;
    private boolean engineOn;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engineOn = false;
    }

    // Методы, связанные только с автомобилем
    public void startEngine() {
        engineOn = true;
        System.out.println("Engine is started.");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("Engine is stopped.");
    }

    public void showCarDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
        if (engineOn) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }
}
```

```java
// Использование
public static void main(String[]args){
        List<Car> carDatabase=new ArrayList<>();
        CarSaver carSaver=new DatabaseCarSaver(carDatabase);

        Car myCar=new Car("Model S","Tesla",2020);
        myCar.startEngine();
        myCar.showCarDetails();

        // Сохраняем автомобиль в базу данных
        carSaver.save(myCar);
        }
```

</details>

<details style="margin-left: 20px;">
<summary>Практика:</summary>

```java
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public void displayTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public void saveTasksToDatabase() {
        // Простая имитация сохранения данных в базу данных
        System.out.println("Saving tasks to database...");
    }

    public void loadTasksFromDatabase() {
        // Простая имитация загрузки данных из базы данных
        System.out.println("Loading tasks from database...");
    }

    public void sendTaskByEmail(String task, String email) {
        // Простая имитация отправки задачи по электронной почте
        System.out.println("Sending task to " + email + ": " + task);
    }
}

```

**Комментарии к коду**
`addTask`, `removeTask`, `displayTasks`: методы для добавления, удаления и отображения задач.
`saveTasksToDatabase`: метод для сохранения всех задач в базу данных.
`loadTasksFromDatabase`: метод для загрузки задач из базы данных.
`sendTaskByEmail`: метод для отправки задачи по электронной почте.

Какие принципы нарушает данный код? Какой рефакторинг вы бы предложили?

<details style="margin-left: 20px;">
<summary>Решение:</summary>
Этот код нарушает несколько принципов SOLID:

- **Single Responsibility Principle:** класс делает слишком много вещей (управляет задачами, работает с базой данных,
  отправляет электронные письма).
- **Open/Closed Principle:** расширение функциональности (например, добавление новых способов сохранения задач)
  потребует
  изменения существующего кода.
- **Dependency Inversion Principle:** класс зависит от конкретной реализации сохранения данных и отправки электронных
  писем, а
  не от абстракции.

Во-первых, создадим интерфейсы для работы с базой данных и отправки электронных писем. Это поможет нам применить
Dependency Inversion Principle и Interface Segregation Principle.

```java
interface TaskDatabase {
    void saveTasks(List<String> tasks);

    List<String> loadTasks();
}
```

```java

interface EmailService {
    void sendEmail(String task, String email);
}
```

Теперь перепишем класс `TaskManager`, чтобы он соответствовал принципам SOLID.

```java
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<String> tasks;
    private TaskDatabase database;
    private EmailService emailService;

    public TaskManager(TaskDatabase database, EmailService emailService) {
        this.tasks = new ArrayList<>();
        this.database = database;
        this.emailService = emailService;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public void displayTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public void saveTasks() {
        database.saveTasks(tasks);
    }

    public void loadTasks() {
        this.tasks = database.loadTasks();
    }

    public void sendTaskByEmail(String task, String email) {
        emailService.sendEmail(task, email);
    }
}
```

**Комментарии к коду**

- **Single Responsibility Principle (SRP):** Теперь `TaskManager` занимается только управлением задачами. Работа с базой данных
  и отправка электронных писем делегированы отдельным интерфейсам.

- **Open/Closed Principle (OCP):** Класс `TaskManager` открыт для расширения (можно добавить новые реализации `TaskDatabase` и
  `EmailService`), но закрыт для модификации (его код не нужно будет изменять при добавлении новой функциональности).

- **Liskov Substitution Principle (LSP):** Этот принцип здесь не применяется напрямую, но код написан так, чтобы новые
  реализации интерфейсов могли быть легко подставлены вместо текущих.

- **Interface Segregation Principle (ISP):** Мы создали узкоспециализированные интерфейсы для работы с базой данных и отправки
  электронных писем.

- **Dependency Inversion Principle (DIP):** `TaskManager` теперь зависит от абстракций (`TaskDatabase` и `EmailService`), а не от
  конкретных реализаций.
</details>
</details>
</details>
</details> <!-- блок ру-->
