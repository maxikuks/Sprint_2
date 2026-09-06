package model;

public class Meat extends Food {
    public Meat(int amount, double price) {
        //Конструктор принимает два входных параметра — количество и цену.
        //И устанавливает для флага isVegetarian "правильное значение".
        super(amount,price,false);
    }
}