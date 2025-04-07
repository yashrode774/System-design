package ObserverPattern.observable;

import ObserverPattern.observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver obj);
    public void remove(NotificationAlertObserver obj);
    public void notifySubscribers();
    public void setStockCount(int count);
    public int getStockCount();

}
