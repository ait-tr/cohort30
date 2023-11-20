console.log("Welcome to DOM");

// Как создать переменную
// string name ="Anna"
// let объявление переменной
// const объявление константы
let name = "Anna";
name =33;
const nam = "Marina";
let age;
age = 25;
console.log(name)

// Мы можем сохранять в переменную элементы из html-документа
// и дальше работать с ними
// метод  get.ElementById()- получить элемент по id

const boxElement = document.getElementById("box-1");
console.log(boxElement);
// Все что касается стиля находится под атрибутом style
// свойства css  внутри js пишутся в формате Lower camel case - background-color
// backgroundColor
//Изменили цвет
boxElement.style.backgroundColor = "red";
//Изменили ширину
boxElement.style.width = "200px";
// Изменили текст
boxElement.textContent ="Hello";


