package com.company;

import java.util.ArrayList;
import java.util.List;

public class CollectionDonation implements BasicOperations{
    public List<Donation> listDonations= new ArrayList<>();

    //Metodos
    @Override
    public void add(Donation donation) {
        boolean validation= false;
        for (Donation x: listDonations) {
            if(x.getPartnerNumber()==donation.getPartnerNumber()){
                x.setAmount(donation.getAmount()+x.getAmount());
                validation= true;
            }
        }
        if(validation==false)
            listDonations.add(donation);
    }

    @Override
    public void remove(Donation donation) {
        for (Donation x: listDonations) {
            if(x.equals(donation)){
                listDonations.remove(x);
            }
        }
    }

    @Override
    public void toList(Donation donation) {
        listDonations.add(donation);
    }
}
