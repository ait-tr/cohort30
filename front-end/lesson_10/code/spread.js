// Spread syntax - синтаксис " распыление"

// Повторим примитивные и ссылочные типы 
const fruits = ["apple", "orange", "mango"];
const fruits2 = fruits;
fruits[0] = "banana";
console.log(fruits);
console.log(fruits2);

// То есть один объект и две переменные которые содержат ссылку на этот объект
// Если сам объект изменить/мутировать - то обе переменные будут
// содержать ссылку на измененный объект

// При работе с примитивными типами - мы храним в переменной значение

let str1 = "hello";
let str2 = str1;
str1 = "Goodbye";
console.log(str1);
console.log(str2);


// Как скопировать элементы массива в новый массив
const cars = ["BMW", "Mercedes", "Audi"];
// spread operator ...

const carsCopy =[...cars];
// Если мы мутирем второй массив то первый не изменится
carsCopy [0]= "Opel";
console.log(cars);
console.log(carsCopy);

// Как объединить два массива в третий с помощью spread

const cities1 = ["Berlin", "Paris"];
const cities2 = ["London", "Budapest"];

const joinedCities = [...cities2, ...cities1];
console.log(joinedCities);

// Мы можем создать массив и добавить в него элемент

const vegitables = ["cucumber", "tomato"];
const newVegitables = [...vegitables, "carrot"];
console.log(newVegitables); // добавилась морковь в самый конец массива

