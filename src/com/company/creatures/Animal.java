package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Saleable, Feedable {
    final String species;

    static final Double DEFAULT_DOG_WEIGHT = 30.0;
    File pic;
    static final Double DEFAULT_LION_WEIGHT = 80.0;
    static final Double DEFAULT_OTHER_WEIGHT = 1.0;
    static final Double DEFAULT_FOOD_WEIGHT = 1.0;
    protected Double weight;


    public Animal(String species) {
        this.species = species;

        if (species.equals("Dog")) {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("Lion")) {
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = DEFAULT_OTHER_WEIGHT;
        }
    }

    @Override
    public void Feed() {
        Feed(DEFAULT_FOOD_WEIGHT);
    }

    @Override
    public void Feed(Double foodWeight) {
        if (weight != 0) {
            weight += foodWeight;
            System.out.println("Thanks! New weight is " + weight);
        } else {
            System.out.println("You can't feed dead animal");
        }
    }

    void takeForAWalk() {
        if (weight != 0) {
            weight--;
            System.out.println("Thanks! New weight is " + weight);
        } else {
            System.out.println("You can't walk with dead animal");
        }
    }

    //overriding the toString() method for Animal
    public String toString() {
        return species;
    }

    //implementation interface
    @Override
    public void sellMe(Human buyer, Human seller, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("You cant sell human you idiot");
        } else if (buyer.cash < price) {
            throw new Exception("Not enough money, sorry");
        } else if (seller.pet != this) {
            throw new Exception("You can't sell this: " + this.toString() + " Its not your!");
        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = this;
            seller.pet = null;
            System.out.println(seller.firstName + " successfully sell " + this.toString() + " for price " + price + " to " + buyer.firstName);

        }

    }
}
