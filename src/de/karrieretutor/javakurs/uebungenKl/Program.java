package de.karrieretutor.javakurs.uebungenKl;

import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args) {
        Galerie arty = new Galerie();
        arty.setName("Kunterbunt");
        arty.setAusstellungname("Das hätte mein Kind auch gekonnt.");
        System.out.println("Dieser Art-Shop heißt: " +arty.getName());
        System.out.println(arty.getAusstellungname());
    }
}
