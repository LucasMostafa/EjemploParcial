package com.company;

import java.util.ArrayList;
import java.util.List;

public class CollectionPartner implements BasicOperationsPartner{
    public List<Partner> listPartners= new ArrayList<>();

    //Metodos
    @Override
    public void add(Partner partner) {
        boolean validation= false;
        for (Partner x: listPartners) {
            if(x.getPartnerNumber()==partner.getPartnerNumber()){
                System.out.println("El socio ya se encuentra en el sistema.");
                validation= true;
            }
        }
        if(validation==false)
            listPartners.add(partner);
    }

    @Override
    public void remove(Partner partner) {
        for (Partner x: listPartners) {
            if(x.equals(partner)){
                listPartners.remove(x);
            }
        }
    }

    @Override
    public void toList() {
        for (Partner x: listPartners) {
            System.out.println(x.toString());
        }
    }
}
