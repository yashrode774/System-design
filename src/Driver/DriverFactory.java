package Driver;

public class DriverFactory {
    public DriverProvider getDriver(String pattern){
        switch (pattern) {
            case "Strategy":
                return new StrategyPattern.Driver();
            case "Observer":
                return new ObserverPattern.Driver();
            case "Factory":
                return new FactoryPattern.Driver();
            case "Decorator":
                return new DecoratorPattern.Driver();
            default:
                return null;
        }
    }
}
