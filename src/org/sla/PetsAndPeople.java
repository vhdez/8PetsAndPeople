package org.sla;

// Author: Mr. Hernandez

public class PetsAndPeople {

    public static void main(String[] args) {
	    // Mr. Hernandez has 2 dogs!
        // FIRST: Assign values to FIELDS
        // Construct an Owner object to represent Mr. Hernandez
        Owner mrHernandez = new Owner();
        // Assign values to all of this Owner object's fields
        mrHernandez.name = "Mr. Hernandez";
        mrHernandez.dogFood = 12;
        mrHernandez.freeTime = 1.75f;
        mrHernandez.money = 40;

        // Construct a Dog object to represent Mr. Hernandez's first pet Rufus
        Dog dog1 = new Dog();
        // Assign values to all of this Dog object's fields
        dog1.name = "Rufus";
        dog1.age = 7;
        dog1.breed = "dachshund";
        dog1.energy = 3.2f;
        dog1.hunger = 0.8f;
        dog1.owner = mrHernandez;
        // Notice that we couldn't assign a value to this field until this Dog object was constructed
        mrHernandez.pet1 = dog1;

        // Construct a Dog object to represent Mr. Hernandez's second pet Bowser
        Dog dog2 = new Dog();
        // Assign values to all of this Dog object's fields
        dog2.name = "Bowser";
        dog2.age = 2;
        dog2.breed = "pug";
        dog2.energy = 1.7f;
        dog2.hunger = 2.5f;
        dog2.owner = mrHernandez;
        // Notice that we couldn't assign a value to this field until this Dog object was constructed
        mrHernandez.pet2 = dog2;

        // SECOND: Call methods since objects are now ready to use
        // Call mrHernandez's method to introduce everyone
        mrHernandez.announce();

        // Call mrHernandez's methods to take care of pets' needs
        mrHernandez.walk(dog1, 0.7f);
        mrHernandez.feed(dog2, 0.3f);

        System.out.println("Bye!"); // -Ethan F
    }
}
