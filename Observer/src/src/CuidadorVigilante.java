package src;

import java.util.concurrent.TimeUnit;

public class CuidadorVigilante implements Cuidador{
    String nombre;

    CuidadorVigilante(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void avisar(Abuelo abuelo) {
        llamaALaPolicia(abuelo);
    }

    @Override
    public String nombre() {
        return nombre;
    }

    private void llamaALaPolicia(Abuelo abuelo){
        System.out.println(nombre + " Llama a la policia y La policia encontro a " + abuelo.nombre());
        abuelo.volverAlGeriatrico();
    }
}
