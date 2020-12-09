package org.sla;

public class Child {

    String name;
    int age;
    float homeworkHours;
    float freeTime;
    float energyLevel;
    Dog dog;
    Pigeon pigeon;


    void announce() {
        System.out.print("Hi!  I'm " + name + ".  ");
        System.out.print("I am " + age + " years old. ");
        System.out.print("I have " + homeworkHours + " hours worth of homework to do.  ");
        System.out.print("I have " + freeTime + " hours of free time left today.  ");

        if (dog != null) {
            System.out.println("");
            System.out.println(name + "'s dog:");
            // Call pet1's method since the Dog class knows how to announce itself
            dog.announce();
        }
        // Check if pet1 has a value before trying to announce a non-existent Dog
        if (pigeon != null) {
            System.out.println("");
            System.out.println(name + "'s pigeon:");
            // Call pet2's method since the Dog class knows how to announce itself
            pigeon.announce();
        }
    }

    void walk(Dog dog, float time, float usedEnergy) {
        if (time < freeTime && 51 <= energyLevel ) {
            // Update Owner's field since their free time is being used
            freeTime = freeTime - time;
            energyLevel = energyLevel - usedEnergy;
            System.out.println("Child " + name + " walks " + dog.name + " for " + time + " hours.");
            dog.exercise(time);
        } else if (51 >= energyLevel) {
            System.out.println("Child " + name + " is too tried to walk " + dog.name + ".");
        } else
            System.out.println("Owner " + name + " doesn't have " + time + "hours to walk " + dog.name);

       // if (51 <= energyLevel) {
      //      System.out.println("Child " + name + " is not tried to walk " + dog.name + " .");
       //     System.out.println(name + " energy level is " + energyLevel + " .");
      //  } else {
       //     System.out.println("Child " + name + " is too tried to walk " + dog.name + ".");
      //  }

        System.out.println("");
    }

    void fly(Pigeon pigeon, float time, float usedEnergy) {
        if (time < freeTime && 51 <= energyLevel) {
            freeTime = freeTime - time;
            energyLevel = energyLevel - usedEnergy;
            System.out.println("Child " + name + " watches " + pigeon.name + " fly for " + time + " hours.");

            pigeon.exercise(time);
        } else if (51 >= energyLevel) {
            System.out.println("Child " + name + " is too tried to watch " + pigeon.name + " fly.");
        } else {
            System.out.println("Child " + name + " doesn't have " + time + " hours to supervise " + pigeon.name + " fly time.");
        }
        //if (51 <= energyLevel) {
        //    System.out.println("Child " + name + " is not tried to watch" + pigeon.name + " fly.");
        //} else {
        //    System.out.println("Child " + name + " is too tried to watch " + pigeon.name + " fly.");
        //}
        System.out.println("");
    }

    void sleep(Child child, float hoursOfsleep) {

        if (hoursOfsleep >= 9) {
            energyLevel = 100;
        } else if (hoursOfsleep >= 8) {
            energyLevel = 90;
        } else if (hoursOfsleep >= 7) {
            energyLevel = 80;
        } else if (hoursOfsleep >= 6) {
            energyLevel = 60;
        } else if (hoursOfsleep >= 5) {
            energyLevel = 50;
        } else if (hoursOfsleep >= 4) {
            energyLevel = 40;
        } else if (hoursOfsleep >= 3) {
            energyLevel = 30;
        } else if (hoursOfsleep >= 2) {
            energyLevel = 20;
        } else if (hoursOfsleep >= 1) {
            energyLevel = 10;
        } else if (hoursOfsleep >= 0) {
            energyLevel = 0;
        }
        System.out.println(name + " slept for " + hoursOfsleep + ". " + name + " 's energy level is " + energyLevel + " .");
    }

}
