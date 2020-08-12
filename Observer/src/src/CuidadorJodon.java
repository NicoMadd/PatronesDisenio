package src;

public class CuidadorJodon implements Cuidador {
    Integer nivelDeJoda;
    String nombre;

    public CuidadorJodon(String nombre,Integer nivelDeJoda){
        this.nivelDeJoda = nivelDeJoda;
        this.nombre = nombre;
    }

    @Override
    public void avisar(Abuelo abuelo) { //abuelo no le gusta que lo jodan entonces se quiere ir
        joder(abuelo);
    }

    @Override
    public String nombre() {
        return nombre;
    }

    private void joder(Abuelo abuelo){
        System.out.println(nombre + " jode a " + abuelo.nombre() );
        abuelo.bajarFelicidad(nivelDeJoda * 2);
    }
}
