package hw_17.pet.model;

public class Pet {
    //class fields
    String type;//type of pet (cat or dog)
    double weight;//weight of pet
    String livingCond;//living conditions of pet
    //designer
    public Pet() {//created empty designer
    }
    public Pet(String type, double weight, String livingCond) {
        this.type = type;
        this.weight = weight;
        this.livingCond = livingCond;
    }
    //getter and setter
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getLivingCond() {
        return livingCond;
    }
    public void setLivingCond(String livingCond) {
        this.livingCond = livingCond;
    }
    // methods
    //created a methods eat, sleep, run
    public void eat (String name){
        System.out.print(name + " wants to eat. ");
        this.type = name;
    }
    public void sleep (String name){
        System.out.print(name + " wants to sleep. ");
    }
    public void run (String name){
        System.out.print(name + " wants go to outside. ");
    }
    public void voice (String name){
        System.out.println();
    }
    public void display (){
        System.out.println("The type of pet is: " + type + "," + " the weight is: " + weight + ", " + " it lives " + livingCond + ".");
    }
}
