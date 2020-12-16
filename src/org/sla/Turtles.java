package org.sla;

// Alonso's GLORIOUS Turtle

public class Turtles extends Pet{

    float energy;

    Turtles(){

    }

    public Turtles(String name, int age, Owner owner, float energy, float hunger) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.energy = energy;
        this.hunger = hunger;
    }

    // METHODS
    void announce() {
        System.out.print("*turtle noise!  I'm " + name + ".  I'm a " + age + " year old.");
        System.out.println("My owner is " + owner.name + ".");
        if (energy > 2.0) {
            System.out.println("*turtle scream!  LET ME SWIM!");
        }
        if (hunger > 2.0) {
            System.out.println("*turtle scream! FOOOOOOOOD! NOOOOW!");
        }
    }

    void eat(float foodAmount) {
        hunger = hunger - foodAmount;
        energy = energy + foodAmount;
        if (hunger > 2.0) {
            System.out.println(name + " says: *turtle scream! MAKE ME FAT!");
        } else {
            System.out.println(name + " says: *happy turtle noise*");
        }
    }

    void exercise(float time) {
        energy = energy - time;
        hunger = hunger + time;
        if (energy > 2.0) {
            System.out.println(name + " says: *turtle scream! NO. I DON'T WANT TO GO!");
        } else {
            System.out.println(name + " says: *happy turtle splash*");
        }
    }
}
