package stu.najah.edu.DependencyInversion.devices;

import stu.najah.edu.DependencyInversion.intf.Product;

public class Monitor implements Product {
    public void turnOn(){
        System.out.println("Turn on " + this.getClass().getName());
    }

    public void turnOff(){
        System.out.println("Turn off " + this.getClass().getName());
    }
}
