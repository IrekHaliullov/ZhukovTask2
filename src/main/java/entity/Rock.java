package main.java.entity;


public class Rock extends Entity {

    @Override
    public String getImage() {
        return EntityImage.ROCK.getShortName();
    }
}
