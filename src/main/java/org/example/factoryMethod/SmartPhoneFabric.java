package org.example.factoryMethod;

public abstract class SmartPhoneFabric {
    public void packDevice() {
        Phone phone = createSmartPhone();
        phone.pack();
    }

    public abstract Phone createSmartPhone();
}
