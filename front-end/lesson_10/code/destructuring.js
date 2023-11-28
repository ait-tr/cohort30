// Деструктуризация
const person = {name:"Frank", age: 21};
console.log(person.age);
const age = person.age;
const name = person.name;
console.log(name, age);

// Другой способ сделать тоже самое

const dog = {nick:"Bobby", breed:"corgi"};
const {nick, breed, height = 10, color = "black"} = dog;
console.log(nick);
console.log(breed);
console.log(height);
console.log(color);
