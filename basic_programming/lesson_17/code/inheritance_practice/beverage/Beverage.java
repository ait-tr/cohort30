package inheritance_practice.beverage;

public class Beverage {
    // поля класса
    String title; // наименование
    String packing; // упаковки
    int quantity; // количество

    // конструктор
    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;
    }

    // пустой конструктор, позволяет создавать пустые объекты данного класса
    public Beverage() {
    }

    // этот метод закупает
    public void toBuy (String title, String packing, int quantity) {
        System.out.println("Go to market and buy " + title + " " + quantity + " " + packing + ".");
        this.packing = packing;
        this.quantity = quantity;
        this.title = title;
    }

    // этот метод показывает, что на складе
    public void displayStock (){
        System.out.println("We have " + quantity + " " + packing + " of " + title + " on stock.");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
