package org.sla;

// Author: Mr. Hernandez

public class PetsAndPeople {

    public static void main(String[] args) {
        Pet[] allOfThePets = new Pet[200];

	    // Mr. Hernandez has 2 dogs!
        // FIRST: Assign values to FIELDS
        // Construct an Owner object to represent Mr. Hernandez
        Owner mrHernandez = new Owner("Mr. Hernandez the Frustrated", 12, 1.75f, 40);
        // Construct a Dog object to represent Mr. Hernandez's first pet Rufus
        allOfThePets[0] = new Dog("Rufus", "dachshund", 7, mrHernandez, 3.2f, 0.8f);
        // Notice that we couldn't assign a value to this field until this Dog object was constructed
        mrHernandez.pet1 = allOfThePets[0];

        // Construct a Dog object to represent Mr. Hernandez's second pet Bowser
        allOfThePets[1] = new Dog("Bowser", "pug", 2, mrHernandez, 1.7f, 2.5f);
        // Notice that we couldn't assign a value to this field until this Dog object was constructed
        mrHernandez.pet2 = allOfThePets[1];

        // SECOND: Call methods since objects are now ready to use
        // Call mrHernandez's method to introduce everyone
        mrHernandez.announce();

        // Call mrHernandez's methods to take care of pets' needs
        mrHernandez.walk(allOfThePets[1], 0.7f);
        mrHernandez.feed(allOfThePets[1], 0.3f);

        Child Bella = new Child();
        Bella.name = "Bella";
        Bella.age = 10;
        Bella.homeworkHours = 2f;
        Bella.freeTime = 5f;


        Dog apolloDog = new Dog();
        // Assign values to all of this Dog object's fields
        apolloDog.name = "Apollo";
        apolloDog.age = 7;
        apolloDog.breed = "Husky";
        apolloDog.energy = 3.2f;
        apolloDog.hunger = 0.1f;
        Bella.dog = apolloDog;

        Pigeon charliePigeon = new Pigeon();
        charliePigeon.name = "Charlie";
        charliePigeon.age = 2;
        charliePigeon.species = "Feral Pigeon";
        charliePigeon.flyTime = 0.2f;
        charliePigeon.hunger = 10f;
        Bella.pigeon = charliePigeon;

        Bella.announce();
        Bella.sleep(Bella, 6f);
        Bella.walk(apolloDog, 2f, 30);
        Bella.fly(charliePigeon, 2.3f, 10);

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

        //making Korra
        WaterBender Avatar2 = new WaterBender();
        Avatar2.name = "Korra";
        Avatar2.freeTime = 16f;
        Avatar2.water1 = basspro;

        //Korra and SeaBass
        Avatar2.announce();
        Avatar2.train(basspro, 10f);



        Owner Fudayl = new Owner("Fudayl", 15, 2.5f,30);

        Dog dogfh = new Dog("Duece", "German Shepard", 3, Fudayl, 1f, 2f);

        Fudayl.announce();


        Fudayl.walk(dogfh, 0.7f);
        Fudayl.feed(dogfh, 0.3f);

        Fudayl.name = "Fudayl";

        Cat cathf = new Cat("Kodak","Black Cat",2, Fudayl, 1f, 2f);



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

        KomodoDragon dragon = new KomodoDragon();
        dragon.name = "Ajax";
        dragon.attention = 3.0f;
        dragon.hunger = 1.0f;
        dragon.age = 2;
        dragon.breed = "Komodo Dragon";
        dragon.owner = Jacob;
        Jacob.pet1 = dragon;

        DragonTamer Kevin = new DragonTamer();
        Kevin.name = "Kevin";
        Kevin.Meat = 2.0f;
        Kevin.freeTime = 8f;
        Kevin.money = 9999999;

        Kevin.announce();
        Kevin.tame(dragon, 5.0f);
        Kevin.feed(dragon, 5f);
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

        Dog dogAR = new Dog();
        dogAR.name = "Snoop";
        dogAR.age= 5;
        dogAR.breed= "Russian Bear hunting Dog";
        dogAR.energy= 1f;
        dogAR.hunger=2f;
        dogAR.owner= Roman;


        Roman.announce();


        Roman.walk(dogAR, 0.7f);
        Roman.feed(dogAR, 0.3f);

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
        Cat2 catAK = new Cat2();
        catAK.name = "Bucky";
        catAK.age = 2;
        catAK.breed = "Japanese Bobtail";
        catAK.energy = 10f;
        catAK.hunger = .7f;
        catAK.owner = Alycia;
        Alycia.pet6 = catAK;

        //Alonso's Owner
        Owner Jojo = new Owner();
        Jojo.name = "Jojo";
        Jojo.dogFood = 7;
        Jojo.turtleFood = 10;
        Jojo.freeTime = 2.0f;
        Jojo.money = 14;

        //Alonso's Dog
        Dog Iggy = new Dog();
        Iggy.name = "Iggy";
        Iggy.age = 3;
        Iggy.breed = "Boston Terrier";
        Iggy.energy = 2f;
        Iggy.hunger = 3;
        Iggy.owner = Jojo;
        Jojo.pet1 = Iggy;

        //Alonso's Turtle
        Turtles Pol = new Turtles();
        Pol.name = "Iggy";
        Pol.age = 3;
        Pol.energy = 2f;
        Pol.hunger = 3;
        Pol.owner = Jojo;
        Jojo.pet20 = Pol;

        //Alonso's Announce
        Jojo.announce();
        Jojo.feed(Iggy, 2);
        Jojo.feed(Pol, 3);

        Alycia.pet6 = catAK;
        // Niyat has 2 dogs!
        // FIRST: Assign values to FIELDS
        // Construct an Owner object to represent Mr. Hernandez
        Owner Niyat = new Owner();
        // Assign values to all of this Owner object's fields
        Niyat.name = "Niyat";
        Niyat.dogFood = 10;
        Niyat.freeTime = 2f;
        Niyat.money = 40;

        Dog pet1 = new Dog();
        // Assign values to all of this Dog object's fields
        pet1.name = "Alex";
        pet1.age = 1;
        pet1.breed = "pomeranian";
        pet1.energy = 4f;
        pet1.hunger = 1f;
        pet1.owner = Niyat;
        // Notice that we couldn't assign a value to this field until this Dog object was constructed
        Niyat.pet1 = pet1;

        // Construct a Dog object to represent Mr. Hernandez's second pet Bowser
        Dog pet2 = new Dog();
        // Assign values to all of this Dog object's fields
        pet2.name = "Cristina";
        pet2.age = 1;
        pet2.breed = "pomeranian";
        pet2.energy = 4f;
        pet2.hunger = 2f;
        pet2.owner = Niyat;
        // Notice that we couldn't assign a value to this field until this Dog object was constructed
        Niyat.pet2 = pet2;

        // SECOND: Call methods since objects are now ready to use
        // Call Niyat's method to introduce everyone
        Niyat.announce();

        // Call Niyat's methods to take care of pets' needs
        Niyat.walk(pet1, 1f);
        Niyat.feed(pet2, 2f);

    }
}
