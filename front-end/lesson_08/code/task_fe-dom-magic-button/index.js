// найдем первую кнопку по id
const btn = document.getElementById("magic-btn")
//скопируем ее - получилась вторая кнопка. ЕЕ можно использовать
const clonedBtn = btn.cloneNode(true)
// Зададим ей новый id
clonedBtn.id ="magic-btn-2"

btn.addEventListener("click", () => {
  // при нажатии на первую кнопку
  clonedBtn.textContent = "Я изменю тебя";
  clonedBtn.style.backgroundColor = "#a78b71";
  clonedBtn.style.color = "white";
  // cloneBtn.className = "second-btn"
  clonedBtn.classList.add("second-btn")
  document.body.append(clonedBtn)
})

let toggle = true;
clonedBtn.addEventListener("click", () => {
  if (toggle){
    btn.style.backgroundColor = "#9c4a1a";
    btn.style.color = "black";
  } else {
    btn.style.backgroundColor = "#f7c815";
    btn.style.color = "white";
  }
  toggle = !toggle;
})