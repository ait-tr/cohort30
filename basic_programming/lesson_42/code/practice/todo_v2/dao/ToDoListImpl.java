package practice.todo_v2.dao;

import hw_38.todo_appl.model.Task;

public class ToDoListImpl implements ToDoList{

// TODO - add file name for tasks

    private Task[] tasks;
    private int capacity;
    private int quantity;

    public ToDoListImpl(int capacity) {
        this.tasks = new Task[capacity];
        this.quantity = 0;
    }

    public boolean addTask(Task task) {
        if (task != null) {
            tasks[quantity] = task;
            quantity++;
            return true;
        }
        return false;
    }

    @Override
    public Task removeTask(int id) {
        // find by id then remove, quantity--
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == id) {
                Task removedTask = tasks[i];
                for (int j = i; j < quantity - 1; j++) {
                    tasks[j] = tasks[j + 1];
                }
                tasks[quantity - 1] = null;
                quantity--;
                // устанавливаем новые индексы c 0 и подряд
                for (int j = 0; j < quantity; j++) {
                    tasks[j].setId(j);
                }
                return removedTask;
            }
        }
        return null;
    }

    @Override
    public Task findTask(int id) {
        // find by id
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == id) {
                Task findedTask = tasks[i];
                return findedTask;
            }
        }
        return null;
    }

    @Override
    public void printTasks() {
        // for loop, print tasks
        for (int i = 0; i < quantity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("You have " + quantity + " tasks.");
    }

    @Override
    public int quantity() {
        return quantity;
    }

    //TODO - add method saveTasks()


    //TODO - add method readTasks()


}
