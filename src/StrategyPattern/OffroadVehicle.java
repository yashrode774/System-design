package StrategyPattern;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new SportsDrive());
    }
}
