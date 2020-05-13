package com.company;

import com.company.creatures.Human;

public class Test {


    void testHumanSalary(Human person) {

        person.setSalary(2000.00);
        System.out.println(person.getSalary() + "\n");
        person.setSalary(-1000.00);
        person.setSalary(30000.00);
        System.out.println(person.getSalary() + "\n");
        person.setSalary(-2000.00);
    }


}
