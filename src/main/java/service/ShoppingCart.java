package service;

import model.Food;

//В нём создай класс для корзины — ShoppingCart.
public class ShoppingCart {
    private Food[] products;

    //Добавь в него поле — массив элементов из объектов типа Food.
    // Понадобится конструктор с одним параметром — массивом элементов Food. С его помощью ты создашь объект корзины.
    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    //получить общую сумму товаров в корзине без скидки,
    public double getCountNoDiscProduct() {
        double count = 0; //результат кол-ва товаров

        for(Food nProduct : products) {
            count += nProduct.getAmount() * nProduct.getPrice();
        }
        return count;
    }

    //получить общую сумму товаров в корзине со скидкой,
    public double getCountDiscProduct() {
        double count = 0; //результат кол-ва товаров

        //считать кол-во нужно будет как-то через for
        for(Food nProduct : products) {
            //переменная где хранится плдученная скидка
            double disc = nProduct.getDiscount();
            //т.к. скидка есть только у красных яблон, то делает расчет через (1 - disc / 100). В случаи красных яблок будет умножение на 0,4, а если обычное то будет умножение на 1-цу
            count += nProduct.getPrice() * nProduct.getAmount() * (1 - disc / 100);
        }

        return count;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double getCountNoDiscVeganProduct() {
        double count = 0; //результат кол-ва товаров

        //считать кол-во нужно будет как-то через for. Если есть признак isVegetarian = true, то считаем. имначе пропуск.
        for(Food nProduct : products) {
            if (nProduct.isVegetarian()) {
                count += nProduct.getPrice() * nProduct.getAmount();
            }
        }
        return count;
    }
}