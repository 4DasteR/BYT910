package org.example;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Guest {

    private String username;
    private String password;
    private List<Asset> assets ;
    private List<Game> games ;

    public Developer (String username , String password)
    {
        this.username = username;
        this.password=password;
        assets = new ArrayList<>();
        games = new ArrayList<>();
    }


}
