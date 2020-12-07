package org.sla;

public class KomodoDragon {
    // FIELDS (the data that describes any dog)
    String name;
    String breed;
    int age;
    Owner owner;
    float attention;
    float hunger;

    // METHODS (what all dogs do)
    void announce() {
        System.out.print("Hiss!  I'm " + name +".  I'm a " + age + " year old " + breed + ".  ");
        // Notice that dog can get owner's name from the Owner object's field
        System.out.println("My owner is " + owner.name + ".");
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


