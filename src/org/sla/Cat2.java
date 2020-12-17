package org.sla;

public class Cat2 extends Pet {
    float energy;

    //CONSTRUCTORS//
    public Cat2(String name, String breed, int age,  Owner owner, float energy, float hunger){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
        this.energy = energy;
        this.hunger = hunger;
    }

    void announce() {
        System.out.print("Meow. Who am I? Oh yeah, I'm " + name +".  I'm a " + age + " year old " + breed + ".  ");
        System.out.println("My owner is " + owner.name + ". I think.");
        if (energy > 2.0) {
            System.out.println("Hithhhh I have a mission! Let me OUT!");
        }
        if (hunger > 2.0) {
            System.out.println("Meow  Feed me please!");
        }
    }

    void eat(float foodAmount) {
        hunger = hunger - foodAmount;
        energy = energy + foodAmount;
        if (hunger > 2.0) {
            System.out.println(name + " says: Hith!  I'm STILL hungry! Feed ME");
        } else {
            System.out.println(name + " says: Thanks!  Ima go do my thing!");
        }
    }

    void exercise(float time) {
        energy = energy - time;
        hunger = hunger + time;
        if (energy > 2.0) {
            System.out.println(name + " says: Aaargh!  Get the string!");
        } else {
            System.out.println(name + " says: Thanks!  I'm ready for a nap.");
        }
    }
}
