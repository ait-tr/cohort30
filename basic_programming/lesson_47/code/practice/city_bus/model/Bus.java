package practice.city_bus.model;

import practice.city_bus.CircularRoute;

import java.util.Objects;

public class Bus implements Comparable<Bus> {

    // Поля класса
    private String model; // модель автобуса
    private String regNumber; // гос. номер
    private CircularRoute route; // маршрут
    private int capacity; // вместимость

    // Конструктор класса
    public Bus(String model, String regNumber, CircularRoute route, int capacity) {
        this.model = model;
        this.regNumber = regNumber;
        this.route = route;
        this.capacity = capacity;
    }

    // Геттеры и сеттеры
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

    public CircularRoute getRoute() {
        return route;
    }

    public void setRoute(CircularRoute route) {
        this.route = route;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addBusStop(String busStop) {
        route.addStop(busStop);
    }

    // Переопределение методов toString, equals, hashCode и compareTo
    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", routeSize=" + (route != null ? route.getSize() : 0) +
                ", capacity=" + capacity +
                '}';
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
        return (route != null ? route.getSize() : 0) - (o.route != null ? o.route.getSize() : 0); // сортировка будет по количеству остановок
    }
}
