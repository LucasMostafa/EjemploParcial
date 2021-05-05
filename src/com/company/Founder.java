package com.company;

import java.util.List;

public class Founder extends Partner{
    //Atributos
    private Position position;

    //Constructores
    public Founder(){
        super();
    }

    public Founder(String name, String gender, int age, Thematic thematic, List<String> author, Position position){
        super(name, gender, age, thematic, author);
        this.position= position;
    }

    //Getter and Setter
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
