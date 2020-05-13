package com.company.devices;

public class LPGCar extends Car {

    Double LPGtankSize;

    public LPGCar(String model, String producer, Integer year, Double value) {
        super(model, producer, year, value);
    }

    @Override
    public void refuel() {
        System.out.println("Fill the LPG tank.");
    }
}
