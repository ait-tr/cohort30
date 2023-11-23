// МАССИВ - ДИНАМИЧЕСКИЙ МАССИВ
// ДЛИНА НЕ ФИКСИРОВАНА

// Два способа создания массива
const arr1 = [];// 1 способ
const arr2 = new Array();// 2 способ

// Как добавить значение по индексу
const fruits = [];
fruits[0] = "apple";// "apple"
console.log(fruits);
fruits[1] = "banana";// "banana"
console.log(fruits);
// Как получить значение по индексу
console.log(fruits[1]);
// Как получить значение по индексу элемента которого нет в списке
console.log(fruits[2]);
// Как получить длину массива
console.log(fruits.length);

// Как создать массив сразу со значениями
const cars = ["BMW", "Mercedes", "Audi","Tesla"];
console.log(cars);
//Пройтись циклом  for  по массиву
for (let i = 0; i<cars.length; i++){
    console.log(cars[i]);
}
// Методы работы с массивами
const students =[];
students.push("John");// добавили справа
console.log(students);
students.push("Tom");// добавили справа
console.log(students);
students.unshift("Alex");// добавили слева
console.log(students);
// pop- удалили элемент с конца массива справа
const vik = students.pop();
console.log(students);
// shift- удалили элемент слева массива (начало)
const leon = students.shift();
console.log(students);
console.log(leon);









