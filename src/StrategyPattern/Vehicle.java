package StrategyPattern;

public class Vehicle {
    DriveStrategy obj;

    // This is called Constructor injection.
    Vehicle(DriveStrategy obj) {
        this.obj = obj;
    }

    public void drive() {
        obj.drive();
    }

}
