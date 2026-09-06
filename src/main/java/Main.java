import model.Food;
import model.Meat;
import model.Apple;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        //Инициализируй данные. Для этого создай объекты:
        //Мясо в количестве 5 кг по цене 100 рублей за кг;
        Meat meat = new Meat(5,100);
        //Яблоки красные в количестве 10 кг по цене 50 рублей;
        Apple rApple = new Apple(10,50,Colour.RED);
        //Яблоки зелёные в количестве 8 кг по цене 60 рублей.
        Apple gApple = new Apple(8,60,Colour.GREEN);

        //Создай массив продуктов из этих элементов
        Food[] products = {meat, rApple, gApple};
        //проинициализируй корзину с помощью созданного массива.
        ShoppingCart cart = new ShoppingCart(products);

        //Посчитай и выведи на экран значения для созданной корзины:
        //общую сумму товаров без скидки,
        System.out.println("Сумма товаров без скидки: " + cart.getCountNoDiscProduct());

        //общую сумму товаров со скидкой,
        System.out.println("Сумма товаров со скидками: " + cart.getCountDiscProduct());

        //сумму всех вегетарианских продуктов без скидки.
        System.out.println("Сумма вегетарианских товаров без скидки: " + cart.getCountNoDiscVeganProduct());

    }
}