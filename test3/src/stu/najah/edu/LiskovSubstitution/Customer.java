package stu.najah.edu.LiskovSubstitution;

import java.util.ArrayList;

public class Customer extends GeneralCustomer{


    public Customer(){
        offers = new ArrayList<>();
    }


    public void addOffers(Offer offer) {
        super.addOffers(offer);
    }
}
