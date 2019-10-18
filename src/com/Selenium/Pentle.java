package com.Selenium;

public class Pentle {

    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            System.out.println("to jest pentla");
        }

        int licznik=0;
        while(licznik<10){
            System.out.println("to jest pentla while ");
            licznik++;
        }

        do{
            System.out.println("to jest do while");
            licznik++;
        }while (licznik<20);

    }
}
