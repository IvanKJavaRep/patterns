package org.example.adapter;

public class Adapter extends ElectronicWatch {
    public Adapter(MechanicalWatch mechanicalWatch) {
        super();
        int hours = mechanicalWatch.angleHour / 12;
        int minutes = mechanicalWatch.angleMinute / 60;
        this.hours = hours;
        this.minutes = minutes;

    }

}
