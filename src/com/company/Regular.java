package com.company;

import java.util.List;

public class Regular extends Partner{
    //Atributos
    private double numberPhone;
    private String direction;

    //Constructores
    public Regular(){
        super();
    }

    public Regular(String name, String gender, int age, Thematic thematic, List<String> author, double numberPhone, String direction){
        super(name, gender, age, thematic, author);
        this.numberPhone= numberPhone;
        this.direction= direction;
    }

    //Getter and Setter
    public double getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(double numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
