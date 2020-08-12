package src;

import Persona.Persona;

public class Main {

    public static void main(String[] args) {
        Persona carlitos = new Persona();

        carlitos.comer();
        carlitos.estadoActual();

        for(int i=0;i<20;i++) {
            carlitos.correr();
            carlitos.getEstado().descripcion();
        }

        for(int i=0;i<20;i++) {
            carlitos.dormir();
            carlitos.estadoActual();
        }

    }
}
