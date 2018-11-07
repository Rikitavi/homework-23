package ru.mukhametzyanov;

import java.util.LinkedList;
import java.util.List;

public class BasketImpl implements Basket {

    private LinkedList<Product> productLinkedList = new LinkedList<>();


    @Override
    public void addProduct(String product, int quantity) {
        productLinkedList.add(new Product(product, quantity));
    }

    @Override
    public void removeProduct(String product) {

    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }

    @Override
    public void clear() {
        productLinkedList.clear();
    }

    @Override
    public void printBasket() {
        for (Product product : productLinkedList) {
            System.out.println(product.toString());
        }
        if (productLinkedList.isEmpty()){
            System.out.println("Basket is empty");
        }
    }

    @Override
    public List<String> getProducts() {
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return 0;
    }
}
