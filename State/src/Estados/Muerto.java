package Estados;

import Persona.Persona;

public class Muerto extends Estado{

    public Muerto(){
        super();
        this.descripcion = "Muerto";
    }
    @Override
    public void dormir(Persona persona) {
        super.dormir(persona);
        if(vecesQueDurmio>10) {
            System.out.println("Revive");
            persona.setEstado(new Normal());
        }
    }

    @Override
    public void correr(Persona persona) {
        super.correr(persona);
        System.out.println("No puede correr");
    }

    @Override
    public void comer(Persona persona) {
        super.comer(persona);
        System.out.println("No puede comer");
    }
}
