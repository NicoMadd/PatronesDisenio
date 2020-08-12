package com.company;

public class Soldado {
    Arma arma;


    public void usarArma(){
        arma.usar();
    }

    public void cambiarArma(Arma arma){
        this.arma = arma;
    }
}
