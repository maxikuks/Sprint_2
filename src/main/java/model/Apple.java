package model;
//т.к. тут используются переменные из пакета constants, то его нужно импортировать
//забираю через * сразу все что есть в пакете. в дальнейшем может нужно будет конретизировать.
import model.constants.*;

public class Apple extends Food implements Discountable {
    private String colour; //Строковое поле "Цвет яблок"

    public Apple(int amount, double price, String colour) {
        //Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
        super(amount,price,true);
        this.colour = colour;
    }

    //Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
    @Override
    public double getDiscount() {
        if(Colour.RED.equals(colour)) {
            return Discount.RED_APPLE_DISC;
        }
        return 0;
    }
}