package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Partner{
    //Atributos
    private String name;
    private String gender;
    private int age;
    private Thematic thematic;
    private List<String> author= new ArrayList<>();
    private int partnerNumber;
    private static int partnerNumberNext= 1;

    //Constructores
    public Partner(){
    }

    public Partner(String name, String gender, int age, Thematic thematic, List<String> author){
        this.name= name;
        this.gender= gender;
        this.age= age;
        this.thematic= thematic;
        this.author= author;
        this.partnerNumber= partnerNumberNext;
        partnerNumberNext++;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Thematic getThematic() {
        return thematic;
    }

    public void setThematic(Thematic thematic) {
        this.thematic = thematic;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public int getPartnerNumber() {
        return partnerNumber;
    }

    public void setPartnerNumber(int partnerNumber) {
        this.partnerNumber = partnerNumber;
    }

    //Equals and hash code
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partner partner = (Partner) o;
        return partnerNumber == partner.partnerNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(partnerNumber);
    }

    @Override
    public String toString(){
        return "Socio " + partnerNumber + "\nNombre: " + this.name + " | Genero: " + this.gender + " | Edad: " + this.age
                + " | Tematica: " + this.thematic + "\nAutores: " + this.author;
    }
}
