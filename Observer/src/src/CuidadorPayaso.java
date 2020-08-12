package src;

public class CuidadorPayaso implements Cuidador {
    String nombre;
    CuidadorPayaso(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void avisar(Abuelo abuelo) {
        if (abuelo.edad() > 75) { //le regala globos para que vuelva
            abuelo.subirFelicidad(10);
            System.out.println(nombre + " Le regala globos a "+ abuelo.nombre());
        }
    }

    @Override
    public String nombre() {
        return nombre;
    }
}
