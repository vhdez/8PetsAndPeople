package org.sla;

// Author: Mr. Hernandez

public class Owner {

    // FIELDS (the data that describes any pet owner)
    String name;
    float dogFood;
    float seedsForPigeon;
    float freeTime;
    float money;
    Dog pet1;
    Dog pet2;
    Bear pet3;
    KomodoDragon pet4;
    Pigeon pet5;
    SeaBass pet10;



    // METHODS (what all pet owners do)
    void announce() {
        System.out.print("Hi!  I'm " + name +".  ");
        System.out.print("I have " + dogFood + " pounds of dog food left.  ");
        System.out.print("I have " + freeTime + " hours of free time left today.  ");
        System.out.println("I have $" + money + " to spend on dog food.");

        // Check if pet1 has a value before trying to announce a non-existent Dog
        if (pet1 != null) {
            System.out.println("");
            System.out.println(name + "'s 1st pet:");
            // Call pet1's method since the Dog class knows how to announce itself
            pet1.announce();
        }
        // Check if pet1 has a value before trying to announce a non-existent Dog
        if (pet2 != null) {
            System.out.println("");
            System.out.println(name + "'s 2nd pet:");
            // Call pet2's method since the Dog class knows how to announce itself
            pet2.announce();
        }
        if (pet3 != null) {
            System.out.println("");
            System.out.println(name + "'s bear :");
            // Call pet3's method since the Dog class knows how to announce itself
            pet3.announce();
        }
        if (pet5 != null) {
            System.out.println("");
            System.out.println(name + "'s Pigeon :");
            // Call pet3's method since the Dog class knows how to announce itself
            pet5.announce();
        }

        if (pet10 != null) {
            System.out.println("");
            System.out.println(name + "'s Komodo Dragon :");
            // Call pet4's method since the Dog class knows how to announce itself
            pet10.announce();
        }

        System.out.println("");
    }

    void walk(Dog dog, float time) {
        if (time < freeTime) {
            // Update Owner's field since their free time is being used
            freeTime = freeTime - time;
            System.out.println("Owner " + name + " walks " + dog.name + " for " + time + " hours.");
            // Call dog's method since the Dog class knows how to exercise
            dog.exercise(time);
        } else {
            System.out.println("Owner " + name + " doesn't have " + time + "hours to walk " + dog.name);
        }
        System.out.println("");
    }

    void feed(Dog dog, float foodAmount) {
        if (foodAmount < dogFood) {
            // Update Owner's field since their dog food is being used
            dogFood = dogFood - foodAmount;
            System.out.println("Owner " + name + " feeds " + dog.name + " " + foodAmount + " pounds.");
            // Call dog's method since the Dog class knows how to eat
            dog.eat(foodAmount);
        } else {
            System.out.println("Owner " + name + " can't feed " + dog.name + " " + foodAmount + " ounds.");
        }
        System.out.println("");
    }

    void walk(Bear myBear, float time) {
        if (time < freeTime) {
            // Update Owner's field since their free time is being used
            freeTime = freeTime - time;
            System.out.println("Owner " + name + " walks " + myBear.name + " for " + time + " hours.");
            // Call dog's method since the Dog class knows how to exercise
            myBear.exercise(time);
        } else {
            System.out.println("Owner " + name + " doesn't have " + time + "hours to walk " + myBear.name);
        }
        System.out.println("");
    }

    void feed(Bear myBear, float foodAmount) {
        if (foodAmount < dogFood) {
            // Update Owner's field since their dog food is being used
            dogFood = dogFood - foodAmount;
            System.out.println("Owner " + name + " feeds " + myBear.name + " " + foodAmount + " pounds.");
            // Call dog's method since the Dog class knows how to eat
            myBear.eat(foodAmount);
        } else {
            System.out.println("Owner " + name + " can't feed " + myBear.name + " " + foodAmount + " pounds.");
        }
        System.out.println("");
    }
    void fly(Pigeon pigeon, float time) {
        if (time < freeTime) {

            freeTime = freeTime - time;
            System.out.println("Owner " + name + " watches " + pigeon.name + " fly for " + time + " hours.");

            pigeon.exercise(time);
        } else {
            System.out.println("Owner " + name + " doesn't have " + time + " to supervise " + pigeon.name + "fly time.");
        }
        System.out.println("");
    }
    void feed(Pigeon pigeon, float seedAmount) {
        if (seedAmount < seedsForPigeon) {

            seedsForPigeon = seedsForPigeon - seedAmount;
            System.out.println("Owner " + name + " feeds " + pigeon.name + " " + seedAmount + " grams.");
            pigeon.eat(seedAmount);
        } else {
            System.out.println("Owner " + name + " can't feed " + pigeon.name + " " + seedsForPigeon + " grams.");
        }
        System.out.println("");
    }

    void pet(KomodoDragon dragon, float time) {
        if (time < freeTime) {
            // Update Owner's field since their free time is being used
            freeTime = freeTime - time;
            System.out.println("Owner " + name + " pets " + dragon.name + " for " + time + " hours.");
            // Call dog's method since the Dog class knows how to exercise
            dragon.exercise(time);
        } else {
            System.out.println("Owner " + name + " doesn't have " + time + "hours to walk " + dragon.name);
        }
        System.out.println("");
    }

    void feed(KomodoDragon dragon, float foodAmount) {
        if (foodAmount < dogFood) {
            // Update Owner's field since their dog food is being used
            dogFood = dogFood - foodAmount;
            System.out.println("Owner " + name + " feeds " + dragon.name + " " + foodAmount + " pounds.");
            // Call dog's method since the Dog class knows how to eat
            dragon.eat(foodAmount);
        } else {
            System.out.println("Owner " + name + " can't feed " + dragon.name + " " + foodAmount + " pounds.");
        }
        System.out.println("");
    }

    void watch(SeaBass bass, float time) {
        if (time < freeTime) {
            // Update Owner's field since their free time is being used
            freeTime = freeTime - time;
            System.out.println("Owner " + name + " walks " + bass.name + " for " + time + " hours.");
            // Call dog's method since the Dog class knows how to exercise
            bass.swim(time);
        } else {
            System.out.println("Owner " + name + " doesn't have " + time + "hours to walk " + bass.name);
        }
        System.out.println("");
    }

    void feed(SeaBass bass, float foodAmount) {
        if (foodAmount < dogFood) {
            // Update Owner's field since their dog food is being used
            dogFood = dogFood - foodAmount;
            System.out.println("Owner " + name + " feeds " + bass.name + " " + foodAmount + " pounds.");
            // Call dog's method since the Dog class knows how to eat
            bass.eat(foodAmount);
        } else {
            System.out.println("Owner " + name + " can't feed " + bass.name + " " + foodAmount + " pounds.");
        }
        System.out.println("");
    }
}
