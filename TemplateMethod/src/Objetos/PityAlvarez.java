package Objetos;

public class PityAlvarez extends Cantante {
    Integer nFaso=0;

    public String presentacion() {
        return "Esta Saliendo el Sol vamos por el faso numero " + ++nFaso;

    }
}
