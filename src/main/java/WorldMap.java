package main.java;

import java.util.Map;

import main.java.entity.Entity;

/**
 * Мировая карта
 * Все, что не отмечено в creatureLocation, является пустым полем
 */
public class WorldMap {
    Map<Field, Entity> creatureLocation;

    public WorldMap(Map<Field, Entity> creatureLocation) {
        this.creatureLocation = creatureLocation;
    }

    public String getImage(int x, int y) {
        Entity creature = creatureLocation.get(new Field(x,y));
        return (creature != null) ? creature.getImage() : null;
    }
}
