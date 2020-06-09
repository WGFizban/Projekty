package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {


    private Integer year;
    public List<Human> owners = new ArrayList<>();

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
//metod show last owner
    public String showLastOwner() {
        if (owners.size() > 0) return (owners.get(owners.size() - 1)).firstName;
        return "Actually no owner";
    }

    public boolean hasAnOwner() {
        return owners.size() > 0;
    }

    public int numberOfCarTransaction() {
        if (owners.size() > 1) return owners.size() - 1;
        return 0;
    }

    public void wasTransactioBetwenAB(Human aSeller, Human bBuyer) {
        if (owners.contains(aSeller) || owners.contains(bBuyer)) {
            if (owners.indexOf(aSeller) < owners.indexOf(bBuyer)) {
                if (owners.indexOf(aSeller) + 1 == owners.indexOf(bBuyer)) {
                    System.out.println(aSeller.firstName + " sell car to " + bBuyer.firstName);
                } else System.out.println("No transaction where A sell to B");
            } else System.out.println("No transaction where " + aSeller.firstName + " sell car to " + bBuyer.firstName);
        } else System.out.println("No transaction where A sell to B");
    }

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
        } else if (seller.whatPlaceCarInGarage(this) < 0 || !seller.firstName.equals(this.showLastOwner())) {
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

