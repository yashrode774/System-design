package DecoratorPattern;

public class Paneer extends ExtraToppings {
    Pizza pizza;

    Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 50;
    }
}
