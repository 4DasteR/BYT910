package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Event {
    private String name;
    private List<Game> usedInGames;

    public Event(String name) {
        this.name = name;
        this.usedInGames = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getUsedInGames() {
        return usedInGames;
    }

    public void setUsedInGames(List<Game> usedInGames) {
        this.usedInGames = usedInGames;
    }
}
