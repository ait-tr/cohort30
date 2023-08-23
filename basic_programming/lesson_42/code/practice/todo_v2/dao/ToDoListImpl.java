package practice.todo_v2.dao;

import practice.todo_v2.model.Task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ToDoListImpl implements ToDoList{

    final String OUTPUT = "tasks.txt";
    final String INPUT = "tasks.txt";

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

    @Override
    public void saveTasks() throws IOException {
        BufferedWriter bfWhriter = new BufferedWriter(new FileWriter(OUTPUT));
        for (int i = 0; i < quantity; i++) {
            String str = String.valueOf(tasks[i]); // переводим tasks в строку
            bfWhriter.write(str + "\n");
        }
        bfWhriter.flush();
    }


    //TODO - add method readTasks()


}
