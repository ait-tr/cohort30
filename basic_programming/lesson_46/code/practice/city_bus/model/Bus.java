package practice.city_bus.model;

import java.util.Objects;

public class Bus implements Comparable<Bus>{

    // поля класса
    private String model; // модель автобуса
    private String regNumber; // гос. номер
    private String route; // маршрут
    private int capacity; // вместимость

    // конструктор класса
    public Bus(String model, String regNumber, String route, int capacity) {
        this.model = model;
        this.regNumber = regNumber;
        this.route = route;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + "model=" + model + ", regNumber=" + regNumber + ", route=" + route + ", capacity=" + capacity + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(regNumber, bus.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public int compareTo(Bus o) {
        return this.route.compareTo(o.route); // сортировка будет по маршруту (в алфавитном порядке)
    }
}
