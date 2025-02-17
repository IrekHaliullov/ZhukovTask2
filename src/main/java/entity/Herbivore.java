package main.java.entity;

public class Herbivore extends Creature {

    @Override
    public void makeMove() {

    }

    void eatGrass() {

    }

    @Override
    public String getImage() {
        return EntityImage.HERBIVORE.getShortName();
    }
}
