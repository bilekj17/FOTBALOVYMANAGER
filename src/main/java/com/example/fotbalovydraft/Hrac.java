package com.example.fotbalovydraft;

public class Hrac {
    private String name;
    private Pozice pozice;
    private int hodnoceni;

    public Hrac(String name, Pozice pozice, int hodnoceni) {
        this.name = name;
        this.pozice = pozice;
        this.hodnoceni = hodnoceni;
    }

    @Override
    public String toString() {
        return name + " " + pozice;
    }


    public String getName() {
        return name;
    }

    public Pozice getPozice() {
        return pozice;
    }

    public int getHodnoceni() {
        return hodnoceni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPozice(Pozice pozice) {
        this.pozice = pozice;
    }

    public void setHodnoceni(int hodnoceni) {
        this.hodnoceni = hodnoceni;
    }
}
