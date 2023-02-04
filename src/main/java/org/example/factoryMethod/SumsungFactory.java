package org.example.factoryMethod;

public class SumsungFactory extends SmartPhoneFabric{
    @Override
    public Phone createSmartPhone() {
        return new Sumsung();
    }
}
