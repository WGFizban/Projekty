package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Phone extends Device {

    static final String DEFAULT_PROTOCOL = "https";
    static final String DEFAULT_HOST = "wgfizbans.play.pl";
    static final int DEFAULT_PORT = 140;
    static final String DEFAULT_APP_VERSION = "Latest";
    Double screenSize;
    public List<Application> appList = new ArrayList<>();
    private Human owner;

    public void setOwner(Human owner) {
        this.owner = owner;
    }

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

    public boolean isAplicationInsatlled(Application apk) {
        return appList.contains(apk);
    }

    public boolean isAplicationInsatlled(String name) {
        return appList.toString().contains(name);
    }

    public void showFreeApp() {
        for (Application app : appList) {
            if (app.price == 0.0) System.out.println(app.toString());
        }
    }

    public Double priceAppOnPhone() {
        Double sumAppValue = 0.0;
        for (Application app : appList) {
            if (app != null) sumAppValue += app.price;
        }
        return sumAppValue;
    }

    public void sortMyAplicationByPrice() {
        Collections.sort(appList, Comparator.nullsLast(Comparator.comparingDouble(Application::getPrice)));
        System.out.println(appList);
    }

    public void sortMyAplicationByName() {
        Collections.sort(appList);
        System.out.println(appList);
    }


    //new installing app method
    public void installAnApp(Application apk) throws Exception {
        if (owner.cash < apk.price) {
            throw new Exception("Not enough money, sorry");
        } else {
            owner.cash -= apk.price;
            appList.add(apk);
            System.out.println("You sucesfully instal an App" + apk.toString());
        }
    }
}
