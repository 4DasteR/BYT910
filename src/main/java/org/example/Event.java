package org.example;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private List<Object> attributes;
    private Game game;

    public Event(String name, Game game) {
        if (game == null) throw new IllegalArgumentException("Game object cannot be null");
        this.name = name;
        this.game = game;
        this.attributes = new ArrayList<>();
    }

    public Event(String name, Game game, List<Object> attributes) {
        this(name, game);
        this.attributes = attributes;
    }

    public void create(Game game) {
        //Here will be adding event to the game
    }
}
