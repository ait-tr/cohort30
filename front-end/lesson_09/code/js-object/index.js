// Пример 1 - создание объекта
const student = {
    age: 22,
    name: 'Вася',
    // age:23
};

console.log(student.age);// 22
console.log(student.name);// Вася

// Пример 2 - ключ может состоять из двух слов
// Если ключ имеет пробелы - его нужно обернуть в кавычки

const product ={
    title: "iPhone",
    price: 2000,
    "model of phone" : "XR"
};
// Получить значение по ключу
console.log(product.price);
console.log(product["model of phone"]);

// Положить значение по ключу
product.diagonal = 6.5;
product["type of adapter"] = "USB-C";
console.log(product);

// Пример 3 
// Если у нас есть переменная и мы хотим доставать
// значения из объекта по этой переменной

let key = "age";
console.log(student[key]);
key ="name";
console.log(student[key]);

const client ={
    firstName: "John",
    wife:"Maria"
};
const key1 ="wife";
//Как достать по переменной из объекта
console.log(client.key1);//undefined
console.log(client[key1]); //Maria

//Пример 4 
//Допустим у нас были переменные - и мы хотим создать из них объект

const title = "Titanic";
const capacity = 1500;

const titanic ={title, capacity}
console.log(titanic);

// Пример 5 
const name1 = "Avrora"
const cap = 300;
// хочу создать объект из этих переменных,но с другими названиями ключей
const avrora = {title:name1, capacity:cap}
console.log(avrora);

// Пример 6
// Метод внутри объекта
const dog = {
    nick: "Tuzik",
    bark(){
        console.log("Гав");
    }
};
// вызов метода
dog.bark();

//ПРОТОТИПНОЕ НАСЛЕДОВАНИЕ
// Наследование - это копирование свойств родительского объекта в новый
const bicycle ={
    brand: "Turist",
    price:3000,
    bell(){
        console.log("Beep");
    }
}
bicycle.bell()

//на основании велосипеда мы сделаем горный велосипед
//указываем прототип с помощью свойства прото(по два подчеркивания с каждой стороны)

const mountineBike = {
    __proto__:bicycle,
    price:450,
    gears:7
}
console.log(mountineBike.price);// 450
console.log(mountineBike.gears);// 7
console.log(mountineBike.brand);// Turist

// Создайте объект транспортное средство vehicle с полями:
// - speed со значением 40
// - capacity со значением 4
// - метод drive(){} - метод выводит в консоль фразу "Поехали!"

// Создайте на основе vehicle объект jeep с capacity = 5
// скоростью 60 и numbersOfDoors = 2

// Вызовите метод drive от jeep

const vihecle ={
    speed:40,
    capacity:4,
    drive(){
        console.log("Поехали!");
    }
};

const jeep = {
    __proto__:vihecle,
    capacity:5,
    speed:60,
    numbersOfDoors:2
};
jeep.drive();







