package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private String name;
    private Developer developer;
    private LocalDate createdAt;
    private LocalDate modifiedAt;
    private boolean shared;
    private List<Event> consistsOfEvents;
    private List<Asset> consistsOfAssets;
    private List<Guest> playingGuests;

    public Game(String name, Developer developer) {
        this.name = name;
        this.developer = developer;
        this.consistsOfEvents = new ArrayList<>();
        this.consistsOfAssets = new ArrayList<>();
        this.playingGuests = new ArrayList<>();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
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

    public List<Event> getConsistsOfEvents() {
        return consistsOfEvents;
    }

    public void setConsistsOfEvents(List<Event> consistsOfEvents) {
        this.consistsOfEvents = consistsOfEvents;
    }

    public List<Asset> getConsistsOfAssets() {
        return consistsOfAssets;
    }

    public void setConsistsOfAssets(List<Asset> consistsOfAssets) {
        this.consistsOfAssets = consistsOfAssets;
    }

    public List<Guest> getPlayingGuests() {
        return playingGuests;
    }

    public void setPlayingGuests(List<Guest> playingGuests) {
        this.playingGuests = playingGuests;
    }
}
