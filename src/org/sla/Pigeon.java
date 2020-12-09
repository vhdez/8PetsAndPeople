package org.sla;

public class Pigeon {
    String name;
    String species;
    int age;
    Owner owner;
    float flyTime;
    float hunger;
    Child child;


    void announce() {
        System.out.print("Coo! I am " + name + ".  I am a " + species  + ". I am " + age + " years old.");
//        System.out.println(" My owner is " + owner.name + ".");
        if (flyTime < 2.0) {
            System.out.println("COO COO! Let me out I need to fly");
        }
        if (hunger > 50) {
            System.out.println("COO COO! I am hungry! Feed me some seeds!");
        }
    }


    void eat(float seedAmount) {

        hunger = hunger - seedAmount;
        flyTime = flyTime + seedAmount;
        if (hunger > 50) {
            System.out.println(name + " says: COO COO! *Pecks aggressively* More seeds please!");
        } else {
            System.out.println(name + " says: I feel full now.");
        }
    }

    void exercise(float time) {
        flyTime = flyTime - time;
        hunger = hunger + time;
        if (flyTime > 2.0) {
            System.out.println(name + " says: WeeeEeeEee look at me fly!");
        } else {
            System.out.println(name + " says: Aww fly time is over?");
        }
    }

}
