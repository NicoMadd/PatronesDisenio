package src;

class IngenieroRascacielos implements IngenieroCivil {
    Integer nivelDeManija;


    public IngenieroRascacielos(Integer nivelDeManija){
        this.nivelDeManija = nivelDeManija;
    }

    @Override
    public Edificio construir() {
        EdificioBuilder constructor = new EdificioBuilder();
        constructor.indicarNivelDeSeguridad(nivelDeManija*10);
        constructor.indicarPisos(nivelDeManija*9);
        constructor.tienePatio(true);
        return constructor.construir();
    }
}
