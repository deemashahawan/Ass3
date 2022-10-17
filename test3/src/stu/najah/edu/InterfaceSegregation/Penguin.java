package stu.najah.edu.InterfaceSegregation;

import stu.najah.edu.InterfaceSegregation.Intf.swimBird;

public class Penguin implements  swimBird {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {

        this.currentLocation = "in the water";
    }
}
