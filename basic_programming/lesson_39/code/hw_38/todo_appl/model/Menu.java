package hw_38.todo_appl.model;

import practice.coffee.Coffee;
import practice.seasons.Season;

public enum Menu {

    LIST(1), ADD(2), FIND (3), REMOVE(4), EXIT(5);

    private int menuItem;

    // конструктор
    Menu(int menuItem) {
        this.menuItem = menuItem;
    }

    // геттер и сеттер
    public int getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(int menuItem) {
        this.menuItem = menuItem;
    }

    // метод, void - ничего не возвращает, он печатает
    public static void printMenu(){
        Menu[] menu = Menu.values();
        for (int i = 0; i < Menu.values().length; i++) {
            System.out.print((menu[i].menuItem) + " - " + menu[i] + " | ");
        }
    }
}
