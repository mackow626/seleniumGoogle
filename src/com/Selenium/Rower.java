package com.Selenium;

interface Pojazd{
    public void stop();
    public void start();
}

abstract class PojazdKolowy implements Pojazd{
    public void stop(){
        System.out.println("musisz sie zatrzymac");
    }

}

public class Rower extends PojazdKolowy {


    @Override
    public void start() {

    }


    public void skok(){

    }
}

  class Hulajnoga implements Pojazd{

    public  void stop(){

    }

    public void start(){

    }

}
