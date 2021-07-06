package de.karrieretutor.javakurs.uebungenKl;

import java.util.ArrayList;
import java.util.List;

public class Artshop {
    private String name;
    private String inhaber;
    private int gruendungsjahr;

    //Liste von Künstlern, nur Künstler rein und raus :)
    private List<Artist> artistList = new ArrayList<>;

    public void setName(String neuName) {
        this.name = neuName;
    }

    public void setGruendungsjahr(int gruendungsjahr) {
        this.gruendungsjahr = gruendungsjahr;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    public String getInhaber() {
        return this.inhaber;
    }

    public int getGruendungsjahr() {
        return this.gruendungsjahr;
    }

    public List<Artist> getArtistList() {
        return this.artistList;
    }

    public String getName() {
        return this.name;
    }
}
