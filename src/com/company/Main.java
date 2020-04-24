package com.company;


public class Main {

    public static void main(String[] args) {

        Test test = new Test();

        Human me = new Human();
        me.firstName = "Wojo";
        me.lastName = "Graban";
        me.setSalary(3000.00);

        //create some cars
        Car fiat = new Car("Punto", "Fiat", 2003, 10000.00);
        Car mercedes = new Car("Benz", "Mercedes", 2019, 40000.00);
        Car seat = new Car("Alhambra", "Seat", 2020, 60000.00);
        Car theLittleOne = new Car("126P", "Fiat", 1980, 2000.00);


        me.setAuto(mercedes);
        me.setAuto(seat);
        me.setAuto(fiat);
        System.out.println("My car \nModel: " + me.getAuto().model + "\nProducer: " + me.getAuto().producer + "\nYear of production: " + me.getAuto().year + "\nValue: " + me.getAuto().value);
        me.setAuto(theLittleOne);
        System.out.println("My car \nModel: " + me.getAuto().model + "\nProducer: " + me.getAuto().producer + "\nYear of production: " + me.getAuto().year + "\nValue: " + me.getAuto().value);


    }
}
