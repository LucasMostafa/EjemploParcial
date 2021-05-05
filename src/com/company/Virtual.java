package com.company;

import java.util.List;

public class Virtual extends Partner{
    //Atributos
    public SocialMedia socialMedia;

    //Constructores
    public Virtual(){
        super();
    }

    public Virtual(String name, String gender, int age, Thematic thematic, List<String> author, SocialMedia socialMedia){
        super(name, gender, age, thematic, author);
        this.socialMedia= socialMedia;
    }

    //Getter and Setter
    public SocialMedia getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(SocialMedia socialMedia) {
        this.socialMedia = socialMedia;
    }
}
