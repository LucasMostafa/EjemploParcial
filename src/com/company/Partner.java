package com.company;

import java.util.ArrayList;
import java.util.List;

public class Partner{
    //Atributos
    private String name;
    private String gender;
    private int age;
    private Thematic thematic;
    private List<String> author= new ArrayList<>();
    private static int partnerNumber= 0;

    //Constructores
    public Partner(){
    }

    public Partner(String name, String gender, int age, Thematic thematic, List<String> author){
        this.name= name;
        this.gender= gender;
        this.age= age;
        this.thematic= thematic;
        this.author= author;
        partnerNumber++;
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

    public static int getPartnerNumber() {
        return partnerNumber;
    }

    public static void setPartnerNumber(int partnerNumber) {
        Partner.partnerNumber = partnerNumber;
    }
}
