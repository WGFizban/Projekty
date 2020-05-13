package com.company;


import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
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

        //toString method
        Pet bob = new Pet("Dog", "Bob");
        Pet nia = new Pet("Cat", "Nia");

        Phone lg = new Phone("LG", "V40", 200.00);
        Phone iphone = new Phone("Samsung", "Galaxy", 300.00);
        Human me = new Human("Wojo", "Graban", lg, bob);
        Human sister = new Human("Becia", "Budnik", iphone, nia);
        me.setAuto(mercedes);


        bob.Feed();
        nia.Feed(25.00);
        FarmAnimal sheep = new FarmAnimal("Sheep");
        System.out.println(sheep.toString());


//        System.out.println("Animal Object: " + bob + "\n" + "Phone Object: " + lg + "\n" + "Car Object: " + theLittleOne + "\n" +
//                "Human Object: " + me);


    }

}
