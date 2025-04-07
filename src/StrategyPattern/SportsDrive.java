package StrategyPattern;

public class SportsDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Sorts mode.");
    }
}
