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


        //making Matthew's person
        Owner Matthew = new Owner();
        Matthew.name = "Madeleine Butterfly";
        Matthew.dogFood = 10f;
        Matthew.freeTime = 9.0f;
        Matthew.money = 5;
        //Matthew's dog
        Dog dogMN = new Dog();
        dogMN.name = "Barko Diaz";
        dogMN.age = 21;
        dogMN.breed = "laser puppy";

        dogMN.hunger = .5f;
        dogMN.owner = Matthew;
        Matthew.pet1 = dogMN;
        //Matthew's Seabass
        SeaBass basspro = new SeaBass();
        basspro.name = "Bass Pro";
        basspro.owner = Matthew;
        basspro.age = 1;
        basspro.energy = 5f;
        basspro.hunger = 2f;
        Matthew.pet10 = basspro;

        //MN & pets interacting
        Matthew.announce();
        dogMN.announce();
        basspro.announce();
        Matthew.walk(dogMN, 3.5f);
        Matthew.feed(dogMN,5f);
        Matthew.feed(basspro, 3f);
        Matthew.watch(basspro, 2f);



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


        Fudayl.walk(dogfh, 0.7f);
        Fudayl.feed(dogfh, 0.3f);

        Owner Jacob = new Owner();
        Jacob.name = "Jacob";
        Jacob.dogFood = 2.0f;
        Jacob.freeTime = 5f;
        Jacob.money = 99999999;
        Dog Toby = new Dog();
        Jacob.pet1 = Toby;
        Toby.name = "Toby";
        Toby.energy = 2.0f;
        Toby.hunger = 0.0f;
        Toby.age = 9;
        Toby.breed = "Shih Tzu";
        Toby.owner = Jacob;

        Jacob.announce();
        Jacob.walk(Toby, 5.0f);
        Jacob.feed(Toby, 5f);

        KomodoDragon Ajax = new KomodoDragon();
        Jacob.pet4 = Ajax;
        Ajax.name = "Ajax";
        Ajax.attention = 3.0f;
        Ajax.hunger = 1.0f;
        Ajax.age = 2;
        Ajax.breed = "Komodo Dragon";
        Ajax.owner = Jacob;

        Jacob.announce();
        Jacob.pet(Ajax, 5.0f);
        Jacob.feed(Ajax, 5f);
        System.out.println("Bye!"); // -Ethan F

        //making Aidan's person

        Owner Roman = new Owner();
        Roman.name = "Aida n";
        Roman.dogFood = 60;
        Roman.freeTime = 4.0f;
        Roman.money = 1000;
        //Aidan's bear
        Bear myBear = new Bear();
        myBear.name = "Big thiccy";
        myBear.age = 4;
        myBear.breed = "Black Bear";
        myBear.energy = 5.0f;
        myBear.hunger = 4.0f;
        myBear.owner = Roman;
        Roman.pet3 = myBear;

        //Bear and aidan do things
        Roman.announce();
        Roman.walk(myBear, 2.5f);
        Roman.feed(myBear,6f);

        System.out.println("Bye!");

        // Ethan:
        Owner EthanC = new Owner();

        EthanC.name = "Ethan Chen";

        EthanC.dogFood = 20;
        EthanC.seedsForPigeon = 100;
        EthanC.freeTime = 3.75f;
        EthanC.money = 100;

        Dog rupertDog = new Dog();
        rupertDog.name = "Rupert";
        rupertDog.age = 4;
        rupertDog.breed = "Corgi" ;
        rupertDog.energy = 2.1f;
        rupertDog.hunger = 0.5f;
        rupertDog.owner = EthanC;
        EthanC.pet1 = rupertDog;

        EthanC.announce();
        EthanC.walk(rupertDog, 1.1f);
        EthanC.feed(rupertDog, 1f);

        // Pet Pigeon :D
        Pigeon myPigeon = new Pigeon();
        myPigeon.name = "Kevin Gertrude Bartholomew Maximus Leon III Smoo";
        myPigeon.age = 2;
        myPigeon.species = "Feral Pigeon";
        myPigeon.flyTime = 0.2f;
        myPigeon.hunger = 60f;
        myPigeon.owner = EthanC;
        EthanC.pet5 = myPigeon;

        EthanC.announce();
        EthanC.fly(myPigeon, 2.3f);
        EthanC.feed(myPigeon, 30f);


        // Tashon's person
        Owner Tashon = new Owner();
        Tashon.name = "Tashon";
        Tashon.dogFood = 13;
        Tashon.freeTime = 2.0f;
        Tashon.money = 8;
        // Tashon's Dog
        Dog mambaDog = new Dog();
        mambaDog.name = "Mamba";
        mambaDog.age = 2;
        mambaDog.breed = "Alaskan Klee Kai";
        mambaDog.energy = 1.3f;
        mambaDog.hunger = 8;
        mambaDog.owner = Tashon;
        Tashon.pet1 = mambaDog;

        Tashon.announce();
        Tashon.walk(mambaDog,2.3f);
        Tashon.feed(mambaDog, 8);


        //Cia's Person
        Owner Alycia = new Owner();
        Alycia.name = "Jensen";
        Alycia.catFood = 15;
        Alycia.freeTime = 5.0f;
        Alycia.money = 20;
        //Cia's cat
        Cat catAK = new Cat();
        catAK.name = "Bucky";
        catAK.age = 2;
        catAK.breed = "Japanese Bobtail";
        catAK.energy = 10f;
        catAK.hunger = .7f;
        catAK.owner = Alycia;
        Alycia.pet1 = catAK;
    }
}
