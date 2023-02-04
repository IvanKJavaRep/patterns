package org.example.strategy;

public class CoolPrinter implements IPrinterStrategy{
    @Override
    public void print() {
        System.out.println("Cool printer printed a line");
    }
}
