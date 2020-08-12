package Estados;

import Persona.Persona;

public class Cansado extends Estado {

    public Cansado(){
        super();
        this.descripcion = "Cansado";
    }

    @Override
    public void dormir(Persona persona) {
        super.dormir(persona);
        System.out.println("Se recupera del cansancio");
        persona.setEstado(new Normal());
    }

    @Override
    public void comer(Persona persona) {
        super.comer(persona);
    }

    @Override
    public void correr(Persona persona) {
        super.correr(persona);
        System.out.println("No puede correr esta cansado");
        if(vecesCorridas>10){
            System.out.println("Se murio");
            persona.setEstado(new Muerto());
        }
    }
}
