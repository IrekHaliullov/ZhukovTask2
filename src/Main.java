import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import main.java.ConsoleRender;
import main.java.Field;
import main.java.WorldMap;
import main.java.entity.Entity;
import main.java.entity.Grass;
import main.java.entity.Herbivore;
import main.java.entity.Predator;
import main.java.entity.Rock;
import main.java.Simulation;
import main.java.entity.Tree;


/**
 * + создать проект, сущности для животных и карту 2 часа
 * + сделать консольный рендерер 2 часа
 * - запустить симуляцию с initActions 2 часа
 * - реализовать алгоритм поиска пути 4 часа
 * - сложить все воедино 4 часа
 */
public class Main {
    final static int turnCount = 9;
    public static void main(String[] args) {

        System.out.println("Start");

        // тестовое создание карты
        Map<Field, Entity> creatureLocation = testMapCreation();
        // тестовое создание карты

        WorldMap worldMap = new WorldMap(creatureLocation);
        ConsoleRender consoleRender = new ConsoleRender();
        Simulation simulation = new Simulation(worldMap, consoleRender, new ArrayList<>(), new ArrayList<>());


        simulation.startSimulation();
        for (int i = 0; i < turnCount; i++) {
            simulation.nextTurn();
        }

    }

    private static Map<Field, Entity> testMapCreation() {
        Map<Field, Entity> creatureLocation = new HashMap<>();
        creatureLocation.put(new Field(1,2), new Grass());
        creatureLocation.put(new Field(1,3), new Grass());
        creatureLocation.put(new Field(1,4), new Grass());
        creatureLocation.put(new Field(1,7), new Grass());
        creatureLocation.put(new Field(2,4), new Rock());
        creatureLocation.put(new Field(3,5), new Rock());
        creatureLocation.put(new Field(3,4), new Tree());
        creatureLocation.put(new Field(4,5), new Tree());
        creatureLocation.put(new Field(2,5), new Herbivore());
        creatureLocation.put(new Field(7,5), new Predator());
        return creatureLocation;
    }
}