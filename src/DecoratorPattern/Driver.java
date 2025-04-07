package DecoratorPattern;
import Driver.DriverProvider;

public class Driver extends DriverProvider {
    public void start() {
//        Pizza p = new Cheese((new Marghereta()));
//        System.out.println(p.getPrice());

        Pizza p = new Cheese(new Paneer((new Marghereta())));
        System.out.println(p.getPrice());
    }
}
