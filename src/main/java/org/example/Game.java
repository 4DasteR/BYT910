package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private long id;
    private String name;
    private LocalDate createdAt;
    private LocalDate modifiedAt;
    private boolean shared;
    private List<Event> events;
    private List<Asset> assets ;
    private List<Guest> guests;

    public Game(String name) {
        this.name = name;
        this.events = new ArrayList<>();
    }

    public static void create(String name, String directory){
        //to-do
    }

    public static void importGame(String pathToFile, String directory){
        //to-do
    }

    public static void loadShared(Game game){

    }

    public void modify(){

    }

    public void addAsset(){

    }

    public void share(){

    }

    public void viewListOfGames(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDate modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }
}
