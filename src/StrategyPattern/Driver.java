package StrategyPattern;
import Driver.DriverProvider;

public class Driver extends DriverProvider {
    public void start() {
        Vehicle v = new OffroadVehicle();
        v.drive();

        v = new GoodsVehicle();
        v.drive();
    }
}
