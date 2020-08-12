package src;

public class Main {

    public static void main(String[] args) {

    	// creacion manual por codigo
	    Edificio edificioFranco = new Edificio(14,14*3,false,100);
	    edificioFranco.mostrarEdificio();

	    //creacion manual por builder

	    EdificioBuilder constructor = new EdificioBuilder();
	    constructor.indicarNivelDeSeguridad(150);
	    constructor.indicarPisos(10);
	    constructor.tienePatio(false);
	    Edificio edificioAGusto = constructor.construir();
	    edificioAGusto.mostrarEdificio();

	    //creacion por abstract factory

	    IngenieroCivil ingMonoblock = new IngenieroDeMonoblock();
	    Edificio monoblock = Edificio.encargarEdificioAIngeniero(ingMonoblock);
	    monoblock.mostrarEdificio();

	    IngenieroCivil ingRascacielo = new IngenieroRascacielos(20);
	    Edificio rascacielo = Edificio.encargarEdificioAIngeniero(ingRascacielo);
    	rascacielo.mostrarEdificio();

    	//creacion por factory method

		IngenieroBase ingenieroSistemas = new IngenieroEnSistemas();
		Edificio edificioServidores = ingenieroSistemas.construir();

    }
}
