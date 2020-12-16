package org.sla;

public class SeaBass extends Pet {
    // FIELDS
    WaterBender trainer;
    float energy;

    public SeaBass(String name, String breed, int age, Owner owner, float energy, float hunger) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
        this.energy = energy;
        this.hunger = hunger;
    }



    // METHODS
    void announce() {
        System.out.print("blub!");
        super.announce();
        if (energy > 5.0) {
            System.out.println("splish splash");
        }
    }


    void eat(float foodAmount) {
        // Update for eat
        hunger = hunger - foodAmount;
        energy = energy + foodAmount;
        if (hunger > 1.0) {
            System.out.println(name + ": blub! blub!");
        } else {
            System.out.println(name + ": . . .");
        }
    }

    void swim(float time) {
        // Update for exercise
        energy = energy - time;
        hunger = hunger + time;
        if (energy > 5.0) {
            System.out.println(name + ": splish splash");
        } else {
            System.out.println(name + ": z z z");
        }
    }
}
