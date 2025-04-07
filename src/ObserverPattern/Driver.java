package ObserverPattern;

import Driver.DriverProvider;

import ObserverPattern.observable.IphoneObservable;
import ObserverPattern.observable.StockObservable;
import ObserverPattern.observer.EmailAlertObserver;
import ObserverPattern.observer.MobileAlertObserver;
import ObserverPattern.observer.NotificationAlertObserver;

public class Driver extends DriverProvider {

    public void start() {
        StockObservable observable = new IphoneObservable();
        NotificationAlertObserver observer1 = new EmailAlertObserver("yashrode774@gmail.com", observable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("niks@gmail.com", observable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("8554877583", observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setStockCount(10);
    }
}
