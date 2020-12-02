package org.sla;

public class Bear {
    String name;
    String breed;
    int age;
    Owner owner;
    float energy;
    float hunger;

    // METHODS (what all dogs do)
    void announce() {
        System.out.print("Yo! wassup it's ya boi " + name +".  I'm a whole " + age + " I'm like " + breed + " years old.  ");
        // Notice that dog can get owner's name from the Owner object's field
        System.out.println("My owner is " + owner.name + ".");
        if (energy > 1.0) {
            System.out.println("Im going to hurt you! let me in the wild!");
        }
        if (hunger > 3.0) {
            System.out.println( "rawr and all that! give me honey!");
        }
    }

    void eat(float foodAmount) {
        hunger = hunger - foodAmount;
        energy = energy + foodAmount;
        if (hunger > 3.0) {
            System.out.println(name + " says: Get back here!  I still got the rumblies!");
        } else {
            System.out.println(name + " says: Thanks!  Imma poop on that tree!");
        }
    }

    void exercise(float time) {
        energy = energy - time;
        hunger = hunger + time;
        if (energy > 1.0) {
            System.out.println(name + " says: Yo im not done here!  I gotta find a fish or somthing!");
        } else {
            System.out.println(name + " says: Ready for winter!");
        }
    }
}
