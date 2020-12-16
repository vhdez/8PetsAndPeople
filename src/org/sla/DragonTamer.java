package org.sla;

public class DragonTamer {

    String name;
    float Meat;
    float freeTime;
    float money;
    KomodoDragon dragon;

    DragonTamer(String name, float Meat, float freeTime, float money ) {
        this.name = name;
        this.Meat = Meat;
        this.freeTime = freeTime;
        this.money = money;
    }


    void announce() {
        System.out.print("Hi!  I'm " + name + ".  ");
        System.out.print("I have " + Meat + " pounds of meat left.  ");
        System.out.print("I have " + freeTime + " hours of free time left today.  ");
        System.out.println("I have $" + money + " to spend on meat.");


        if (dragon != null) {
            System.out.println("");
            System.out.println(name + "'s Komodo Dragon :");
            // Call pet4's method since the Dog class knows how to announce itself
            dragon.announce();
        }
        System.out.println("");

    }

        void tame(KomodoDragon dragon,float time){
            if (time < freeTime) {
                // Update Owner's field since their free time is being used
                freeTime = freeTime - time;
                System.out.println("Owner " + name + " pets " + dragon.name + " for " + time + " hours.");
                // Call dog's method since the Dog class knows how to exercise
                dragon.exercise(time);
            } else {
                System.out.println("Owner " + name + " doesn't have " + time + "hours to tame " + dragon.name);
            }
            System.out.println("");
        }

        void feed(KomodoDragon dragon, float foodAmount){
            if (foodAmount < Meat) {
                // Update Owner's field since their dog food is being used
                Meat = Meat - foodAmount;
                System.out.println("Owner " + name + " feeds " + dragon.name + " " + foodAmount + " pounds.");
                // Call dog's method since the Dog class knows how to eat
                dragon.eat(foodAmount);
            } else {
                System.out.println("Owner " + name + " can't feed " + dragon.name + " " + foodAmount + " pounds.");
            }
            System.out.println("");
        }
    }

