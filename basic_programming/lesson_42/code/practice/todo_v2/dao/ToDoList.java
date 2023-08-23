package practice.todo_v2.dao;

import hw_38.todo_appl.model.Task;

import java.io.IOException;

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

    // read tasks from file

    // save tasks to file

}
