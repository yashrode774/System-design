import Driver.DriverFactory;
import Driver.DriverProvider;

public class Main {

    public static void main(String[] args) {
        DriverFactory obj = new DriverFactory();
        DriverProvider driver = obj.getDriver("Observer");
        driver.start();
    }

}
