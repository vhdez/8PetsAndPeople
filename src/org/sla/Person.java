package org.sla;

public class Person {
    String name;
    float freeTime;

    void announce() {
        System.out.print("Hi!  I'm " + name + ".  ");
        System.out.print("I have " + freeTime + " hours of free time left today.  ");
    }

}
