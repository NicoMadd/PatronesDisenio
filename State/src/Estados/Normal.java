package Estados;

import Persona.Persona;

public class Normal extends Estado{

    public Normal(){
        super();
        this.descripcion = "Normal";
    }

    @Override
    public void dormir(Persona persona) {
        super.dormir(persona);
    }

    @Override
    public void comer(Persona persona) {
        super.comer(persona);
        if(this.vecesQueComio>3)
            persona.setEstado(new Cansado());
    }

    @Override
    public void correr(Persona persona) {
        super.correr(persona);
        if(this.vecesCorridas>3)
            persona.setEstado(new Cansado());
    }
}
