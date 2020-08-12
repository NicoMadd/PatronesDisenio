package src;

public class Main {

    public static void main(String[] args) {

        ReceptorDeCodigos receptor = new ReceptorDeCodigos();

        Comando saludoNormal = new ComandoSaludar("Hola!!!");
        Comando saludoTriste = new ComandoSaludar("Chauu!!!");
        Comando saludoDaleBo = new ComandoSaludar("DALE BOO!!!");

        receptor.recibirComando(saludoNormal);
        receptor.recibirComando(saludoTriste);

        receptor.procesarComandos();

        //System.out.println("-------------------------------------");

        receptor.deshacerUltimoComando();

        receptor.recibirComando(saludoDaleBo);
        receptor.procesarComandos();

    }
}
