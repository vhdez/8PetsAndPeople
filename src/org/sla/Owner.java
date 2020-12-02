package org.sla;

// Author: Mr. Hernandez

public class Owner {

    // FIELDS (the data that describes any pet owner)
    String name;
    float dogFood;
    float freeTime;
    float money;
    Dog pet1;
    Dog pet2;

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
}