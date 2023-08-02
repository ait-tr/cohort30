package hw_32.cars;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private String regNumber;
    private String model;
    private String company; // в гараже стоят машины разных компаний
    private double engine; // объем двигателя, либо мощность
    private String color;
    private int milage;

    public Car(String regNumber, String model, String company, double engine, String color, int milage) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
        this.milage = milage;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    @Override
    public String toString() {
        return "Car{" + "regNumber='" + regNumber + "', model='" + model + "', company='" + company + "', engine=" + engine + ", color='" + color + ", milage " + milage + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public int compareTo(Car o) {
        return this.regNumber.compareTo(o.regNumber); // сортируем по алфавиту регномеров
    }
}
