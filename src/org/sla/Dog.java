package org.sla;

// Author: Mr. Hernandez

public class Dog {

    // FIELDS (the data that describes any dog)
    String name;
    String breed;
    int age;
    Owner owner;
    float energy;
    float hunger;

    // METHODS (what all dogs do)
    void announce() {
        System.out.print("Woof!  I'm " + name +".  I'm a " + age + " year old " + breed + ".  ");
        // Notice that dog can get owner's name from the Owner object's field
        System.out.println("My owner is " + owner.name + ".");
        if (energy > 2.0) {
            System.out.println("Aaargh!  Walk me NOW!");
        }
        if (hunger > 2.0) {
            System.out.println("Growl!  Feed me please!");
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