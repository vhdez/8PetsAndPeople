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
        allOfThePets[3] = new Pigeon("Kevin Gertrude Bartholomew Maximus Leon III Smoo", 2, EthanC, 60f, "Feral Pigeon", 0.2f, Bella);
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
