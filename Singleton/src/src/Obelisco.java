package src;

public class Obelisco {

    private static Obelisco obelisco = new Obelisco();

    private Obelisco(){

    }
    public static Obelisco getInstance(){
        return obelisco;
    }

    public void vamosArgentina(){
        System.out.println("Vamos Argentina");
    }
}
