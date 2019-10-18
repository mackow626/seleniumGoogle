package com.Selenium;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Wyjatki {
    public static void main(String[] args) {

        Samochod samochod = new Samochod();

        System.out.println(samochod.getKolor());


    }

}

class Samochod{
    public String kolor;

    public Samochod(){

    }

    public Samochod(String kolor){
        this.kolor=kolor;
    }

    public void jedzie(){
        System.out.println("Brum brum brum");
    }

    public String getKolor(){
        return kolor;
    }

    public void setKolor(String jakisKolor){
        kolor=jakisKolor;
    }

}
