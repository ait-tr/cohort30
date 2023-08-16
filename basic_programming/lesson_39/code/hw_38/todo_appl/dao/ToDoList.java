package hw_38.todo_appl.dao;

import hw_38.todo_appl.model.Task;

public interface ToDoList {

    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int id);

    // find Task
    Task findTask(int id);

    // print list of Tasks
    void printTasks();

    // quantity of tasks
    int quantity();

}
