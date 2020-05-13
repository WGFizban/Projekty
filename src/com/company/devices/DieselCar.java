package com.company.devices;

public class DieselCar extends Car {

    Double dieselTankSize;

    public DieselCar(String model, String producer, Integer year, Double value) {
        super(model, producer, year, value);
    }

    @Override
    public void refuel() {
        System.out.println("Fill the tank with diesel fuel.");
    }
}
