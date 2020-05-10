package com.company;


import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        //Test test = new Test();

        //create some cars
        Car mercedes = new Car("Benz", "Mercedes", 2019, 40000.00);
        Car seat = new Car("Alhambra", "Seat", 2020, 60000.00);
        Car theLittleOne = new Car("126P", "Fiat", 1980, 2000.00);

        Car fiat = new Car("Punto", "Fiat", 2003, 10000.00);
        Car fiat1 = new Car("Punto", "Fiat", 2003, 10000.00);


        //print
        System.out.println("Print Object Car seat: " + seat);
        System.out.println("Print Object Car fiat: " + fiat);
        System.out.println("And Fiat1 with the same value of pool: " + fiat1 + "\n");

        //comparison
        System.out.println("Comparison Fiat and Fiat1: " + fiat.equals(fiat1));
        System.out.println("Comparison Fiat and Fiat : " + fiat.equals(fiat) + "\n");
        //my own test
        System.out.println("Comparison with toString Fiat & Fiat1");
        System.out.println((fiat.toString()).equals(fiat1.toString()) + "\n");
        //toString method
        Animal bob = new Animal("Dog");
        Phone lg = new Phone("LG", "V40", 200.00);
        Human me = new Human("Wojo", "Graban", lg, bob);


        //If uncomment code below Human get a car :)
/*        me.setSalary(40000.00);
        me.setAuto(theLittleOne);*/

        System.out.println("Animal Object: " + bob + "\n" + "Phone Object: " + lg + "\n" + "Car Object: " + theLittleOne + "\n" +
                "Human Object: " + me);


    }

}
