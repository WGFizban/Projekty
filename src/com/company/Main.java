package com.company;


import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.DieselCar;
import com.company.devices.ElectricCar;
import com.company.devices.LPGCar;
import com.company.devices.Phone;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Test test = new Test();

        //create some cars
        DieselCar mercedes = new DieselCar("Benz", "Mercedes", 2019, 40000.00);


        //toString method
        Pet bob = new Pet("Dog", "Bob");
        Pet nia = new Pet("Cat", "Nia");

        Phone lg = new Phone("LG", "V40", 200.00);
        Phone iphone = new Phone("Samsung", "Galaxy", 300.00);
        Human me = new Human("Wojo", "Graban", lg, bob);
        Human sister = new Human("Becia", "Budnik", iphone, nia);
        me.setAuto(mercedes);


//        bob.Feed();
//        nia.Feed(25.00);
//        FarmAnimal sheep = new FarmAnimal("Sheep");
//        System.out.println(sheep.toString());


        //list of app
        List<String> appNames = new ArrayList<>();
        appNames.add("BTD6");
        appNames.add("Guns&Glory");
        appNames.add("D&D");
        appNames.add("facebook");

        //array of app
        String[] appToInstall = {"calculator", "calendar", "notebook"};


        try {
            iphone.installAnnApp(appNames);
            iphone.installAnnApp("Git");
            iphone.installAnnApp("WPS ofiice", "5.2.4");
            iphone.installAnnApp(appToInstall);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        ElectricCar elcar = new ElectricCar("Leaf", "Nissan", 2020, 300000.00);
        LPGCar lpgcar = new LPGCar("Panda", "Fiat", 2000, 1000.00);
        DieselCar seat = new DieselCar("Alhambra", "Seat", 2020, 60000.00);
        elcar.refuel();
        lpgcar.refuel();
        seat.refuel();


//        System.out.println("Animal Object: " + bob + "\n" + "Phone Object: " + lg + "\n" + "Car Object: " + theLittleOne + "\n" +
//                "Human Object: " + me);


    }

}
