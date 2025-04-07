package ObserverPattern.observer;

import ObserverPattern.observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    String number;
    StockObservable observable;

    public MobileAlertObserver(String number, StockObservable observable) {
        this.observable = observable;
        this.number = number;
    }

    @Override
    public void update() {
        System.out.println("notified over text to " + number);
    }
}
