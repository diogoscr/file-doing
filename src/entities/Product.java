package entities;

public class Product {

    private final String name;
    private final Double price;
    private final Integer quantity;

    public Product(String name,Double price,Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double total() {
        return price*quantity;
    }
}