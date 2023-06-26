package inheritance_practice.Beverage;

public class BeverageAppl {
    public static void main(String[] args) {
        Beverage b1 = new Beverage();
        b1.displayStock();
        b1.toBuy("Cola", "boxes", 10);
        b1.displayStock();

        Beverage b2 = new Beverage();
        b2.displayStock();
        b2.toBuy("Wine", "bottle", 3);
        b2.displayStock();

        Beer beer1 = new Beer();
        beer1.displayStock();
        beer1.toBuy("Beer", "box", 10, "white");
        beer1.displayStock();

    }
}
