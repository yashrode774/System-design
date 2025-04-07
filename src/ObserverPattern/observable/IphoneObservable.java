package ObserverPattern.observable;

import ObserverPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {
    public List<NotificationAlertObserver> observerList = new ArrayList<>();

    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver obs: observerList) {
            obs.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
