package org.example.factoryMethod;

public class AppleFactory extends SmartPhoneFabric{
    @Override
    public Phone createSmartPhone() {
        return new Apple();
    }
}
