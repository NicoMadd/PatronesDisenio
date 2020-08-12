package src;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Abuelo {
    List<Cuidador> cuidadores;
    String nombre;
    Integer edad;
    Integer felicidad;
    Boolean seEscapo;
    Integer contadorGritos;
    Integer distanciaCorrida;

    public Abuelo(String nombre,Integer edad){
        this.felicidad = 100;
        this.edad = edad;
        this.contadorGritos = 0;
        this.nombre = nombre;
        this.cuidadores = new LinkedList<Cuidador>();
        this.distanciaCorrida=0;
    }

    public void leGritan(){

        contadorGritos++;
        validarGanasDeEscaparse();
    }

    private void validarGanasDeEscaparse() {
        if (contadorGritos>4) {
            escapar();
            contadorGritos = 0;
        }

    }

    public void agregarCuidador(Cuidador cuidador){
        this.cuidadores.add(cuidador);
    }

    public void removerCuidador(Cuidador cuidador){
        this.cuidadores.remove(cuidador);
    }

    public void escapar(){
        subirFelicidad(50);
        this.seEscapo = true;
        avisarCuidadores(); // siempre hace sonar la alarma
    }

    private void avisarCuidadores() {
        System.out.println("Suena la alarma");
        cuidadores.forEach(cuidador -> cuidador.avisar(this));
    }

    void bajarFelicidad(Integer cantidad){
        felicidad = Math.max(felicidad -= cantidad,0);
    }

    void subirFelicidad(Integer cantidad){
        felicidad = Math.min(felicidad += cantidad,100);
    }

    public Integer edad() {
        return this.edad;
    }

    public void volverAlGeriatrico() {
        this.seEscapo = false;
        bajarFelicidad(20);
    }

    public String nombre(){
        return nombre;
    }
}
