package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;


//extends
public class Human extends Animal {
    public String firstName;
    String lastName;
    public Phone phone;
    public Animal pet;


    static final int DEFAULT_NUMBER_CAR_IN_GARAGE = 2;
    public Double cash = 30000.0; //cash to buy things


    //Car auto;


    private Double salary;
    private Double lastSalary; // last value of salary before set new
    private Integer countOfGet = 0; // number of execution getter
    private LocalDateTime lastGet; // date and time of last execution
    private Car[] garage;

    public Human(String firstName, String lastName, Phone phone, Animal pet) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.garage = new Car[DEFAULT_NUMBER_CAR_IN_GARAGE];
    }

    //overriding constructor for Human
    public Human(String firstName, String lastName, Phone phone, Animal pet, int garageLimit) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.garage = new Car[garageLimit];
    }

    public Double getSalary() {

        if (countOfGet == 0) {
            countOfGet++;
            lastSalary = salary;
            lastGet = LocalDateTime.now();
            System.out.println("This is information about your salary.\nNumber of execution 'get':" + countOfGet + " Date of last execution:" + lastGet + "\nSalary: ");
            return this.salary;
        } else {
            countOfGet++;
            System.out.println("This is information about your salary.\nNumber of execution 'get':" + countOfGet + " Date of last execution:" + lastGet + "\nSalary on that day: " + lastSalary);
            lastGet = LocalDateTime.now();
            lastSalary = salary;
            System.out.println("Your salary now: ");
            return this.salary;
        }
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Warning! Your salary may not be less than zero.\nThis may be an attempt to make an unauthorized salary change!\n");
        } else {
            System.out.println("Your salary has been changed to a new value.\nThis information has been sent to the accounting system. " +
                    "You must collect an annex to the contract in HR.\n" +
                    "Please :) do not hide the value of your salary, because Tax Office and Social Security Office already know about the change.\n");
            this.salary = salary;
        }

    }


    // refactor get and set car
    public Car getAuto(int placeInGarage) {
        return this.garage[placeInGarage];
    }

    public void setAuto(Car auto, int placeInGarage) {
        if (auto != null) auto.owners.add(this);
        this.garage[placeInGarage] = auto;
    }

    // calculated value of cars in garage
    public Double valueCarsInGarage() {
        Double sumCarValue = 0.0;
        for (Car car : garage) {
            if (car != null) sumCarValue += car.value;
        }
        return sumCarValue;
    }

    //check free place in garage
    public int checkFirstFreePlaceInGarage() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) return i;
        }
        return -1;
    }

    public int whatPlaceCarInGarage(Car auto) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == auto) return i;
        }
        return -1;
    }


    public void buyAutoFromSalon(Car auto, int garagePlace) {

        if (this.cash > auto.value) {
            System.out.println("You successfully buy a car without any loan! :D");
            this.setAuto(auto, garagePlace);
        } else if (cash > (auto.value / 12)) {
            System.out.println("You buy a car successfully, but you need a loan. Very sad but true :( ");
            this.setAuto(auto, garagePlace);
        } else {
            System.out.println("You won't buy this car. Go to college, find a new job and start earning more! :P");
        }
    }

    //overriding the toString() method for Human
    public String toString() {
        return firstName + " " + lastName + " " + phone + " " + pet + " " + Arrays.toString(garage);
    }

    public void sortMyCars() {
        Arrays.sort(garage, Comparator.nullsLast(Comparator.comparingInt(Car::getYear)));
        System.out.println("Your cars " + firstName + " are sort: " + Arrays.toString(this.garage));
    }
}
