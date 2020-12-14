package org.sla;

// Author: Mr. Hernandez

public class Dog extends Pet {

    // FIELDS (the extra data that describes any dog)
    float energy;

    // CONSTRUCTORS

    Dog() {

    }

    public Dog(String name, String breed, int age, Owner owner, float energy, float hunger) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
        this.energy = energy;
        this.hunger = hunger;
    }

    // METHODS (what all dogs do)
    void announce() {
        super.announce();

        if (energy > 2.0) {
            System.out.println("Aaargh!  Walk me NOW!");
        }
    }

    void eat(float foodAmount) {
        // Update Dog object's fields since both are affected by eating
        hunger = hunger - foodAmount;
        energy = energy + foodAmount;
        if (hunger > 2.0) {
            System.out.println(name + " says: Growl!  I'm STILL hungry!");
        } else {
            System.out.println(name + " says: Thanks!  Now I need to poo!");
        }
    }

    void exercise(float time) {
        // Update Dog object's fields since both are affected by exercising
        energy = energy - time;
        hunger = hunger + time;
        if (energy > 2.0) {
            System.out.println(name + " says: Aaargh!  Hold that leash!");
        } else {
            System.out.println(name + " says: Thanks!  I'm ready for a nap!");
        }
    }
}