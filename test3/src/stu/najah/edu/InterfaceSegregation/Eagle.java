package stu.najah.edu.InterfaceSegregation;

import stu.najah.edu.InterfaceSegregation.Intf.flyBird;

public class Eagle implements  flyBird {
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    @Override
    public void fly() {
        this.currentLocation = "in the air";
    }

    @Override
    public void molt() {

        this.numberOfFeathers -= 1;
    }


}
