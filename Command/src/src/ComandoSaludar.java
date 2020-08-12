package src;

public class ComandoSaludar implements Comando {
    String saludo;

    public ComandoSaludar(String saludo){
        this.saludo = saludo;
    }

    @Override
    public void ejecutar() {
        System.out.println(saludo);
    }

    @Override
    public void deshacer() {
        System.out.println("Perdon!! :( mi saludo era " + saludo);
    }
}
