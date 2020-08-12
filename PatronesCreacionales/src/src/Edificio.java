package src;

public class Edificio {
    Integer pisos;
    Integer altura;
    Boolean patio;
    Integer nivelDeSeguridad;


    //abstract factory

    public static Edificio encargarEdificioAIngeniero(IngenieroCivil ingeniero){
        return ingeniero.construir();
    }


    public Edificio(Integer pisos,Integer altura,Boolean patio, Integer nivelDeSeguridad){
        this.pisos = pisos;
        this.altura = altura;
        this.patio = patio;
        this.nivelDeSeguridad = nivelDeSeguridad;
    }

    public void mostrarEdificio(){
        System.out.println("Este Edificio tiene " + pisos + " pisos, altura de " + altura + "m, patio:" + patio + " y con un nivel de seguridad de " + nivelDeSeguridad);
    }

}
