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


        Dog apolloDog = new Dog("Apollo", "Husky", 7, mrHernandez, 3.2f, 0.1f );

        Pigeon charliePigeon = new Pigeon("Charlie", 2, mrHernandez, 10f, "Feral Pigeon", 0.2f);
        charliePigeon.name = "Charlie";
        charliePigeon.age = 2;
        charliePigeon.species = "Feral Pigeon";
        charliePigeon.flyTime = 0.2f;
        charliePigeon.hunger = 10f;


        Child Bella = new Child("Bella", 10, 2f, 5f, 80, apolloDog, charliePigeon);


        Bella.dog = apolloDog;
        Bella.pigeon = charliePigeon;
        Bella.announce();
        Bella.sleep(Bella, 6f);
        Bella.walk(apolloDog, 2f, 30);
        Bella.fly(charliePigeon, 2.3f, 10);

        //making Matthew's person
        Owner Matthew = new Owner("Madeleine Butterfly", 10f, 9.0f, 20);
        //Matthew's dog
        Dog dogMN = new Dog("Barko Diaz", "laser puppy", 21, Matthew, 2f, .5f);
        //Matthew's Seabass
        SeaBass basspro = new SeaBass("Bass Pro", "fish", 1, Matthew, 5f, 2f);
        //making Korra
        WaterBender Avatar2 = new WaterBender("Korra",16f);
        Avatar2.water1 = basspro;
        Matthew.pet10 = basspro;
        Matthew.pet1 = dogMN;
        //MN & pets interacting
        Matthew.announce();
        dogMN.announce();
        basspro.announce();
        Matthew.walk(dogMN, 3.5f);
        Matthew.feed(dogMN,5f);
        Matthew.feed(basspro, 3f);
        Matthew.watch(basspro, 2f);
        //Korra and SeaBass
        Avatar2.announce();
        Avatar2.train(basspro, 10f);



        Owner Jacob = new Owner("Jacob", 2f, 5f, 99999999);

        Owner Fudayl = new Owner("Fudayl", 15, 2.5f,30);

        allOfThePets[2] = new Dog("Duece", "German Shepard", 3, Fudayl, 1f, 2f);
        Fudayl.pet2=allOfThePets[2];

        Fudayl.announce();


        Fudayl.walk(Fudayl.pet2, 0.7f);
        Fudayl.feed(Fudayl.pet2, 0.3f);

        Fudayl.name = "Fudayl";

       allOfThePets[22] = new Cat("Kodak","Black Cat",2, Fudayl, 1f, 2f);
        Fudayl.pet22=allOfThePets[22];


        Dog Toby = new Dog("Toby", "Shih Tzu", 9, Jacob, 2f, 0f);

        Jacob.announce();
        Jacob.walk(Toby, 5.0f);
        Jacob.feed(Toby, 5f);

        KomodoDragon dragon = new KomodoDragon("Ajax", "Komodo Dragon", 2, Jacob, 3f, 1f);

        DragonTamer Kevin = new DragonTamer("Kevin",2f, 9999999 , 8f);

        Kevin.announce();
        Kevin.tame(dragon, 5.0f);
        Kevin.feed(dragon, 5f);
        System.out.println("Bye!"); // -Ethan F

        //making Aidan's person


        Owner Roman = new Owner("Aidan", 60, 4.0f, 1000);
        //Aidan's bear
        Bear myBear = new Bear("Big thiccy", "Black Bear", 4, Roman, 5.0f, 4.0f);
        Roman.pet3 = myBear;

        Dog dogAR = new Dog("Snoop", "Russian Bear Hunting Dog", 5, Roman, 1f, 2f);
        Roman.pet1 = dogAR;


        Roman.announce();
        Roman.walk(myBear, 2.5f);
        Roman.feed(myBear,6f);


        Roman.walk(dogAR, 0.7f);
        Roman.feed(dogAR, 0.3f);

        System.out.println("Bye!");

        Roman.announce();


        // Ethan:
        Owner EthanC = new Owner("Ethan Chen", 20, 3.75f, 100);

        EthanC.seedsForPigeon = 100;

        allOfThePets[2] = new Dog("Rupert", "Corgi", 4, EthanC, 2.1f, 0.5f);
        EthanC.pet1 = allOfThePets[2];

        EthanC.announce();
        EthanC.walk(allOfThePets[2], 1.1f);
        EthanC.feed(allOfThePets[2], 1f);

        // Pet Pigeon :D
        allOfThePets[3] = new Pigeon("Kevin Gertrude Bartholomew Maximus Leon III Smoo", 2, EthanC, 60f, "Feral Pigeon", 0.2f);
        EthanC.pet5 = allOfThePets[3];

        EthanC.announce();
        EthanC.fly(allOfThePets[3], 2.3f);
        EthanC.feed(allOfThePets[3], 30f);


        // Tashon's person
        Owner Tashon = new Owner("Tashon", 13,2.0f,8);
        // Tashon's Dog
        allOfThePets[8]= new Dog("Mamba", "Alaskan Klee Kai", 2, Tashon, 1.3f, 8);
        Tashon.pet1 = allOfThePets[8];

        Tashon.announce();
        Tashon.walk(allOfThePets[8],2.3f);
        Tashon.feed(allOfThePets[8], 8);


        //Cia's Person
        Owner Alycia = new Owner("Jensen", 15, 5.0f, 20);

        //Cia's Dog
        allOfThePets[2] = new Dog("Steve", "Golden Retriever", 1, Alycia, 2f, 1f);
        Alycia.pet2 = allOfThePets[2];

        Alycia.announce();
        Alycia.walk(allOfThePets[2], 2f);
        Alycia.feed(allOfThePets[2], 1f);

        allOfThePets[15] = new Cat2("Bucky", "Japanese Bobtail", 2, Alycia, 1f, 0.7f);
        Alycia.pet6 = allOfThePets[15];

        //Cia's announce
        Alycia.announce();
        Alycia.walk(allOfThePets[15], 1f);
        Alycia.feed(allOfThePets[15], .7f);

        //Alonso's Owner
        Owner Jojo = new Owner("Jojo, the Bizarre", 7, 2.0f, 14);

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
        Turtles Pol = new Turtles("Pol", 3, Jojo, 2f, 3);

        //Alonso's Announce
        Jojo.announce();
        Jojo.feed(Iggy, 2);
        Jojo.feed(Pol, 3);


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
