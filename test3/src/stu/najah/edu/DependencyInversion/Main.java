package stu.najah.edu.DependencyInversion;

import stu.najah.edu.DependencyInversion.devices.Keyboard;
import stu.najah.edu.DependencyInversion.devices.Monitor;

public class Main {
    public static void main(String[] args) {
        WindowsMachine machine=new WindowsMachine();
        machine.setProduct(new Keyboard());
        machine.changeKeyboardStatus(false);
        machine.changeKeyboardStatus(true);

        machine.setProduct(new Monitor());
        machine.changeKeyboardStatus(false);
        machine.changeKeyboardStatus(true);


    }
}
