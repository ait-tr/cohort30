// 1й вариант работы с промисами
function getName(){
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            resolve("John");
        }, 1000)
    })
}
console.log(getName());
// Обработка с помощью then
getName().then((data)=>{
    console.log(data);
})

// 2й вариант работы с промисами
async function f(){
    const response = await getName(); //с помощью await мы можем раскрыть промис и обработать его
    console.log(response);
}

//Две одинаковые функции которые возвращают 5

function getFive(){
    return new Promise(function(resolve,reject){
        resolve(5)
    })
}
console.log(getFive());//выведет 5

async function getFiveVer1(){
    return 5;
}
console.log(getFiveVer1());//выведет 5