package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device {


    private Integer year;

    public Integer getYear() {
        return year;
    }

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

//    //overriding the clone() method for Car
//    public Object clone() {
//        Car aclone = new Car(this.model, this.producer, this.year, this.value);
//        return aclone;
//    }

    abstract public void refuel();


    @Override
    public void turnOn() {
        System.out.println("Car is on");
    }


    @Override
    public void sellMe(Human buyer, Human seller, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("Not enough money, sorry");
        } else if (buyer.checkFirstFreePlaceInGarage() < 0) {
            throw new Exception("Buyer has no free place for this");
        } else if (seller.whatPlaceCarInGarage(this) < 0) {
            throw new Exception("You can't sell this: " + this.toString() + " Its not your!");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.setAuto(this, buyer.checkFirstFreePlaceInGarage());
            seller.setAuto(null, seller.whatPlaceCarInGarage(this));
            System.out.println(seller.firstName + " successfully sell " + this.toString() + " for price " + price + " to " + buyer.firstName);
        }
    }


}

