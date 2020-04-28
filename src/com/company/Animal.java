package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    static final Double DEFAULT_DOG_WEIGHT = 30.0;
    File pic;
    static final Double DEFAULT_LION_WEIGHT = 80.0;
    static final Double DEFAULT_OTHER_WEIGHT = 1.0;
    private Double weight;


    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
        if (species.equals("Dog")) {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("Lion")) {
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = DEFAULT_OTHER_WEIGHT;
        }

    }


    void feed() {
        if (weight != 0) {
            weight++;
            System.out.println("New weight is" + weight);
        } else {
            System.out.println("You can't feed dead animal");
        }
    }

    void takeForAWalk() {
        if (weight != 0) {
            weight--;
            System.out.println("New weight is" + weight);
        } else {
            System.out.println("You can't walk with dead animal");
        }
    }

    //overriding the toString() method for Animal
    public String toString() {
        return species + " " + name;
    }
}
