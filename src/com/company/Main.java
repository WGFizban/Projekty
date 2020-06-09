package com.company;


import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) throws Exception {


        //create some cars
        DieselCar mercedes = new DieselCar("Benz", "Mercedes", 2019, 40000.00);
        ElectricCar elcar = new ElectricCar("Leaf", "Nissan", 2020, 300000.00);
        LPGCar lpgcar = new LPGCar("Panda", "Fiat", 2000, 1000.00);
        DieselCar seat = new DieselCar("Alhambra", "Seat", 2018, 60000.00);


        Pet bob = new Pet("Dog", "Bob");
        Pet nia = new Pet("Cat", "Nia");

        Phone lg = new Phone("LG", "V40", 200.00);
        Phone iphone = new Phone("Samsung", "Galaxy", 300.00);
        Human me = new Human("Wojo", "Graban", lg, bob);
        Human sister = new Human("Becia", "Budnik", iphone, nia);
        me.setAuto(elcar, 0);
        me.setAuto(mercedes, 1);
        me.setPhone(iphone);

        //test
        Application test1 = new Application("calculator", "v1", 20.00);
        Application test2 = new Application("mess", "v1", 0.0);
        Application test3 = new Application("facebook", "v1", 0.0);
        Application test4 = new Application("spotify", "v1", 20.00);
        Application test5 = new Application("email", "v1", 20.00);

        me.phone.installAnApp(test1);
        me.phone.installAnApp(test2);
        me.phone.installAnApp(test3);


    }

}
