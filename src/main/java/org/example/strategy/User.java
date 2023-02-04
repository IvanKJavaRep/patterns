package org.example.strategy;

public class User {
    public IPrinterStrategy strategy;

    public User(IPrinterStrategy strategy) {
        this.strategy = strategy;
    }
}
