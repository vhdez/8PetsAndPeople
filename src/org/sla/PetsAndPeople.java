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
        dog2.name = "Bowser ";
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


        //making Matthew's person
        Owner Matthew = new Owner();
        Matthew.name = "Madeleine Butterfly";
        Matthew.dogFood = 10;
        Matthew.freeTime = 4.0f;
        Matthew.money = 5;
        //Matthew's dog
        Dog dogMN = new Dog();
        dogMN.name = "Barko Diaz";
        dogMN.age = 21;
        dogMN.breed = "laser puppy";
        dogMN.energy = 10f;
        dogMN.hunger = .5f;
        dogMN.owner = Matthew;
        Matthew.pet1 = dogMN;

        //MN & dog interacting
        Matthew.announce();
        Matthew.walk(dogMN, 3.5f);
        Matthew.feed(dogMN,5f);

        Owner Fudayl = new Owner();
        Fudayl.name = "Fudayl";
        Fudayl.dogFood=15;
        Fudayl.freeTime=2.5f;
        Fudayl.money=30;

        Dog dogfh = new Dog();
        dogfh.name = "Duece";
        dogfh.age=3;
        dogfh.breed= "German Shepard";
        dogfh.energy= 1f;
        dogfh.hunger=2f;
        dogfh.owner= Fudayl;


        Fudayl.announce();


        Fudayl.walk(dog1, 0.7f);
        Fudayl.feed(dog2, 0.3f);

        System.out.println("Bye!"); // -Ethan F

        Owner EthanC = new Owner();

        EthanC.name = "Ethan Chen";

        EthanC.dogFood = 20;
        EthanC.freeTime = 3.75f;
        EthanC.money = 100;

        Dog rupertDog = new Dog();
        rupertDog.name = "Rupert";
        rupertDog.age = 4;
        rupertDog.breed = "Corgi";
        rupertDog.energy = 2.1f;
        rupertDog.hunger = 0.5f;
        rupertDog.owner = EthanC;
        EthanC.pet1 = rupertDog;

        EthanC.announce();

        EthanC.walk(rupertDog, 1.1f);
        EthanC.feed(rupertDog, 1f);


        // Tashon's person
        Owner Tashon = new Owner();
        Tashon.name = "Tashon";
        Tashon.dogFood = 13;

    }
}
