package com.company.devices;

import com.company.creatures.Human;

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

    @Override
    public void turnOn() {
        System.out.println("Phone is on");
    }

    @Override
    public void sellMe(Human buyer, Human seller, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("Not enough money, sorry");
        } else if (seller.phone != this) {
            throw new Exception("You can't sell this: " + this.toString() + " Its not your!");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.phone = this;
            seller.phone = null;
            System.out.println(seller.firstName + " successfully sell " + this.toString() + " for price " + price + " to " + buyer.firstName);
        }
    }
}
