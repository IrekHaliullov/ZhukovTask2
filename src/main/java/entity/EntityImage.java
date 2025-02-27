package main.java.entity;

public enum EntityImage {
    HERBIVORE("H"),
    PREDATOR("P"),
    GRASS("G"),
    ROCK("R"),
    TREE("T");

    String shortName;

    EntityImage(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
