package com.Selenium;

interface Owoce {
    int pobierzCene();
    int pobierzWage();
}

class Pomarancza implements Owoce {
    int cena;
    int waga;
    String kolor;

    public Pomarancza(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }
    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }

    public String pobierzKolor() {
        return kolor;
    }
}

class Banany implements Owoce {
    int cena;
    int waga;
    String kolor;

    public Banany(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }
    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}

class Jabłka implements Owoce {
    int cena;
    int waga;
    String kolor;

    public Jabłka(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }
    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}


 class Main3 {
    public static void main(String[] args) {

        Owoce owoce = new Pomarancza(12,23,"seg");

    }
}