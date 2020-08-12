package src;

public class EdificioBuilder {
    Integer pisos;
    Integer altura;
    Boolean patio;
    Integer nivelDeSeguridad;

    public Edificio construir(){
        return new Edificio(pisos, pisos*3, patio, nivelDeSeguridad);
    }

    public void indicarPisos(Integer pisos){
        this.pisos = pisos;
    }

    public void indicarNivelDeSeguridad(Integer nivel){
        this.nivelDeSeguridad = nivel;
    }

    public void tienePatio(Boolean tienePatio){
        this.patio = tienePatio;
    }

}
