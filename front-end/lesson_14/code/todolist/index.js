function addTask(){
// Получаем значение из текстового поля
    const taskText = document.getElementById("taskInput").value;
    if (taskText.trim()=== ""){
        alert("Задача не может быть пустой");
        return;
    }
    //return после вызова alert() не дает задаче добавиться в список
    const taskItem = document.createElement("li");
    taskItem.innerHTML = `${taskText} <button onclick ="removeTask(this)">Удалить</button>`;
    // Добавим элемент в список задач
    document.getElementById("taskList").appendChild(taskItem);
    //Очищаем текстовое поле
    document.getElementById("taskInput").value = "";
}
function removeTask(button){
    //Удаляем родительский элемент
    const taskItem = button.parentElement;
    taskItem.remove();
}