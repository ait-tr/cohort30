const brothers = [
    {race:"hobbit", height: 110, age:45, name:"Frodo Baggins"},
    {race:"human", height: 185, age:46, name:"Aragorn"},
    {race:"elf", height: 189, age:110, name:"Legolas"},
    {race:"dworf", height: 140, age:150, name:"Gimly"},
    {race:"human", height: 195, age:200, name:"Gandalf"},
];
// const frodo = brothers[0];
// console.log(frodo);
const [frodo, aragorn, legolas, gimly, gandalf] = brothers;

console.log(aragorn);

const ageOfFrodo = frodo.age;// достали по ключу
console.log(ageOfFrodo);

const user = {id:1, email:"user@mail.com", login:"funny_user"}
// const email = user.email;
const {email,id, login} = user;
console.log(email);