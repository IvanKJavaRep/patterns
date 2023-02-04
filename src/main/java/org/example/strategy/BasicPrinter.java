package org.example.strategy;

public class BasicPrinter implements IPrinterStrategy{
    @Override
    public void print() {
        System.out.println("Basic printer printed a line");
    }
}
