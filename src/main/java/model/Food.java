package model;

public abstract class Food {
    //Поля должны быть доступны только из классов-потомков
    //Модификатор protected работает так же, как модификатор по умолчанию. При этом он даёт доступ классам-наследникам даже за пределами пакета.
    protected int amount; //Количество продукта в килограммах (целое число)
    protected double price; //Цена за единицу (вещественное число). Возможно, нужно использовать и float. Беру с запасом
    protected boolean isVegetarian; //Флаг, который показывает, вегетарианский ли продукт

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    //геттеры для получения значений переменных
    public int getAmount() {
        return  amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    //эксперипент
    public double getDiscount() {
        return 0;
    }
}