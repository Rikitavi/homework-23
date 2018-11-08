package ru.mukhametzyanov;

public class Product {
    private String productName;
    private int quantity;

    public Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
