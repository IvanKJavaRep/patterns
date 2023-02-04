package org.example.observer;

public class GAI1 implements Subscriber {
    @Override
    public void update() {
        System.out.println("gai1 is notified");
    }
}
