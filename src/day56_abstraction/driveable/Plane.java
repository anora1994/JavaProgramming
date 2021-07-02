package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-Pilot mode");
    }



    @Override
    public void transportPeople() {
        System.out.println("Flying people from one place to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * 25.0) + " to fly " + mile + " miles");
    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard");
    }

    @Override
    public void bye() {
        System.out.println("Thanks for flying with us");
    }

    public void land() {
        System.out.println("Landland");
    }
}
