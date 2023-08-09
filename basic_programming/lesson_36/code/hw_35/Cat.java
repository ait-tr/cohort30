package hw_35;

import java.util.Objects;

public class Cat implements Comparable<Cat> {

    private String name; // кличка
    private int age; // возраст
    private String color;
    private double weight;

    public Cat(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + "', age=" + age + ", color='" + color  + "', weight=" + weight + '}';
    }

    @Override
    public int compareTo(Cat o) {
        // return this.age - o.age;
        return Integer.compare(this.getAge(), o.getAge()); // сортировка по возрасту
    }
}
