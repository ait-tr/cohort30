package hw_25.bus;

public class Bus {
//    Создать класс Bus (автобус) - с полями номер маршрута, вместимость, скорость на маршруте, длина маршрута.
//    Реализовать методы go, stop, speedUp, speedDown

    //fields of class Bus
    private String route;
    private int capacity;
    private double speed;
    private double route_length;

    // методы

    // конструкторы класса
    // полный конструктор, все поля в него включены
    public Bus(String route, int capacity, double speed, double route_length) {
        this.route = route;
        this.capacity = capacity;
        this.speed = speed;
        this.route_length = route_length;
    }

    // конструктор только с capacity
    public Bus(int capacity) {
        this.capacity = capacity;
    }

    // пустой конструктор
    public Bus() {
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getRoute_length() {
        return route_length;
    }

    public void setRoute_length(double route_length) {
        this.route_length = route_length;
    }

    @Override
    public String toString() {
        return "Bus: route " + route  + ", capacity=" + capacity;
    }

    public void go(double speed){
        this.speed = speed;
        System.out.println("The bus is going on the route " + route + ", speed = " + speed);
    }

    public void stop(){
        speed = 0;
        System.out.println("The bus stops, speed = " + speed);
    }

    public double speedUp(double inc) {
        return speed += inc;
    }

    public double speedDown(double dec) {
        return speed -= dec;
    }

    public void displaySpeed() {
        speed = getSpeed();
        System.out.println("The speed of bus = " + speed);
    }

    public void displayBus() {
        speed = getSpeed();
        System.out.println("Route " + route + ", capacity " + capacity + ", current speed " + speed);
    }

}
