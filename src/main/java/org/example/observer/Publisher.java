package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (var sub :
                subscribers) {
            sub.update();
        }
    }
}
