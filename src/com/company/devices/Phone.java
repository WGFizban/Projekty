package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {

    static final String DEFAULT_PROTOCOL = "https";
    static final String DEFAULT_HOST = "wgfizbans.play.pl";
    static final int DEFAULT_PORT = 140;
    static final String DEFAULT_APP_VERSION = "Latest";
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

    //installing an App
    public void installAnnApp(String[] appNames) throws MalformedURLException {
        for (String appName : appNames) {
            installAnnApp(appName);
        }
    }

    public void installAnnApp(List<String> appNames) throws MalformedURLException {
        for (String appName : appNames) {
            installAnnApp(appName);
        }
    }

    public void installAnnApp(String appName) throws MalformedURLException {
        installAnnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnnApp(String appName, String appVersion) throws MalformedURLException {
        URL url = new URL(DEFAULT_PROTOCOL, DEFAULT_HOST, DEFAULT_PORT, appName + " version: " + appVersion);
        installAnnApp(url);
    }

    public void installAnnApp(URL appUrl) {
        System.out.println("On your Phone will be installed: " + appUrl.getFile());
    }


}
