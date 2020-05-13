package com.company.creatures;

import com.company.Saleable;

public class FarmAnimal extends Animal implements Edible, Saleable {

    static final String Def_Sheep_BreedMaterials = "wool";
    static final String Def_Chicken_BreedMaterials = "eggs";
    static final String Def_Other_BreedMaterials = "meet";
    public String breedingMaterials;

    public FarmAnimal(String species) {
        super(species);

        if (species.equals("Sheep")) {
            breedingMaterials = Def_Sheep_BreedMaterials;
        } else if (species.equals("Chicken")) {
            breedingMaterials = Def_Chicken_BreedMaterials;
        } else {
            breedingMaterials = Def_Other_BreedMaterials;
        }
    }


    @Override
    public void beEaten() {
        weight = 0.0;
        System.out.println("Bon Apetit");
    }

    public String toString() {
        return species + " " + breedingMaterials;
    }
}
