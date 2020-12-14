package org.sla;

public class Pet {

    // FIELDS (the data that describes any pet)
    String name;
    String breed;
    int age;
    Owner owner;
    float hunger;

    // CONSTRUCTORS

    // METHODS (what all pets do)
    void announce() {
        System.out.print("Woof!  I'm " + name +".  I'm a " + age + " year old " + breed + ".  ");
        // Notice that dog can get owner's name from the Owner object's field
        // System.out.println("My owner is " + owner.name + ".");
        if (hunger > 2.0) {
            System.out.println("Growl!  Feed me please!");
        }
    }


    void eat(float foodAmount) {
        // Update Dog object's fields since both are affected by eating
        hunger = hunger - foodAmount;
        if (hunger > 2.0) {
            System.out.println(name + " says: Growl!  I'm STILL hungry!");
        } else {
            System.out.println(name + " says: Thanks!  Now I need to poo!");
        }
    }

    void exercise(float time) {
        // Update Dog object's fields since both are affected by exercising
        hunger = hunger + time;
        System.out.println(name + " says: Thanks!  I'm ready for a nap!");
    }
}