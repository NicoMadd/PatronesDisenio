package src;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

class CondicionMultiple implements Condicion {
    List<Condicion> condiciones;
    Integer tipo; // 0 es OR : 1 es AND
    TipoCondicion tipoCondicion; // como un strategy algo asi.

    @Override
    public Boolean cumpleCondicion() {
        /*

        return tipoCondicion.evaluar(condiciones);

         */

        
        switch (tipo){
            case 0:
                return evaluarOR();
                break;
            case 1:
                return evaluarAND();
                break;
        }
    }



    private Boolean evaluarAND() {
        return condiciones.forAll(condicion -> cumpleCondicion());
    }

    private Boolean evaluarOR() {
        return condiciones.any(condicion -> cumpleCondicion());
    }
}
