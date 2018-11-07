package ru.mukhametzyanov;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        BasketImpl basket = new BasketImpl();
        LinkedList<Product> linkedList = new LinkedList<>();

        basket.addProduct("Telephone", 3);
        basket.addProduct("TV", 2);
        basket.printBasket();

        linkedList.add(basket.addProduct())


    }
}
