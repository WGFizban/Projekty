package com.company.devices;

public class Application implements Comparable<Application> {


    public String name;
    public String version;
    public Double price;

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Application ao) {
        int result = this.name.compareTo(ao.name);
        return result;
    }

    public String toString() {
        return name + " " + version + " " + price;
    }
}
