package org.example.observer;

public class GAI2 implements Subscriber {
    @Override
    public void update() {
        System.out.println("gai2 is notified");
    }
}
