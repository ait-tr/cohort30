package hw_38.todo_appl.dao;

import hw_38.todo_appl.model.Task;

public class ToDoListImpl implements ToDoList{

    private Task[] tasks;

    int capacity;

    public ToDoListImpl(int capacity) {
        this.tasks = new Task[capacity];
    }

    @Override
    public boolean addTask(Task task) {
        // if not null, add task to tasks, quantity++
        return false;
    }

    @Override
    public Task removeTask(int id) {
        // find by id then remove, quantity--
        return null;
    }

    @Override
    public Task findTask(int id) {
        // find by id
        return null;
    }

    @Override
    public void printTasks() {
        // for loop, print tasks

    }

    @Override
    public int quantity() {
        // return quantity;
        return 0;
    }
}
