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
        System.out.println("\n Sum value of my cars in garage " + me.valueCarsInGarage() + "\n My sister Sum value cars in  garage " + sister.valueCarsInGarage());

//test selling car
        elcar.sellCar(sister, me, 1, 10.00); // succesfully sell
        // elcar.sellCar(sister, me, 1, 8000000.00); //exception with price
        // elcar.sellCar(sister, me, 1, 10.00); // exception with ownership

        me.sortMyCars();
        sister.sortMyCars();


        System.out.println(sister);


//test
        //Car[] offer = {mercedes, elcar, lpgcar,null, seat,null};

        //System.out.println("Cars in offer before sort: " + Arrays.toString(offer));
//sort with null
        //Arrays.sort(offer,Comparator.nullsLast(Comparator.comparingInt(Car::getYear)));

        //System.out.println("Cars in offer after sort: " + Arrays.toString(offer));


        //System.out.println(me.getAuto(0) + "\n" + me.getAuto(1));
        System.out.println("\n Sum value of my cars in garage " + me.valueCarsInGarage() + "\n My sister Sum value cars in  garage " + sister.valueCarsInGarage());


    }

}
