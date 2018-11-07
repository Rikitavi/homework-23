package ru.mukhametzyanov;

import java.util.List;

public interface Basket {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    void printBasket();

    List<String> getProducts();

    int getProductQuantity(String product);

}
