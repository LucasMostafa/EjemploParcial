package com.company;

import java.util.Objects;

public class Donation{
    //Atributos
    private double amount;
    private int partnerNumber;

    //Constructores
    public Donation(){
    }

    public Donation(double amount, int partnerNumber){
        this.amount= amount;
        this.partnerNumber= partnerNumber;
    }

    //Getter and Setter
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPartnerNumber() {
        return partnerNumber;
    }

    public void setPartnerNumber(int partnerNumber) {
        this.partnerNumber = partnerNumber;
    }

    //Equal and hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return Double.compare(donation.amount, amount) == 0 && partnerNumber == donation.partnerNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, partnerNumber);
    }
}
