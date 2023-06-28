package hw_17.pet;

import hw_17.pet.model.Pet;
import hw_17.pet.model.Cat;
import hw_17.pet.model.Dog;

public class HouseAppl {
    public static void main(String[] args) {
        Pet cat1 = new Cat (" cat ", 4.0, " home ", " Maya, ", "british shorthair ",11);
        cat1.display();
        Pet cat2 = new Cat(" cat ", 4.5, " home ", " Finn, ", "siamese ",11.5);
        cat2.display();
        Pet cat3 = new Cat(" cat ", 3.8, " home ", " Gila, ", "balenese long haired ",5);
        cat3.display();
        Pet dog1 = new Dog(" dog ", 25.0, " home ", " Avalon, ", "labrador ", 10);
        dog1.display();
        Pet dog2 = new Dog (" dog ", 23.0, " home ", " Paco, ", "breedless ", 10 );
        dog2.display();
        System.out.println();
        System.out.print("Every morning in our place starts the same way :)");
        dog1.voice("Avalon ");
        System.out.print("because ");
        dog1.run("Avalon");
        dog2.eat("Paco");
        cat1.voice("Maya ");
        System.out.print(" because ");
        cat1.eat("Maya");
        cat2.sleep("Finn");
        cat3.run("Gila");
        System.out.println();
        System.out.println(" That´s how we live :))! ");
    }
    //_____methods_____
    public void day(){
        System.out.println("In the morning m" );
    }

}
