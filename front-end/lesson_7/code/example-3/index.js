// Мы можем создавать элементы с нуля и прикреплять их к документу Html
// Создадим пустой элемент p

const newElement = document.createElement("p");
// Выше код создания элемента с нуля
newElement.textContent = "Я БЫЛ СОЗДАН  при помощи JS";
// Меняем текст внутри элемента
newElement.style.border = "2px solid red";
// Добавляем бордер

document.body.append(newElement);
// ПРИКРЕПЛЯЕМ ЭЛЕМЕНТ К ДОКУМЕНТУ HTML

const targetElement = document.getElementById("target-element");

const newBtn = document.createElement("button");
newBtn.type = "button";
newBtn.textContent = "Нажми на меня";
targetElement.append(newBtn);