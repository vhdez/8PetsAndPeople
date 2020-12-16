package org.sla;

public class Cat extends Pet {

    float energy;

    public Cat(String name, String breed, int age, Owner owner, float energy, float hunger) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
        this.energy = energy;
        this.hunger = hunger;
    }

    void announce() {
        System.out.print("Hello my name is " + name + ".  I'm " + breed + " I just turned  " + age + " years old.  ");
        // Notice that dog can get owner's name from the Owner object's field
        System.out.println("My owner is " + owner.name + ".");
        if (energy > 1.0) {
            System.out.println("Let me go out");
        }
        if (hunger > 3.0) {
            System.out.println("I'm hungry give me some food!");
        }
    }

    void eat(float foodAmount) {
        hunger = hunger - foodAmount;
        energy = energy + foodAmount;
        if (hunger > 2.0) {
            System.out.println(name + " says: I'm STILL hungry! Feed ME");
        } else {
            System.out.println(name + " says: Thanks! ");
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





