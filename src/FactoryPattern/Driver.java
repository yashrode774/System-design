package FactoryPattern;
import Driver.DriverProvider;

public class Driver extends DriverProvider {

    public void start() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s = shapeFactory.getShape("Circle");
        s.draw();
    }
}
