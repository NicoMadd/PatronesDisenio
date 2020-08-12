package src;

import sun.awt.image.ImageWatched;

import java.util.*;

public class ReceptorDeCodigos {
    List<Comando> comandosRecibidos = new LinkedList<>();
    Stack<Comando> comandosProcesados = new Stack<>();

    public void recibirComando(Comando comando){
        comandosRecibidos.add(comando);
    }

    public void procesarComandos(){
        comandosRecibidos.forEach(comando -> procesarComando(comando));
        comandosRecibidos.forEach(comando -> comandosProcesados.push(comando));
        comandosRecibidos.clear();
    }

    private void procesarComando(Comando comando) {
        comando.ejecutar();
    }

    public void deshacerUltimoComando(){
        if(!comandosProcesados.isEmpty())
            comandosProcesados.pop().deshacer();
    }
}
