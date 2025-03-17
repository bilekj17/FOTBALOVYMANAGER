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
        return name + "" + pozice;
    }
    public String getName() {
        return name;
    }

    public String getPozice() {
        return pozice;
    }

    public int getHodnoceni() {
        return hodnoceni;
    }
}
