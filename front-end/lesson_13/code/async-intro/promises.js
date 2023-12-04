function getSix (){
        setTimeout(()=>{
        return 6
        },4000)
    }
    let x = getSix();
    console.log(x)


function getSeven(){
    return new Promise(function(resolve,reject){
        setTimeout(()=>{
            resolve(6)
        },4000)
    })
}
const promise = getSeven();
console.log(promise)

promise.then((data)=>{
    console.log(data)
})
// с помощью then мы можем получить данные из промиса(обработать)

function getSevenRej(){
    return new Promise(function(resolve,reject){
        setTimeout(()=>{
            reject(new Error("Ошибка сервера"));
        },4000)
    })
}

const promise2 = getSevenRej();
promise2.then((data)=>{
    console.log(data); // значения попадают в  then
    // с данными мы можем работать только  здесь
})
.catch((e)=>{
    console.log(e)
})


// функция принимать имя пользователя -
// если имя John - вернет resolved
// если имя другое - вернет rejected

function getAgeOfUserByName(name){
    return new Promise(function(resolve,reject){
       if (name ==="John"){
        setInterval(()=>{
            resolve(20)
        },3000)
          
       }else{
        setInterval(()=>{
            reject(new Error("Нет такого имени"))
        },3000)
        
       }
    })
}
getAgeOfUserByName("John")
.then((data)=>console.log(data))
.catch((e)=>console.log(e))


getAgeOfUserByName("Tom")
.then((data)=>console.log(data))
.catch((e)=>console.log(e))