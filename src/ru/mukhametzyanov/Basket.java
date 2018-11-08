package ru.mukhametzyanov;

import java.util.LinkedList;

public interface Basket {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    void printBasket();

//    LinkedList<String> getProducts();
//
//    int getProductQuantity(String product);

}
