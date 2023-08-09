package hw_35;

import java.util.Objects;

public class Cat implements Comparable<Cat>{

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(weight, cat.weight) == 0 && Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, weight);
    }

    @Override
    public int compareTo(Cat o) {
        // return - Integer.compare(this.getAge(), o.getAge()); // сортируем по годам

        return this.age - o.age; // так тоже можно
    }
}
