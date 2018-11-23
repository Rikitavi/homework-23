package ru.mukhametzyanov;

import java.util.LinkedList;

public class BasketImpl implements Basket {

    private LinkedList<Product> productLinkedList = new LinkedList<>();

    /**
     * Получение выбранного продукта по индексу
     *
     * @param index
     */
    void getIndexListNumber(int index) {
        System.out.println(productLinkedList.get(index));
    }

    /**
     * Добавление продукта в корзину
     *
     * @param product  имя продукта
     * @param quantity кол-во
     */
    @Override
    public void addProduct(String product, int quantity) {
        productLinkedList.add(new Product(product, quantity));
    }

    /**
     * Удаление выбранного продукта из корзины
     *
     * @param product
     */
    @Override
    public void removeProduct(String product) {
        productLinkedList.remove();
    }

    /**
     * Увеличение кол-ва продукта
     *
     * @param productName
     * @param quantity
     */
    @Override
    public void updateProductQuantity(String productName, int quantity) {
        //Поиск продукта объекта по имени
        Product product = getProductByName(productName);
        //увеличение кол - ва найденного продукта
        if (product != null) {
            product.setQuantity(quantity);
        }
    }

    /**
     * Метод осуществляет поиск продукта по его имени
     *
     * @param productName
     * @return
     */
    private Product getProductByName(String productName) {
        for (Product product : productLinkedList) {
            if (product.getProductName().equals(productName)) {
                return product;
            }
        }
        return null;
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
        if (productLinkedList.isEmpty()) {
            System.out.println("Basket is empty");
        } else {
            System.out.println(productLinkedList);
            System.out.println();
        }

    }
}
