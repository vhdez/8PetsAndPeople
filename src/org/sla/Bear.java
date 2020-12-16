package org.sla;

public class Bear extends Pet {
    float energy;
    float hunger;


    public Bear(String name, String breed, int age, Owner owner, float energy, float hunger) {
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
            System.out.println(name + " says: im gonna take that hibernation nap now");
        }
    }
}
