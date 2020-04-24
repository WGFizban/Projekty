package com.company;

public class Car {
    String model;
    String producer;
    Integer year;
    Double value;

    public Car(String model, String producer, Integer year, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value = value;
    }


    public Object clone() {
        Car aclone = new Car(this.model, this.producer, this.year, this.value);
        return aclone;
    }


}

