package org.example;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String name;
    private List<Object> attributes;
    private Game game;

    public Event(String name, Game game){
        this.name = name;
        this.game = game;
        this.attributes = new ArrayList<>();
    }

    public Event(String name, List<Object> attributes){
        this(name);
        this.attributes = attributes;
    }

    public void create(Game game){
        //Here will be adding event to the game
    }
}
