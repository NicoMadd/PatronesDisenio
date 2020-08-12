package Persona;

import Estados.Estado;
import Estados.Normal;

public class Persona {
    Estado estado;

    public Persona(){
        this.estado = new Normal();
    }

    public void dormir(){
        System.out.println("Duerme");
        estado.dormir(this);
    }

    public void comer(){
        System.out.println("Come");
        estado.comer(this);
    }

    public void correr(){
        System.out.println("Corre");
        estado.correr(this);
    }

    public void setEstado(Estado estado) {
        System.out.println("Cambia a estado " + estado.descripcion());
        this.estado = estado;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void estadoActual(){
        System.out.println("Esta en el estado " + estado.descripcion());
    }
}

