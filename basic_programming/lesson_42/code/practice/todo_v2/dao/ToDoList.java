package practice.todo_v2.dao;

import practice.todo_v2.model.Task;

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

    // TODO read tasks from file

    // TODO save tasks to file
    void saveTasks() throws IOException;

}
