package ru.mukhametzyanov;

import java.util.LinkedList;

public class BasketImpl implements Basket {
    private LinkedList<Product> productLinkedList = new LinkedList<>();

    /**
     * Получение выбранного продукта по индексу
     * @param index
     */
    void getIndexListNumber(int index){
        System.out.println(productLinkedList.get(index));
    }

    /**
     * Добавление продукта в корзину
     * @param product имя продукта
     * @param quantity кол-во
     */
    @Override
    public void addProduct(String product, int quantity) {
        productLinkedList.add(new Product(product, quantity));
    }

    /**
     * Удаление выбранного продукта из корзины
     * @param product
     */
    @Override
    public void removeProduct(String product) {
        productLinkedList.remove();
    }

    /**
     * Увеличение кол-ва продукта
     * @param product
     * @param quantity
     */
    @Override
    public void updateProductQuantity(String product, int quantity) {
    }

    /**
     * Очистка корзины
     */
    @Override
    public void clear() {
        productLinkedList.clear();
    }

    /**
     * Вывод содержимого корзины на экран
     */
    @Override
    public void printBasket() {
        System.out.println(productLinkedList);
        System.out.println();
        if (productLinkedList.isEmpty()){
            System.out.println("Basket is empty");
        }
    }

//    @Override
//    public LinkedList<String> getProducts() {
//        return null;
//    }
//
//    @Override
//    public int getProductQuantity(String product) {
//        return 0;
//    }
}
