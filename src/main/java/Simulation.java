package main.java;

import java.util.List;
import java.util.Objects;

public class Simulation {
    private final WorldMap worldMap;
    private Integer turnCounter;
    private final ConsoleRender consoleRender;
    private final List<Action> initActions;
    private final List<Action> turnActions;

    public Simulation(WorldMap worldMap, ConsoleRender consoleRender, List<Action> initActions, List<Action> turnActions) {
        this.worldMap = worldMap;
        this.consoleRender = consoleRender;
        this.initActions = initActions;
        this.turnActions = turnActions;
        this.turnCounter = 0;
    }

    public void nextTurn() {
        turnCounter++;
        if (!Objects.isNull(turnActions)) {
            for (Action action: turnActions) {
                action.doAction();
            }
        }
        consoleRender.print(worldMap);
    }

    public void startSimulation() {
        if (!Objects.isNull(initActions)) {
            for (Action action: initActions) {
                action.doAction();
            }
        }
    }

    public void pauseSimulation() {

    }
}
