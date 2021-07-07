package de.karrieretutor.javakurs.uebungenKl;

import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args) {
        Galerie arty = new Galerie();
        arty.setName("Kunterbunt");
        arty.setAusstellungname("Das hätte mein Kind auch gekonnt.");
        System.out.println("Dieser Art-Shop heißt: " +arty.getName());
        System.out.println(arty.getAusstellungname());

        Artshop pinselland  = new Artshop();
        Artshop farbenfroh  = new Artshop();
        Artshop canvalove   = new Artshop();

        pinselland.setName("Mayers Pinselshop");
        farbenfroh.setInhaber("Hans");
        canvalove.setInhaber("Ursula");
        //System.out.println("Der Shop"+pinselland.getName() + "gehört" + pinselland.getInhaber());


        Artwork meinArtwork = new Artwork();

        //System.out.println(meinArtwork.artwork("df"));

    }
}
