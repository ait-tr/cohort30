const tick = setInterval(()=>{
    console.log("tick");
},5000); // будет выполняться каждые 5 секунд

const interval = setInterval(()=>{
    console.log("interval");
},1000)

setTimeout(()=>{
    clearInterval(tick);
    clearInterval(interval);
},5000)