package com.company.devices;

import com.company.Saleable;

public abstract class Device implements Saleable {
    String producer;
    String model;

    abstract public void turnOn();

}
