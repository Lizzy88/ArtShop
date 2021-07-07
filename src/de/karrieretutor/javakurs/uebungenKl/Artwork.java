package de.karrieretutor.javakurs.uebungenKl;

public class Artwork {
    private String title;
    private String kuenstler;
    private int format;
    private int preis;
    public static int preisAllerBilder;

    //Konstruktor ohne Rückgabetyp
    public Artwork(){}
    //Konstruktor mit Typen
    public Artwork (String title, String kuenstler, int format, int preis){
            this.title = title;
            this.kuenstler = kuenstler;
            this.format = format;
            preisAllerBilder = preisAllerBilder + preis;
        }
//Getter und Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKuenstler() {
        return kuenstler;
    }

    public void setKuenstler(String kuenstler) {
        this.kuenstler = kuenstler;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;

        public static int preisAllerBilder() {
            return preisAllerBilder();
        }
    }


    }

