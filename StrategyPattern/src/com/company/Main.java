package com.company;

public class Main {
    public static void main(String[] args) {

        Soldado soldado = new Soldado();
        soldado.cambiarArma(new Espada());
        soldado.usarArma();

        soldado.cambiarArma(new Rifle());
        soldado.usarArma();

        soldado.cambiarArma(new Revolver());
        soldado.usarArma();

    }
}
