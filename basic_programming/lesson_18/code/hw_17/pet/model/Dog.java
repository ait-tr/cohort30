package hw_17.pet.model;

public class Dog extends Pet {
    String name;
    String breed;
    double age;

    //designer
    public Dog(String type, double weight, String livingCond, String name, String breed, double age) {
        super(type, weight, livingCond);
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    //methods
    //override the parent method
    public void eat() {
        super.eat(type);
    }

    public void sleep() {
        super.sleep(name);
    }

    public void run() {
        super.run(name);
    }

    ////created a method voice
    public void voice(String name) {
        super.voice(name);
        System.out.print(name + " say wow-wow ");
    }

    public void display() {
        super.display();
        System.out.println(" The Name of " + type + " is: " + name + " the breed is: " + breed + ", " + " the age is " + age + " years old.");
    }
}