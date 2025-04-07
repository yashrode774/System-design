package ObserverPattern.observer;

import ObserverPattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    String EmailId;
    StockObservable observable;

    public EmailAlertObserver(String EmailId, StockObservable observable) {
        this.observable = observable;
        this.EmailId = EmailId;
    }

    @Override
    public void update() {
        System.out.println("notified over email to " + EmailId);
    }
}
