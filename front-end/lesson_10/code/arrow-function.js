// Стрелочная функция
// Пример обычной функции

function sum(a,b){
    return a+b;
}
console.log(sum(20,10));// 30

// Стрелочная функция
// блочная
const sum2 = (a,b) =>{
    return a + b;
}

// Запись в одну строку
// строчная

const sum3 = (a,b) => a + b;
const res = sum3(10,20);


//Передача функции в качестве параметра
function calculate(a,b, operation){
    return operation(a,b);
}

function subtract (a,b){
    return a - b;
}
// Вызов функции
calculate(9,3, subtract);// 6

calculate(9,3,(a,b) => a / b);// 3

// Создать метод universalGreeting, этот метод будет приветствовать на рахных языках
// Пусть метод принимает в качестве параметров 
// -имя
// - функция приветствия

// Напишите две функции приветствия
// - одна пусть приветствует  на английском englishGreeting: "Hello, name " 
// вторая пусть будет на японском japaneseGreeting: "Konnichiwa, name " 

//Вызовите метод universalGreeting

function universalGreeting(name,greetingFunction){
    return greetingFunction (name);
}
function englishGreeting(name){
    return `Heello, ${name}`; //  шаблонная строка - бэктикс
}
const res2 = universalGreeting("John",englishGreeting);
console.log(res2);
const res3 = universalGreeting("Sayochi", (name =>`Konnichiwa, ${name}`) );
console.log(res3);