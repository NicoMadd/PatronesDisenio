package Estados;

import Persona.Persona;

public abstract class Estado {
    protected Integer vecesCorridas;
    protected Integer vecesQueComio;
    protected Integer vecesQueDurmio;
    protected String descripcion;

    Estado (){
        vecesCorridas=0;
        vecesQueComio=0;
        vecesQueDurmio=0;
    }
    public void dormir(Persona persona){
        ++this.vecesQueDurmio;
    }
    public void comer(Persona persona){
        ++this.vecesQueComio;
    }
    public void correr(Persona persona){
        ++this.vecesCorridas;
    }
    public String descripcion(){
        return descripcion;
    }

}
