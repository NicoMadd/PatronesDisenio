package src;

public class Main {

    public static void main(String[] args) {

        Abuelo pepe = new Abuelo("Pepe",85);

        Cuidador carlitos = new CuidadorPayaso("Carlitos");
        Cuidador jose = new CuidadorVigilante("Jose");
        Cuidador mario = new CuidadorJodon("Mario",3);
        Cuidador manuel = new CuidadorJodon("Mario",20);

        pepe.agregarCuidador(carlitos);
        pepe.agregarCuidador(jose);
        pepe.agregarCuidador(mario);
        pepe.agregarCuidador(manuel);

        for(int i=0; i<5;i++)
            pepe.leGritan();
        System.out.println(pepe.felicidad);
    }
}
