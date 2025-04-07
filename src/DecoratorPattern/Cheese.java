package DecoratorPattern;

public class Cheese extends ExtraToppings{
    Pizza pizza;

    Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 10;
    }
}