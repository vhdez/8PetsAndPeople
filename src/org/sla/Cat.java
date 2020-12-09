package org.sla;

public class Cat {
    String name;
    String breed;
    int age;
    Owner owner;
    float energy;
    float hunger;
    String color;

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
    }






