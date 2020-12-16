package org.sla;

public class SeaBass extends Pet {
    // FIELDS
    WaterBender trainer;
    float energy;

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
