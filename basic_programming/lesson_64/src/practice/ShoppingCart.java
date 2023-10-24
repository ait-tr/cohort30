package practice;

public class ShoppingCart {
    private int itemCount;
    private double totalPrice;

    public ShoppingCart() {
        this.itemCount = 0;
        this.totalPrice = 0.0;
    }

    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void empty() {
        itemCount = 0;
        totalPrice = 0.0;
    }
}