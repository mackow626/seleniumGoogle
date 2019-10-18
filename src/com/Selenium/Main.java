package com.Selenium;
public class Main {
    public static void main(String[] args) {
        int[] tablica  = new int[101];

        for(int i=0;i<=100;i++){
            tablica[i]=i;
        }
        System.out.println(tablica.length);

        for(int i:tablica){
            if (i%2==0){
                tablica[i]=i*2;
            }
        }
        System.out.println(tablica.length);

        for(int y=0;y<=100;y++){
            System.out.println("Element listy to "+tablica[y]);
        }
    }}
