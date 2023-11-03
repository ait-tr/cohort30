package practice;

public class Car {
    // Бренд автомобиля
    private String brand;

    // Количество дверей
    private int doors;

    // Скорость автомобиля
    private int speed;

    // Общее количество созданных автомобилей
    private static int totalCars;

    // Конструктор
    public Car(String brand, int doors) {
        this.brand = brand;
        this.doors = doors;
        this.speed = 0;
    }

    // Метод для увеличения скорости
    public void accelerate(int amount) {
        speed += amount;
    }

    // Метод для уменьшения скорости
    public void decelerate(int amount) {
        speed -= amount;
    }

    // Метод для получения текущей скорости
    public int getSpeed() {
        return speed;
    }

    // Метод для получения общего количества созданных автомобилей
    public static int getTotalCars() {
        return totalCars;
    }

    // Геттеры и сеттеры для полей
    // ...
}
