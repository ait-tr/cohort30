package inheritance_practice.Beverage;

public class Beer extends Beverage {
    String type;

    public Beer() {
    }

    public Beer(String type) {
        this.type = type;
    }

    public Beer(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    public void toBuy(String title, String packing, int quantity, String type) {
        super.toBuy(title, packing, quantity);
        this.type = type;
    }

    public void displayStock() {
        super.displayStock();
        System.out.println("This is " + type + " beer.");
    }

}
