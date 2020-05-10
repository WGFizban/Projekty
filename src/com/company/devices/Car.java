package com.company.devices;

public class Car extends Device {
    public Double value;
    Integer year;


    public Car(String model, String producer, Integer year, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value = value;
    }

    //overriding the toString() method for Car
    public String toString() {
        return producer + " " + model + " " + year + " " + value;
    }

    //overriding the clone() method for Car
    public Object clone() {
        Car aclone = new Car(this.model, this.producer, this.year, this.value);
        return aclone;
    }


    @Override
    public void turnOn() {
        System.out.println("Car is on");
    }

    @Override
    public void sellMe() {
        System.out.println("You sell car " + this.model);
    }
}

