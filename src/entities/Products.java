package entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        double value = quantity * price;
        return value;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts (int quantity) {
        this.quantity -= quantity;
    }
}
