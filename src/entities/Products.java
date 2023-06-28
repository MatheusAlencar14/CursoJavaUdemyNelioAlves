package entities;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public Products (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Products (String name, double price) {
        this.name = name;
        this.price = price;
    }

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

    public String toString () {
        return name + ", R$ " + String.format("%.3f", price) + ", " + quantity
                + " unidades, Total em estoque: R$ " + String.format("%.3f", totalValueInStock()) ;
    }
}
