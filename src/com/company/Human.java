package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;

//extends
public class Human extends Animal {
    public String firstName;
    String lastName;
    public Phone phone;
    Animal pet;
    Car auto;
    private Double salary;
    private Double lastSalary; // last value of salary before set new
    private Integer countOfGet = 0; // number of execution getter
    private LocalDateTime lastGet; // date and time of last execution
    public Double cash = 300.0; //cash to buy things

    public Human(String firstName, String lastName, Phone phone, Animal pet) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
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


    public Car getAuto() {
        return this.auto;
    }

    public void setAuto(Car auto) {
        this.auto = auto;
    }

    public void buyAutoFromSalon(Car auto) {

        if (this.salary > auto.value) {
            System.out.println("You successfully buy a car without any loan! :D");
            this.auto = auto;
        } else if (salary > (auto.value / 12)) {
            System.out.println("You buy a car successfully, but you need a loan. Very sad but true :( ");
            this.auto = auto;
        } else {
            System.out.println("You won't buy this car. Go to college, find a new job and start earning more! :P");
        }
    }

    //overriding the toString() method for Human
    public String toString() {
        return firstName + " " + lastName + " " + phone + " " + pet + " " + auto;
    }
}
