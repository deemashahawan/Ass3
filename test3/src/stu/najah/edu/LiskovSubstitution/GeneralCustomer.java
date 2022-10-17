package stu.najah.edu.LiskovSubstitution;

import java.util.ArrayList;

public class GeneralCustomer {
    protected ArrayList<Offer> offers = null;

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }

    public void addOffers(Offer offer) {
        this.offers.add(offer);
    }
}
