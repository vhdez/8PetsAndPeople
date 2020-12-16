package org.sla;

public class WaterBender extends Person{

    // FIELDS (the data that describes any pet owner)
    SeaBass water1;

    WaterBender(String avatarName, float timeAvailable) {
        name = avatarName;
        freeTime = timeAvailable;
        //water1 = fish;
    }


    // METHODS (what all pet owners do)
    void announce() {
        System.out.print("The name's " + name +".  ");
        System.out.print("I have water bending abilities.  ");
        System.out.print("I have " + freeTime + " hours today.  ");
        System.out.print("I'm tasked with training" + water1 + ".  ");

        // Check if pet1 has a value before trying to announce a non-existent Dog
        if (water1 != null) {
            System.out.println("");
            System.out.println(name + "'s 1st pet:");
            // Call pet1's method since the Dog class knows how to announce itself
            water1.announce();
        }

        System.out.println("");
    }


    void train(SeaBass bass, float time) {
        if (time < freeTime) {
            // Update Owner's field since their free time is being used
            freeTime = freeTime - time;
            System.out.println("Owner " + name + " trains " + bass.name + " for " + time + " hours.");
            // Call dog's method since the Dog class knows how to exercise
            bass.swim(time);
        } else {
            System.out.println("Owner " + name + " doesn't have " + time + "hours to train " + bass.name);
        }
        System.out.println("");
    }

}
