const plusBtnElement = document.getElementById("plus");
const minusBtnElement = document.getElementById("minus");
const counterElement = document.getElementById("counter");

let counter = 0;

const plusHandler =()=>{
    counter++;
    counterElement.innerText = counter;// увеличиваем значение счетчика на +1
}

const minusHandler = ()=> {
    counterElement.innerText = --counter; // уменьшаем значение счетчика на -1
}

plusBtnElement.addEventListener("click",plusHandler);
minusBtnElement.addEventListener("click",minusHandler);

