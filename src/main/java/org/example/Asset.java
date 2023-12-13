package org.example;

import java.awt.image.BufferedImage;
import java.util.List;

public class Asset {
    private static List<Asset> assetList;
    private String name;
    private BufferedImage image;
    private boolean shared;
    private List<Developer> developerList;
    private List<Game> gameList;

    public Asset(String name, BufferedImage image, boolean shared) {
        this.name = name;
        this.image = image;
        this.shared = shared;
    }

    public static String create(String name) {
        return "Created: " + name;
    }

    public String share() {
        shared = true;
        return "Shared: " + name;
    }

    public static String viewListOfAssets() {
        return assetList.toString();
    }
}
