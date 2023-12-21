package org.example;

import java.util.ArrayList;
import java.util.List;

public class Entity {
    private String name;
    private boolean hostile;
    private int startPositionX;
    private int startPositionY;
    private final Game game;

    private List<Event> usedEvents;

    public Entity(String name, boolean hostile, int startPositionX, int startPositionY, Game game) {
        if (game == null) throw new IllegalArgumentException("Game must not be null!");
        this.name = name;
        this.hostile = hostile;
        this.startPositionX = startPositionX;
        this.startPositionY = startPositionY;
        this.game = game;
        this.usedEvents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHostile() {
        return hostile;
    }

    public void setHostile(boolean hostile) {
        this.hostile = hostile;
    }

    public int getStartPositionX() {
        return startPositionX;
    }

    public void setStartPositionX(int startPositionX) {
        this.startPositionX = startPositionX;
    }

    public int getStartPositionY() {
        return startPositionY;
    }

    public void setStartPositionY(int startPositionY) {
        this.startPositionY = startPositionY;
    }

    public List<Event> getUsedEvents() {
        return usedEvents;
    }

    public void setUsedEvents(List<Event> usedEvents) {
        this.usedEvents = usedEvents;
    }
}
