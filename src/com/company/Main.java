package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CollectionDonation listDonations= new CollectionDonation();

        Donation donation1= new Donation(400, 1);
        Donation donation2= new Donation(600, 2);

        listDonations.add(donation1);
        listDonations.add(donation2);

        listDonations.toList();

        CollectionPartner listPartner= new CollectionPartner();

        List<String> author= new ArrayList<>();

        String author1= "Cristian Castro";
        String author2= "Juan Riquelme";
        author.add(author1);
        author.add(author2);

        Partner partner1= new Partner("Lucas", "Masculino", 27, Thematic.ACTION, author);
        Partner partner2= new Partner("Gaston", "Masculino", 26, Thematic.COMEDY, author);
        Partner partner3= new Partner("Mauro", "Masculino", 28, Thematic.HORROR, author);

        listPartner.add(partner1);
        listPartner.add(partner2);
        listPartner.add(partner3);

        listPartner.toList();
    }
}
