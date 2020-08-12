package com.company;

import Objetos.Cantante;
import Objetos.Enya;
import Objetos.Pavarotti;
import Objetos.PityAlvarez;

public class Main {

    public static void main(String[] args) {

        Cantante pavarotti = new Pavarotti();
        Cantante enya = new Enya();
        Cantante pityAlvarez = new PityAlvarez();

        pavarotti.cantar();
        enya.cantar();

        for(int i=0;i<10;i++)
            pityAlvarez.cantar();
    }
}
