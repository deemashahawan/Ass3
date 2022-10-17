package stu.najah.edu.DependencyInversion.devices;

import stu.najah.edu.DependencyInversion.intf.Product;

public class Keyboard implements Product {

    @Override
    public void turnOn() {
        System.out.println("Power on " + this.getClass().getName());
    }

    @Override
    public void turnOff() {

            System.out.println("Power off " + this.getClass().getName());
    }
}
