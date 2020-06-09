package com.company.devices;

public class ElectricCar extends Car {

    Double batterySize;

    public ElectricCar(String model, String producer, Integer year, Double value) {
        super(model, producer, year, value);
    }

    @Override
    public void refuel() {
        System.out.println("Connect the battery for charging.");
    }


}
