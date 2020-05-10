package com.company.devices;

public class Phone extends Device {
    Double screenSize;

    public Phone(String producer, String model, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
    }

    //overriding the toString() method for Phone
    public String toString() {
        return producer + " " + model + " " + screenSize;
    }

}
