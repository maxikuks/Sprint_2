package model;

import model.constants.Colour;
import model.constants.Discount;

public class Meat extends Food implements Discountable{
    public Meat(int amount, double price) {
        //Конструктор принимает два входных параметра — количество и цену.
        //И устанавливает для флага isVegetarian "правильное значение".
        super(amount,price,false);
    }

    @Override
    public double getDiscount() {
        return 0;
    }

}