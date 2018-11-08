package ru.mukhametzyanov;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        BasketImpl basketImpl = new BasketImpl();

        basketImpl.addProduct("Telephone", 3);
        basketImpl.addProduct("TV", 2);
        basketImpl.addProduct("Microwave oven", 1);
        basketImpl.addProduct("Gas oven", 3);
        basketImpl.printBasket();
        basketImpl.removeProduct("Telephone");
        basketImpl.printBasket();
        basketImpl.printBasket();
        basketImpl.getIndexListNumber(1);
        basketImpl.clear();
        basketImpl.printBasket();






//        LinkedList<Product> productLinkedList = new LinkedList<>();
//        Product product = new Product("Telephone", 2);
//        Product product1 = new Product("Telephone", 2);
//        productLinkedList.add(product);
//        productLinkedList.add(product1);
//        System.out.println(productLinkedList);

    }
}
