package com.company;

import com.company.creatures.Human;

//interface saleable
public interface Saleable {
    void sellMe(Human buyer, Human seller, Double price) throws Exception;

}
