package org.example;

import org.example.adapter.Adapter;
import org.example.adapter.ElectronicWatch;
import org.example.adapter.MechanicalWatch;
import org.example.adapter.WatchUser;
import org.example.factoryMethod.AppleFactory;
import org.example.factoryMethod.SmartPhoneFabric;
import org.example.factoryMethod.SumsungFactory;
import org.example.observer.GAI1;
import org.example.observer.GAI2;
import org.example.observer.Publisher;
import org.example.observer.Subscriber;
import org.example.strategy.BasicPrinter;
import org.example.strategy.CoolPrinter;
import org.example.strategy.User;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //strategy test
        User user = new User(new BasicPrinter());
        user.strategy.print();
        User user1 = new User(new CoolPrinter());
        user1.strategy.print();
        // observer test
        Publisher publisher = new Publisher();
        GAI1 gai1 = new GAI1();
        GAI2 gai2 = new GAI2();
        publisher.addSubscriber(gai1);
        publisher.addSubscriber(gai2);
        publisher.notifySubscribers();
        //factoryMethod test
        Random random = new Random();
        int i = random.nextInt(2);
        SmartPhoneFabric fabric;
        if (i % 2 == 0) {
            fabric = new SumsungFactory();
        } else {
            fabric = new AppleFactory();
        }
        fabric.createSmartPhone().pack();
        //adapter test
        ElectronicWatch electronicWatch = new ElectronicWatch(1, 5);
        WatchUser watchUser = new WatchUser();
        watchUser.getTime(electronicWatch);
        MechanicalWatch mechanicalWatch = new MechanicalWatch(60, 120);
        Adapter adapter = new Adapter(mechanicalWatch);
        watchUser.getTime(adapter);

    }
}