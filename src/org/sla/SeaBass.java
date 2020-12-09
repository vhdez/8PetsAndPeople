package org.sla;

public class SeaBass {
    // FIELDS
    String name;
    int age;
    Owner owner;
    float energy;
    float hunger;

    // METHODS
    void announce() {
        System.out.print("blub! ");
        System.out.println("My owner is " + owner.name + ".");
        if (energy > 5.0) {
            System.out.println("splish splash");
        }
        if (hunger > 1.0) {
            System.out.println("blub! blub!");
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
