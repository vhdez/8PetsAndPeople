package org.sla;

public class KomodoDragon extends Pet {
    // FIELDS (the data that describes any komodo dragon)
    float attention;

    // METHODS (what all dogs do)
    void announce() {
        super.announce();

        if (attention > 2.0) {
            System.out.println("Aaargh!  Rub my back!");
        }
        if (hunger > 2.0) {
            System.out.println("Growl!  Feed me meat!");
        }
    }

    void eat(float foodAmount) {
        // Update Dog object's fields since both are affected by eating
        hunger = hunger - foodAmount;
        hunger = hunger + foodAmount;
        if (hunger > 2.0) {
            System.out.println(name + " says: Growl!  I'm STILL hungry, im bout to eat you!");
        } else {
            System.out.println(name + " says: Thanks!  You can go now");
        }
    }

    void exercise(float time) {
        // Update Dog object's fields since both are affected by exercising
        attention = attention - time;
        attention = attention + time;
        if (attention > 2.0) {
            System.out.println(name + " says: Aaargh!  Keep rubbing!");
        } else {
            System.out.println(name + " says: Thanks!  You can go now.");
        }
    }
}


