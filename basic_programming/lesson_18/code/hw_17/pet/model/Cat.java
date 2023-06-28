package hw_17.pet.model;

public class Cat extends Pet {
    //class fields
    String name;
    String breed;
    double age;
    //designer
    public Cat() {//created empty designer
    }
    public Cat(String type, double weight, String livingCond) {
        super(type, weight, livingCond);
    }
    public Cat(String type, double weight, String livingCond, String name, String breed, double age) {
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
    // methods
    //override the parent method
    public void eat (String type){
        super.eat(type);
    }
    public void sleep (){
        super.sleep(type);
    }
    //created a method voice
    public void voice (String name){
        super.voice(name);
        System.out.print(name + " says meow ");
    }
    public void display (){
        super.display();
        System.out.print(" The Name of " + type + " is: " + name + " the breed is: " + breed + ", " + " the age is " + age + " years old.");
    }
    
    
    
}
