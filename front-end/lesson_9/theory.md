## Object, class, prototype inheritance, inheritance

### Прототипное наследование

Модель наследования в JavaScript может озадачить опытных разработчиков на высокоуровневых объектно-ориентированных языках (таких, например, как Java или C++), поскольку она динамическая и не включает в себя реализацию понятия class (хотя ключевое слово class, бывшее долгие годы зарезервированным, и приобрело практическое значение в стандарте ES2015, однако, классы в JavaScript представляют собой лишь "синтаксический сахар" поверх прототипно-ориентированной модели наследования).

В плане наследования JavaScript работает лишь с одной сущностью: объектами. Каждый объект имеет внутреннюю ссылку на другой объект, называемый его прототипом. У объекта-прототипа также есть свой собственный прототип и так далее до тех пор, пока цепочка не завершится объектом, у которого свойство prototype равно null. По определению, null не имеет прототипа и является завершающим звеном в цепочке прототипов.

Хотя прототипную модель наследования некоторые относят к недостаткам JavaScript, на самом деле она мощнее классической. К примеру, поверх неё можно предельно просто реализовать классическое наследование, а вот попытки совершить обратное непременно вынудят вас попотеть.

### Наследование свойств
Объекты в JavaScript — динамические "контейнеры", наполненные свойствами (называемыми собственными свойствами). Каждый объект содержит ссылку на свой объект-прототип. При попытке получить доступ к какому-либо свойству объекта, свойство вначале ищется в самом объекте, затем в прототипе объекта, после чего в прототипе прототипа, и так далее. Поиск ведётся до тех пор, пока не найдено свойство с совпадающим именем или не достигнут конец цепочки прототипов.

### Пример наследования свойств
```json lines
const bike = {
  brand: "stels"
};

const mountainBike = {
  speeds: 7,
  __proto__: bike // указали, что прототипом mountainBike является bike
}
console.log(mountainBike);        // { speeds: 7 }
console.log(mountainBike.speeds); // 7
```


### Появление классов
С выходом ECMAScript 6 появился целый набор ключевых слов, реализующих классы. Они могут показаться знакомыми людям, изучавшим языки, основанные на классах, но есть существенные отличия. JavaScript был и остаётся прототипно-ориентированным языком. Новые ключевые слова: "class", "constructor", "static", "extends" и "super".

### Конструктор 
 **constructor** - это специальный метод, служащий для создания и инициализации объектов, созданных с использованием class.
```
class Polygon {
    constructor() {
        this.name = 'Polygon';
    }
}

const poly1 = new Polygon();

console.log(poly1.name);
// Expected output: "Polygon"
```

Конструктор позволяет произвести начальную инициализацию, которая должна быть выполнена до того, как остальные методы будут вызваны.
```
class Person {

    constructor(name) {
        this.name = name;
    }

    introduce() {
        console.log(`Hello, my name is ${this.name}`);
    }

}

const otto = new Person('Отто');

otto.introduce();
```

### Наследование классов
Наследование классов – это способ расширения одного класса другим классом.

Таким образом, мы можем добавить новый функционал к уже существующему.

Ключевое слово «extends»
Допустим, у нас есть класс Animal:

```json lines
class Animal {
  constructor(name) {
    this.speed = 0;
    this.name = name;
  }
  run(speed) {
    this.speed = speed;
    alert(`${this.name} бежит со скоростью ${this.speed}.`);
  }
  stop() {
    this.speed = 0;
    alert(`${this.name} стоит неподвижно.`);
  }
}

let animal = new Animal("Мой питомец");

```
…И мы хотели бы создать ещё один class Rabbit.

Поскольку кролики – это животные, класс Rabbit должен быть основан на Animal, и иметь доступ к методам животных, так чтобы кролики могли делать то, что могут делать «общие» животные.

Синтаксис для расширения другого класса следующий: class Child extends Parent.

Давайте создадим class Rabbit, который наследуется от Animal:

```json lines
class Rabbit extends Animal {
hide() {
alert(`${this.name} прячется!`);
}
}

let rabbit = new Rabbit("Белый кролик");

rabbit.run(5); // Белый кролик бежит со скоростью 5.
rabbit.hide(); // Белый кролик прячется!
```
Объект класса Rabbit имеет доступ как к методам Rabbit, таким как rabbit.hide(), так и к методам Animal, таким как rabbit.run().


## Object, class, prototype inheritance, inheritance

### Prototype inheritance

The inheritance model in JavaScript can be confusing for experienced developers in high-level object-oriented languages (such as Java or C++) because it is dynamic and does not include an implementation of the concept of class (although the class keyword, which was reserved for many years, has gained practical value in ES2015, however, classes in JavaScript are just "syntactic sugar" on top of a prototype-based inheritance model).

In terms of inheritance, JavaScript only works with one entity: objects. Every object has an internal reference to another object, called its prototype. The prototype object also has its own prototype, and so on, until the chain ends with an object whose prototype property is null. By definition, null has no prototype and is the last link in the prototype chain.

Although the prototypal inheritance model is considered by some to be a disadvantage of JavaScript, it is actually more powerful than the classical one. For example, on top of it, you can extremely simply implement classical inheritance, but trying to do the opposite will certainly force you to sweat.

### Property inheritance
Objects in JavaScript are dynamic "containers" filled with properties (called native properties). Each object contains a reference to its prototype object. When trying to access any property of an object, the property is first looked up in the object itself, then in the object's prototype, then in the prototype's prototype, and so on. The search continues until a property with a matching name is found or the end of the prototype chain is reached.

### Property inheritance example
```json lines
const bike = {
   brand: "stels"
};

const mountainBike = {
   speeds: 7
   __proto__: bike // specified that mountainBike's prototype is bike
}
console log(mountainBike); // {speeds: 7}
console.log(mountainBike.speeds); // 7
```


### Appearance of classes
With the release of ECMAScript 6, a whole set of keywords has appeared that implement classes. They may seem familiar to people who have studied class-based languages, but there are significant differences. JavaScript was, and still is, a prototype-based language. New keywords: "class", "constructor", "static", "extends" and "super".

### Constructor
**constructor** is a special method used to create and initialize objects created using class.
```
class Polygon {
     constructor() {
         this.name = 'Polygon';
     }
}

const poly1 = new Polygon();

console.log(poly1.name);
// Expected output: "Polygon"
```

The constructor allows for some initialization that must be done before the rest of the methods are called.
```
class Person {

     constructor(name) {
         this.name = name;
     }

     introduce() {
         console.log(`Hello, my name is ${this.name}`);
     }

}

const otto = new Person('Otto');

otto.introduce();
```

### Class inheritance
Class inheritance is a way of extending one class by another class.

Thus, we can add new functionality to the existing one.

Keyword "extends"
Let's say we have an Animal class:

```json lines
class Animal {
   constructor(name) {
     this speed = 0;
     this.name = name;
   }
   run(speed) {
     this speed = speed;
     alert(`${this.name} runs at ${this.speed}.`);
   }
   stop() {
     this speed = 0;
     alert(`${this.name} stands still.`);
   }
}

let animal = new Animal("My pet");

```
…And we would like to create another Rabbit class.

Because rabbits are animals, the Rabbit class must be based on Animal, and have access to animal methods so that rabbits can do things that "common" animals can do.

The syntax for extending another class is: class Child extends Parent.

Let's create a Rabbit class that inherits from Animal:

```json lines
class Rabbit extends Animal {
hide() {
alert(`${this.name} is hiding!`);
}
}

let rabbit = new Rabbit("White Rabbit");

rabbit run(5); // The white rabbit runs at speed 5.
rabbit hide(); // The white rabbit is hiding!
```
An object of the Rabbit class has access to both Rabbit methods such as rabbit.hide() and Animal methods such as rabbit.run().