const paragraphElement = document.getElementById("text");
const changeButtonElement = document.getElementById("btn-change");
const flowerElement = document.getElementById("flowers");
const changeFlowerButtonElement = document.getElementById("btn-change-flower");
const surikatElement = document.getElementById("Surikat");
const addSurikatButtonElement = document.getElementById("add-surikat");

// console.log(paragraphElement);
// console.log(changeButtonElement);

// Мы можем назначить обработчик события и при нажатии на кнопку мы будем менять цвет фона
// параграфа на синий
changeButtonElement.addEventListener("click", () => {
    paragraphElement.style.backgroundColor = "blue";
})
// Меняем текст внутри
changeFlowerButtonElement.addEventListener("click", () => {
    flowerElement.textContent = "Ягодки";
})

addSurikatButtonElement.addEventListener("click", () => {
    surikatElement.src = "https://i.pinimg.com/originals/84/2f/5f/842f5f4989388a0314513505e2a9bca1.jpg"
})
surikatElement.style.width = "300px";

