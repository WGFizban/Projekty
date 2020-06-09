package com.company;


import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.DieselCar;
import com.company.devices.ElectricCar;
import com.company.devices.LPGCar;
import com.company.devices.Phone;

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

        //uncoment code below to throw freee place exception
        //sister.setSalary(90000.00);
        //sister.buyAutoFromSalon(lpgcar, 1);
        sister.setAuto(lpgcar, 0);
        me.sortMyCars();
        sister.sortMyCars();

//test selling car
        System.out.println(elcar.showLastOwner());
        elcar.sellMe(sister, me, 10.00); // succesfully sell
        //elcar.sellMe(sister, me,8000000.00); //exception with price
        //lpgcar.sellMe(sister, me,10.00); // exception with ownership
        System.out.println(elcar.showLastOwner());

        System.out.println("Has seat owners: " + seat.showLastOwner() + " number of transaction " + seat.numberOfCarTransaction());
        System.out.println("Has nissan owners: " + elcar.hasAnOwner() + " number of transaction " + elcar.numberOfCarTransaction());
        System.out.println("Has mercedes owners: " + mercedes.hasAnOwner() + " number of transaction " + mercedes.numberOfCarTransaction());
        elcar.wasTransactioBetwenAB(me, sister);


    }

}
