package stu.najah.edu.DependencyInversion;

import stu.najah.edu.DependencyInversion.intf.Product;

public class WindowsMachine {
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void changeKeyboardStatus(boolean status){
        if (status){
            product.turnOn();
        } else {
            product.turnOff();
        }
    }



}
