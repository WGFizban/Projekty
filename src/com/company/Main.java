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

        //toString method
        Animal bob = new Animal("Dog");
        Animal nia = new Animal("Cat");
        bob.name = "Bob";
        nia.name = "Nia";
        Phone lg = new Phone("LG", "V40", 200.00);
        Phone iphone = new Phone("Samsung", "Galaxy", 300.00);
        Human me = new Human("Wojo", "Graban", lg, bob);
        Human sister = new Human("Becia", "Budnik", iphone, nia);
        me.setAuto(mercedes);


        //Some try using saleable
        try {
            //sell nia not my pet
            nia.sellMe(sister, me, 100.00);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //sell me :)
            me.sellMe(sister, me, 500.00);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("My sister pet  " + sister.pet + " and cash " + sister.cash);
            System.out.println("My pet  " + me.pet + " and cash " + me.cash);
            //sell bob my pet
            bob.sellMe(sister, me, 100.00);
            System.out.println("My sister pet  " + sister.pet + " and cash " + sister.cash);
            System.out.println("My pet  " + me.pet + " and cash " + me.cash);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //my sister sell your iphone to me
            iphone.sellMe(me, sister, 300.00);
            //me sell mercedes to my sister
            mercedes.sellMe(sister, me, 250.00);

        } catch (Exception e) {
            e.printStackTrace();
        }


//        System.out.println("Animal Object: " + bob + "\n" + "Phone Object: " + lg + "\n" + "Car Object: " + theLittleOne + "\n" +
//                "Human Object: " + me);


    }

}
